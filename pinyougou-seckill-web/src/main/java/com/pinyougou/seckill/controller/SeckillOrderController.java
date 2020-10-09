package com.pinyougou.seckill.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.seckill.service.SeckillOrderService;

import entity.Result;

@RestController
@RequestMapping("/seckillOrder")
public class SeckillOrderController {
	
	@Reference
	private SeckillOrderService seckillOrderService;
	
	/**
	 * 功能：
	 * 1.用户秒杀下单
	 */
	@RequestMapping("/submitOrder")
	public Result submitOrder(Long seckillGoodId) {
		//判断用户是否登录
		String userName=SecurityContextHolder.getContext().getAuthentication().getName();
		if("anonymousUser".equals(userName)) {
			return new Result(false, "请登录");
		}
		try {
			seckillOrderService.submitOrder(userName, seckillGoodId);
			
			return new Result(true, "提交成功");
		} catch (RuntimeException e) {
			e.printStackTrace();
			return new Result(false, e.getMessage());
		}catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "提交失败");
		}
	}

}
