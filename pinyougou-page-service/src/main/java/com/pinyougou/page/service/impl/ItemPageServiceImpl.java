package com.pinyougou.page.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfig;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import com.alibaba.dubbo.config.annotation.Service;
import com.pinyougou.mapper.TbGoodsDescMapper;
import com.pinyougou.mapper.TbGoodsMapper;
import com.pinyougou.page.service.ItemPageService;
import com.pinyougou.pojo.TbGoods;
import com.pinyougou.pojo.TbGoodsDesc;

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
	

	@Override
	public boolean genItemHtml(Long goodsId) {
		Writer writer = null;
		try {
		//1.获取freemarker配置类
		Configuration configuration=freeMarkerConfigurer.getConfiguration();
		//2.获取模板对象
			Template template=configuration.getTemplate("item.ftl");
			//3.生成数据模型
			Map dataModel=new HashMap();
			TbGoods goods=tbGoodsMapper.selectByPrimaryKey(goodsId);
			dataModel.put("goods", goods);
			
			TbGoodsDesc goodsDesc=tbGoodsDescMapper.selectByPrimaryKey(goodsId);
			dataModel.put("goodsDesc", goodsDesc);
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

}
