
package com.pinyougou.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class TbPayLogExample {
  protected String orderByClause;

  protected boolean distinct;

  public static class Criteria extends TbPayLogExample.GeneratedCriteria {
    protected Criteria() {
            super();
    }

  }

  protected List<TbPayLogExample.Criteria> oredCriteria;

  public TbPayLogExample() {
        oredCriteria = new ArrayList<Criteria>();
  }

  public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
  }

  public String getOrderByClause() {
        return orderByClause;
  }

  public void setDistinct(boolean distinct) {
        this.distinct = distinct;
  }

  public boolean isDistinct() {
        return distinct;
  }

  public List<TbPayLogExample.Criteria> getOredCriteria() {
        return oredCriteria;
  }

  public void or(TbPayLogExample.Criteria criteria) {
        oredCriteria.add(criteria);
  }

  public TbPayLogExample.Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
  }

  public TbPayLogExample.Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
  }

  protected TbPayLogExample.Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
  }

  public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
  }

  protected static abstract class GeneratedCriteria {
    protected List<TbPayLogExample.Criterion> criteria;

    protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
    }

    public boolean isValid() {
            return criteria.size() > 0;
    }

    public List<TbPayLogExample.Criterion> getAllCriteria() {
            return criteria;
    }

    public List<TbPayLogExample.Criterion> getCriteria() {
            return criteria;
    }

    protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
    }

    protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
    }

    protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
    }

    public TbPayLogExample.Criteria andOutTradeNoIsNull() {
            addCriterion("out_trade_no is null");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andOutTradeNoIsNotNull() {
            addCriterion("out_trade_no is not null");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andOutTradeNoEqualTo(String value) {
            addCriterion("out_trade_no =", value, "outTradeNo");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andOutTradeNoNotEqualTo(String value) {
            addCriterion("out_trade_no <>", value, "outTradeNo");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andOutTradeNoGreaterThan(String value) {
            addCriterion("out_trade_no >", value, "outTradeNo");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andOutTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("out_trade_no >=", value, "outTradeNo");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andOutTradeNoLessThan(String value) {
            addCriterion("out_trade_no <", value, "outTradeNo");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andOutTradeNoLessThanOrEqualTo(String value) {
            addCriterion("out_trade_no <=", value, "outTradeNo");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andOutTradeNoLike(String value) {
            addCriterion("out_trade_no like", value, "outTradeNo");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andOutTradeNoNotLike(String value) {
            addCriterion("out_trade_no not like", value, "outTradeNo");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andOutTradeNoIn(List<String> values) {
            addCriterion("out_trade_no in", values, "outTradeNo");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andOutTradeNoNotIn(List<String> values) {
            addCriterion("out_trade_no not in", values, "outTradeNo");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andOutTradeNoBetween(String value1, String value2) {
            addCriterion("out_trade_no between", value1, value2, "outTradeNo");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andOutTradeNoNotBetween(String value1, String value2) {
            addCriterion("out_trade_no not between", value1, value2, "outTradeNo");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andPayTimeIsNull() {
            addCriterion("pay_time is null");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andPayTimeIsNotNull() {
            addCriterion("pay_time is not null");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andPayTimeEqualTo(Date value) {
            addCriterion("pay_time =", value, "payTime");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andPayTimeNotEqualTo(Date value) {
            addCriterion("pay_time <>", value, "payTime");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andPayTimeGreaterThan(Date value) {
            addCriterion("pay_time >", value, "payTime");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_time >=", value, "payTime");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andPayTimeLessThan(Date value) {
            addCriterion("pay_time <", value, "payTime");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("pay_time <=", value, "payTime");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andPayTimeIn(List<Date> values) {
            addCriterion("pay_time in", values, "payTime");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andPayTimeNotIn(List<Date> values) {
            addCriterion("pay_time not in", values, "payTime");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andPayTimeBetween(Date value1, Date value2) {
            addCriterion("pay_time between", value1, value2, "payTime");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("pay_time not between", value1, value2, "payTime");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andTotalFeeIsNull() {
            addCriterion("total_fee is null");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andTotalFeeIsNotNull() {
            addCriterion("total_fee is not null");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andTotalFeeEqualTo(Long value) {
            addCriterion("total_fee =", value, "totalFee");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andTotalFeeNotEqualTo(Long value) {
            addCriterion("total_fee <>", value, "totalFee");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andTotalFeeGreaterThan(Long value) {
            addCriterion("total_fee >", value, "totalFee");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andTotalFeeGreaterThanOrEqualTo(Long value) {
            addCriterion("total_fee >=", value, "totalFee");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andTotalFeeLessThan(Long value) {
            addCriterion("total_fee <", value, "totalFee");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andTotalFeeLessThanOrEqualTo(Long value) {
            addCriterion("total_fee <=", value, "totalFee");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andTotalFeeIn(List<Long> values) {
            addCriterion("total_fee in", values, "totalFee");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andTotalFeeNotIn(List<Long> values) {
            addCriterion("total_fee not in", values, "totalFee");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andTotalFeeBetween(Long value1, Long value2) {
            addCriterion("total_fee between", value1, value2, "totalFee");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andTotalFeeNotBetween(Long value1, Long value2) {
            addCriterion("total_fee not between", value1, value2, "totalFee");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andTransactionIdIsNull() {
            addCriterion("transaction_id is null");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andTransactionIdIsNotNull() {
            addCriterion("transaction_id is not null");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andTransactionIdEqualTo(String value) {
            addCriterion("transaction_id =", value, "transactionId");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andTransactionIdNotEqualTo(String value) {
            addCriterion("transaction_id <>", value, "transactionId");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andTransactionIdGreaterThan(String value) {
            addCriterion("transaction_id >", value, "transactionId");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andTransactionIdGreaterThanOrEqualTo(String value) {
            addCriterion("transaction_id >=", value, "transactionId");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andTransactionIdLessThan(String value) {
            addCriterion("transaction_id <", value, "transactionId");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andTransactionIdLessThanOrEqualTo(String value) {
            addCriterion("transaction_id <=", value, "transactionId");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andTransactionIdLike(String value) {
            addCriterion("transaction_id like", value, "transactionId");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andTransactionIdNotLike(String value) {
            addCriterion("transaction_id not like", value, "transactionId");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andTransactionIdIn(List<String> values) {
            addCriterion("transaction_id in", values, "transactionId");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andTransactionIdNotIn(List<String> values) {
            addCriterion("transaction_id not in", values, "transactionId");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andTransactionIdBetween(String value1, String value2) {
            addCriterion("transaction_id between", value1, value2, "transactionId");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andTransactionIdNotBetween(String value1, String value2) {
            addCriterion("transaction_id not between", value1, value2, "transactionId");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andTradeStateIsNull() {
            addCriterion("trade_state is null");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andTradeStateIsNotNull() {
            addCriterion("trade_state is not null");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andTradeStateEqualTo(String value) {
            addCriterion("trade_state =", value, "tradeState");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andTradeStateNotEqualTo(String value) {
            addCriterion("trade_state <>", value, "tradeState");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andTradeStateGreaterThan(String value) {
            addCriterion("trade_state >", value, "tradeState");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andTradeStateGreaterThanOrEqualTo(String value) {
            addCriterion("trade_state >=", value, "tradeState");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andTradeStateLessThan(String value) {
            addCriterion("trade_state <", value, "tradeState");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andTradeStateLessThanOrEqualTo(String value) {
            addCriterion("trade_state <=", value, "tradeState");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andTradeStateLike(String value) {
            addCriterion("trade_state like", value, "tradeState");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andTradeStateNotLike(String value) {
            addCriterion("trade_state not like", value, "tradeState");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andTradeStateIn(List<String> values) {
            addCriterion("trade_state in", values, "tradeState");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andTradeStateNotIn(List<String> values) {
            addCriterion("trade_state not in", values, "tradeState");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andTradeStateBetween(String value1, String value2) {
            addCriterion("trade_state between", value1, value2, "tradeState");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andTradeStateNotBetween(String value1, String value2) {
            addCriterion("trade_state not between", value1, value2, "tradeState");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andOrderListIsNull() {
            addCriterion("order_list is null");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andOrderListIsNotNull() {
            addCriterion("order_list is not null");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andOrderListEqualTo(String value) {
            addCriterion("order_list =", value, "orderList");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andOrderListNotEqualTo(String value) {
            addCriterion("order_list <>", value, "orderList");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andOrderListGreaterThan(String value) {
            addCriterion("order_list >", value, "orderList");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andOrderListGreaterThanOrEqualTo(String value) {
            addCriterion("order_list >=", value, "orderList");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andOrderListLessThan(String value) {
            addCriterion("order_list <", value, "orderList");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andOrderListLessThanOrEqualTo(String value) {
            addCriterion("order_list <=", value, "orderList");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andOrderListLike(String value) {
            addCriterion("order_list like", value, "orderList");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andOrderListNotLike(String value) {
            addCriterion("order_list not like", value, "orderList");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andOrderListIn(List<String> values) {
            addCriterion("order_list in", values, "orderList");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andOrderListNotIn(List<String> values) {
            addCriterion("order_list not in", values, "orderList");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andOrderListBetween(String value1, String value2) {
            addCriterion("order_list between", value1, value2, "orderList");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andOrderListNotBetween(String value1, String value2) {
            addCriterion("order_list not between", value1, value2, "orderList");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andPayTypeIsNull() {
            addCriterion("pay_type is null");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andPayTypeIsNotNull() {
            addCriterion("pay_type is not null");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andPayTypeEqualTo(String value) {
            addCriterion("pay_type =", value, "payType");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andPayTypeNotEqualTo(String value) {
            addCriterion("pay_type <>", value, "payType");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andPayTypeGreaterThan(String value) {
            addCriterion("pay_type >", value, "payType");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andPayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("pay_type >=", value, "payType");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andPayTypeLessThan(String value) {
            addCriterion("pay_type <", value, "payType");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andPayTypeLessThanOrEqualTo(String value) {
            addCriterion("pay_type <=", value, "payType");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andPayTypeLike(String value) {
            addCriterion("pay_type like", value, "payType");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andPayTypeNotLike(String value) {
            addCriterion("pay_type not like", value, "payType");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andPayTypeIn(List<String> values) {
            addCriterion("pay_type in", values, "payType");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andPayTypeNotIn(List<String> values) {
            addCriterion("pay_type not in", values, "payType");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andPayTypeBetween(String value1, String value2) {
            addCriterion("pay_type between", value1, value2, "payType");
            return (Criteria) this;
    }

    public TbPayLogExample.Criteria andPayTypeNotBetween(String value1, String value2) {
            addCriterion("pay_type not between", value1, value2, "payType");
            return (Criteria) this;
    }

  }

  public static class Criterion {
    private String condition;

    private Object value;

    private Object secondValue;

    private boolean noValue;

    private boolean singleValue;

    private boolean betweenValue;

    private boolean listValue;

    private String typeHandler;

    public String getCondition() {
            return condition;
    }

    public Object getValue() {
            return value;
    }

    public Object getSecondValue() {
            return secondValue;
    }

    public boolean isNoValue() {
            return noValue;
    }

    public boolean isSingleValue() {
            return singleValue;
    }

    public boolean isBetweenValue() {
            return betweenValue;
    }

    public boolean isListValue() {
            return listValue;
    }

    public String getTypeHandler() {
            return typeHandler;
    }

    protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
    }

    protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
    }

    protected Criterion(String condition, Object value) {
            this(condition, value, null);
    }

    protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
    }

    protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
    }

  }

}
