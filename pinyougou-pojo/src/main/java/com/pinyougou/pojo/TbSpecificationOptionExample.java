
package com.pinyougou.pojo;

import java.util.ArrayList;
import java.util.List;
public class TbSpecificationOptionExample {
  protected String orderByClause;

  protected boolean distinct;

  public static class Criteria extends TbSpecificationOptionExample.GeneratedCriteria {
    protected Criteria() {
            super();
    }

  }

  protected List<TbSpecificationOptionExample.Criteria> oredCriteria;

  public TbSpecificationOptionExample() {
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

  public List<TbSpecificationOptionExample.Criteria> getOredCriteria() {
        return oredCriteria;
  }

  public void or(TbSpecificationOptionExample.Criteria criteria) {
        oredCriteria.add(criteria);
  }

  public TbSpecificationOptionExample.Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
  }

  public TbSpecificationOptionExample.Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
  }

  protected TbSpecificationOptionExample.Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
  }

  public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
  }

  protected static abstract class GeneratedCriteria {
    protected List<TbSpecificationOptionExample.Criterion> criteria;

    protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
    }

    public boolean isValid() {
            return criteria.size() > 0;
    }

    public List<TbSpecificationOptionExample.Criterion> getAllCriteria() {
            return criteria;
    }

    public List<TbSpecificationOptionExample.Criterion> getCriteria() {
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

    public TbSpecificationOptionExample.Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
    }

    public TbSpecificationOptionExample.Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
    }

    public TbSpecificationOptionExample.Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
    }

    public TbSpecificationOptionExample.Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
    }

    public TbSpecificationOptionExample.Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
    }

    public TbSpecificationOptionExample.Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
    }

    public TbSpecificationOptionExample.Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
    }

    public TbSpecificationOptionExample.Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
    }

    public TbSpecificationOptionExample.Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
    }

    public TbSpecificationOptionExample.Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
    }

    public TbSpecificationOptionExample.Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
    }

    public TbSpecificationOptionExample.Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
    }

    public TbSpecificationOptionExample.Criteria andOptionNameIsNull() {
            addCriterion("option_name is null");
            return (Criteria) this;
    }

    public TbSpecificationOptionExample.Criteria andOptionNameIsNotNull() {
            addCriterion("option_name is not null");
            return (Criteria) this;
    }

    public TbSpecificationOptionExample.Criteria andOptionNameEqualTo(String value) {
            addCriterion("option_name =", value, "optionName");
            return (Criteria) this;
    }

    public TbSpecificationOptionExample.Criteria andOptionNameNotEqualTo(String value) {
            addCriterion("option_name <>", value, "optionName");
            return (Criteria) this;
    }

    public TbSpecificationOptionExample.Criteria andOptionNameGreaterThan(String value) {
            addCriterion("option_name >", value, "optionName");
            return (Criteria) this;
    }

    public TbSpecificationOptionExample.Criteria andOptionNameGreaterThanOrEqualTo(String value) {
            addCriterion("option_name >=", value, "optionName");
            return (Criteria) this;
    }

    public TbSpecificationOptionExample.Criteria andOptionNameLessThan(String value) {
            addCriterion("option_name <", value, "optionName");
            return (Criteria) this;
    }

    public TbSpecificationOptionExample.Criteria andOptionNameLessThanOrEqualTo(String value) {
            addCriterion("option_name <=", value, "optionName");
            return (Criteria) this;
    }

    public TbSpecificationOptionExample.Criteria andOptionNameLike(String value) {
            addCriterion("option_name like", value, "optionName");
            return (Criteria) this;
    }

    public TbSpecificationOptionExample.Criteria andOptionNameNotLike(String value) {
            addCriterion("option_name not like", value, "optionName");
            return (Criteria) this;
    }

    public TbSpecificationOptionExample.Criteria andOptionNameIn(List<String> values) {
            addCriterion("option_name in", values, "optionName");
            return (Criteria) this;
    }

    public TbSpecificationOptionExample.Criteria andOptionNameNotIn(List<String> values) {
            addCriterion("option_name not in", values, "optionName");
            return (Criteria) this;
    }

    public TbSpecificationOptionExample.Criteria andOptionNameBetween(String value1, String value2) {
            addCriterion("option_name between", value1, value2, "optionName");
            return (Criteria) this;
    }

    public TbSpecificationOptionExample.Criteria andOptionNameNotBetween(String value1, String value2) {
            addCriterion("option_name not between", value1, value2, "optionName");
            return (Criteria) this;
    }

    public TbSpecificationOptionExample.Criteria andSpecIdIsNull() {
            addCriterion("spec_id is null");
            return (Criteria) this;
    }

    public TbSpecificationOptionExample.Criteria andSpecIdIsNotNull() {
            addCriterion("spec_id is not null");
            return (Criteria) this;
    }

    public TbSpecificationOptionExample.Criteria andSpecIdEqualTo(Long value) {
            addCriterion("spec_id =", value, "specId");
            return (Criteria) this;
    }

    public TbSpecificationOptionExample.Criteria andSpecIdNotEqualTo(Long value) {
            addCriterion("spec_id <>", value, "specId");
            return (Criteria) this;
    }

    public TbSpecificationOptionExample.Criteria andSpecIdGreaterThan(Long value) {
            addCriterion("spec_id >", value, "specId");
            return (Criteria) this;
    }

    public TbSpecificationOptionExample.Criteria andSpecIdGreaterThanOrEqualTo(Long value) {
            addCriterion("spec_id >=", value, "specId");
            return (Criteria) this;
    }

    public TbSpecificationOptionExample.Criteria andSpecIdLessThan(Long value) {
            addCriterion("spec_id <", value, "specId");
            return (Criteria) this;
    }

    public TbSpecificationOptionExample.Criteria andSpecIdLessThanOrEqualTo(Long value) {
            addCriterion("spec_id <=", value, "specId");
            return (Criteria) this;
    }

    public TbSpecificationOptionExample.Criteria andSpecIdIn(List<Long> values) {
            addCriterion("spec_id in", values, "specId");
            return (Criteria) this;
    }

    public TbSpecificationOptionExample.Criteria andSpecIdNotIn(List<Long> values) {
            addCriterion("spec_id not in", values, "specId");
            return (Criteria) this;
    }

    public TbSpecificationOptionExample.Criteria andSpecIdBetween(Long value1, Long value2) {
            addCriterion("spec_id between", value1, value2, "specId");
            return (Criteria) this;
    }

    public TbSpecificationOptionExample.Criteria andSpecIdNotBetween(Long value1, Long value2) {
            addCriterion("spec_id not between", value1, value2, "specId");
            return (Criteria) this;
    }

    public TbSpecificationOptionExample.Criteria andOrdersIsNull() {
            addCriterion("orders is null");
            return (Criteria) this;
    }

    public TbSpecificationOptionExample.Criteria andOrdersIsNotNull() {
            addCriterion("orders is not null");
            return (Criteria) this;
    }

    public TbSpecificationOptionExample.Criteria andOrdersEqualTo(Integer value) {
            addCriterion("orders =", value, "orders");
            return (Criteria) this;
    }

    public TbSpecificationOptionExample.Criteria andOrdersNotEqualTo(Integer value) {
            addCriterion("orders <>", value, "orders");
            return (Criteria) this;
    }

    public TbSpecificationOptionExample.Criteria andOrdersGreaterThan(Integer value) {
            addCriterion("orders >", value, "orders");
            return (Criteria) this;
    }

    public TbSpecificationOptionExample.Criteria andOrdersGreaterThanOrEqualTo(Integer value) {
            addCriterion("orders >=", value, "orders");
            return (Criteria) this;
    }

    public TbSpecificationOptionExample.Criteria andOrdersLessThan(Integer value) {
            addCriterion("orders <", value, "orders");
            return (Criteria) this;
    }

    public TbSpecificationOptionExample.Criteria andOrdersLessThanOrEqualTo(Integer value) {
            addCriterion("orders <=", value, "orders");
            return (Criteria) this;
    }

    public TbSpecificationOptionExample.Criteria andOrdersIn(List<Integer> values) {
            addCriterion("orders in", values, "orders");
            return (Criteria) this;
    }

    public TbSpecificationOptionExample.Criteria andOrdersNotIn(List<Integer> values) {
            addCriterion("orders not in", values, "orders");
            return (Criteria) this;
    }

    public TbSpecificationOptionExample.Criteria andOrdersBetween(Integer value1, Integer value2) {
            addCriterion("orders between", value1, value2, "orders");
            return (Criteria) this;
    }

    public TbSpecificationOptionExample.Criteria andOrdersNotBetween(Integer value1, Integer value2) {
            addCriterion("orders not between", value1, value2, "orders");
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
