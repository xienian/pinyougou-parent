
package com.pinyougou.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class TbAddressExample {
  protected String orderByClause;

  protected boolean distinct;

  public static class Criteria extends TbAddressExample.GeneratedCriteria {
    protected Criteria() {
            super();
    }

  }

  protected List<TbAddressExample.Criteria> oredCriteria;

  public TbAddressExample() {
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

  public List<TbAddressExample.Criteria> getOredCriteria() {
        return oredCriteria;
  }

  public void or(TbAddressExample.Criteria criteria) {
        oredCriteria.add(criteria);
  }

  public TbAddressExample.Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
  }

  public TbAddressExample.Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
  }

  protected TbAddressExample.Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
  }

  public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
  }

  protected static abstract class GeneratedCriteria {
    protected List<TbAddressExample.Criterion> criteria;

    protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
    }

    public boolean isValid() {
            return criteria.size() > 0;
    }

    public List<TbAddressExample.Criterion> getAllCriteria() {
            return criteria;
    }

    public List<TbAddressExample.Criterion> getCriteria() {
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

    public TbAddressExample.Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andProvinceIdIsNull() {
            addCriterion("province_id is null");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andProvinceIdIsNotNull() {
            addCriterion("province_id is not null");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andProvinceIdEqualTo(String value) {
            addCriterion("province_id =", value, "provinceId");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andProvinceIdNotEqualTo(String value) {
            addCriterion("province_id <>", value, "provinceId");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andProvinceIdGreaterThan(String value) {
            addCriterion("province_id >", value, "provinceId");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andProvinceIdGreaterThanOrEqualTo(String value) {
            addCriterion("province_id >=", value, "provinceId");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andProvinceIdLessThan(String value) {
            addCriterion("province_id <", value, "provinceId");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andProvinceIdLessThanOrEqualTo(String value) {
            addCriterion("province_id <=", value, "provinceId");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andProvinceIdLike(String value) {
            addCriterion("province_id like", value, "provinceId");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andProvinceIdNotLike(String value) {
            addCriterion("province_id not like", value, "provinceId");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andProvinceIdIn(List<String> values) {
            addCriterion("province_id in", values, "provinceId");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andProvinceIdNotIn(List<String> values) {
            addCriterion("province_id not in", values, "provinceId");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andProvinceIdBetween(String value1, String value2) {
            addCriterion("province_id between", value1, value2, "provinceId");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andProvinceIdNotBetween(String value1, String value2) {
            addCriterion("province_id not between", value1, value2, "provinceId");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andCityIdIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andCityIdIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andCityIdEqualTo(String value) {
            addCriterion("city_id =", value, "cityId");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andCityIdNotEqualTo(String value) {
            addCriterion("city_id <>", value, "cityId");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andCityIdGreaterThan(String value) {
            addCriterion("city_id >", value, "cityId");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andCityIdGreaterThanOrEqualTo(String value) {
            addCriterion("city_id >=", value, "cityId");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andCityIdLessThan(String value) {
            addCriterion("city_id <", value, "cityId");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andCityIdLessThanOrEqualTo(String value) {
            addCriterion("city_id <=", value, "cityId");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andCityIdLike(String value) {
            addCriterion("city_id like", value, "cityId");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andCityIdNotLike(String value) {
            addCriterion("city_id not like", value, "cityId");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andCityIdIn(List<String> values) {
            addCriterion("city_id in", values, "cityId");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andCityIdNotIn(List<String> values) {
            addCriterion("city_id not in", values, "cityId");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andCityIdBetween(String value1, String value2) {
            addCriterion("city_id between", value1, value2, "cityId");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andCityIdNotBetween(String value1, String value2) {
            addCriterion("city_id not between", value1, value2, "cityId");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andTownIdIsNull() {
            addCriterion("town_id is null");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andTownIdIsNotNull() {
            addCriterion("town_id is not null");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andTownIdEqualTo(String value) {
            addCriterion("town_id =", value, "townId");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andTownIdNotEqualTo(String value) {
            addCriterion("town_id <>", value, "townId");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andTownIdGreaterThan(String value) {
            addCriterion("town_id >", value, "townId");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andTownIdGreaterThanOrEqualTo(String value) {
            addCriterion("town_id >=", value, "townId");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andTownIdLessThan(String value) {
            addCriterion("town_id <", value, "townId");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andTownIdLessThanOrEqualTo(String value) {
            addCriterion("town_id <=", value, "townId");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andTownIdLike(String value) {
            addCriterion("town_id like", value, "townId");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andTownIdNotLike(String value) {
            addCriterion("town_id not like", value, "townId");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andTownIdIn(List<String> values) {
            addCriterion("town_id in", values, "townId");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andTownIdNotIn(List<String> values) {
            addCriterion("town_id not in", values, "townId");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andTownIdBetween(String value1, String value2) {
            addCriterion("town_id between", value1, value2, "townId");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andTownIdNotBetween(String value1, String value2) {
            addCriterion("town_id not between", value1, value2, "townId");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andContactIsNull() {
            addCriterion("contact is null");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andContactIsNotNull() {
            addCriterion("contact is not null");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andContactEqualTo(String value) {
            addCriterion("contact =", value, "contact");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andContactNotEqualTo(String value) {
            addCriterion("contact <>", value, "contact");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andContactGreaterThan(String value) {
            addCriterion("contact >", value, "contact");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andContactGreaterThanOrEqualTo(String value) {
            addCriterion("contact >=", value, "contact");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andContactLessThan(String value) {
            addCriterion("contact <", value, "contact");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andContactLessThanOrEqualTo(String value) {
            addCriterion("contact <=", value, "contact");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andContactLike(String value) {
            addCriterion("contact like", value, "contact");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andContactNotLike(String value) {
            addCriterion("contact not like", value, "contact");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andContactIn(List<String> values) {
            addCriterion("contact in", values, "contact");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andContactNotIn(List<String> values) {
            addCriterion("contact not in", values, "contact");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andContactBetween(String value1, String value2) {
            addCriterion("contact between", value1, value2, "contact");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andContactNotBetween(String value1, String value2) {
            addCriterion("contact not between", value1, value2, "contact");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andIsDefaultIsNull() {
            addCriterion("is_default is null");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andIsDefaultIsNotNull() {
            addCriterion("is_default is not null");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andIsDefaultEqualTo(String value) {
            addCriterion("is_default =", value, "isDefault");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andIsDefaultNotEqualTo(String value) {
            addCriterion("is_default <>", value, "isDefault");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andIsDefaultGreaterThan(String value) {
            addCriterion("is_default >", value, "isDefault");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andIsDefaultGreaterThanOrEqualTo(String value) {
            addCriterion("is_default >=", value, "isDefault");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andIsDefaultLessThan(String value) {
            addCriterion("is_default <", value, "isDefault");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andIsDefaultLessThanOrEqualTo(String value) {
            addCriterion("is_default <=", value, "isDefault");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andIsDefaultLike(String value) {
            addCriterion("is_default like", value, "isDefault");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andIsDefaultNotLike(String value) {
            addCriterion("is_default not like", value, "isDefault");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andIsDefaultIn(List<String> values) {
            addCriterion("is_default in", values, "isDefault");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andIsDefaultNotIn(List<String> values) {
            addCriterion("is_default not in", values, "isDefault");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andIsDefaultBetween(String value1, String value2) {
            addCriterion("is_default between", value1, value2, "isDefault");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andIsDefaultNotBetween(String value1, String value2) {
            addCriterion("is_default not between", value1, value2, "isDefault");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andNotesIsNull() {
            addCriterion("notes is null");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andNotesIsNotNull() {
            addCriterion("notes is not null");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andNotesEqualTo(String value) {
            addCriterion("notes =", value, "notes");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andNotesNotEqualTo(String value) {
            addCriterion("notes <>", value, "notes");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andNotesGreaterThan(String value) {
            addCriterion("notes >", value, "notes");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andNotesGreaterThanOrEqualTo(String value) {
            addCriterion("notes >=", value, "notes");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andNotesLessThan(String value) {
            addCriterion("notes <", value, "notes");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andNotesLessThanOrEqualTo(String value) {
            addCriterion("notes <=", value, "notes");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andNotesLike(String value) {
            addCriterion("notes like", value, "notes");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andNotesNotLike(String value) {
            addCriterion("notes not like", value, "notes");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andNotesIn(List<String> values) {
            addCriterion("notes in", values, "notes");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andNotesNotIn(List<String> values) {
            addCriterion("notes not in", values, "notes");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andNotesBetween(String value1, String value2) {
            addCriterion("notes between", value1, value2, "notes");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andNotesNotBetween(String value1, String value2) {
            addCriterion("notes not between", value1, value2, "notes");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andAliasIsNull() {
            addCriterion("alias is null");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andAliasIsNotNull() {
            addCriterion("alias is not null");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andAliasEqualTo(String value) {
            addCriterion("alias =", value, "alias");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andAliasNotEqualTo(String value) {
            addCriterion("alias <>", value, "alias");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andAliasGreaterThan(String value) {
            addCriterion("alias >", value, "alias");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andAliasGreaterThanOrEqualTo(String value) {
            addCriterion("alias >=", value, "alias");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andAliasLessThan(String value) {
            addCriterion("alias <", value, "alias");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andAliasLessThanOrEqualTo(String value) {
            addCriterion("alias <=", value, "alias");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andAliasLike(String value) {
            addCriterion("alias like", value, "alias");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andAliasNotLike(String value) {
            addCriterion("alias not like", value, "alias");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andAliasIn(List<String> values) {
            addCriterion("alias in", values, "alias");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andAliasNotIn(List<String> values) {
            addCriterion("alias not in", values, "alias");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andAliasBetween(String value1, String value2) {
            addCriterion("alias between", value1, value2, "alias");
            return (Criteria) this;
    }

    public TbAddressExample.Criteria andAliasNotBetween(String value1, String value2) {
            addCriterion("alias not between", value1, value2, "alias");
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
