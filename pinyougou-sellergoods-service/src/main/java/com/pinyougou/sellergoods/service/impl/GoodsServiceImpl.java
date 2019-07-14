package com.pinyougou.sellergoods.service.impl;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.pinyougou.mapper.TbBrandMapper;
import com.pinyougou.mapper.TbGoodsDescMapper;
import com.pinyougou.mapper.TbGoodsMapper;
import com.pinyougou.mapper.TbItemCatMapper;
import com.pinyougou.mapper.TbItemMapper;
import com.pinyougou.mapper.TbSellerMapper;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.pojo.TbGoods;
import com.pinyougou.pojo.TbGoodsDesc;
import com.pinyougou.pojo.TbGoodsExample;
import com.pinyougou.pojo.TbGoodsExample.Criteria;
import com.pinyougou.pojo.TbItem;
import com.pinyougou.pojo.TbItemCat;
import com.pinyougou.pojo.TbItemExample;
import com.pinyougou.pojo.TbSeller;
import com.pinyougou.pojogroup.Goods;
import com.pinyougou.sellergoods.service.GoodsService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class GoodsServiceImpl implements GoodsService {

	@Autowired
	private TbGoodsMapper goodsMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbGoods> findAll() {
		return goodsMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		TbGoodsExample example = new TbGoodsExample();
		Criteria criteria = example.createCriteria();
		criteria.andIsDeleteIsNull();
		Page<TbGoods> page=   (Page<TbGoods>) goodsMapper.selectByExample(example);
		return new PageResult(page.getTotal(), page.getResult());
	}

	@Autowired
	private TbGoodsDescMapper goodsDescMapper;
	
	@Autowired
	private TbBrandMapper brandMapper;
	
	@Autowired
	private TbItemCatMapper itemCatMapper;
	
	@Autowired
	private TbItemMapper  itemMapper;
	
	@Autowired
	private TbSellerMapper sellerMapper;
	/**
	 * 增加
	 */
	@Override
	@Transactional
	public void add(Goods goods) {
		
		goods.getGoods().setAuditStatus("0");//状态：未审核
		goodsMapper.insert(goods.getGoods());//保存商品基本信息
		
		goods.getGoodsDesc().setGoodsId(goods.getGoods().getId());//将商品基本表的ID给商品扩展表
		goodsDescMapper.insert(goods.getGoodsDesc());//保存商品扩展表数据
		
		//增加sku列表
		//当启用规格时，遍历每个item项，包装数据并存储
		saveItemList(goods);
		
	}
	
	private void saveItemList(Goods goods) {
		if("1".equals(goods.getGoods().getIsEnableSpec()))
		{
		for(TbItem item:goods.getItemList()) {
			//逐一包装表字段
			//title:商品名称+规格
			StringBuilder title=new StringBuilder(goods.getGoods().getGoodsName());
				//获取规格对象
			Map<String, Object> map = JSON.parseObject(item.getSpec(), Map.class);
				//拼接title
			for(String key:map.keySet()) {
				title.append(" "+map.get(key));
			}
			//封装title
			item.setTitle(title.toString());
			
			setItemValus(goods, item);
			itemMapper.insert(item);
		}
		}else {//当商品录入没有启用规格时，只有一个默认的sku
			TbItem item=new TbItem();
			//封装title
			item.setTitle(goods.getGoods().getGoodsName());
			//封装基本的sku
			item.setStatus("1");//状态
			item.setIsDefault("1");//默认
			item.setPrice( goods.getGoods().getPrice() );//价格		
			item.setNum(99999);//库存数量
			item.setSpec("{}");
			
			setItemValus(goods, item);
			itemMapper.insert(item);
		}
	}
	
	private void setItemValus(Goods goods,TbItem item) {
		//image
		//获取图片数据
	 String images = goodsDescMapper.selectByPrimaryKey(goods.getGoodsDesc().getGoodsId()).getItemImages();
	 	//将json格式转成map集合
	 List<Map> imageList = JSON.parseArray(images, Map.class);
	 //封装image
	 if (imageList.size()>0) {
		 item.setImage((String) imageList.get(0).get("url"));;
	}
	 
		item.setGoodsId(goods.getGoods().getId());//商品SPU编号
		item.setSellerId(goods.getGoods().getSellerId());//商家编号
		item.setCategoryid(goods.getGoods().getCategory3Id());//商品分类编号（3级）
		item.setCreateTime(new Date());//创建日期
		item.setUpdateTime(new Date());//修改日期 
		//品牌名称
		TbBrand brand = brandMapper.selectByPrimaryKey(goods.getGoods().getBrandId());
		item.setBrand(brand.getName());
		//分类名称
		TbItemCat itemCat = itemCatMapper.selectByPrimaryKey(goods.getGoods().getCategory3Id());
		item.setCategory(itemCat.getName());		
		//商家名称
		TbSeller seller = sellerMapper.selectByPrimaryKey(goods.getGoods().getSellerId());
		item.setSeller(seller.getNickName());	

	}
	
	/**
	 * 修改
	 */
	@Override
	@Transactional
	public void update( Goods goods){
		goods.getGoods().setAuditStatus("0");//设置未申请状态:如果是经过修改的商品，需要重新设置状态
		goodsMapper.updateByPrimaryKey(goods.getGoods());//保存商品表
		goodsDescMapper.updateByPrimaryKey(goods.getGoodsDesc());//保存商品扩展表
		//删除原有的sku列表数据		
		TbItemExample example=new TbItemExample();
		com.pinyougou.pojo.TbItemExample.Criteria criteria = example.createCriteria();
		criteria.andGoodsIdEqualTo(goods.getGoods().getId());	
		itemMapper.deleteByExample(example);
		//添加新的sku列表数据
		saveItemList(goods);//插入商品SKU列表数据	

	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public  Goods findOne(Long id){
		//封装Goods对象
		Goods goods = new Goods();
		TbGoods tbGoods = goodsMapper.selectByPrimaryKey(id);
		goods.setGoods(tbGoods);
		TbGoodsDesc goodsDesc = goodsDescMapper.selectByPrimaryKey(id);
		goods.setGoodsDesc(goodsDesc);
		//查询SKU商品列表
		TbItemExample example=new TbItemExample();
		com.pinyougou.pojo.TbItemExample.Criteria criteria = example.createCriteria();
		criteria.andGoodsIdEqualTo(id);//查询条件：商品ID
		List<TbItem> itemList = itemMapper.selectByExample(example);		
		goods.setItemList(itemList);

		return goods;
	}

	/**
	 * 批量删除
	 */
	@Override
	@Transactional
	public void delete(Long[] ids) {
		for(Long id:ids){
			TbGoods goods = goodsMapper.selectByPrimaryKey(id);
			goods.setIsDelete("1");
			goodsMapper.updateByPrimaryKey(goods);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbGoods goods, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbGoodsExample example=new TbGoodsExample();
		Criteria criteria = example.createCriteria();
		criteria.andIsDeleteIsNull();
		if(goods!=null){			
			if(goods.getSellerId()!=null && goods.getSellerId().length()>0){
				/*criteria.andSellerIdLike("%"+goods.getSellerId()+"%");*/
				//商家ID需要精确值
				criteria.andSellerIdEqualTo(goods.getSellerId());
			}
			if(goods.getGoodsName()!=null && goods.getGoodsName().length()>0){
				criteria.andGoodsNameLike("%"+goods.getGoodsName()+"%");
			}
			if(goods.getAuditStatus()!=null && goods.getAuditStatus().length()>0){
				criteria.andAuditStatusLike("%"+goods.getAuditStatus()+"%");
			}
			if(goods.getIsMarketable()!=null && goods.getIsMarketable().length()>0){
				criteria.andIsMarketableLike("%"+goods.getIsMarketable()+"%");
			}
			if(goods.getCaption()!=null && goods.getCaption().length()>0){
				criteria.andCaptionLike("%"+goods.getCaption()+"%");
			}
			if(goods.getSmallPic()!=null && goods.getSmallPic().length()>0){
				criteria.andSmallPicLike("%"+goods.getSmallPic()+"%");
			}
			if(goods.getIsEnableSpec()!=null && goods.getIsEnableSpec().length()>0){
				criteria.andIsEnableSpecLike("%"+goods.getIsEnableSpec()+"%");
			}
			if(goods.getIsDelete()!=null && goods.getIsDelete().length()>0){
				criteria.andIsDeleteLike("%"+goods.getIsDelete()+"%");
			}
	
		}
		
		Page<TbGoods> page= (Page<TbGoods>)goodsMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
		
		/**
		 * 功能：
		 * 1.商品审核
		 */
		@Override
		public void updateStatus(Long[] ids, String status) {
			for (Long id : ids) {
				TbGoods goods = goodsMapper.selectByPrimaryKey(id);
				goods.setAuditStatus(status);
				goodsMapper.updateByPrimaryKey(goods);
			}
			
		}
	
}
