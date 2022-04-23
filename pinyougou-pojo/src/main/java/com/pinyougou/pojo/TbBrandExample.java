
package com.pinyougou.pojo;

import java.util.ArrayList;
import java.util.List;
public class TbBrandExample {
  protected String orderByClause;

  protected boolean distinct;

  public static class Criteria extends TbBrandExample.GeneratedCriteria {
    protected Criteria() {
            super();
    }

  }

  protected List<TbBrandExample.Criteria> oredCriteria;

  public TbBrandExample() {
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

  public List<TbBrandExample.Criteria> getOredCriteria() {
        return oredCriteria;
  }

  public void or(TbBrandExample.Criteria criteria) {
        oredCriteria.add(criteria);
  }

  public TbBrandExample.Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
  }

  public TbBrandExample.Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
  }

  protected TbBrandExample.Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
  }

  public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
  }

  protected static abstract class GeneratedCriteria {
    protected List<TbBrandExample.Criterion> criteria;

    protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
    }

    public boolean isValid() {
            return criteria.size() > 0;
    }

    public List<TbBrandExample.Criterion> getAllCriteria() {
            return criteria;
    }

    public List<TbBrandExample.Criterion> getCriteria() {
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

    public TbBrandExample.Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
    }

    public TbBrandExample.Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
    }

    public TbBrandExample.Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
    }

    public TbBrandExample.Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
    }

    public TbBrandExample.Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
    }

    public TbBrandExample.Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
    }

    public TbBrandExample.Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
    }

    public TbBrandExample.Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
    }

    public TbBrandExample.Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
    }

    public TbBrandExample.Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
    }

    public TbBrandExample.Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
    }

    public TbBrandExample.Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
    }

    public TbBrandExample.Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
    }

    public TbBrandExample.Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
    }

    public TbBrandExample.Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
    }

    public TbBrandExample.Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
    }

    public TbBrandExample.Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
    }

    public TbBrandExample.Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
    }

    public TbBrandExample.Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
    }

    public TbBrandExample.Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
    }

    public TbBrandExample.Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
    }

    public TbBrandExample.Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
    }

    public TbBrandExample.Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
    }

    public TbBrandExample.Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
    }

    public TbBrandExample.Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
    }

    public TbBrandExample.Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
    }

    public TbBrandExample.Criteria andFirstCharIsNull() {
            addCriterion("first_char is null");
            return (Criteria) this;
    }

    public TbBrandExample.Criteria andFirstCharIsNotNull() {
            addCriterion("first_char is not null");
            return (Criteria) this;
    }

    public TbBrandExample.Criteria andFirstCharEqualTo(String value) {
            addCriterion("first_char =", value, "firstChar");
            return (Criteria) this;
    }

    public TbBrandExample.Criteria andFirstCharNotEqualTo(String value) {
            addCriterion("first_char <>", value, "firstChar");
            return (Criteria) this;
    }

    public TbBrandExample.Criteria andFirstCharGreaterThan(String value) {
            addCriterion("first_char >", value, "firstChar");
            return (Criteria) this;
    }

    public TbBrandExample.Criteria andFirstCharGreaterThanOrEqualTo(String value) {
            addCriterion("first_char >=", value, "firstChar");
            return (Criteria) this;
    }

    public TbBrandExample.Criteria andFirstCharLessThan(String value) {
            addCriterion("first_char <", value, "firstChar");
            return (Criteria) this;
    }

    public TbBrandExample.Criteria andFirstCharLessThanOrEqualTo(String value) {
            addCriterion("first_char <=", value, "firstChar");
            return (Criteria) this;
    }

    public TbBrandExample.Criteria andFirstCharLike(String value) {
            addCriterion("first_char like", value, "firstChar");
            return (Criteria) this;
    }

    public TbBrandExample.Criteria andFirstCharNotLike(String value) {
            addCriterion("first_char not like", value, "firstChar");
            return (Criteria) this;
    }

    public TbBrandExample.Criteria andFirstCharIn(List<String> values) {
            addCriterion("first_char in", values, "firstChar");
            return (Criteria) this;
    }

    public TbBrandExample.Criteria andFirstCharNotIn(List<String> values) {
            addCriterion("first_char not in", values, "firstChar");
            return (Criteria) this;
    }

    public TbBrandExample.Criteria andFirstCharBetween(String value1, String value2) {
            addCriterion("first_char between", value1, value2, "firstChar");
            return (Criteria) this;
    }

    public TbBrandExample.Criteria andFirstCharNotBetween(String value1, String value2) {
            addCriterion("first_char not between", value1, value2, "firstChar");
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
