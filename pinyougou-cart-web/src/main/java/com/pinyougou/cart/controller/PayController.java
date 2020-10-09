package com.pinyougou.cart.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.order.service.OrderService;
import com.pinyougou.pay.service.WeixinPayService;
import com.pinyougou.pojo.TbPayLog;

import entity.Result;
import util.IdWorker;


/**
 * 功能weixinPayNative：微信扫码支付下单功能；返回数据前端生成二维码；2小时期限。
 * @author 10334
 *
 */
@RestController
@RequestMapping("/pay")
public class PayController {
	
	@Reference
	private WeixinPayService weixinPayService;
	
	@Autowired
	private OrderService orderService;
	
	/**
	 * 功能：
	 * 1.目前写死功能；
	 * 2.不根据用户数据查询支付状态订单信息；
	 * @return
	 */
	@RequestMapping("/weixinPayNative")
	public Map weixinPayNative() {
		//查询订单信息
		String userId = SecurityContextHolder.getContext().getAuthentication().getName();
		
		TbPayLog payLog= orderService.searchPayLogFromRedis(userId);
		
		if(payLog!=null) {
			Map<String, String> map = weixinPayService.createNative(payLog.getOutTradeNo(), payLog.getTotalFee()+"");
			return map;
		}else {
			return new HashMap();
		}
		
	}
	
	@RequestMapping("/queryWeixinPayNative")
	public Result queryWeixinPayNative(String out_trade_no) {
		System.out.println("加入查询微信订单状态");
		Result result=null;
		//查询次数<=100
		int times=0;
		while(true) {
			if(times++>=100) {
				result=new  Result(false, "二维码超时");
				break;

			}
			//调用
			Map<String,String> queryWeixinNativePayStatus = weixinPayService.queryWeixinNativePayStatus(out_trade_no);
			if(queryWeixinNativePayStatus==null) {
				result=new Result(false, "支付出错");
				break;
			}
			
			if(queryWeixinNativePayStatus.get("trade_state").equals("success")) {
				result=new  Result(true, "支付成功");
				//修改订单状态
				orderService.updateOrderStatus(out_trade_no, queryWeixinNativePayStatus.get("transaction_id"));
				break;
			}
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}

}
