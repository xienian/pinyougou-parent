package com.pinyougou.seckill.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.TbSeckillGoods;
import com.pinyougou.seckill.service.SeckillGoodsService;

@RestController
@RequestMapping("/seckillGoods")
public class SeckillGoodsController {
	
	@Reference(timeout=10000)
	private SeckillGoodsService seckillGoodsService;
	
	@RequestMapping("/findList")
	public List<TbSeckillGoods> findList(){
		List<TbSeckillGoods> list = seckillGoodsService.findList();
		return list;	
	}
	
	@RequestMapping("/findOne")
	public TbSeckillGoods findOne(String id) {
		return seckillGoodsService.findOne((long) Integer.parseInt(id));
	}

}
