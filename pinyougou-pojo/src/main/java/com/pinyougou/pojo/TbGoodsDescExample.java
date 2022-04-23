
package com.pinyougou.pojo;

import java.util.ArrayList;
import java.util.List;
public class TbGoodsDescExample {
  protected String orderByClause;

  protected boolean distinct;

  public static class Criteria extends TbGoodsDescExample.GeneratedCriteria {
    protected Criteria() {
            super();
    }

  }

  protected List<TbGoodsDescExample.Criteria> oredCriteria;

  public TbGoodsDescExample() {
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

  public List<TbGoodsDescExample.Criteria> getOredCriteria() {
        return oredCriteria;
  }

  public void or(TbGoodsDescExample.Criteria criteria) {
        oredCriteria.add(criteria);
  }

  public TbGoodsDescExample.Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
  }

  public TbGoodsDescExample.Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
  }

  protected TbGoodsDescExample.Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
  }

  public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
  }

  protected static abstract class GeneratedCriteria {
    protected List<TbGoodsDescExample.Criterion> criteria;

    protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
    }

    public boolean isValid() {
            return criteria.size() > 0;
    }

    public List<TbGoodsDescExample.Criterion> getAllCriteria() {
            return criteria;
    }

    public List<TbGoodsDescExample.Criterion> getCriteria() {
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

    public TbGoodsDescExample.Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andGoodsIdEqualTo(Long value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andGoodsIdNotEqualTo(Long value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andGoodsIdGreaterThan(Long value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andGoodsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andGoodsIdLessThan(Long value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andGoodsIdLessThanOrEqualTo(Long value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andGoodsIdIn(List<Long> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andGoodsIdNotIn(List<Long> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andGoodsIdBetween(Long value1, Long value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andGoodsIdNotBetween(Long value1, Long value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andIntroductionIsNull() {
            addCriterion("introduction is null");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andIntroductionIsNotNull() {
            addCriterion("introduction is not null");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andIntroductionEqualTo(String value) {
            addCriterion("introduction =", value, "introduction");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andIntroductionNotEqualTo(String value) {
            addCriterion("introduction <>", value, "introduction");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andIntroductionGreaterThan(String value) {
            addCriterion("introduction >", value, "introduction");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("introduction >=", value, "introduction");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andIntroductionLessThan(String value) {
            addCriterion("introduction <", value, "introduction");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andIntroductionLessThanOrEqualTo(String value) {
            addCriterion("introduction <=", value, "introduction");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andIntroductionLike(String value) {
            addCriterion("introduction like", value, "introduction");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andIntroductionNotLike(String value) {
            addCriterion("introduction not like", value, "introduction");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andIntroductionIn(List<String> values) {
            addCriterion("introduction in", values, "introduction");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andIntroductionNotIn(List<String> values) {
            addCriterion("introduction not in", values, "introduction");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andIntroductionBetween(String value1, String value2) {
            addCriterion("introduction between", value1, value2, "introduction");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andIntroductionNotBetween(String value1, String value2) {
            addCriterion("introduction not between", value1, value2, "introduction");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andSpecificationItemsIsNull() {
            addCriterion("specification_items is null");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andSpecificationItemsIsNotNull() {
            addCriterion("specification_items is not null");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andSpecificationItemsEqualTo(String value) {
            addCriterion("specification_items =", value, "specificationItems");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andSpecificationItemsNotEqualTo(String value) {
            addCriterion("specification_items <>", value, "specificationItems");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andSpecificationItemsGreaterThan(String value) {
            addCriterion("specification_items >", value, "specificationItems");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andSpecificationItemsGreaterThanOrEqualTo(String value) {
            addCriterion("specification_items >=", value, "specificationItems");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andSpecificationItemsLessThan(String value) {
            addCriterion("specification_items <", value, "specificationItems");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andSpecificationItemsLessThanOrEqualTo(String value) {
            addCriterion("specification_items <=", value, "specificationItems");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andSpecificationItemsLike(String value) {
            addCriterion("specification_items like", value, "specificationItems");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andSpecificationItemsNotLike(String value) {
            addCriterion("specification_items not like", value, "specificationItems");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andSpecificationItemsIn(List<String> values) {
            addCriterion("specification_items in", values, "specificationItems");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andSpecificationItemsNotIn(List<String> values) {
            addCriterion("specification_items not in", values, "specificationItems");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andSpecificationItemsBetween(String value1, String value2) {
            addCriterion("specification_items between", value1, value2, "specificationItems");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andSpecificationItemsNotBetween(String value1, String value2) {
            addCriterion("specification_items not between", value1, value2, "specificationItems");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andCustomAttributeItemsIsNull() {
            addCriterion("custom_attribute_items is null");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andCustomAttributeItemsIsNotNull() {
            addCriterion("custom_attribute_items is not null");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andCustomAttributeItemsEqualTo(String value) {
            addCriterion("custom_attribute_items =", value, "customAttributeItems");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andCustomAttributeItemsNotEqualTo(String value) {
            addCriterion("custom_attribute_items <>", value, "customAttributeItems");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andCustomAttributeItemsGreaterThan(String value) {
            addCriterion("custom_attribute_items >", value, "customAttributeItems");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andCustomAttributeItemsGreaterThanOrEqualTo(String value) {
            addCriterion("custom_attribute_items >=", value, "customAttributeItems");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andCustomAttributeItemsLessThan(String value) {
            addCriterion("custom_attribute_items <", value, "customAttributeItems");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andCustomAttributeItemsLessThanOrEqualTo(String value) {
            addCriterion("custom_attribute_items <=", value, "customAttributeItems");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andCustomAttributeItemsLike(String value) {
            addCriterion("custom_attribute_items like", value, "customAttributeItems");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andCustomAttributeItemsNotLike(String value) {
            addCriterion("custom_attribute_items not like", value, "customAttributeItems");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andCustomAttributeItemsIn(List<String> values) {
            addCriterion("custom_attribute_items in", values, "customAttributeItems");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andCustomAttributeItemsNotIn(List<String> values) {
            addCriterion("custom_attribute_items not in", values, "customAttributeItems");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andCustomAttributeItemsBetween(String value1, String value2) {
            addCriterion("custom_attribute_items between", value1, value2, "customAttributeItems");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andCustomAttributeItemsNotBetween(String value1, String value2) {
            addCriterion("custom_attribute_items not between", value1, value2, "customAttributeItems");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andItemImagesIsNull() {
            addCriterion("item_images is null");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andItemImagesIsNotNull() {
            addCriterion("item_images is not null");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andItemImagesEqualTo(String value) {
            addCriterion("item_images =", value, "itemImages");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andItemImagesNotEqualTo(String value) {
            addCriterion("item_images <>", value, "itemImages");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andItemImagesGreaterThan(String value) {
            addCriterion("item_images >", value, "itemImages");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andItemImagesGreaterThanOrEqualTo(String value) {
            addCriterion("item_images >=", value, "itemImages");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andItemImagesLessThan(String value) {
            addCriterion("item_images <", value, "itemImages");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andItemImagesLessThanOrEqualTo(String value) {
            addCriterion("item_images <=", value, "itemImages");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andItemImagesLike(String value) {
            addCriterion("item_images like", value, "itemImages");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andItemImagesNotLike(String value) {
            addCriterion("item_images not like", value, "itemImages");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andItemImagesIn(List<String> values) {
            addCriterion("item_images in", values, "itemImages");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andItemImagesNotIn(List<String> values) {
            addCriterion("item_images not in", values, "itemImages");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andItemImagesBetween(String value1, String value2) {
            addCriterion("item_images between", value1, value2, "itemImages");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andItemImagesNotBetween(String value1, String value2) {
            addCriterion("item_images not between", value1, value2, "itemImages");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andPackageListIsNull() {
            addCriterion("package_list is null");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andPackageListIsNotNull() {
            addCriterion("package_list is not null");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andPackageListEqualTo(String value) {
            addCriterion("package_list =", value, "packageList");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andPackageListNotEqualTo(String value) {
            addCriterion("package_list <>", value, "packageList");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andPackageListGreaterThan(String value) {
            addCriterion("package_list >", value, "packageList");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andPackageListGreaterThanOrEqualTo(String value) {
            addCriterion("package_list >=", value, "packageList");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andPackageListLessThan(String value) {
            addCriterion("package_list <", value, "packageList");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andPackageListLessThanOrEqualTo(String value) {
            addCriterion("package_list <=", value, "packageList");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andPackageListLike(String value) {
            addCriterion("package_list like", value, "packageList");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andPackageListNotLike(String value) {
            addCriterion("package_list not like", value, "packageList");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andPackageListIn(List<String> values) {
            addCriterion("package_list in", values, "packageList");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andPackageListNotIn(List<String> values) {
            addCriterion("package_list not in", values, "packageList");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andPackageListBetween(String value1, String value2) {
            addCriterion("package_list between", value1, value2, "packageList");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andPackageListNotBetween(String value1, String value2) {
            addCriterion("package_list not between", value1, value2, "packageList");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andSaleServiceIsNull() {
            addCriterion("sale_service is null");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andSaleServiceIsNotNull() {
            addCriterion("sale_service is not null");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andSaleServiceEqualTo(String value) {
            addCriterion("sale_service =", value, "saleService");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andSaleServiceNotEqualTo(String value) {
            addCriterion("sale_service <>", value, "saleService");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andSaleServiceGreaterThan(String value) {
            addCriterion("sale_service >", value, "saleService");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andSaleServiceGreaterThanOrEqualTo(String value) {
            addCriterion("sale_service >=", value, "saleService");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andSaleServiceLessThan(String value) {
            addCriterion("sale_service <", value, "saleService");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andSaleServiceLessThanOrEqualTo(String value) {
            addCriterion("sale_service <=", value, "saleService");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andSaleServiceLike(String value) {
            addCriterion("sale_service like", value, "saleService");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andSaleServiceNotLike(String value) {
            addCriterion("sale_service not like", value, "saleService");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andSaleServiceIn(List<String> values) {
            addCriterion("sale_service in", values, "saleService");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andSaleServiceNotIn(List<String> values) {
            addCriterion("sale_service not in", values, "saleService");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andSaleServiceBetween(String value1, String value2) {
            addCriterion("sale_service between", value1, value2, "saleService");
            return (Criteria) this;
    }

    public TbGoodsDescExample.Criteria andSaleServiceNotBetween(String value1, String value2) {
            addCriterion("sale_service not between", value1, value2, "saleService");
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
