package com.pinyougou.cart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.order.service.OrderService;
import com.pinyougou.pojo.TbOrder;
import com.pinyougou.pojo.TbUserExample;
import com.pinyougou.pojo.TbUserExample.Criteria;

import entity.Result;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	
	@Reference
	private OrderService orderService;
	
	@RequestMapping("/add")
	public Result add(@RequestBody TbOrder order) {
		//获取当前用户名
		String userName = SecurityContextHolder.getContext().getAuthentication().getName();
		//获取用户对象
		order.setUserId(userName);
		order.setSourceType("2");//订单来源 PC
		
		try {
			orderService.add(order);
			return new Result(true, "保存订单成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加订单失败");
		}
		
		
	}
	
	
	
	

}
