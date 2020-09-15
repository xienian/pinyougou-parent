package com.pinyougou.cart.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
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
	@CrossOrigin(origins= {"http://localhost:9105"},allowCredentials="true")
	public Result addGoodsToCartList(Long itemId,Integer num) {
		String username = SecurityContextHolder.getContext().getAuthentication().getName(); 
		System.out.println("当前登录用户："+username);
		
		try {
			//获取购物车列表
			List<Cart> cartList=findCartList();
			//调用添加购物车服务，保存购物车
			cartList = cartService.addGoodsToCartList(cartList, itemId, num);
			
			if (username.equals("anonymousUser")) {//如果没登录
				//将购物车写入cookie
				String cartList_Cookie=JSON.toJSONString(cartList);
				util.CookieUtil.setCookie(request, response, "cartList", cartList_Cookie, 3600*24*7, "UTF-8");
				
				System.out.println("向cookie存入数据");	
			}else {
				//如果是已登录，保存到redis
				cartService.saveCartListToRedis(username, cartList);
			}
			return new Result(true, "添加购物车成功");

		}catch (RuntimeException  e) {
			
			e.printStackTrace();
			return new Result(false, e.getMessage());
		} catch (Exception e) {
			
			e.printStackTrace();
			return new Result(false, "添加购物车失败");
		}
	}
	
	@RequestMapping("/findCartList")
	public List<Cart> findCartList() {
		//得到登陆人账号,判断当前是否有人登陆
		String username = SecurityContextHolder.getContext().getAuthentication().getName();    
		String cartListString  = util.CookieUtil.getCookieValue(request, "cartList", "UTF-8");
		if(cartListString==null || cartListString.equals("")){
			cartListString="[]";
		}

		//获取客户端上传的购物车对象
		List<Cart> cartList_cookie = JSON.parseArray(cartListString, Cart.class);
		if (username.equals("anonymousUser")) {//如果未登录

		return cartList_cookie;
	}else {//如果已登录
		List<Cart> cartList_redis =cartService.findCartListFromRedis(username);//从redis中提取		
		
		if(cartList_cookie.size()>0){//如果本地存在购物车
			//合并购物车
			cartList_redis=cartService.mergeCartList(cartList_redis, cartList_cookie);	
			//清除本地cookie的数据
			util.CookieUtil.deleteCookie(request, response, "cartList");
			//将合并后的数据存入redis 
			cartService.saveCartListToRedis(username, cartList_redis); 
		}			
		return cartList_redis;
	}	
		}

}
