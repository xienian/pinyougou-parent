package com.pinyougou.search.service;

import java.util.Map;

public interface ItemSearchService {
	
	/**
	 * 从solr中查询商品列表
	 * @param searchMap
	 * @return
	 */
	public Map<String,Object> search(Map searchMap);

}
