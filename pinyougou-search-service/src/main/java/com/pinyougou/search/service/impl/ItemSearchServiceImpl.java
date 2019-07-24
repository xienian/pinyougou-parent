package com.pinyougou.search.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.core.query.Criteria;
import org.springframework.data.solr.core.query.HighlightOptions;
import org.springframework.data.solr.core.query.HighlightQuery;
import org.springframework.data.solr.core.query.Query;
import org.springframework.data.solr.core.query.SimpleHighlightQuery;
import org.springframework.data.solr.core.query.SimpleQuery;
import org.springframework.data.solr.core.query.result.HighlightEntry;
import org.springframework.data.solr.core.query.result.HighlightPage;
import org.springframework.data.solr.core.query.result.ScoredPage;

import com.alibaba.dubbo.config.annotation.Service;
import com.pinyougou.pojo.TbItem;
import com.pinyougou.search.service.ItemSearchService;

@Service(timeout=5000)
public class ItemSearchServiceImpl implements ItemSearchService {
	
	//solr操作模板
	@Autowired
	private SolrTemplate solrTemplate;
	
	/*
	 * (non-Javadoc)
	 * @see com.pinyougou.search.ItemSearchService#search(java.util.Map)
	 */
	@Override
	public Map<String, Object> search(Map searchMap) {
		Map map = new HashMap<>();
/*		//准备查询条件
		Query query = new SimpleQuery("*:*");
		Criteria criteria = new Criteria("item_keywords").is(searchMap.get("keywords"));
		query.addCriteria(criteria);
		//获取文档集合
		ScoredPage<TbItem> scoredPage = solrTemplate.queryForPage(query, TbItem.class);
		map.put("rows", scoredPage.getContent());//一开始没调用方法
		//返回
*/		map.putAll(searchMap);
		return map;
	}

	private Map<String, Object> searchList(Map searchMap, Map map) {
		//高亮查询接口
		HighlightQuery query = new SimpleHighlightQuery();
		//高亮选项
		HighlightOptions highlightOptions = new HighlightOptions();
		//设置高亮域
		highlightOptions.addField("item_keywords");
		//设置高亮域值前缀
		highlightOptions.setSimplePrefix("<em style='color:red'>");
		//设置高亮域值后缀
		highlightOptions.setSimplePostfix("</em>");
		
		query.setHighlightOptions(highlightOptions);
		
		//按关键字查询
		Criteria criteria = new Criteria("item_keywords").is(searchMap.get("keywords"));
		query.addCriteria(criteria);
		
		//高亮域获取和赋值给文档对象
		HighlightPage<TbItem> queryForHighlightPage = solrTemplate.queryForHighlightPage(query, TbItem.class);
		//喜欢遍历高亮入口集合
		for(HighlightEntry<TbItem> entry:queryForHighlightPage.getHighlighted()) {
			TbItem entity = entry.getEntity();//获取原实体
			//如果这个文档有高亮域并且高亮域集合的第一个域（目前即：item_keywords）的多值列有高亮对象（目前即：item_title)，
			//那么给原实体设置高亮值
			if(entry.getHighlights().size()>0 && entry.getHighlights().get(0).getSnipplets().size()>0){
				entity.setTitle(entry.getHighlights().get(0).getSnipplets().get(0));//设置高亮的结果
			}			

			
		}
		map.put("rows",queryForHighlightPage.getContent());
		return map;
	}

}
