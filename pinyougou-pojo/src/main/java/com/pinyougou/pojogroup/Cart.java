package com.pinyougou.pojogroup;

import java.io.Serializable;
import java.util.List;

import com.pinyougou.pojo.TbOrderItem;

/**
 * 因为每个用户的购物车在没有生成订单时，都算是临时的对象，那么就不必要
 * 对未下订单的购物车链表进行持久化，那么将它们存入cookie和Redis就是可行
 * 的了。
 * @author 10334
 *
 */
public class Cart implements Serializable {
	private String sellerId;//商家ID
	private String sellerName;//商家名称
	private List<TbOrderItem> orderItemList;//购物车明细
	public String getSellerId() {
		return sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public List<TbOrderItem> getOrderItemList() {
		return orderItemList;
	}
	public void setOrderItemList(List<TbOrderItem> orderItemList) {
		this.orderItemList = orderItemList;
	}
	
	

}
