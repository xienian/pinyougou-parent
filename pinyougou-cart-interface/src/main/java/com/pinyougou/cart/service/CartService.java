package com.pinyougou.cart.service;

import java.util.List;

import com.pinyougou.pojogroup.Cart;

public interface CartService {
	
	/**
	 * 添加商品到购物车
	 * @param list
	 * @param itemId
	 * @param num
	 * @return
	 */
	public List addGoodsToCartList(List<Cart> list,Long itemId,Integer num);

}
