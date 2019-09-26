package com.pinyougou.page.service.impl;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfig;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import com.pinyougou.mapper.TbGoodsDescMapper;
import com.pinyougou.mapper.TbGoodsMapper;
import com.pinyougou.mapper.TbItemCatMapper;
import com.pinyougou.mapper.TbItemMapper;
import com.pinyougou.page.service.ItemPageService;
import com.pinyougou.pojo.TbGoods;
import com.pinyougou.pojo.TbGoodsDesc;
import com.pinyougou.pojo.TbItem;
import com.pinyougou.pojo.TbItemCatExample;
import com.pinyougou.pojo.TbItemExample;
import com.pinyougou.pojo.TbItemExample.Criteria;

import freemarker.core.ParseException;
import freemarker.template.Configuration;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateNotFoundException;

@Service
public class ItemPageServiceImpl implements ItemPageService {
	
	@Value("${pagedir}")
	private String pagedir;
	
	@Autowired
	private FreeMarkerConfigurer freeMarkerConfigurer;
	
	@Autowired
	private TbGoodsMapper tbGoodsMapper;
	
	@Autowired
	private TbGoodsDescMapper tbGoodsDescMapper;
	
	@Autowired
	private TbItemCatMapper tbItemCatMapper;
	
	@Autowired
	private TbItemMapper tbItemMapper;
	
	@Override
	public boolean genItemHtml(Long goodsId) {
		Writer writer = null;
		try {
		//1.获取freemarker配置类
		Configuration configuration=freeMarkerConfigurer.getConfiguration();
		//2.获取模板对象
			Template template=configuration.getTemplate("item.ftl");
			//3.生成数据模型
			
			//3.1商品数据
			Map dataModel=new HashMap();
			TbGoods goods=tbGoodsMapper.selectByPrimaryKey(goodsId);
			dataModel.put("goods", goods);
			//3.2商品详情数据
			TbGoodsDesc goodsDesc=tbGoodsDescMapper.selectByPrimaryKey(goodsId);
			dataModel.put("goodsDesc", goodsDesc);
			//3.3获取商品3个分类
			String itemCat1=tbItemCatMapper.selectByPrimaryKey(goods.getCategory1Id()).getName();
			String itemCat2=tbItemCatMapper.selectByPrimaryKey(goods.getCategory2Id()).getName();
			String itemCat3=tbItemCatMapper.selectByPrimaryKey(goods.getCategory3Id()).getName();
			dataModel.put("itemCat1", itemCat1);
			dataModel.put("itemCat2", itemCat2);
			dataModel.put("itemCat3", itemCat3);
			//3.4获取sku
			TbItemExample tbItemExample=new TbItemExample();
			Criteria criteria=tbItemExample.createCriteria();
			criteria.andGoodsIdEqualTo(goodsId);
			criteria.andStatusEqualTo("1");
			tbItemExample.setOrderByClause("is_default desc");
			
			List<TbItem> itemList  = tbItemMapper.selectByExample(tbItemExample);
			dataModel.put("itemList", itemList);//妈的，key多了个空格，在ftl模板中取不出值，艹！
			
			//4.输出流
			writer = new FileWriter(pagedir+goodsId+".html");
			//5.输出和关闭流
			template.process(dataModel, writer);
			return true;
		} catch (TemplateNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedTemplateNameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TemplateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return false;
	}
	
	/**
	 * 功能：
	 * 1.删除商品详情页；
	 */
	@Override
	public boolean deleteItemHtml(Long[] goodsIds) {
		try {
			for(Long goodsId:goodsIds) {
			boolean b= new File(pagedir+goodsId+".html").delete();
			}
		return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

}
