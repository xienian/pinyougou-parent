package com.pinyougou.solrutil;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.pinyougou.mapper.TbItemMapper;
import com.pinyougou.pojo.TbItem;
import com.pinyougou.pojo.TbItemExample;
import com.pinyougou.pojo.TbItemExample.Criteria;

@Component
public class SolrUtil {

	@Autowired
	private TbItemMapper itemMapper;
	
	@Autowired
	private SolrTemplate solrTemplate;
	
	public void importItemData(){
		
		TbItemExample example=new TbItemExample();
		Criteria criteria = example.createCriteria();
		criteria.andStatusEqualTo("1");//审核通过的才导入的
		List<TbItem> itemList = itemMapper.selectByExample(example);
		
		System.out.println("---商品列表---");
		for(TbItem item:itemList){
			System.out.println(item.getId()+" "+ item.getTitle()+ " "+item.getPrice());	
			Map specMap = JSON.parseObject(item.getSpec(), Map.class);//从数据库中提取规格json字符串转换为map
			item.setSpecMap(specMap);
			
			System.out.println("price:"+item.getPrice());
		}
		
		solrTemplate.saveBeans(itemList);
		solrTemplate.commit();
		
		System.out.println("---结束---");
	}
	
	   
/*	    public void testAdd(){
	        TbItem item = new TbItem() ;
	        item.setBrand("华为");  // 设置品牌
	        item.setCategory("手机"); // 设置类别
	        item.setId((long) 19931202);;  // 设置ID
	        item.setPrice();  // 设置价格
	        item.setSeller("xiuxiang");  // 设置商品所属商家的名字
	        item.setTitle("华为5G时代");  // 设置商品标题
	        String specStr = "{\"网络\":\"移动4G\",\"机身内存\":\"32G\"}" ;  // 设置动态域的内容 specStr是一个json字符串
	        Map<String,String> specMap = JSON.parseObject(specStr,Map.class) ; // 将json字符串转成Map集合
	        item.setSpecMap(specMap); // 设置到动态域对应的属性中，会将specMap的key拼接到定义的动态域的后面，以item_spec_{{key}}的形式创建域
	        solrTemplate.saveBean(item) ;
	        solrTemplate.commit();

	    }*/
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("classpath*:spring/applicationContext*.xml");
		SolrUtil solrUtil=  (SolrUtil) context.getBean("solrUtil");
		solrUtil.importItemData();
		
	}
	
	
}
