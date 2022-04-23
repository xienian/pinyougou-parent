
package com.pinyougou.pojo;

import java.util.ArrayList;
import java.util.List;
public class TbAreasExample {
  protected String orderByClause;

  protected boolean distinct;

  public static class Criteria extends TbAreasExample.GeneratedCriteria {
    protected Criteria() {
            super();
    }

  }

  protected List<TbAreasExample.Criteria> oredCriteria;

  public TbAreasExample() {
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

  public List<TbAreasExample.Criteria> getOredCriteria() {
        return oredCriteria;
  }

  public void or(TbAreasExample.Criteria criteria) {
        oredCriteria.add(criteria);
  }

  public TbAreasExample.Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
  }

  public TbAreasExample.Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
  }

  protected TbAreasExample.Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
  }

  public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
  }

  protected static abstract class GeneratedCriteria {
    protected List<TbAreasExample.Criterion> criteria;

    protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
    }

    public boolean isValid() {
            return criteria.size() > 0;
    }

    public List<TbAreasExample.Criterion> getAllCriteria() {
            return criteria;
    }

    public List<TbAreasExample.Criterion> getCriteria() {
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

    public TbAreasExample.Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
    }

    public TbAreasExample.Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
    }

    public TbAreasExample.Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
    }

    public TbAreasExample.Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
    }

    public TbAreasExample.Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
    }

    public TbAreasExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
    }

    public TbAreasExample.Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
    }

    public TbAreasExample.Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
    }

    public TbAreasExample.Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
    }

    public TbAreasExample.Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
    }

    public TbAreasExample.Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
    }

    public TbAreasExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
    }

    public TbAreasExample.Criteria andAreaidIsNull() {
            addCriterion("areaid is null");
            return (Criteria) this;
    }

    public TbAreasExample.Criteria andAreaidIsNotNull() {
            addCriterion("areaid is not null");
            return (Criteria) this;
    }

    public TbAreasExample.Criteria andAreaidEqualTo(String value) {
            addCriterion("areaid =", value, "areaid");
            return (Criteria) this;
    }

    public TbAreasExample.Criteria andAreaidNotEqualTo(String value) {
            addCriterion("areaid <>", value, "areaid");
            return (Criteria) this;
    }

    public TbAreasExample.Criteria andAreaidGreaterThan(String value) {
            addCriterion("areaid >", value, "areaid");
            return (Criteria) this;
    }

    public TbAreasExample.Criteria andAreaidGreaterThanOrEqualTo(String value) {
            addCriterion("areaid >=", value, "areaid");
            return (Criteria) this;
    }

    public TbAreasExample.Criteria andAreaidLessThan(String value) {
            addCriterion("areaid <", value, "areaid");
            return (Criteria) this;
    }

    public TbAreasExample.Criteria andAreaidLessThanOrEqualTo(String value) {
            addCriterion("areaid <=", value, "areaid");
            return (Criteria) this;
    }

    public TbAreasExample.Criteria andAreaidLike(String value) {
            addCriterion("areaid like", value, "areaid");
            return (Criteria) this;
    }

    public TbAreasExample.Criteria andAreaidNotLike(String value) {
            addCriterion("areaid not like", value, "areaid");
            return (Criteria) this;
    }

    public TbAreasExample.Criteria andAreaidIn(List<String> values) {
            addCriterion("areaid in", values, "areaid");
            return (Criteria) this;
    }

    public TbAreasExample.Criteria andAreaidNotIn(List<String> values) {
            addCriterion("areaid not in", values, "areaid");
            return (Criteria) this;
    }

    public TbAreasExample.Criteria andAreaidBetween(String value1, String value2) {
            addCriterion("areaid between", value1, value2, "areaid");
            return (Criteria) this;
    }

    public TbAreasExample.Criteria andAreaidNotBetween(String value1, String value2) {
            addCriterion("areaid not between", value1, value2, "areaid");
            return (Criteria) this;
    }

    public TbAreasExample.Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
    }

    public TbAreasExample.Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
    }

    public TbAreasExample.Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
    }

    public TbAreasExample.Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
    }

    public TbAreasExample.Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
    }

    public TbAreasExample.Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
    }

    public TbAreasExample.Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
    }

    public TbAreasExample.Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
    }

    public TbAreasExample.Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
    }

    public TbAreasExample.Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
    }

    public TbAreasExample.Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
    }

    public TbAreasExample.Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
    }

    public TbAreasExample.Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
    }

    public TbAreasExample.Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
    }

    public TbAreasExample.Criteria andCityidIsNull() {
            addCriterion("cityid is null");
            return (Criteria) this;
    }

    public TbAreasExample.Criteria andCityidIsNotNull() {
            addCriterion("cityid is not null");
            return (Criteria) this;
    }

    public TbAreasExample.Criteria andCityidEqualTo(String value) {
            addCriterion("cityid =", value, "cityid");
            return (Criteria) this;
    }

    public TbAreasExample.Criteria andCityidNotEqualTo(String value) {
            addCriterion("cityid <>", value, "cityid");
            return (Criteria) this;
    }

    public TbAreasExample.Criteria andCityidGreaterThan(String value) {
            addCriterion("cityid >", value, "cityid");
            return (Criteria) this;
    }

    public TbAreasExample.Criteria andCityidGreaterThanOrEqualTo(String value) {
            addCriterion("cityid >=", value, "cityid");
            return (Criteria) this;
    }

    public TbAreasExample.Criteria andCityidLessThan(String value) {
            addCriterion("cityid <", value, "cityid");
            return (Criteria) this;
    }

    public TbAreasExample.Criteria andCityidLessThanOrEqualTo(String value) {
            addCriterion("cityid <=", value, "cityid");
            return (Criteria) this;
    }

    public TbAreasExample.Criteria andCityidLike(String value) {
            addCriterion("cityid like", value, "cityid");
            return (Criteria) this;
    }

    public TbAreasExample.Criteria andCityidNotLike(String value) {
            addCriterion("cityid not like", value, "cityid");
            return (Criteria) this;
    }

    public TbAreasExample.Criteria andCityidIn(List<String> values) {
            addCriterion("cityid in", values, "cityid");
            return (Criteria) this;
    }

    public TbAreasExample.Criteria andCityidNotIn(List<String> values) {
            addCriterion("cityid not in", values, "cityid");
            return (Criteria) this;
    }

    public TbAreasExample.Criteria andCityidBetween(String value1, String value2) {
            addCriterion("cityid between", value1, value2, "cityid");
            return (Criteria) this;
    }

    public TbAreasExample.Criteria andCityidNotBetween(String value1, String value2) {
            addCriterion("cityid not between", value1, value2, "cityid");
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
