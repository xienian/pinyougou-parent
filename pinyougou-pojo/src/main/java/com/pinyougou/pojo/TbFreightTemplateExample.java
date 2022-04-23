
package com.pinyougou.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class TbFreightTemplateExample {
  protected String orderByClause;

  protected boolean distinct;

  public static class Criteria extends TbFreightTemplateExample.GeneratedCriteria {
    protected Criteria() {
            super();
    }

  }

  protected List<TbFreightTemplateExample.Criteria> oredCriteria;

  public TbFreightTemplateExample() {
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

  public List<TbFreightTemplateExample.Criteria> getOredCriteria() {
        return oredCriteria;
  }

  public void or(TbFreightTemplateExample.Criteria criteria) {
        oredCriteria.add(criteria);
  }

  public TbFreightTemplateExample.Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
  }

  public TbFreightTemplateExample.Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
  }

  protected TbFreightTemplateExample.Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
  }

  public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
  }

  protected static abstract class GeneratedCriteria {
    protected List<TbFreightTemplateExample.Criterion> criteria;

    protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
    }

    public boolean isValid() {
            return criteria.size() > 0;
    }

    public List<TbFreightTemplateExample.Criterion> getAllCriteria() {
            return criteria;
    }

    public List<TbFreightTemplateExample.Criterion> getCriteria() {
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

    public TbFreightTemplateExample.Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andSellerIdIsNull() {
            addCriterion("seller_id is null");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andSellerIdIsNotNull() {
            addCriterion("seller_id is not null");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andSellerIdEqualTo(String value) {
            addCriterion("seller_id =", value, "sellerId");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andSellerIdNotEqualTo(String value) {
            addCriterion("seller_id <>", value, "sellerId");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andSellerIdGreaterThan(String value) {
            addCriterion("seller_id >", value, "sellerId");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andSellerIdGreaterThanOrEqualTo(String value) {
            addCriterion("seller_id >=", value, "sellerId");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andSellerIdLessThan(String value) {
            addCriterion("seller_id <", value, "sellerId");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andSellerIdLessThanOrEqualTo(String value) {
            addCriterion("seller_id <=", value, "sellerId");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andSellerIdLike(String value) {
            addCriterion("seller_id like", value, "sellerId");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andSellerIdNotLike(String value) {
            addCriterion("seller_id not like", value, "sellerId");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andSellerIdIn(List<String> values) {
            addCriterion("seller_id in", values, "sellerId");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andSellerIdNotIn(List<String> values) {
            addCriterion("seller_id not in", values, "sellerId");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andSellerIdBetween(String value1, String value2) {
            addCriterion("seller_id between", value1, value2, "sellerId");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andSellerIdNotBetween(String value1, String value2) {
            addCriterion("seller_id not between", value1, value2, "sellerId");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andIsDefaultIsNull() {
            addCriterion("is_default is null");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andIsDefaultIsNotNull() {
            addCriterion("is_default is not null");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andIsDefaultEqualTo(String value) {
            addCriterion("is_default =", value, "isDefault");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andIsDefaultNotEqualTo(String value) {
            addCriterion("is_default <>", value, "isDefault");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andIsDefaultGreaterThan(String value) {
            addCriterion("is_default >", value, "isDefault");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andIsDefaultGreaterThanOrEqualTo(String value) {
            addCriterion("is_default >=", value, "isDefault");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andIsDefaultLessThan(String value) {
            addCriterion("is_default <", value, "isDefault");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andIsDefaultLessThanOrEqualTo(String value) {
            addCriterion("is_default <=", value, "isDefault");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andIsDefaultLike(String value) {
            addCriterion("is_default like", value, "isDefault");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andIsDefaultNotLike(String value) {
            addCriterion("is_default not like", value, "isDefault");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andIsDefaultIn(List<String> values) {
            addCriterion("is_default in", values, "isDefault");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andIsDefaultNotIn(List<String> values) {
            addCriterion("is_default not in", values, "isDefault");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andIsDefaultBetween(String value1, String value2) {
            addCriterion("is_default between", value1, value2, "isDefault");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andIsDefaultNotBetween(String value1, String value2) {
            addCriterion("is_default not between", value1, value2, "isDefault");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andSendTimeTypeIsNull() {
            addCriterion("send_time_type is null");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andSendTimeTypeIsNotNull() {
            addCriterion("send_time_type is not null");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andSendTimeTypeEqualTo(String value) {
            addCriterion("send_time_type =", value, "sendTimeType");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andSendTimeTypeNotEqualTo(String value) {
            addCriterion("send_time_type <>", value, "sendTimeType");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andSendTimeTypeGreaterThan(String value) {
            addCriterion("send_time_type >", value, "sendTimeType");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andSendTimeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("send_time_type >=", value, "sendTimeType");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andSendTimeTypeLessThan(String value) {
            addCriterion("send_time_type <", value, "sendTimeType");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andSendTimeTypeLessThanOrEqualTo(String value) {
            addCriterion("send_time_type <=", value, "sendTimeType");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andSendTimeTypeLike(String value) {
            addCriterion("send_time_type like", value, "sendTimeType");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andSendTimeTypeNotLike(String value) {
            addCriterion("send_time_type not like", value, "sendTimeType");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andSendTimeTypeIn(List<String> values) {
            addCriterion("send_time_type in", values, "sendTimeType");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andSendTimeTypeNotIn(List<String> values) {
            addCriterion("send_time_type not in", values, "sendTimeType");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andSendTimeTypeBetween(String value1, String value2) {
            addCriterion("send_time_type between", value1, value2, "sendTimeType");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andSendTimeTypeNotBetween(String value1, String value2) {
            addCriterion("send_time_type not between", value1, value2, "sendTimeType");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andPriceEqualTo(Long value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andPriceNotEqualTo(Long value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andPriceGreaterThan(Long value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andPriceLessThan(Long value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andPriceLessThanOrEqualTo(Long value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andPriceIn(List<Long> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andPriceNotIn(List<Long> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andPriceBetween(Long value1, Long value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andPriceNotBetween(Long value1, Long value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
    }

    public TbFreightTemplateExample.Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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
