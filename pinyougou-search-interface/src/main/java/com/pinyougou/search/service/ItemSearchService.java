package com.pinyougou.search.service;

import java.util.List;
import java.util.Map;

public interface ItemSearchService {
	
	/**
	 * 从solr中查询商品列表
	 * @param searchMap
	 * @return
	 */
	public Map<String,Object> search(Map searchMap);
	
	/**
	 * 更新一部分商品数据到索引库
	 * @param list
	 */
	public void importList(List list);
	
	/**
	 * 删除一部分商品索引数据
	 * @param goodsList
	 */
	public void deleByGoodsIds(List goodsList);
}
