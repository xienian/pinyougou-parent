
package com.pinyougou.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class TbOrderExample {
  protected String orderByClause;

  protected boolean distinct;

  public static class Criteria extends TbOrderExample.GeneratedCriteria {
    protected Criteria() {
            super();
    }

  }

  protected List<TbOrderExample.Criteria> oredCriteria;

  public TbOrderExample() {
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

  public List<TbOrderExample.Criteria> getOredCriteria() {
        return oredCriteria;
  }

  public void or(TbOrderExample.Criteria criteria) {
        oredCriteria.add(criteria);
  }

  public TbOrderExample.Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
  }

  public TbOrderExample.Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
  }

  protected TbOrderExample.Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
  }

  public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
  }

  protected static abstract class GeneratedCriteria {
    protected List<TbOrderExample.Criterion> criteria;

    protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
    }

    public boolean isValid() {
            return criteria.size() > 0;
    }

    public List<TbOrderExample.Criterion> getAllCriteria() {
            return criteria;
    }

    public List<TbOrderExample.Criterion> getCriteria() {
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

    public TbOrderExample.Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andOrderIdEqualTo(Long value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andOrderIdNotEqualTo(Long value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andOrderIdGreaterThan(Long value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andOrderIdLessThan(Long value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andOrderIdIn(List<Long> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andOrderIdNotIn(List<Long> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andOrderIdBetween(Long value1, Long value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andPaymentIsNull() {
            addCriterion("payment is null");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andPaymentIsNotNull() {
            addCriterion("payment is not null");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andPaymentEqualTo(BigDecimal value) {
            addCriterion("payment =", value, "payment");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andPaymentNotEqualTo(BigDecimal value) {
            addCriterion("payment <>", value, "payment");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andPaymentGreaterThan(BigDecimal value) {
            addCriterion("payment >", value, "payment");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andPaymentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("payment >=", value, "payment");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andPaymentLessThan(BigDecimal value) {
            addCriterion("payment <", value, "payment");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andPaymentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("payment <=", value, "payment");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andPaymentIn(List<BigDecimal> values) {
            addCriterion("payment in", values, "payment");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andPaymentNotIn(List<BigDecimal> values) {
            addCriterion("payment not in", values, "payment");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andPaymentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payment between", value1, value2, "payment");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andPaymentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payment not between", value1, value2, "payment");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andPaymentTypeIsNull() {
            addCriterion("payment_type is null");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andPaymentTypeIsNotNull() {
            addCriterion("payment_type is not null");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andPaymentTypeEqualTo(String value) {
            addCriterion("payment_type =", value, "paymentType");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andPaymentTypeNotEqualTo(String value) {
            addCriterion("payment_type <>", value, "paymentType");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andPaymentTypeGreaterThan(String value) {
            addCriterion("payment_type >", value, "paymentType");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andPaymentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("payment_type >=", value, "paymentType");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andPaymentTypeLessThan(String value) {
            addCriterion("payment_type <", value, "paymentType");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andPaymentTypeLessThanOrEqualTo(String value) {
            addCriterion("payment_type <=", value, "paymentType");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andPaymentTypeLike(String value) {
            addCriterion("payment_type like", value, "paymentType");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andPaymentTypeNotLike(String value) {
            addCriterion("payment_type not like", value, "paymentType");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andPaymentTypeIn(List<String> values) {
            addCriterion("payment_type in", values, "paymentType");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andPaymentTypeNotIn(List<String> values) {
            addCriterion("payment_type not in", values, "paymentType");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andPaymentTypeBetween(String value1, String value2) {
            addCriterion("payment_type between", value1, value2, "paymentType");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andPaymentTypeNotBetween(String value1, String value2) {
            addCriterion("payment_type not between", value1, value2, "paymentType");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andPostFeeIsNull() {
            addCriterion("post_fee is null");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andPostFeeIsNotNull() {
            addCriterion("post_fee is not null");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andPostFeeEqualTo(String value) {
            addCriterion("post_fee =", value, "postFee");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andPostFeeNotEqualTo(String value) {
            addCriterion("post_fee <>", value, "postFee");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andPostFeeGreaterThan(String value) {
            addCriterion("post_fee >", value, "postFee");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andPostFeeGreaterThanOrEqualTo(String value) {
            addCriterion("post_fee >=", value, "postFee");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andPostFeeLessThan(String value) {
            addCriterion("post_fee <", value, "postFee");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andPostFeeLessThanOrEqualTo(String value) {
            addCriterion("post_fee <=", value, "postFee");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andPostFeeLike(String value) {
            addCriterion("post_fee like", value, "postFee");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andPostFeeNotLike(String value) {
            addCriterion("post_fee not like", value, "postFee");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andPostFeeIn(List<String> values) {
            addCriterion("post_fee in", values, "postFee");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andPostFeeNotIn(List<String> values) {
            addCriterion("post_fee not in", values, "postFee");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andPostFeeBetween(String value1, String value2) {
            addCriterion("post_fee between", value1, value2, "postFee");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andPostFeeNotBetween(String value1, String value2) {
            addCriterion("post_fee not between", value1, value2, "postFee");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andPaymentTimeIsNull() {
            addCriterion("payment_time is null");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andPaymentTimeIsNotNull() {
            addCriterion("payment_time is not null");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andPaymentTimeEqualTo(Date value) {
            addCriterion("payment_time =", value, "paymentTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andPaymentTimeNotEqualTo(Date value) {
            addCriterion("payment_time <>", value, "paymentTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andPaymentTimeGreaterThan(Date value) {
            addCriterion("payment_time >", value, "paymentTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andPaymentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("payment_time >=", value, "paymentTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andPaymentTimeLessThan(Date value) {
            addCriterion("payment_time <", value, "paymentTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andPaymentTimeLessThanOrEqualTo(Date value) {
            addCriterion("payment_time <=", value, "paymentTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andPaymentTimeIn(List<Date> values) {
            addCriterion("payment_time in", values, "paymentTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andPaymentTimeNotIn(List<Date> values) {
            addCriterion("payment_time not in", values, "paymentTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andPaymentTimeBetween(Date value1, Date value2) {
            addCriterion("payment_time between", value1, value2, "paymentTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andPaymentTimeNotBetween(Date value1, Date value2) {
            addCriterion("payment_time not between", value1, value2, "paymentTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andConsignTimeIsNull() {
            addCriterion("consign_time is null");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andConsignTimeIsNotNull() {
            addCriterion("consign_time is not null");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andConsignTimeEqualTo(Date value) {
            addCriterion("consign_time =", value, "consignTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andConsignTimeNotEqualTo(Date value) {
            addCriterion("consign_time <>", value, "consignTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andConsignTimeGreaterThan(Date value) {
            addCriterion("consign_time >", value, "consignTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andConsignTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("consign_time >=", value, "consignTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andConsignTimeLessThan(Date value) {
            addCriterion("consign_time <", value, "consignTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andConsignTimeLessThanOrEqualTo(Date value) {
            addCriterion("consign_time <=", value, "consignTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andConsignTimeIn(List<Date> values) {
            addCriterion("consign_time in", values, "consignTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andConsignTimeNotIn(List<Date> values) {
            addCriterion("consign_time not in", values, "consignTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andConsignTimeBetween(Date value1, Date value2) {
            addCriterion("consign_time between", value1, value2, "consignTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andConsignTimeNotBetween(Date value1, Date value2) {
            addCriterion("consign_time not between", value1, value2, "consignTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andCloseTimeIsNull() {
            addCriterion("close_time is null");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andCloseTimeIsNotNull() {
            addCriterion("close_time is not null");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andCloseTimeEqualTo(Date value) {
            addCriterion("close_time =", value, "closeTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andCloseTimeNotEqualTo(Date value) {
            addCriterion("close_time <>", value, "closeTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andCloseTimeGreaterThan(Date value) {
            addCriterion("close_time >", value, "closeTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andCloseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("close_time >=", value, "closeTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andCloseTimeLessThan(Date value) {
            addCriterion("close_time <", value, "closeTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andCloseTimeLessThanOrEqualTo(Date value) {
            addCriterion("close_time <=", value, "closeTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andCloseTimeIn(List<Date> values) {
            addCriterion("close_time in", values, "closeTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andCloseTimeNotIn(List<Date> values) {
            addCriterion("close_time not in", values, "closeTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andCloseTimeBetween(Date value1, Date value2) {
            addCriterion("close_time between", value1, value2, "closeTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andCloseTimeNotBetween(Date value1, Date value2) {
            addCriterion("close_time not between", value1, value2, "closeTime");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andShippingNameIsNull() {
            addCriterion("shipping_name is null");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andShippingNameIsNotNull() {
            addCriterion("shipping_name is not null");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andShippingNameEqualTo(String value) {
            addCriterion("shipping_name =", value, "shippingName");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andShippingNameNotEqualTo(String value) {
            addCriterion("shipping_name <>", value, "shippingName");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andShippingNameGreaterThan(String value) {
            addCriterion("shipping_name >", value, "shippingName");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andShippingNameGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_name >=", value, "shippingName");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andShippingNameLessThan(String value) {
            addCriterion("shipping_name <", value, "shippingName");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andShippingNameLessThanOrEqualTo(String value) {
            addCriterion("shipping_name <=", value, "shippingName");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andShippingNameLike(String value) {
            addCriterion("shipping_name like", value, "shippingName");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andShippingNameNotLike(String value) {
            addCriterion("shipping_name not like", value, "shippingName");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andShippingNameIn(List<String> values) {
            addCriterion("shipping_name in", values, "shippingName");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andShippingNameNotIn(List<String> values) {
            addCriterion("shipping_name not in", values, "shippingName");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andShippingNameBetween(String value1, String value2) {
            addCriterion("shipping_name between", value1, value2, "shippingName");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andShippingNameNotBetween(String value1, String value2) {
            addCriterion("shipping_name not between", value1, value2, "shippingName");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andShippingCodeIsNull() {
            addCriterion("shipping_code is null");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andShippingCodeIsNotNull() {
            addCriterion("shipping_code is not null");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andShippingCodeEqualTo(String value) {
            addCriterion("shipping_code =", value, "shippingCode");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andShippingCodeNotEqualTo(String value) {
            addCriterion("shipping_code <>", value, "shippingCode");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andShippingCodeGreaterThan(String value) {
            addCriterion("shipping_code >", value, "shippingCode");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andShippingCodeGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_code >=", value, "shippingCode");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andShippingCodeLessThan(String value) {
            addCriterion("shipping_code <", value, "shippingCode");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andShippingCodeLessThanOrEqualTo(String value) {
            addCriterion("shipping_code <=", value, "shippingCode");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andShippingCodeLike(String value) {
            addCriterion("shipping_code like", value, "shippingCode");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andShippingCodeNotLike(String value) {
            addCriterion("shipping_code not like", value, "shippingCode");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andShippingCodeIn(List<String> values) {
            addCriterion("shipping_code in", values, "shippingCode");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andShippingCodeNotIn(List<String> values) {
            addCriterion("shipping_code not in", values, "shippingCode");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andShippingCodeBetween(String value1, String value2) {
            addCriterion("shipping_code between", value1, value2, "shippingCode");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andShippingCodeNotBetween(String value1, String value2) {
            addCriterion("shipping_code not between", value1, value2, "shippingCode");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andBuyerMessageIsNull() {
            addCriterion("buyer_message is null");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andBuyerMessageIsNotNull() {
            addCriterion("buyer_message is not null");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andBuyerMessageEqualTo(String value) {
            addCriterion("buyer_message =", value, "buyerMessage");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andBuyerMessageNotEqualTo(String value) {
            addCriterion("buyer_message <>", value, "buyerMessage");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andBuyerMessageGreaterThan(String value) {
            addCriterion("buyer_message >", value, "buyerMessage");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andBuyerMessageGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_message >=", value, "buyerMessage");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andBuyerMessageLessThan(String value) {
            addCriterion("buyer_message <", value, "buyerMessage");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andBuyerMessageLessThanOrEqualTo(String value) {
            addCriterion("buyer_message <=", value, "buyerMessage");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andBuyerMessageLike(String value) {
            addCriterion("buyer_message like", value, "buyerMessage");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andBuyerMessageNotLike(String value) {
            addCriterion("buyer_message not like", value, "buyerMessage");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andBuyerMessageIn(List<String> values) {
            addCriterion("buyer_message in", values, "buyerMessage");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andBuyerMessageNotIn(List<String> values) {
            addCriterion("buyer_message not in", values, "buyerMessage");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andBuyerMessageBetween(String value1, String value2) {
            addCriterion("buyer_message between", value1, value2, "buyerMessage");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andBuyerMessageNotBetween(String value1, String value2) {
            addCriterion("buyer_message not between", value1, value2, "buyerMessage");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andBuyerNickIsNull() {
            addCriterion("buyer_nick is null");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andBuyerNickIsNotNull() {
            addCriterion("buyer_nick is not null");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andBuyerNickEqualTo(String value) {
            addCriterion("buyer_nick =", value, "buyerNick");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andBuyerNickNotEqualTo(String value) {
            addCriterion("buyer_nick <>", value, "buyerNick");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andBuyerNickGreaterThan(String value) {
            addCriterion("buyer_nick >", value, "buyerNick");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andBuyerNickGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_nick >=", value, "buyerNick");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andBuyerNickLessThan(String value) {
            addCriterion("buyer_nick <", value, "buyerNick");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andBuyerNickLessThanOrEqualTo(String value) {
            addCriterion("buyer_nick <=", value, "buyerNick");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andBuyerNickLike(String value) {
            addCriterion("buyer_nick like", value, "buyerNick");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andBuyerNickNotLike(String value) {
            addCriterion("buyer_nick not like", value, "buyerNick");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andBuyerNickIn(List<String> values) {
            addCriterion("buyer_nick in", values, "buyerNick");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andBuyerNickNotIn(List<String> values) {
            addCriterion("buyer_nick not in", values, "buyerNick");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andBuyerNickBetween(String value1, String value2) {
            addCriterion("buyer_nick between", value1, value2, "buyerNick");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andBuyerNickNotBetween(String value1, String value2) {
            addCriterion("buyer_nick not between", value1, value2, "buyerNick");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andBuyerRateIsNull() {
            addCriterion("buyer_rate is null");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andBuyerRateIsNotNull() {
            addCriterion("buyer_rate is not null");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andBuyerRateEqualTo(String value) {
            addCriterion("buyer_rate =", value, "buyerRate");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andBuyerRateNotEqualTo(String value) {
            addCriterion("buyer_rate <>", value, "buyerRate");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andBuyerRateGreaterThan(String value) {
            addCriterion("buyer_rate >", value, "buyerRate");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andBuyerRateGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_rate >=", value, "buyerRate");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andBuyerRateLessThan(String value) {
            addCriterion("buyer_rate <", value, "buyerRate");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andBuyerRateLessThanOrEqualTo(String value) {
            addCriterion("buyer_rate <=", value, "buyerRate");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andBuyerRateLike(String value) {
            addCriterion("buyer_rate like", value, "buyerRate");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andBuyerRateNotLike(String value) {
            addCriterion("buyer_rate not like", value, "buyerRate");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andBuyerRateIn(List<String> values) {
            addCriterion("buyer_rate in", values, "buyerRate");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andBuyerRateNotIn(List<String> values) {
            addCriterion("buyer_rate not in", values, "buyerRate");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andBuyerRateBetween(String value1, String value2) {
            addCriterion("buyer_rate between", value1, value2, "buyerRate");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andBuyerRateNotBetween(String value1, String value2) {
            addCriterion("buyer_rate not between", value1, value2, "buyerRate");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andReceiverAreaNameIsNull() {
            addCriterion("receiver_area_name is null");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andReceiverAreaNameIsNotNull() {
            addCriterion("receiver_area_name is not null");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andReceiverAreaNameEqualTo(String value) {
            addCriterion("receiver_area_name =", value, "receiverAreaName");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andReceiverAreaNameNotEqualTo(String value) {
            addCriterion("receiver_area_name <>", value, "receiverAreaName");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andReceiverAreaNameGreaterThan(String value) {
            addCriterion("receiver_area_name >", value, "receiverAreaName");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andReceiverAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_area_name >=", value, "receiverAreaName");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andReceiverAreaNameLessThan(String value) {
            addCriterion("receiver_area_name <", value, "receiverAreaName");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andReceiverAreaNameLessThanOrEqualTo(String value) {
            addCriterion("receiver_area_name <=", value, "receiverAreaName");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andReceiverAreaNameLike(String value) {
            addCriterion("receiver_area_name like", value, "receiverAreaName");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andReceiverAreaNameNotLike(String value) {
            addCriterion("receiver_area_name not like", value, "receiverAreaName");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andReceiverAreaNameIn(List<String> values) {
            addCriterion("receiver_area_name in", values, "receiverAreaName");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andReceiverAreaNameNotIn(List<String> values) {
            addCriterion("receiver_area_name not in", values, "receiverAreaName");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andReceiverAreaNameBetween(String value1, String value2) {
            addCriterion("receiver_area_name between", value1, value2, "receiverAreaName");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andReceiverAreaNameNotBetween(String value1, String value2) {
            addCriterion("receiver_area_name not between", value1, value2, "receiverAreaName");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andReceiverMobileIsNull() {
            addCriterion("receiver_mobile is null");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andReceiverMobileIsNotNull() {
            addCriterion("receiver_mobile is not null");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andReceiverMobileEqualTo(String value) {
            addCriterion("receiver_mobile =", value, "receiverMobile");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andReceiverMobileNotEqualTo(String value) {
            addCriterion("receiver_mobile <>", value, "receiverMobile");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andReceiverMobileGreaterThan(String value) {
            addCriterion("receiver_mobile >", value, "receiverMobile");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andReceiverMobileGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_mobile >=", value, "receiverMobile");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andReceiverMobileLessThan(String value) {
            addCriterion("receiver_mobile <", value, "receiverMobile");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andReceiverMobileLessThanOrEqualTo(String value) {
            addCriterion("receiver_mobile <=", value, "receiverMobile");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andReceiverMobileLike(String value) {
            addCriterion("receiver_mobile like", value, "receiverMobile");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andReceiverMobileNotLike(String value) {
            addCriterion("receiver_mobile not like", value, "receiverMobile");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andReceiverMobileIn(List<String> values) {
            addCriterion("receiver_mobile in", values, "receiverMobile");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andReceiverMobileNotIn(List<String> values) {
            addCriterion("receiver_mobile not in", values, "receiverMobile");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andReceiverMobileBetween(String value1, String value2) {
            addCriterion("receiver_mobile between", value1, value2, "receiverMobile");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andReceiverMobileNotBetween(String value1, String value2) {
            addCriterion("receiver_mobile not between", value1, value2, "receiverMobile");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andReceiverZipCodeIsNull() {
            addCriterion("receiver_zip_code is null");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andReceiverZipCodeIsNotNull() {
            addCriterion("receiver_zip_code is not null");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andReceiverZipCodeEqualTo(String value) {
            addCriterion("receiver_zip_code =", value, "receiverZipCode");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andReceiverZipCodeNotEqualTo(String value) {
            addCriterion("receiver_zip_code <>", value, "receiverZipCode");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andReceiverZipCodeGreaterThan(String value) {
            addCriterion("receiver_zip_code >", value, "receiverZipCode");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andReceiverZipCodeGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_zip_code >=", value, "receiverZipCode");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andReceiverZipCodeLessThan(String value) {
            addCriterion("receiver_zip_code <", value, "receiverZipCode");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andReceiverZipCodeLessThanOrEqualTo(String value) {
            addCriterion("receiver_zip_code <=", value, "receiverZipCode");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andReceiverZipCodeLike(String value) {
            addCriterion("receiver_zip_code like", value, "receiverZipCode");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andReceiverZipCodeNotLike(String value) {
            addCriterion("receiver_zip_code not like", value, "receiverZipCode");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andReceiverZipCodeIn(List<String> values) {
            addCriterion("receiver_zip_code in", values, "receiverZipCode");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andReceiverZipCodeNotIn(List<String> values) {
            addCriterion("receiver_zip_code not in", values, "receiverZipCode");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andReceiverZipCodeBetween(String value1, String value2) {
            addCriterion("receiver_zip_code between", value1, value2, "receiverZipCode");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andReceiverZipCodeNotBetween(String value1, String value2) {
            addCriterion("receiver_zip_code not between", value1, value2, "receiverZipCode");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andReceiverIsNull() {
            addCriterion("receiver is null");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andReceiverIsNotNull() {
            addCriterion("receiver is not null");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andReceiverEqualTo(String value) {
            addCriterion("receiver =", value, "receiver");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andReceiverNotEqualTo(String value) {
            addCriterion("receiver <>", value, "receiver");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andReceiverGreaterThan(String value) {
            addCriterion("receiver >", value, "receiver");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andReceiverGreaterThanOrEqualTo(String value) {
            addCriterion("receiver >=", value, "receiver");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andReceiverLessThan(String value) {
            addCriterion("receiver <", value, "receiver");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andReceiverLessThanOrEqualTo(String value) {
            addCriterion("receiver <=", value, "receiver");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andReceiverLike(String value) {
            addCriterion("receiver like", value, "receiver");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andReceiverNotLike(String value) {
            addCriterion("receiver not like", value, "receiver");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andReceiverIn(List<String> values) {
            addCriterion("receiver in", values, "receiver");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andReceiverNotIn(List<String> values) {
            addCriterion("receiver not in", values, "receiver");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andReceiverBetween(String value1, String value2) {
            addCriterion("receiver between", value1, value2, "receiver");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andReceiverNotBetween(String value1, String value2) {
            addCriterion("receiver not between", value1, value2, "receiver");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andExpireIsNull() {
            addCriterion("expire is null");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andExpireIsNotNull() {
            addCriterion("expire is not null");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andExpireEqualTo(Date value) {
            addCriterion("expire =", value, "expire");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andExpireNotEqualTo(Date value) {
            addCriterion("expire <>", value, "expire");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andExpireGreaterThan(Date value) {
            addCriterion("expire >", value, "expire");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andExpireGreaterThanOrEqualTo(Date value) {
            addCriterion("expire >=", value, "expire");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andExpireLessThan(Date value) {
            addCriterion("expire <", value, "expire");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andExpireLessThanOrEqualTo(Date value) {
            addCriterion("expire <=", value, "expire");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andExpireIn(List<Date> values) {
            addCriterion("expire in", values, "expire");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andExpireNotIn(List<Date> values) {
            addCriterion("expire not in", values, "expire");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andExpireBetween(Date value1, Date value2) {
            addCriterion("expire between", value1, value2, "expire");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andExpireNotBetween(Date value1, Date value2) {
            addCriterion("expire not between", value1, value2, "expire");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andInvoiceTypeIsNull() {
            addCriterion("invoice_type is null");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andInvoiceTypeIsNotNull() {
            addCriterion("invoice_type is not null");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andInvoiceTypeEqualTo(String value) {
            addCriterion("invoice_type =", value, "invoiceType");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andInvoiceTypeNotEqualTo(String value) {
            addCriterion("invoice_type <>", value, "invoiceType");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andInvoiceTypeGreaterThan(String value) {
            addCriterion("invoice_type >", value, "invoiceType");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andInvoiceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_type >=", value, "invoiceType");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andInvoiceTypeLessThan(String value) {
            addCriterion("invoice_type <", value, "invoiceType");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andInvoiceTypeLessThanOrEqualTo(String value) {
            addCriterion("invoice_type <=", value, "invoiceType");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andInvoiceTypeLike(String value) {
            addCriterion("invoice_type like", value, "invoiceType");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andInvoiceTypeNotLike(String value) {
            addCriterion("invoice_type not like", value, "invoiceType");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andInvoiceTypeIn(List<String> values) {
            addCriterion("invoice_type in", values, "invoiceType");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andInvoiceTypeNotIn(List<String> values) {
            addCriterion("invoice_type not in", values, "invoiceType");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andInvoiceTypeBetween(String value1, String value2) {
            addCriterion("invoice_type between", value1, value2, "invoiceType");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andInvoiceTypeNotBetween(String value1, String value2) {
            addCriterion("invoice_type not between", value1, value2, "invoiceType");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andSourceTypeIsNull() {
            addCriterion("source_type is null");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andSourceTypeIsNotNull() {
            addCriterion("source_type is not null");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andSourceTypeEqualTo(String value) {
            addCriterion("source_type =", value, "sourceType");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andSourceTypeNotEqualTo(String value) {
            addCriterion("source_type <>", value, "sourceType");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andSourceTypeGreaterThan(String value) {
            addCriterion("source_type >", value, "sourceType");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andSourceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("source_type >=", value, "sourceType");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andSourceTypeLessThan(String value) {
            addCriterion("source_type <", value, "sourceType");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andSourceTypeLessThanOrEqualTo(String value) {
            addCriterion("source_type <=", value, "sourceType");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andSourceTypeLike(String value) {
            addCriterion("source_type like", value, "sourceType");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andSourceTypeNotLike(String value) {
            addCriterion("source_type not like", value, "sourceType");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andSourceTypeIn(List<String> values) {
            addCriterion("source_type in", values, "sourceType");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andSourceTypeNotIn(List<String> values) {
            addCriterion("source_type not in", values, "sourceType");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andSourceTypeBetween(String value1, String value2) {
            addCriterion("source_type between", value1, value2, "sourceType");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andSourceTypeNotBetween(String value1, String value2) {
            addCriterion("source_type not between", value1, value2, "sourceType");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andSellerIdIsNull() {
            addCriterion("seller_id is null");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andSellerIdIsNotNull() {
            addCriterion("seller_id is not null");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andSellerIdEqualTo(String value) {
            addCriterion("seller_id =", value, "sellerId");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andSellerIdNotEqualTo(String value) {
            addCriterion("seller_id <>", value, "sellerId");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andSellerIdGreaterThan(String value) {
            addCriterion("seller_id >", value, "sellerId");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andSellerIdGreaterThanOrEqualTo(String value) {
            addCriterion("seller_id >=", value, "sellerId");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andSellerIdLessThan(String value) {
            addCriterion("seller_id <", value, "sellerId");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andSellerIdLessThanOrEqualTo(String value) {
            addCriterion("seller_id <=", value, "sellerId");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andSellerIdLike(String value) {
            addCriterion("seller_id like", value, "sellerId");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andSellerIdNotLike(String value) {
            addCriterion("seller_id not like", value, "sellerId");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andSellerIdIn(List<String> values) {
            addCriterion("seller_id in", values, "sellerId");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andSellerIdNotIn(List<String> values) {
            addCriterion("seller_id not in", values, "sellerId");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andSellerIdBetween(String value1, String value2) {
            addCriterion("seller_id between", value1, value2, "sellerId");
            return (Criteria) this;
    }

    public TbOrderExample.Criteria andSellerIdNotBetween(String value1, String value2) {
            addCriterion("seller_id not between", value1, value2, "sellerId");
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
