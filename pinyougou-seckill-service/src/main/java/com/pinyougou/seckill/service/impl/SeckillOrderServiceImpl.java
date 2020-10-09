package com.pinyougou.seckill.service.impl;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.pinyougou.mapper.TbSeckillGoodsMapper;
import com.pinyougou.mapper.TbSeckillOrderMapper;
import com.pinyougou.pojo.TbSeckillGoods;
import com.pinyougou.pojo.TbSeckillOrder;
import com.pinyougou.pojo.TbSeckillOrderExample;
import com.pinyougou.pojo.TbSeckillOrderExample.Criteria;
import com.pinyougou.seckill.service.SeckillOrderService;

import entity.PageResult;
import entity.Result;
import util.IdWorker;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class SeckillOrderServiceImpl implements SeckillOrderService {

	@Autowired
	private TbSeckillOrderMapper seckillOrderMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbSeckillOrder> findAll() {
		return seckillOrderMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbSeckillOrder> page=   (Page<TbSeckillOrder>) seckillOrderMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbSeckillOrder seckillOrder) {
		seckillOrderMapper.insert(seckillOrder);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbSeckillOrder seckillOrder){
		seckillOrderMapper.updateByPrimaryKey(seckillOrder);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbSeckillOrder findOne(Long id){
		return seckillOrderMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			seckillOrderMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbSeckillOrder seckillOrder, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbSeckillOrderExample example=new TbSeckillOrderExample();
		Criteria criteria = example.createCriteria();
		
		if(seckillOrder!=null){			
						if(seckillOrder.getUserId()!=null && seckillOrder.getUserId().length()>0){
				criteria.andUserIdLike("%"+seckillOrder.getUserId()+"%");
			}
			if(seckillOrder.getSellerId()!=null && seckillOrder.getSellerId().length()>0){
				criteria.andSellerIdLike("%"+seckillOrder.getSellerId()+"%");
			}
			if(seckillOrder.getStatus()!=null && seckillOrder.getStatus().length()>0){
				criteria.andStatusLike("%"+seckillOrder.getStatus()+"%");
			}
			if(seckillOrder.getReceiverAddress()!=null && seckillOrder.getReceiverAddress().length()>0){
				criteria.andReceiverAddressLike("%"+seckillOrder.getReceiverAddress()+"%");
			}
			if(seckillOrder.getReceiverMobile()!=null && seckillOrder.getReceiverMobile().length()>0){
				criteria.andReceiverMobileLike("%"+seckillOrder.getReceiverMobile()+"%");
			}
			if(seckillOrder.getReceiver()!=null && seckillOrder.getReceiver().length()>0){
				criteria.andReceiverLike("%"+seckillOrder.getReceiver()+"%");
			}
			if(seckillOrder.getTransactionId()!=null && seckillOrder.getTransactionId().length()>0){
				criteria.andTransactionIdLike("%"+seckillOrder.getTransactionId()+"%");
			}
	
		}
		
		Page<TbSeckillOrder> page= (Page<TbSeckillOrder>)seckillOrderMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
		
		@Autowired
		private RedisTemplate redisTemplate;
		
		@Autowired
		private IdWorker idWorker;
		
		@Autowired
		private TbSeckillGoodsMapper seckillGoodsMapper;
		
		/**
		 * 功能：
		 * 1.用户秒杀下单；
		 */
		@Override
		public void submitOrder(String userId, Long seckillGoodId) {
			//获取商品
			TbSeckillGoods seckillGoods=(TbSeckillGoods) redisTemplate.boundHashOps("seckillGoods").get(seckillGoodId);
			//减库存
			if (seckillGoods!=null && seckillGoods.getStockCount()>0) {
				Integer sockCount =seckillGoods.getStockCount();
				sockCount-=1;
				seckillGoods.setStockCount(sockCount);
				if (sockCount==0) {
					seckillGoodsMapper.updateByPrimaryKey(seckillGoods);//先保存秒杀商品信息
					redisTemplate.boundHashOps("seckillGoods").delete(seckillGoodId);//再清除缓存数据，结束此商品秒杀活动
				}
				redisTemplate.boundHashOps("seckillGoods").put(seckillGoodId, seckillGoods);//将秒杀商品信息更新
				//封装订单对象
				TbSeckillOrder order=new TbSeckillOrder();	
				order.setId(idWorker.nextId());
				order.setSeckillId(seckillGoodId);
				order.setMoney(seckillGoods.getCostPrice());
				order.setUserId(userId);
				order.setSellerId(seckillGoods.getSellerId());
				order.setCreateTime(new Date());
				order.setStatus("0");
				

				redisTemplate.boundHashOps("seckillOrder").put(userId, order);;//保存秒杀订单,放入缓存		
			}else {
				if (seckillGoods==null) {
					throw new RuntimeException("商品不存在");
				}
				if (seckillGoods.getStockCount()<=0) {
					throw new RuntimeException("商品已售完");
				}
			}

		}

		@Override
		public TbSeckillOrder searchSeckillOrderFromRedisByUserId(String userId) {
			TbSeckillOrder order= (TbSeckillOrder) redisTemplate.boundHashOps("seckillOrder").get(userId);
			return order;
		}
		
		@Override
		public void saveOrderFromRedisToDb(String userId, Long orderId, String transactionId) {
			TbSeckillOrder seckillOrder=(TbSeckillOrder) redisTemplate.boundHashOps("seckillOrder").get(userId);
			if (seckillOrder==null) {
				throw new RuntimeException("订单不存在");
			}
			if (seckillOrder.getId().longValue()!=orderId.longValue()) {
				throw new RuntimeException("订单不相符");
			}
			if (seckillOrder!=null) {
				//修改订单状态
				seckillOrder.setPayTime(new Date());
				seckillOrder.setStatus("1");
				//获取流水号等
				seckillOrder.setTransactionId(transactionId);
				
				seckillOrderMapper.insert(seckillOrder);
				redisTemplate.boundHashOps("seckillOrder").delete(userId);
				
			}
			
		}

		@Override
		public void deleteOrderFromRedis(String userId, Long orderId) {
			TbSeckillOrder order= (TbSeckillOrder) redisTemplate.boundHashOps("seckillOrder").get(userId);
			if(order!=null && order.getId().longValue()==orderId.longValue()) {
				redisTemplate.boundHashOps("seckillOrder").delete(userId);
				TbSeckillGoods seckillGoods=(TbSeckillGoods) redisTemplate.boundHashOps("seckillGoods").get(order.getSeckillId());
				seckillGoods.setStockCount(seckillGoods.getStockCount()+1);
				redisTemplate.boundHashOps("seckillGoods").put(order.getSeckillId(), seckillGoods);
			}
			
		}
	
}
