package com.pinyougou.search.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.core.query.Criteria;
import org.springframework.data.solr.core.query.FilterQuery;
import org.springframework.data.solr.core.query.GroupOptions;
import org.springframework.data.solr.core.query.HighlightOptions;
import org.springframework.data.solr.core.query.HighlightQuery;
import org.springframework.data.solr.core.query.Query;
import org.springframework.data.solr.core.query.SimpleFilterQuery;
import org.springframework.data.solr.core.query.SimpleHighlightQuery;
import org.springframework.data.solr.core.query.SimpleQuery;
import org.springframework.data.solr.core.query.result.GroupEntry;
import org.springframework.data.solr.core.query.result.GroupPage;
import org.springframework.data.solr.core.query.result.GroupResult;
import org.springframework.data.solr.core.query.result.HighlightEntry;
import org.springframework.data.solr.core.query.result.HighlightEntry.Highlight;
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
*/		
		//处理用户搜索时，加上空格的问题
		String keywords=(String) searchMap.get("keywords");
		keywords=keywords.replace(" ", "");
		searchMap.put("keywords", keywords);
		map.putAll(searchList(searchMap, new HashMap<>()));
		//获取分组列表
		List<String> searchCategoryList = searchCategoryList(searchMap);
		map.put("categoryList", searchCategoryList);
		//3.查询品牌和规格列表
		String categoryName=(String)searchMap.get("category");
		if(!"".equals(categoryName)){//如果有分类名称
			map.putAll(searchBrandAndSpecList(categoryName));			
		}else{//如果没有分类名称，按照第一个查询
			if(searchCategoryList.size()>0){
				map.putAll(searchBrandAndSpecList(searchCategoryList.get(0)));
			}
		}

		
		
		return map;

	}
	/*
	 * 功能：
	 * 1.根据商品分类，查询品牌和规格列表，从缓存中；
	 */
	@Autowired
	private RedisTemplate redisTemplate;
	
	private Map searchBrandAndSpecList(String category) {
		Map map=new HashMap<>();
		//获取分类的模板id
		Long typeId= (Long) redisTemplate.boundHashOps("itemCat").get(category);
		
		if (typeId!=null) {
			//根据模板id获取商品分类品牌列表
			List brandList  = (List) redisTemplate.boundHashOps("brandList").get(typeId);
			map.put("brandList", brandList);//返回值添加品牌列表
			//根据模板id获取商品分类规格列表
			List specList = (List) redisTemplate.boundHashOps("specList").get(typeId);
			map.put("specList", specList);
		}
		
		return map;
	}
	
	/**
	 * 功能：
	 * 1.根据搜索关键词查询文档；
	 * @param searchMap
	 * @param map
	 * @return
	 */
	private Map<String, Object> searchList(Map searchMap, Map map) {
		
		//高亮查询接口
		HighlightQuery query = new SimpleHighlightQuery();
		//高亮选项
		HighlightOptions highlightOptions = new HighlightOptions();
		//设置高亮域
		highlightOptions.addField("item_title");
		//设置高亮域值前缀
		highlightOptions.setSimplePrefix("<em style='color:red'>");
		//设置高亮域值后缀
		highlightOptions.setSimplePostfix("</em>");
		
		query.setHighlightOptions(highlightOptions);
		
		//1.1按关键字查询
		Criteria criteria = new Criteria("item_keywords").is(searchMap.get("keywords"));
		//测试
		query.addCriteria(criteria);

		//1.2按分类筛选
		if(!"".equals(searchMap.get("category"))) {
			Criteria filterCriteria = new Criteria("item_category").is(searchMap.get("category"));
			FilterQuery filterQuery = new SimpleFilterQuery(filterCriteria);
			query.addFilterQuery(filterQuery);
		}
		
		//1.3按品牌筛选
		if(!"".equals(searchMap.get("brand"))) {
			Criteria filterCriteria = new Criteria("item_brand").is(searchMap.get("brand"));
			FilterQuery filterQuery = new SimpleFilterQuery(filterCriteria);
			query.addFilterQuery(filterQuery);
		}
		
		//1.4按规格筛选
		if(searchMap.get("spec")!=null) {
			Map<String, String> specMap = (Map<String, String>) searchMap.get("spec");
			for(String key:specMap.keySet()) {
					Criteria filterCriteria = new Criteria("item_spec_"+key).is(specMap.get(key));
					FilterQuery filterQuery = new SimpleFilterQuery(filterCriteria);
					query.addFilterQuery(filterQuery);
			}

		}
		//1.5 价格区间
		if(!"".equals(searchMap.get("price"))) {
			String priceStr=(String) searchMap.get("price");
			String[] price = priceStr.split("-");
			
			if(!"0".equals(price[0])) {
				Criteria filterCriteria = new Criteria("item_price").greaterThanEqual(price[0]);
				FilterQuery filterQuery = new SimpleFilterQuery(filterCriteria);
				query.addFilterQuery(filterQuery);
			}
			
			if (!"*".equals(price[1])) {
				Criteria filterCriteria = new Criteria("item_price").lessThanEqual(price[1]);
				FilterQuery filterQuery = new SimpleFilterQuery(filterCriteria);
				query.addFilterQuery(filterQuery);
			}
			
			
		}
		
		//1.6 分页查询
			//获取页码
		Integer pageNo= (Integer) searchMap.get("pageNo");
		if(pageNo==null) {
			pageNo=1;
		}
			//获取每页数据量
		Integer pageSize=(Integer) searchMap.get("pageSize");
		if (pageSize==null) {
			pageSize=20;//默认20页
		}
		
			//solr分页查询条件
		query.setOffset((pageNo-1)*pageSize);
		query.setRows(pageSize);
		
		//1.7 根据属性排序
			//1.获取排序类型和排序字段
		String sortValue=(String) searchMap.get("sort");//ASC || DESC
		String sortField=(String) searchMap.get("sortField");//排序字段
		
			//2.如果需要排序
		if(sortValue!=null && !"".equals(sortValue)) {
			if("ASC".equals(sortValue)) {//注意字符串的==和equals方法的区别
				Sort sort=new Sort(Sort.Direction.ASC, "item_"+sortField);
				query.addSort(sort);
			}
			
			if("DESC".equals(sortValue)) {
				Sort sort=new Sort(Sort.Direction.DESC, "item_"+sortField);
				query.addSort(sort);
			}
		}
		
		//高亮域获取和赋值给文档对象
		HighlightPage<TbItem> queryForHighlightPage = solrTemplate.queryForHighlightPage(query, TbItem.class);
		List<HighlightEntry<TbItem>> highlighted = queryForHighlightPage.getHighlighted();
		//喜欢遍历高亮入口集合
		for(HighlightEntry<TbItem> entry:highlighted) {
			TbItem entity = entry.getEntity();//获取原实体
			//如果这个文档有高亮域并且高亮域集合的第一个域（目前即：item_keywords）的多值列有高亮对象（目前即：item_title)，
			//那么给原实体设置高亮值

			if(entry.getHighlights().size()>0 && entry.getHighlights().get(0).getSnipplets().size()>0){
				entity.setTitle(entry.getHighlights().get(0).getSnipplets().get(0));//第一个高亮域的第一个多值列（对应：item_title)
			}			

			
		}
		map.put("rows",queryForHighlightPage.getContent());
		//返回：总记录数，总页数
		map.put("total", queryForHighlightPage.getTotalElements());
		map.put("totalPages", queryForHighlightPage.getTotalPages());
		return map;
	}
	
	/**
	 * 功能：
	 * 1.根据solrAPI的分组查询接口，获得商品分类列表；
	 * @param searchMap
	 * @return
	 */
	private List<String> searchCategoryList(Map searchMap){
		/**
		 * 1.
		 */
		List<String> list=new ArrayList<String>();
		Query query=new SimpleQuery("*:*");
		//分组选项
		GroupOptions groupOptions=new GroupOptions();
		groupOptions.addGroupByField("item_category");
		//设置选项
		query.setGroupOptions(groupOptions);
		//solr条件查询
		Criteria criteria=new Criteria("item_keywords").is(searchMap.get("keywords"));
		query.addCriteria(criteria);
		
		//得到分组页，包含普通数据和分组数据
		GroupPage<TbItem> queryForGroupPage = solrTemplate.queryForGroupPage(query, TbItem.class);
		//根据列得到分组结果集
		GroupResult<TbItem> groupResult = queryForGroupPage.getGroupResult("item_category");//可以从已经设定分组字段中获取
		//得到分组结果入口页
		Page<GroupEntry<TbItem>> groupEntries = groupResult.getGroupEntries();
		//得到分组入口集合
		List<GroupEntry<TbItem>> content = groupEntries.getContent();
		//遍历分组对象，存入分组集合中
		for (GroupEntry<TbItem> groupEntry : content) {
			list.add(groupEntry.getGroupValue());
		}
		
		return list;
	}
	
	/*
	 * 功能：
	 * 1.更新商品信息
	 * @see com.pinyougou.search.service.ItemSearchService#importList(java.util.List)
	 */
	@Override
	public void importList(List list) {
		solrTemplate.saveBeans(list);
		solrTemplate.commit();
		
	}
	
	/**
	 * 功能：
	 * 1.批量删除失效商品索引
	 */
	@Override
	public void deleByGoodsIds(List goodsList) {
		System.out.println("删除商品ID:"+goodsList);
		Query query=new SimpleQuery();
		Criteria criteria=new Criteria("item_goodsid").in(goodsList);
		query.addCriteria(criteria);
		
		solrTemplate.delete(query);
		solrTemplate.commit();
		
	}

}
