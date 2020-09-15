package com.pinyougou.pay.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.wxpay.sdk.WXPay;
import com.github.wxpay.sdk.WXPayUtil;
import com.pinyougou.pay.service.WeixinPayService;

import util.HttpClient;
/**
 * 功能：
 * 1.使用微信支付平台，完成网站的支付功能模块；
 * @author 10334
 *
 */
@Service
@Transactional
public class WeixinPayServiceImpl implements WeixinPayService {
	
	@Value("${appid}")
	private String appid;
	
	@Value("${partner}")
	private String partner;
	
	@Value("${partnerkey}")
	private String partnerkey;
	
	
	
	/*
	 * 功能：
	 * 1.调用微信支付平台的统一下单功能；返回map对象；
	 * @see com.pinyougou.pay.service.WeixinPayService#createNative(java.lang.String, java.lang.String)
	 */
	@Override
	public Map createNative(String out_trade_no, String total_fee) {
		//准备下单请求数据
		Map<String,String> requestParam=new HashMap<String, String>();
		
		requestParam.put("appid", appid);
		requestParam.put("mch_id", partner);
		requestParam.put("nonce_str", WXPayUtil.generateNonceStr());
		requestParam.put("body", "品优购商品");
		requestParam.put("out_trade_no", out_trade_no);
		requestParam.put("total_fee", total_fee);
		requestParam.put("spbill_create_ip", "127.0.0.1");
		requestParam.put("notify_url", "http://test.itcast.cn");
		requestParam.put("trade_type", "NATIVE");
		
		try {
			//使用微信支付SDK，将map类型数据转为xml
			String requestParamXml=WXPayUtil.generateSignedXml(requestParam, partnerkey);
			System.out.println("微信NATIVE支付请求数据："+requestParamXml);
			//用HTTPCLIENT发送请求
			HttpClient client=new HttpClient("https://api.mch.weixin.qq.com/pay/unifiedorder");
			client.setHttps(true);
			client.setXmlParam(requestParamXml);
			client.post();
			//获取微信支付后台返回值
			String responseXml=client.getContent();
			System.out.println("微信NAVITE返回数据:"+responseXml);
			//将XML转换为map类型
			Map<String,String> responseMap=WXPayUtil.xmlToMap(responseXml);
			//目前只用二维码链接、总金额、订单号返回
			Map<String,String> map=new HashMap<>();
			map.put("code_url", responseMap.get("code_url"));
			map.put("total_fee", responseMap.get("total_fee"));
			map.put("out_trade_no", responseMap.get("out_trade_no"));
			return map;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new HashMap<>();
		}
	}


	//查询订单
	@Override
	public Map queryWeixinNativePayStatus(String out_trade_no) {
		try {
		//整理查询订单数据
		Map<String, String> queryStatus=new HashMap<>();
		
		queryStatus.put("appid", appid);
		queryStatus.put("mch_id", partner);
		queryStatus.put("nonce_str", WXPayUtil.generateNonceStr());
		queryStatus.put("out_trade_no", out_trade_no);
		String queryString=WXPayUtil.generateSignedXml(queryStatus, partnerkey);
		System.out.println("微信扫码支付订单查询请求数据："+queryString);
		
		//调用SDK
		HttpClient httpClient=new HttpClient("https://api.mch.weixin.qq.com/pay/orderquery");
		httpClient.setHttps(true);
		httpClient.setXmlParam(queryString);
		httpClient.post();
		//根据返回数据信息，修改订单支付状态
		String queryResult=httpClient.getContent();
		Map<String, String> map=WXPayUtil.xmlToMap(queryResult);
		return map;
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

		
	}

}
