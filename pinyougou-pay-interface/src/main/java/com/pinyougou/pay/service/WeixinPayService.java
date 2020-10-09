package com.pinyougou.pay.service;

import java.util.Map;

/**
 * 接口：
 * 1.微信支付功能接口；
 * @author 10334
 *
 */
public interface WeixinPayService {
	//微信扫码支付，下单功能
	public Map createNative(String out_trade_no,String total_fee) ;
	
	public Map queryWeixinNativePayStatus(String out_trade_no);

	public Map closeOrder(String out_trade_no);
	


}
