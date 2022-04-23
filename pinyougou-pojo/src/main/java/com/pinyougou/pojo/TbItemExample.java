
package com.pinyougou.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class TbItemExample {
  protected String orderByClause;

  protected boolean distinct;

  public static class Criteria extends TbItemExample.GeneratedCriteria {
    protected Criteria() {
            super();
    }

  }

  protected List<TbItemExample.Criteria> oredCriteria;

  public TbItemExample() {
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

  public List<TbItemExample.Criteria> getOredCriteria() {
        return oredCriteria;
  }

  public void or(TbItemExample.Criteria criteria) {
        oredCriteria.add(criteria);
  }

  public TbItemExample.Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
  }

  public TbItemExample.Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
  }

  protected TbItemExample.Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
  }

  public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
  }

  protected static abstract class GeneratedCriteria {
    protected List<TbItemExample.Criterion> criteria;

    protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
    }

    public boolean isValid() {
            return criteria.size() > 0;
    }

    public List<TbItemExample.Criterion> getAllCriteria() {
            return criteria;
    }

    public List<TbItemExample.Criterion> getCriteria() {
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

    public TbItemExample.Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andSellPointIsNull() {
            addCriterion("sell_point is null");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andSellPointIsNotNull() {
            addCriterion("sell_point is not null");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andSellPointEqualTo(String value) {
            addCriterion("sell_point =", value, "sellPoint");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andSellPointNotEqualTo(String value) {
            addCriterion("sell_point <>", value, "sellPoint");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andSellPointGreaterThan(String value) {
            addCriterion("sell_point >", value, "sellPoint");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andSellPointGreaterThanOrEqualTo(String value) {
            addCriterion("sell_point >=", value, "sellPoint");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andSellPointLessThan(String value) {
            addCriterion("sell_point <", value, "sellPoint");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andSellPointLessThanOrEqualTo(String value) {
            addCriterion("sell_point <=", value, "sellPoint");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andSellPointLike(String value) {
            addCriterion("sell_point like", value, "sellPoint");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andSellPointNotLike(String value) {
            addCriterion("sell_point not like", value, "sellPoint");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andSellPointIn(List<String> values) {
            addCriterion("sell_point in", values, "sellPoint");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andSellPointNotIn(List<String> values) {
            addCriterion("sell_point not in", values, "sellPoint");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andSellPointBetween(String value1, String value2) {
            addCriterion("sell_point between", value1, value2, "sellPoint");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andSellPointNotBetween(String value1, String value2) {
            addCriterion("sell_point not between", value1, value2, "sellPoint");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andStockCountIsNull() {
            addCriterion("stock_count is null");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andStockCountIsNotNull() {
            addCriterion("stock_count is not null");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andStockCountEqualTo(Integer value) {
            addCriterion("stock_count =", value, "stockCount");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andStockCountNotEqualTo(Integer value) {
            addCriterion("stock_count <>", value, "stockCount");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andStockCountGreaterThan(Integer value) {
            addCriterion("stock_count >", value, "stockCount");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andStockCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock_count >=", value, "stockCount");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andStockCountLessThan(Integer value) {
            addCriterion("stock_count <", value, "stockCount");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andStockCountLessThanOrEqualTo(Integer value) {
            addCriterion("stock_count <=", value, "stockCount");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andStockCountIn(List<Integer> values) {
            addCriterion("stock_count in", values, "stockCount");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andStockCountNotIn(List<Integer> values) {
            addCriterion("stock_count not in", values, "stockCount");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andStockCountBetween(Integer value1, Integer value2) {
            addCriterion("stock_count between", value1, value2, "stockCount");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andStockCountNotBetween(Integer value1, Integer value2) {
            addCriterion("stock_count not between", value1, value2, "stockCount");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andNumEqualTo(Integer value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andNumNotEqualTo(Integer value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andNumGreaterThan(Integer value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andNumLessThan(Integer value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andNumIn(List<Integer> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andNumNotIn(List<Integer> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andBarcodeIsNull() {
            addCriterion("barcode is null");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andBarcodeIsNotNull() {
            addCriterion("barcode is not null");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andBarcodeEqualTo(String value) {
            addCriterion("barcode =", value, "barcode");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andBarcodeNotEqualTo(String value) {
            addCriterion("barcode <>", value, "barcode");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andBarcodeGreaterThan(String value) {
            addCriterion("barcode >", value, "barcode");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andBarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("barcode >=", value, "barcode");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andBarcodeLessThan(String value) {
            addCriterion("barcode <", value, "barcode");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andBarcodeLessThanOrEqualTo(String value) {
            addCriterion("barcode <=", value, "barcode");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andBarcodeLike(String value) {
            addCriterion("barcode like", value, "barcode");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andBarcodeNotLike(String value) {
            addCriterion("barcode not like", value, "barcode");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andBarcodeIn(List<String> values) {
            addCriterion("barcode in", values, "barcode");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andBarcodeNotIn(List<String> values) {
            addCriterion("barcode not in", values, "barcode");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andBarcodeBetween(String value1, String value2) {
            addCriterion("barcode between", value1, value2, "barcode");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andBarcodeNotBetween(String value1, String value2) {
            addCriterion("barcode not between", value1, value2, "barcode");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andImageIsNull() {
            addCriterion("image is null");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andImageIsNotNull() {
            addCriterion("image is not null");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andImageEqualTo(String value) {
            addCriterion("image =", value, "image");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andImageNotEqualTo(String value) {
            addCriterion("image <>", value, "image");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andImageGreaterThan(String value) {
            addCriterion("image >", value, "image");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andImageGreaterThanOrEqualTo(String value) {
            addCriterion("image >=", value, "image");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andImageLessThan(String value) {
            addCriterion("image <", value, "image");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andImageLessThanOrEqualTo(String value) {
            addCriterion("image <=", value, "image");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andImageLike(String value) {
            addCriterion("image like", value, "image");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andImageNotLike(String value) {
            addCriterion("image not like", value, "image");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andImageIn(List<String> values) {
            addCriterion("image in", values, "image");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andImageNotIn(List<String> values) {
            addCriterion("image not in", values, "image");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andImageBetween(String value1, String value2) {
            addCriterion("image between", value1, value2, "image");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andImageNotBetween(String value1, String value2) {
            addCriterion("image not between", value1, value2, "image");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCategoryidIsNull() {
            addCriterion("categoryId is null");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCategoryidIsNotNull() {
            addCriterion("categoryId is not null");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCategoryidEqualTo(Long value) {
            addCriterion("categoryId =", value, "categoryid");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCategoryidNotEqualTo(Long value) {
            addCriterion("categoryId <>", value, "categoryid");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCategoryidGreaterThan(Long value) {
            addCriterion("categoryId >", value, "categoryid");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCategoryidGreaterThanOrEqualTo(Long value) {
            addCriterion("categoryId >=", value, "categoryid");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCategoryidLessThan(Long value) {
            addCriterion("categoryId <", value, "categoryid");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCategoryidLessThanOrEqualTo(Long value) {
            addCriterion("categoryId <=", value, "categoryid");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCategoryidIn(List<Long> values) {
            addCriterion("categoryId in", values, "categoryid");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCategoryidNotIn(List<Long> values) {
            addCriterion("categoryId not in", values, "categoryid");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCategoryidBetween(Long value1, Long value2) {
            addCriterion("categoryId between", value1, value2, "categoryid");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCategoryidNotBetween(Long value1, Long value2) {
            addCriterion("categoryId not between", value1, value2, "categoryid");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andItemSnIsNull() {
            addCriterion("item_sn is null");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andItemSnIsNotNull() {
            addCriterion("item_sn is not null");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andItemSnEqualTo(String value) {
            addCriterion("item_sn =", value, "itemSn");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andItemSnNotEqualTo(String value) {
            addCriterion("item_sn <>", value, "itemSn");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andItemSnGreaterThan(String value) {
            addCriterion("item_sn >", value, "itemSn");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andItemSnGreaterThanOrEqualTo(String value) {
            addCriterion("item_sn >=", value, "itemSn");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andItemSnLessThan(String value) {
            addCriterion("item_sn <", value, "itemSn");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andItemSnLessThanOrEqualTo(String value) {
            addCriterion("item_sn <=", value, "itemSn");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andItemSnLike(String value) {
            addCriterion("item_sn like", value, "itemSn");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andItemSnNotLike(String value) {
            addCriterion("item_sn not like", value, "itemSn");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andItemSnIn(List<String> values) {
            addCriterion("item_sn in", values, "itemSn");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andItemSnNotIn(List<String> values) {
            addCriterion("item_sn not in", values, "itemSn");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andItemSnBetween(String value1, String value2) {
            addCriterion("item_sn between", value1, value2, "itemSn");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andItemSnNotBetween(String value1, String value2) {
            addCriterion("item_sn not between", value1, value2, "itemSn");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCostPirceIsNull() {
            addCriterion("cost_pirce is null");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCostPirceIsNotNull() {
            addCriterion("cost_pirce is not null");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCostPirceEqualTo(BigDecimal value) {
            addCriterion("cost_pirce =", value, "costPirce");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCostPirceNotEqualTo(BigDecimal value) {
            addCriterion("cost_pirce <>", value, "costPirce");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCostPirceGreaterThan(BigDecimal value) {
            addCriterion("cost_pirce >", value, "costPirce");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCostPirceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_pirce >=", value, "costPirce");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCostPirceLessThan(BigDecimal value) {
            addCriterion("cost_pirce <", value, "costPirce");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCostPirceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_pirce <=", value, "costPirce");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCostPirceIn(List<BigDecimal> values) {
            addCriterion("cost_pirce in", values, "costPirce");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCostPirceNotIn(List<BigDecimal> values) {
            addCriterion("cost_pirce not in", values, "costPirce");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCostPirceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_pirce between", value1, value2, "costPirce");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCostPirceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_pirce not between", value1, value2, "costPirce");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andMarketPriceIsNull() {
            addCriterion("market_price is null");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andMarketPriceIsNotNull() {
            addCriterion("market_price is not null");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andMarketPriceEqualTo(BigDecimal value) {
            addCriterion("market_price =", value, "marketPrice");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andMarketPriceNotEqualTo(BigDecimal value) {
            addCriterion("market_price <>", value, "marketPrice");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andMarketPriceGreaterThan(BigDecimal value) {
            addCriterion("market_price >", value, "marketPrice");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andMarketPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("market_price >=", value, "marketPrice");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andMarketPriceLessThan(BigDecimal value) {
            addCriterion("market_price <", value, "marketPrice");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andMarketPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("market_price <=", value, "marketPrice");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andMarketPriceIn(List<BigDecimal> values) {
            addCriterion("market_price in", values, "marketPrice");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andMarketPriceNotIn(List<BigDecimal> values) {
            addCriterion("market_price not in", values, "marketPrice");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andMarketPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("market_price between", value1, value2, "marketPrice");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andMarketPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("market_price not between", value1, value2, "marketPrice");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andIsDefaultIsNull() {
            addCriterion("is_default is null");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andIsDefaultIsNotNull() {
            addCriterion("is_default is not null");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andIsDefaultEqualTo(String value) {
            addCriterion("is_default =", value, "isDefault");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andIsDefaultNotEqualTo(String value) {
            addCriterion("is_default <>", value, "isDefault");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andIsDefaultGreaterThan(String value) {
            addCriterion("is_default >", value, "isDefault");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andIsDefaultGreaterThanOrEqualTo(String value) {
            addCriterion("is_default >=", value, "isDefault");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andIsDefaultLessThan(String value) {
            addCriterion("is_default <", value, "isDefault");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andIsDefaultLessThanOrEqualTo(String value) {
            addCriterion("is_default <=", value, "isDefault");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andIsDefaultLike(String value) {
            addCriterion("is_default like", value, "isDefault");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andIsDefaultNotLike(String value) {
            addCriterion("is_default not like", value, "isDefault");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andIsDefaultIn(List<String> values) {
            addCriterion("is_default in", values, "isDefault");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andIsDefaultNotIn(List<String> values) {
            addCriterion("is_default not in", values, "isDefault");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andIsDefaultBetween(String value1, String value2) {
            addCriterion("is_default between", value1, value2, "isDefault");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andIsDefaultNotBetween(String value1, String value2) {
            addCriterion("is_default not between", value1, value2, "isDefault");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andGoodsIdEqualTo(Long value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andGoodsIdNotEqualTo(Long value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andGoodsIdGreaterThan(Long value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andGoodsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andGoodsIdLessThan(Long value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andGoodsIdLessThanOrEqualTo(Long value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andGoodsIdIn(List<Long> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andGoodsIdNotIn(List<Long> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andGoodsIdBetween(Long value1, Long value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andGoodsIdNotBetween(Long value1, Long value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andSellerIdIsNull() {
            addCriterion("seller_id is null");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andSellerIdIsNotNull() {
            addCriterion("seller_id is not null");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andSellerIdEqualTo(String value) {
            addCriterion("seller_id =", value, "sellerId");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andSellerIdNotEqualTo(String value) {
            addCriterion("seller_id <>", value, "sellerId");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andSellerIdGreaterThan(String value) {
            addCriterion("seller_id >", value, "sellerId");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andSellerIdGreaterThanOrEqualTo(String value) {
            addCriterion("seller_id >=", value, "sellerId");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andSellerIdLessThan(String value) {
            addCriterion("seller_id <", value, "sellerId");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andSellerIdLessThanOrEqualTo(String value) {
            addCriterion("seller_id <=", value, "sellerId");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andSellerIdLike(String value) {
            addCriterion("seller_id like", value, "sellerId");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andSellerIdNotLike(String value) {
            addCriterion("seller_id not like", value, "sellerId");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andSellerIdIn(List<String> values) {
            addCriterion("seller_id in", values, "sellerId");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andSellerIdNotIn(List<String> values) {
            addCriterion("seller_id not in", values, "sellerId");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andSellerIdBetween(String value1, String value2) {
            addCriterion("seller_id between", value1, value2, "sellerId");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andSellerIdNotBetween(String value1, String value2) {
            addCriterion("seller_id not between", value1, value2, "sellerId");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCartThumbnailIsNull() {
            addCriterion("cart_thumbnail is null");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCartThumbnailIsNotNull() {
            addCriterion("cart_thumbnail is not null");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCartThumbnailEqualTo(String value) {
            addCriterion("cart_thumbnail =", value, "cartThumbnail");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCartThumbnailNotEqualTo(String value) {
            addCriterion("cart_thumbnail <>", value, "cartThumbnail");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCartThumbnailGreaterThan(String value) {
            addCriterion("cart_thumbnail >", value, "cartThumbnail");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCartThumbnailGreaterThanOrEqualTo(String value) {
            addCriterion("cart_thumbnail >=", value, "cartThumbnail");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCartThumbnailLessThan(String value) {
            addCriterion("cart_thumbnail <", value, "cartThumbnail");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCartThumbnailLessThanOrEqualTo(String value) {
            addCriterion("cart_thumbnail <=", value, "cartThumbnail");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCartThumbnailLike(String value) {
            addCriterion("cart_thumbnail like", value, "cartThumbnail");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCartThumbnailNotLike(String value) {
            addCriterion("cart_thumbnail not like", value, "cartThumbnail");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCartThumbnailIn(List<String> values) {
            addCriterion("cart_thumbnail in", values, "cartThumbnail");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCartThumbnailNotIn(List<String> values) {
            addCriterion("cart_thumbnail not in", values, "cartThumbnail");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCartThumbnailBetween(String value1, String value2) {
            addCriterion("cart_thumbnail between", value1, value2, "cartThumbnail");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCartThumbnailNotBetween(String value1, String value2) {
            addCriterion("cart_thumbnail not between", value1, value2, "cartThumbnail");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCategoryEqualTo(String value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCategoryNotEqualTo(String value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCategoryGreaterThan(String value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCategoryLessThan(String value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCategoryLike(String value) {
            addCriterion("category like", value, "category");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCategoryNotLike(String value) {
            addCriterion("category not like", value, "category");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCategoryIn(List<String> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCategoryNotIn(List<String> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("category not between", value1, value2, "category");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andSpecIsNull() {
            addCriterion("spec is null");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andSpecIsNotNull() {
            addCriterion("spec is not null");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andSpecEqualTo(String value) {
            addCriterion("spec =", value, "spec");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andSpecNotEqualTo(String value) {
            addCriterion("spec <>", value, "spec");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andSpecGreaterThan(String value) {
            addCriterion("spec >", value, "spec");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andSpecGreaterThanOrEqualTo(String value) {
            addCriterion("spec >=", value, "spec");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andSpecLessThan(String value) {
            addCriterion("spec <", value, "spec");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andSpecLessThanOrEqualTo(String value) {
            addCriterion("spec <=", value, "spec");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andSpecLike(String value) {
            addCriterion("spec like", value, "spec");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andSpecNotLike(String value) {
            addCriterion("spec not like", value, "spec");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andSpecIn(List<String> values) {
            addCriterion("spec in", values, "spec");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andSpecNotIn(List<String> values) {
            addCriterion("spec not in", values, "spec");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andSpecBetween(String value1, String value2) {
            addCriterion("spec between", value1, value2, "spec");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andSpecNotBetween(String value1, String value2) {
            addCriterion("spec not between", value1, value2, "spec");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andSellerIsNull() {
            addCriterion("seller is null");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andSellerIsNotNull() {
            addCriterion("seller is not null");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andSellerEqualTo(String value) {
            addCriterion("seller =", value, "seller");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andSellerNotEqualTo(String value) {
            addCriterion("seller <>", value, "seller");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andSellerGreaterThan(String value) {
            addCriterion("seller >", value, "seller");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andSellerGreaterThanOrEqualTo(String value) {
            addCriterion("seller >=", value, "seller");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andSellerLessThan(String value) {
            addCriterion("seller <", value, "seller");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andSellerLessThanOrEqualTo(String value) {
            addCriterion("seller <=", value, "seller");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andSellerLike(String value) {
            addCriterion("seller like", value, "seller");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andSellerNotLike(String value) {
            addCriterion("seller not like", value, "seller");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andSellerIn(List<String> values) {
            addCriterion("seller in", values, "seller");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andSellerNotIn(List<String> values) {
            addCriterion("seller not in", values, "seller");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andSellerBetween(String value1, String value2) {
            addCriterion("seller between", value1, value2, "seller");
            return (Criteria) this;
    }

    public TbItemExample.Criteria andSellerNotBetween(String value1, String value2) {
            addCriterion("seller not between", value1, value2, "seller");
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
