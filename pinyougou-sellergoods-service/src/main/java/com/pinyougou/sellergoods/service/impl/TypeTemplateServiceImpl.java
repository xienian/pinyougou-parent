package com.pinyougou.sellergoods.service.impl;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.pinyougou.mapper.TbSpecificationOptionMapper;
import com.pinyougou.mapper.TbTypeTemplateMapper;
import com.pinyougou.pojo.TbSpecificationOption;
import com.pinyougou.pojo.TbSpecificationOptionExample;
import com.pinyougou.pojo.TbTypeTemplate;
import com.pinyougou.pojo.TbTypeTemplateExample;
import com.pinyougou.pojo.TbTypeTemplateExample.Criteria;
import com.pinyougou.sellergoods.service.TypeTemplateService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class TypeTemplateServiceImpl implements TypeTemplateService {

	@Autowired
	private TbTypeTemplateMapper typeTemplateMapper;
	
	@Autowired
	private TbSpecificationOptionMapper tbSpecificationOptionMapper;
	/**
	 * 查询全部
	 */
	@Override
	public List<TbTypeTemplate> findAll() {
		return typeTemplateMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbTypeTemplate> page=   (Page<TbTypeTemplate>) typeTemplateMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	@Transactional
	public void add(TbTypeTemplate typeTemplate) {
		typeTemplateMapper.insert(typeTemplate);		
	}

	
	/**
	 * 修改
	 */
	@Override
	@Transactional
	public void update(TbTypeTemplate typeTemplate){
		typeTemplateMapper.updateByPrimaryKey(typeTemplate);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbTypeTemplate findOne(Long id){
		return typeTemplateMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	@Transactional
	public void delete(Long[] ids) {
		for(Long id:ids){
			typeTemplateMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbTypeTemplate typeTemplate, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbTypeTemplateExample example=new TbTypeTemplateExample();
		Criteria criteria = example.createCriteria();
		
		if(typeTemplate!=null){			
						if(typeTemplate.getName()!=null && typeTemplate.getName().length()>0){
				criteria.andNameLike("%"+typeTemplate.getName()+"%");
			}
			if(typeTemplate.getSpecIds()!=null && typeTemplate.getSpecIds().length()>0){
				criteria.andSpecIdsLike("%"+typeTemplate.getSpecIds()+"%");
			}
			if(typeTemplate.getBrandIds()!=null && typeTemplate.getBrandIds().length()>0){
				criteria.andBrandIdsLike("%"+typeTemplate.getBrandIds()+"%");
			}
			if(typeTemplate.getCustomAttributeItems()!=null && typeTemplate.getCustomAttributeItems().length()>0){
				criteria.andCustomAttributeItemsLike("%"+typeTemplate.getCustomAttributeItems()+"%");
			}
	
		}
		
		Page<TbTypeTemplate> page= (Page<TbTypeTemplate>)typeTemplateMapper.selectByExample(example);		
		saveToRedis();//存入数据到缓存
		return new PageResult(page.getTotal(), page.getResult());
	}
		
		@Autowired
		private RedisTemplate redisTemplate;
		
		/**
		 * 将数据存入缓存
		 */
		private void saveToRedis(){
			//获取模板数据
			List<TbTypeTemplate> typeTemplateList = findAll();
			//循环模板
			for(TbTypeTemplate typeTemplate :typeTemplateList){				
				//存储品牌列表		
				List<Map> brandList = JSON.parseArray(typeTemplate.getBrandIds(), Map.class);			
				redisTemplate.boundHashOps("brandList").put(typeTemplate.getId(), brandList);
			
				//存储规格列表
				List<Map> specList = findSpecList(typeTemplate.getId());//根据模板ID查询规格列表
				redisTemplate.boundHashOps("specList").put(typeTemplate.getId(), specList);	//数组中每一个元素是一个map,map中有options的key选项		
			}
			System.out.println("更新缓存:品牌表");
			System.out.println("更新缓存:规格表");
		}

		
		/**
		 *根据模板ID，查询规格字符串，根据规格id，查询规格列表，封装返回；
		 */
		@Override
		public List<Map> findSpecList(Long id) {
			/**
			 * 1.查询模板中的规格字符串；
			 * 2.根据规格id，查询规格选项；
			 * 3.封装规格选项进map集合中；
			 */
			TbTypeTemplate tbTypeTemplate=typeTemplateMapper.selectByPrimaryKey(id);
			List<Map> list=JSON.parseArray(tbTypeTemplate.getSpecIds(), Map.class);
			
			for (Map map : list) {
				TbSpecificationOptionExample optionExample=new TbSpecificationOptionExample();
				com.pinyougou.pojo.TbSpecificationOptionExample.Criteria criteria=optionExample.createCriteria();
				criteria.andSpecIdEqualTo(new Long( (Integer) map.get("id")));
				List<TbSpecificationOption> options=tbSpecificationOptionMapper.selectByExample(optionExample);
				
				map.put("options", options);
			}
			return list;
		}


}
