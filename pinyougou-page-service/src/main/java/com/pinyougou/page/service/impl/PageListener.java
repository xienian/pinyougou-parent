package com.pinyougou.page.service.impl;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pinyougou.page.service.ItemPageService;

@Component
public class PageListener implements MessageListener {
	
	@Autowired
	private ItemPageService itemPageService;
	
	@Override
	public void onMessage(Message message) {
		TextMessage textMessage=(TextMessage) message;
		Long goodsId=Long.parseLong(textMessage.toString());
		System.out.println("接收到消息："+goodsId);
		boolean b = itemPageService.genItemHtml(goodsId);
		System.out.println("生成页面:"+b);
	}

}
