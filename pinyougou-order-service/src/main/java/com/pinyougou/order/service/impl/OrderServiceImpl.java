package com.pinyougou.order.service.impl;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.pinyougou.mapper.TbOrderItemMapper;
import com.pinyougou.mapper.TbOrderMapper;
import com.pinyougou.mapper.TbPayLogMapper;
import com.pinyougou.pojo.TbOrder;
import com.pinyougou.pojo.TbOrderExample;
import com.pinyougou.pojo.TbOrderExample.Criteria;
import com.pinyougou.pojo.TbOrderItem;
import com.pinyougou.pojo.TbPayLog;
import com.pinyougou.pojogroup.Cart;
import com.pinyougou.order.service.OrderService;

import entity.PageResult;
import util.IdWorker;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
@Transactional
public class OrderServiceImpl implements OrderService {

	@Autowired
	private TbOrderMapper orderMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbOrder> findAll() {
		return orderMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbOrder> page=   (Page<TbOrder>) orderMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}
	
	//Redis工具
	@Autowired
	private RedisTemplate<String, Object> redisTemplate;
	
	//订单表dao
	@Autowired
	private TbOrderItemMapper tbOrderItemMapper;
	
	//“雪花算法”对象
	@Autowired
	private IdWorker idWorker;
	
	//支付日志dao
	@Autowired
	private TbPayLogMapper tbPayLogMapper;
	/**
	 * 增加
	 */
	@Override
	public void add(TbOrder order) {
		//1.获取购物车中，当前用户的所有购物车；
		List<Cart> cartList = (List<Cart>) redisTemplate.boundHashOps("cartList").get(order.getUserId());
		//2.构造订单对象，构造订单项对象；
		System.out.println("userId:"+order.getUserId());
		

		//订单号列表
		List<String> list=new ArrayList<>();
		//支付订单总金额
		double total_fee=0;
		
		for(Cart cart:cartList) {
			long orderId=idWorker.nextId();
			System.out.println(orderId);
			System.out.println("sellerId:"+cart.getSellerId());
			TbOrder tbOrder=new TbOrder();//新建订单对象
			//给订单对象赋值
			tbOrder.setOrderId(orderId);//订单ID
			tbOrder.setUserId(order.getUserId());//用户ID
			tbOrder.setPaymentType(order.getPaymentType());//支付类型
			tbOrder.setStatus("1");//1：未付款；2.已付款
			tbOrder.setCreateTime(new Date());//订单创建日期
			tbOrder.setUpdateTime(new Date());//订单更新日期
			tbOrder.setReceiverAreaName(order.getReceiverAreaName());//地址
			tbOrder.setReceiverMobile(order.getReceiverMobile());//手机号
			tbOrder.setReceiver(order.getReceiver());//收货人
			tbOrder.setSellerId(cart.getSellerId());//商家ID
			tbOrder.setSourceType(order.getSourceType());//订单来源
			//循环购物车明细
			double money=0;

			//生成订单项对象
			for(TbOrderItem tbOrderItem:cart.getOrderItemList()) {
				tbOrderItem.setId(idWorker.nextId());//订单项ID
				tbOrderItem.setOrderId(orderId);//订单ID
				money+=tbOrderItem.getTotalFee().doubleValue();//每个订单的总金额
				tbOrderItemMapper.insert(tbOrderItem);
			}
			
			total_fee+=money;
			//支付日志字段：订单列表
			list.add(tbOrder.getOrderId()+"");
			
			tbOrder.setPayment(new BigDecimal(money));//订单总金额
			orderMapper.insert(tbOrder);
		}
		//
		
		
		//3.保存支付日志对象
		//如果是线下支付则不用
		if("1".equals(order.getPaymentType())) {
			//准备支付日志对象
			TbPayLog payLog=new TbPayLog();
			//日志主键ID用雪花算法
			payLog.setOutTradeNo(idWorker.nextId()+"");
			//其他日志对象字段
			payLog.setCreateTime(new Date());//创建日期
			payLog.setUserId(order.getUserId());//用户ID
			
			payLog.setOrderList(list.toString().replace("[", "").replace("]", ""));//订单号列表
			System.out.println("订单号列表:"+list.toString().replace("[", "").replace("]", ""));
			payLog.setTotalFee((long)total_fee*100);//总金额
			payLog.setPayType("1");//支付类型：微信支付
			payLog.setTradeState("0");//支付状态
			
			tbPayLogMapper.insert(payLog);
			//放入Redis
			redisTemplate.boundHashOps("payLog").put(order.getUserId(), payLog);
		}
		
		
		//4.消除Redis中相应购物车数据
		redisTemplate.boundHashOps("cartList").delete(order.getUserId());
		
		
		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbOrder order){
		orderMapper.updateByPrimaryKey(order);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbOrder findOne(Long id){
		return orderMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			orderMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbOrder order, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbOrderExample example=new TbOrderExample();
		Criteria criteria = example.createCriteria();
		
		if(order!=null){			
						if(order.getPaymentType()!=null && order.getPaymentType().length()>0){
				criteria.andPaymentTypeLike("%"+order.getPaymentType()+"%");
			}
			if(order.getPostFee()!=null && order.getPostFee().length()>0){
				criteria.andPostFeeLike("%"+order.getPostFee()+"%");
			}
			if(order.getStatus()!=null && order.getStatus().length()>0){
				criteria.andStatusLike("%"+order.getStatus()+"%");
			}
			if(order.getShippingName()!=null && order.getShippingName().length()>0){
				criteria.andShippingNameLike("%"+order.getShippingName()+"%");
			}
			if(order.getShippingCode()!=null && order.getShippingCode().length()>0){
				criteria.andShippingCodeLike("%"+order.getShippingCode()+"%");
			}
			if(order.getUserId()!=null && order.getUserId().length()>0){
				criteria.andUserIdLike("%"+order.getUserId()+"%");
			}
			if(order.getBuyerMessage()!=null && order.getBuyerMessage().length()>0){
				criteria.andBuyerMessageLike("%"+order.getBuyerMessage()+"%");
			}
			if(order.getBuyerNick()!=null && order.getBuyerNick().length()>0){
				criteria.andBuyerNickLike("%"+order.getBuyerNick()+"%");
			}
			if(order.getBuyerRate()!=null && order.getBuyerRate().length()>0){
				criteria.andBuyerRateLike("%"+order.getBuyerRate()+"%");
			}
			if(order.getReceiverAreaName()!=null && order.getReceiverAreaName().length()>0){
				criteria.andReceiverAreaNameLike("%"+order.getReceiverAreaName()+"%");
			}
			if(order.getReceiverMobile()!=null && order.getReceiverMobile().length()>0){
				criteria.andReceiverMobileLike("%"+order.getReceiverMobile()+"%");
			}
			if(order.getReceiverZipCode()!=null && order.getReceiverZipCode().length()>0){
				criteria.andReceiverZipCodeLike("%"+order.getReceiverZipCode()+"%");
			}
			if(order.getReceiver()!=null && order.getReceiver().length()>0){
				criteria.andReceiverLike("%"+order.getReceiver()+"%");
			}
			if(order.getInvoiceType()!=null && order.getInvoiceType().length()>0){
				criteria.andInvoiceTypeLike("%"+order.getInvoiceType()+"%");
			}
			if(order.getSourceType()!=null && order.getSourceType().length()>0){
				criteria.andSourceTypeLike("%"+order.getSourceType()+"%");
			}
			if(order.getSellerId()!=null && order.getSellerId().length()>0){
				criteria.andSellerIdLike("%"+order.getSellerId()+"%");
			}
	
		}
		
		Page<TbOrder> page= (Page<TbOrder>)orderMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
		
		//从Redis查询支付日志
		@Override
		public TbPayLog searchPayLogFromRedis(String userId) {
			TbPayLog payLog= (TbPayLog) redisTemplate.boundHashOps("payLog").get(userId);
			return payLog;
		}

		//修改订单支付状态
		@Override
		public void updateOrderStatus(String out_trade_no, String transaction_id) {
			//获取相应的支付日志对象
			TbPayLog payLog = tbPayLogMapper.selectByPrimaryKey(out_trade_no);
			//修改某些字段
			payLog.setPayTime(new Date());
			payLog.setTransactionId(transaction_id);
			payLog.setTradeState("1");

			//根据订单列表获取订单对象，并修改支付状态
			String orderList=payLog.getOrderList();
			String[] orders = orderList.split(",.");
			
			for (String order : orders) {
				TbOrder tbOrder = orderMapper.selectByPrimaryKey((long) Integer.parseInt(order));
				if (tbOrder!=null) {
					tbOrder.setStatus("2");
					orderMapper.updateByPrimaryKey(tbOrder);
				}				
			}
			
			tbPayLogMapper.updateByPrimaryKey(payLog);
			
			//清除Redis中支付日志
			redisTemplate.boundHashOps("payLog").delete(payLog.getUserId());
			
		}
	
}
