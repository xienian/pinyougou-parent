package com.pinyougou.seckill.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pinyougou.pay.service.WeixinPayService;
import com.pinyougou.pojo.TbSeckillOrder;
import com.pinyougou.seckill.service.SeckillOrderService;

import entity.Result;

@RestController
@RequestMapping("/pay")
public class PayController {

	
	@Autowired
	private WeixinPayService wexinPayService;
	
	@Autowired
	private SeckillOrderService seckillOrderService;
	
	/**
	 * 功能：
	 * 1.秒杀用户微信下单；
	 */
	@RequestMapping("/createNative")
	public Map createNative() {
		//从缓存中查询用户秒杀订单
		String userName=SecurityContextHolder.getContext().getAuthentication().getName();
		TbSeckillOrder order= seckillOrderService.searchSeckillOrderFromRedisByUserId(userName);
		if (order!=null) {
			//调用支付服务，微信下单
			Map createNative = wexinPayService.createNative(order.getId()+"", (order.getMoney().doubleValue()*100+""));
			return createNative;
		}else {
			return new HashMap();
		}
	}
	
	@RequestMapping("/queryPayStatus")
	public Result queryPayStatus(String out_trade_no) {
		String userId=SecurityContextHolder.getContext().getAuthentication().getName();
		TbSeckillOrder order=geTbSeckillOrderFromRedis(userId);
		//5分钟查询，每次间隔3s
		int count=100;
		Result result=null;
		while(true) {
			
			Map payStatus = wexinPayService.queryWeixinNativePayStatus(out_trade_no);
			if(payStatus==null) {
				result=new Result(false, "支付出错");
				seckillOrderService.deleteOrderFromRedis(userId, order.getId());
				break;
			}
			
			if(payStatus.get("trade_state").equals("success")) {
				result=new  Result(true, "支付成功");
				seckillOrderService.saveOrderFromRedisToDb(userId, Long.parseLong(out_trade_no), (String) payStatus.get("transaction_id"));
				break;
			}
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (Exception e) {
				e.printStackTrace();
				result= new Result(false, e.getMessage());
			}
			
			if(count--==0) {
				result=new Result(false, "支付超时");
				Map map = wexinPayService.closeOrder(out_trade_no);
				if (map!=null && !"SUCCESS".equals(map.get("return_code"))) {
					if("ORDERPAID".equals(map.get("err_code"))) {
						result=new Result(true, "支付成功");
						seckillOrderService.saveOrderFromRedisToDb(userId, Long.parseLong(out_trade_no), (String) map.get("transaction_id"));
					}
				}
				if (!result.isSuccess()) {
					seckillOrderService.deleteOrderFromRedis(userId,Long.parseLong(out_trade_no));
				}
				
				break;
			}
			
		}
		return result;
	}
	
	@Autowired
	private RedisTemplate redisTemplate;
	
	
	private TbSeckillOrder geTbSeckillOrderFromRedis(String userId) {
		
		return (TbSeckillOrder) redisTemplate.boundHashOps("seckillOrder").get(userId);		
	}
}
