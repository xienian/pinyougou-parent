package com.pinyougou.cart.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.pinyougou.cart.service.CartService;
import com.pinyougou.pojogroup.Cart;

import entity.Result;

@RestController
@RequestMapping("/cart")
public class CartController {
	
	@Autowired
	private HttpServletRequest request;//这是一个代理类，线程安全
	
	@Reference
	private CartService cartService;
	
	@Autowired
	private HttpServletResponse response;

	@RequestMapping("/addGoodsToCartList")
	public Result addGoodsToCartList(Long itemId,Integer num) {
		try {
			//从cookie中提取数据
			List<Cart> cartList=findCartList();
			//调用添加购物车服务，保存购物车
			cartList = cartService.addGoodsToCartList(cartList, itemId, num);
			//将购物车写入cookie
			String cartList_Cookie=JSON.toJSONString(cartList);
			util.CookieUtil.setCookie(request, response, "cartList", cartList_Cookie, 3600*24*7, "UTF-8");
			
			return new Result(true, "添加购物车成功");
		} catch (Exception e) {
			
			e.printStackTrace();
			return new Result(false, "添加购物车失败");
		}
	}
	
	@RequestMapping("/findCartList")
	public List<Cart> findCartList() {
		//通过cookieutil获得购物车cookie数据
		String cartListString = util.CookieUtil.getCookieValue(request, "cartList", "UTF-8");
		if(cartListString==null || cartListString.equals("")) {
			cartListString="[]";
		}
		//通过json工具转成Java对象
		List<Cart> cartList = JSON.parseArray(cartListString, Cart.class);
		return cartList;
	}

}
