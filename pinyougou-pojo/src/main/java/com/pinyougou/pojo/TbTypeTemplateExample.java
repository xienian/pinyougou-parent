
package com.pinyougou.pojo;

import java.util.ArrayList;
import java.util.List;
public class TbTypeTemplateExample {
  protected String orderByClause;

  protected boolean distinct;

  public static class Criteria extends TbTypeTemplateExample.GeneratedCriteria {
    protected Criteria() {
            super();
    }

  }

  protected List<TbTypeTemplateExample.Criteria> oredCriteria;

  public TbTypeTemplateExample() {
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

  public List<TbTypeTemplateExample.Criteria> getOredCriteria() {
        return oredCriteria;
  }

  public void or(TbTypeTemplateExample.Criteria criteria) {
        oredCriteria.add(criteria);
  }

  public TbTypeTemplateExample.Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
  }

  public TbTypeTemplateExample.Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
  }

  protected TbTypeTemplateExample.Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
  }

  public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
  }

  protected static abstract class GeneratedCriteria {
    protected List<TbTypeTemplateExample.Criterion> criteria;

    protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
    }

    public boolean isValid() {
            return criteria.size() > 0;
    }

    public List<TbTypeTemplateExample.Criterion> getAllCriteria() {
            return criteria;
    }

    public List<TbTypeTemplateExample.Criterion> getCriteria() {
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

    public TbTypeTemplateExample.Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andSpecIdsIsNull() {
            addCriterion("spec_ids is null");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andSpecIdsIsNotNull() {
            addCriterion("spec_ids is not null");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andSpecIdsEqualTo(String value) {
            addCriterion("spec_ids =", value, "specIds");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andSpecIdsNotEqualTo(String value) {
            addCriterion("spec_ids <>", value, "specIds");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andSpecIdsGreaterThan(String value) {
            addCriterion("spec_ids >", value, "specIds");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andSpecIdsGreaterThanOrEqualTo(String value) {
            addCriterion("spec_ids >=", value, "specIds");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andSpecIdsLessThan(String value) {
            addCriterion("spec_ids <", value, "specIds");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andSpecIdsLessThanOrEqualTo(String value) {
            addCriterion("spec_ids <=", value, "specIds");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andSpecIdsLike(String value) {
            addCriterion("spec_ids like", value, "specIds");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andSpecIdsNotLike(String value) {
            addCriterion("spec_ids not like", value, "specIds");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andSpecIdsIn(List<String> values) {
            addCriterion("spec_ids in", values, "specIds");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andSpecIdsNotIn(List<String> values) {
            addCriterion("spec_ids not in", values, "specIds");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andSpecIdsBetween(String value1, String value2) {
            addCriterion("spec_ids between", value1, value2, "specIds");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andSpecIdsNotBetween(String value1, String value2) {
            addCriterion("spec_ids not between", value1, value2, "specIds");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andBrandIdsIsNull() {
            addCriterion("brand_ids is null");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andBrandIdsIsNotNull() {
            addCriterion("brand_ids is not null");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andBrandIdsEqualTo(String value) {
            addCriterion("brand_ids =", value, "brandIds");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andBrandIdsNotEqualTo(String value) {
            addCriterion("brand_ids <>", value, "brandIds");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andBrandIdsGreaterThan(String value) {
            addCriterion("brand_ids >", value, "brandIds");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andBrandIdsGreaterThanOrEqualTo(String value) {
            addCriterion("brand_ids >=", value, "brandIds");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andBrandIdsLessThan(String value) {
            addCriterion("brand_ids <", value, "brandIds");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andBrandIdsLessThanOrEqualTo(String value) {
            addCriterion("brand_ids <=", value, "brandIds");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andBrandIdsLike(String value) {
            addCriterion("brand_ids like", value, "brandIds");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andBrandIdsNotLike(String value) {
            addCriterion("brand_ids not like", value, "brandIds");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andBrandIdsIn(List<String> values) {
            addCriterion("brand_ids in", values, "brandIds");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andBrandIdsNotIn(List<String> values) {
            addCriterion("brand_ids not in", values, "brandIds");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andBrandIdsBetween(String value1, String value2) {
            addCriterion("brand_ids between", value1, value2, "brandIds");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andBrandIdsNotBetween(String value1, String value2) {
            addCriterion("brand_ids not between", value1, value2, "brandIds");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andCustomAttributeItemsIsNull() {
            addCriterion("custom_attribute_items is null");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andCustomAttributeItemsIsNotNull() {
            addCriterion("custom_attribute_items is not null");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andCustomAttributeItemsEqualTo(String value) {
            addCriterion("custom_attribute_items =", value, "customAttributeItems");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andCustomAttributeItemsNotEqualTo(String value) {
            addCriterion("custom_attribute_items <>", value, "customAttributeItems");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andCustomAttributeItemsGreaterThan(String value) {
            addCriterion("custom_attribute_items >", value, "customAttributeItems");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andCustomAttributeItemsGreaterThanOrEqualTo(String value) {
            addCriterion("custom_attribute_items >=", value, "customAttributeItems");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andCustomAttributeItemsLessThan(String value) {
            addCriterion("custom_attribute_items <", value, "customAttributeItems");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andCustomAttributeItemsLessThanOrEqualTo(String value) {
            addCriterion("custom_attribute_items <=", value, "customAttributeItems");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andCustomAttributeItemsLike(String value) {
            addCriterion("custom_attribute_items like", value, "customAttributeItems");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andCustomAttributeItemsNotLike(String value) {
            addCriterion("custom_attribute_items not like", value, "customAttributeItems");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andCustomAttributeItemsIn(List<String> values) {
            addCriterion("custom_attribute_items in", values, "customAttributeItems");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andCustomAttributeItemsNotIn(List<String> values) {
            addCriterion("custom_attribute_items not in", values, "customAttributeItems");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andCustomAttributeItemsBetween(String value1, String value2) {
            addCriterion("custom_attribute_items between", value1, value2, "customAttributeItems");
            return (Criteria) this;
    }

    public TbTypeTemplateExample.Criteria andCustomAttributeItemsNotBetween(String value1, String value2) {
            addCriterion("custom_attribute_items not between", value1, value2, "customAttributeItems");
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
