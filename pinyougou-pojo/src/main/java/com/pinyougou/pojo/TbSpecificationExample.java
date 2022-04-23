
package com.pinyougou.pojo;

import java.util.ArrayList;
import java.util.List;
public class TbSpecificationExample {
  protected String orderByClause;

  protected boolean distinct;

  public static class Criteria extends TbSpecificationExample.GeneratedCriteria {
    protected Criteria() {
            super();
    }

  }

  protected List<TbSpecificationExample.Criteria> oredCriteria;

  public TbSpecificationExample() {
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

  public List<TbSpecificationExample.Criteria> getOredCriteria() {
        return oredCriteria;
  }

  public void or(TbSpecificationExample.Criteria criteria) {
        oredCriteria.add(criteria);
  }

  public TbSpecificationExample.Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
  }

  public TbSpecificationExample.Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
  }

  protected TbSpecificationExample.Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
  }

  public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
  }

  protected static abstract class GeneratedCriteria {
    protected List<TbSpecificationExample.Criterion> criteria;

    protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
    }

    public boolean isValid() {
            return criteria.size() > 0;
    }

    public List<TbSpecificationExample.Criterion> getAllCriteria() {
            return criteria;
    }

    public List<TbSpecificationExample.Criterion> getCriteria() {
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

    public TbSpecificationExample.Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
    }

    public TbSpecificationExample.Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
    }

    public TbSpecificationExample.Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
    }

    public TbSpecificationExample.Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
    }

    public TbSpecificationExample.Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
    }

    public TbSpecificationExample.Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
    }

    public TbSpecificationExample.Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
    }

    public TbSpecificationExample.Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
    }

    public TbSpecificationExample.Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
    }

    public TbSpecificationExample.Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
    }

    public TbSpecificationExample.Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
    }

    public TbSpecificationExample.Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
    }

    public TbSpecificationExample.Criteria andSpecNameIsNull() {
            addCriterion("spec_name is null");
            return (Criteria) this;
    }

    public TbSpecificationExample.Criteria andSpecNameIsNotNull() {
            addCriterion("spec_name is not null");
            return (Criteria) this;
    }

    public TbSpecificationExample.Criteria andSpecNameEqualTo(String value) {
            addCriterion("spec_name =", value, "specName");
            return (Criteria) this;
    }

    public TbSpecificationExample.Criteria andSpecNameNotEqualTo(String value) {
            addCriterion("spec_name <>", value, "specName");
            return (Criteria) this;
    }

    public TbSpecificationExample.Criteria andSpecNameGreaterThan(String value) {
            addCriterion("spec_name >", value, "specName");
            return (Criteria) this;
    }

    public TbSpecificationExample.Criteria andSpecNameGreaterThanOrEqualTo(String value) {
            addCriterion("spec_name >=", value, "specName");
            return (Criteria) this;
    }

    public TbSpecificationExample.Criteria andSpecNameLessThan(String value) {
            addCriterion("spec_name <", value, "specName");
            return (Criteria) this;
    }

    public TbSpecificationExample.Criteria andSpecNameLessThanOrEqualTo(String value) {
            addCriterion("spec_name <=", value, "specName");
            return (Criteria) this;
    }

    public TbSpecificationExample.Criteria andSpecNameLike(String value) {
            addCriterion("spec_name like", value, "specName");
            return (Criteria) this;
    }

    public TbSpecificationExample.Criteria andSpecNameNotLike(String value) {
            addCriterion("spec_name not like", value, "specName");
            return (Criteria) this;
    }

    public TbSpecificationExample.Criteria andSpecNameIn(List<String> values) {
            addCriterion("spec_name in", values, "specName");
            return (Criteria) this;
    }

    public TbSpecificationExample.Criteria andSpecNameNotIn(List<String> values) {
            addCriterion("spec_name not in", values, "specName");
            return (Criteria) this;
    }

    public TbSpecificationExample.Criteria andSpecNameBetween(String value1, String value2) {
            addCriterion("spec_name between", value1, value2, "specName");
            return (Criteria) this;
    }

    public TbSpecificationExample.Criteria andSpecNameNotBetween(String value1, String value2) {
            addCriterion("spec_name not between", value1, value2, "specName");
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
