
package com.pinyougou.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class TbSellerExample {
  protected String orderByClause;

  protected boolean distinct;

  public static class Criteria extends TbSellerExample.GeneratedCriteria {
    protected Criteria() {
            super();
    }

  }

  protected List<TbSellerExample.Criteria> oredCriteria;

  public TbSellerExample() {
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

  public List<TbSellerExample.Criteria> getOredCriteria() {
        return oredCriteria;
  }

  public void or(TbSellerExample.Criteria criteria) {
        oredCriteria.add(criteria);
  }

  public TbSellerExample.Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
  }

  public TbSellerExample.Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
  }

  protected TbSellerExample.Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
  }

  public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
  }

  protected static abstract class GeneratedCriteria {
    protected List<TbSellerExample.Criterion> criteria;

    protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
    }

    public boolean isValid() {
            return criteria.size() > 0;
    }

    public List<TbSellerExample.Criterion> getAllCriteria() {
            return criteria;
    }

    public List<TbSellerExample.Criterion> getCriteria() {
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

    public TbSellerExample.Criteria andSellerIdIsNull() {
            addCriterion("seller_id is null");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andSellerIdIsNotNull() {
            addCriterion("seller_id is not null");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andSellerIdEqualTo(String value) {
            addCriterion("seller_id =", value, "sellerId");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andSellerIdNotEqualTo(String value) {
            addCriterion("seller_id <>", value, "sellerId");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andSellerIdGreaterThan(String value) {
            addCriterion("seller_id >", value, "sellerId");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andSellerIdGreaterThanOrEqualTo(String value) {
            addCriterion("seller_id >=", value, "sellerId");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andSellerIdLessThan(String value) {
            addCriterion("seller_id <", value, "sellerId");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andSellerIdLessThanOrEqualTo(String value) {
            addCriterion("seller_id <=", value, "sellerId");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andSellerIdLike(String value) {
            addCriterion("seller_id like", value, "sellerId");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andSellerIdNotLike(String value) {
            addCriterion("seller_id not like", value, "sellerId");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andSellerIdIn(List<String> values) {
            addCriterion("seller_id in", values, "sellerId");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andSellerIdNotIn(List<String> values) {
            addCriterion("seller_id not in", values, "sellerId");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andSellerIdBetween(String value1, String value2) {
            addCriterion("seller_id between", value1, value2, "sellerId");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andSellerIdNotBetween(String value1, String value2) {
            addCriterion("seller_id not between", value1, value2, "sellerId");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andNickNameIsNull() {
            addCriterion("nick_name is null");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andNickNameIsNotNull() {
            addCriterion("nick_name is not null");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andNickNameEqualTo(String value) {
            addCriterion("nick_name =", value, "nickName");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andNickNameNotEqualTo(String value) {
            addCriterion("nick_name <>", value, "nickName");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andNickNameGreaterThan(String value) {
            addCriterion("nick_name >", value, "nickName");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("nick_name >=", value, "nickName");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andNickNameLessThan(String value) {
            addCriterion("nick_name <", value, "nickName");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andNickNameLessThanOrEqualTo(String value) {
            addCriterion("nick_name <=", value, "nickName");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andNickNameLike(String value) {
            addCriterion("nick_name like", value, "nickName");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andNickNameNotLike(String value) {
            addCriterion("nick_name not like", value, "nickName");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andNickNameIn(List<String> values) {
            addCriterion("nick_name in", values, "nickName");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andNickNameNotIn(List<String> values) {
            addCriterion("nick_name not in", values, "nickName");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("nick_name between", value1, value2, "nickName");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("nick_name not between", value1, value2, "nickName");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andAddressDetailIsNull() {
            addCriterion("address_detail is null");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andAddressDetailIsNotNull() {
            addCriterion("address_detail is not null");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andAddressDetailEqualTo(String value) {
            addCriterion("address_detail =", value, "addressDetail");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andAddressDetailNotEqualTo(String value) {
            addCriterion("address_detail <>", value, "addressDetail");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andAddressDetailGreaterThan(String value) {
            addCriterion("address_detail >", value, "addressDetail");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andAddressDetailGreaterThanOrEqualTo(String value) {
            addCriterion("address_detail >=", value, "addressDetail");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andAddressDetailLessThan(String value) {
            addCriterion("address_detail <", value, "addressDetail");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andAddressDetailLessThanOrEqualTo(String value) {
            addCriterion("address_detail <=", value, "addressDetail");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andAddressDetailLike(String value) {
            addCriterion("address_detail like", value, "addressDetail");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andAddressDetailNotLike(String value) {
            addCriterion("address_detail not like", value, "addressDetail");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andAddressDetailIn(List<String> values) {
            addCriterion("address_detail in", values, "addressDetail");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andAddressDetailNotIn(List<String> values) {
            addCriterion("address_detail not in", values, "addressDetail");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andAddressDetailBetween(String value1, String value2) {
            addCriterion("address_detail between", value1, value2, "addressDetail");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andAddressDetailNotBetween(String value1, String value2) {
            addCriterion("address_detail not between", value1, value2, "addressDetail");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLinkmanNameIsNull() {
            addCriterion("linkman_name is null");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLinkmanNameIsNotNull() {
            addCriterion("linkman_name is not null");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLinkmanNameEqualTo(String value) {
            addCriterion("linkman_name =", value, "linkmanName");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLinkmanNameNotEqualTo(String value) {
            addCriterion("linkman_name <>", value, "linkmanName");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLinkmanNameGreaterThan(String value) {
            addCriterion("linkman_name >", value, "linkmanName");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLinkmanNameGreaterThanOrEqualTo(String value) {
            addCriterion("linkman_name >=", value, "linkmanName");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLinkmanNameLessThan(String value) {
            addCriterion("linkman_name <", value, "linkmanName");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLinkmanNameLessThanOrEqualTo(String value) {
            addCriterion("linkman_name <=", value, "linkmanName");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLinkmanNameLike(String value) {
            addCriterion("linkman_name like", value, "linkmanName");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLinkmanNameNotLike(String value) {
            addCriterion("linkman_name not like", value, "linkmanName");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLinkmanNameIn(List<String> values) {
            addCriterion("linkman_name in", values, "linkmanName");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLinkmanNameNotIn(List<String> values) {
            addCriterion("linkman_name not in", values, "linkmanName");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLinkmanNameBetween(String value1, String value2) {
            addCriterion("linkman_name between", value1, value2, "linkmanName");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLinkmanNameNotBetween(String value1, String value2) {
            addCriterion("linkman_name not between", value1, value2, "linkmanName");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLinkmanQqIsNull() {
            addCriterion("linkman_qq is null");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLinkmanQqIsNotNull() {
            addCriterion("linkman_qq is not null");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLinkmanQqEqualTo(String value) {
            addCriterion("linkman_qq =", value, "linkmanQq");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLinkmanQqNotEqualTo(String value) {
            addCriterion("linkman_qq <>", value, "linkmanQq");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLinkmanQqGreaterThan(String value) {
            addCriterion("linkman_qq >", value, "linkmanQq");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLinkmanQqGreaterThanOrEqualTo(String value) {
            addCriterion("linkman_qq >=", value, "linkmanQq");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLinkmanQqLessThan(String value) {
            addCriterion("linkman_qq <", value, "linkmanQq");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLinkmanQqLessThanOrEqualTo(String value) {
            addCriterion("linkman_qq <=", value, "linkmanQq");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLinkmanQqLike(String value) {
            addCriterion("linkman_qq like", value, "linkmanQq");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLinkmanQqNotLike(String value) {
            addCriterion("linkman_qq not like", value, "linkmanQq");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLinkmanQqIn(List<String> values) {
            addCriterion("linkman_qq in", values, "linkmanQq");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLinkmanQqNotIn(List<String> values) {
            addCriterion("linkman_qq not in", values, "linkmanQq");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLinkmanQqBetween(String value1, String value2) {
            addCriterion("linkman_qq between", value1, value2, "linkmanQq");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLinkmanQqNotBetween(String value1, String value2) {
            addCriterion("linkman_qq not between", value1, value2, "linkmanQq");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLinkmanMobileIsNull() {
            addCriterion("linkman_mobile is null");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLinkmanMobileIsNotNull() {
            addCriterion("linkman_mobile is not null");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLinkmanMobileEqualTo(String value) {
            addCriterion("linkman_mobile =", value, "linkmanMobile");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLinkmanMobileNotEqualTo(String value) {
            addCriterion("linkman_mobile <>", value, "linkmanMobile");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLinkmanMobileGreaterThan(String value) {
            addCriterion("linkman_mobile >", value, "linkmanMobile");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLinkmanMobileGreaterThanOrEqualTo(String value) {
            addCriterion("linkman_mobile >=", value, "linkmanMobile");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLinkmanMobileLessThan(String value) {
            addCriterion("linkman_mobile <", value, "linkmanMobile");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLinkmanMobileLessThanOrEqualTo(String value) {
            addCriterion("linkman_mobile <=", value, "linkmanMobile");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLinkmanMobileLike(String value) {
            addCriterion("linkman_mobile like", value, "linkmanMobile");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLinkmanMobileNotLike(String value) {
            addCriterion("linkman_mobile not like", value, "linkmanMobile");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLinkmanMobileIn(List<String> values) {
            addCriterion("linkman_mobile in", values, "linkmanMobile");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLinkmanMobileNotIn(List<String> values) {
            addCriterion("linkman_mobile not in", values, "linkmanMobile");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLinkmanMobileBetween(String value1, String value2) {
            addCriterion("linkman_mobile between", value1, value2, "linkmanMobile");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLinkmanMobileNotBetween(String value1, String value2) {
            addCriterion("linkman_mobile not between", value1, value2, "linkmanMobile");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLinkmanEmailIsNull() {
            addCriterion("linkman_email is null");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLinkmanEmailIsNotNull() {
            addCriterion("linkman_email is not null");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLinkmanEmailEqualTo(String value) {
            addCriterion("linkman_email =", value, "linkmanEmail");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLinkmanEmailNotEqualTo(String value) {
            addCriterion("linkman_email <>", value, "linkmanEmail");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLinkmanEmailGreaterThan(String value) {
            addCriterion("linkman_email >", value, "linkmanEmail");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLinkmanEmailGreaterThanOrEqualTo(String value) {
            addCriterion("linkman_email >=", value, "linkmanEmail");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLinkmanEmailLessThan(String value) {
            addCriterion("linkman_email <", value, "linkmanEmail");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLinkmanEmailLessThanOrEqualTo(String value) {
            addCriterion("linkman_email <=", value, "linkmanEmail");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLinkmanEmailLike(String value) {
            addCriterion("linkman_email like", value, "linkmanEmail");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLinkmanEmailNotLike(String value) {
            addCriterion("linkman_email not like", value, "linkmanEmail");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLinkmanEmailIn(List<String> values) {
            addCriterion("linkman_email in", values, "linkmanEmail");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLinkmanEmailNotIn(List<String> values) {
            addCriterion("linkman_email not in", values, "linkmanEmail");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLinkmanEmailBetween(String value1, String value2) {
            addCriterion("linkman_email between", value1, value2, "linkmanEmail");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLinkmanEmailNotBetween(String value1, String value2) {
            addCriterion("linkman_email not between", value1, value2, "linkmanEmail");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLicenseNumberIsNull() {
            addCriterion("license_number is null");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLicenseNumberIsNotNull() {
            addCriterion("license_number is not null");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLicenseNumberEqualTo(String value) {
            addCriterion("license_number =", value, "licenseNumber");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLicenseNumberNotEqualTo(String value) {
            addCriterion("license_number <>", value, "licenseNumber");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLicenseNumberGreaterThan(String value) {
            addCriterion("license_number >", value, "licenseNumber");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLicenseNumberGreaterThanOrEqualTo(String value) {
            addCriterion("license_number >=", value, "licenseNumber");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLicenseNumberLessThan(String value) {
            addCriterion("license_number <", value, "licenseNumber");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLicenseNumberLessThanOrEqualTo(String value) {
            addCriterion("license_number <=", value, "licenseNumber");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLicenseNumberLike(String value) {
            addCriterion("license_number like", value, "licenseNumber");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLicenseNumberNotLike(String value) {
            addCriterion("license_number not like", value, "licenseNumber");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLicenseNumberIn(List<String> values) {
            addCriterion("license_number in", values, "licenseNumber");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLicenseNumberNotIn(List<String> values) {
            addCriterion("license_number not in", values, "licenseNumber");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLicenseNumberBetween(String value1, String value2) {
            addCriterion("license_number between", value1, value2, "licenseNumber");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLicenseNumberNotBetween(String value1, String value2) {
            addCriterion("license_number not between", value1, value2, "licenseNumber");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andTaxNumberIsNull() {
            addCriterion("tax_number is null");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andTaxNumberIsNotNull() {
            addCriterion("tax_number is not null");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andTaxNumberEqualTo(String value) {
            addCriterion("tax_number =", value, "taxNumber");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andTaxNumberNotEqualTo(String value) {
            addCriterion("tax_number <>", value, "taxNumber");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andTaxNumberGreaterThan(String value) {
            addCriterion("tax_number >", value, "taxNumber");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andTaxNumberGreaterThanOrEqualTo(String value) {
            addCriterion("tax_number >=", value, "taxNumber");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andTaxNumberLessThan(String value) {
            addCriterion("tax_number <", value, "taxNumber");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andTaxNumberLessThanOrEqualTo(String value) {
            addCriterion("tax_number <=", value, "taxNumber");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andTaxNumberLike(String value) {
            addCriterion("tax_number like", value, "taxNumber");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andTaxNumberNotLike(String value) {
            addCriterion("tax_number not like", value, "taxNumber");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andTaxNumberIn(List<String> values) {
            addCriterion("tax_number in", values, "taxNumber");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andTaxNumberNotIn(List<String> values) {
            addCriterion("tax_number not in", values, "taxNumber");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andTaxNumberBetween(String value1, String value2) {
            addCriterion("tax_number between", value1, value2, "taxNumber");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andTaxNumberNotBetween(String value1, String value2) {
            addCriterion("tax_number not between", value1, value2, "taxNumber");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andOrgNumberIsNull() {
            addCriterion("org_number is null");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andOrgNumberIsNotNull() {
            addCriterion("org_number is not null");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andOrgNumberEqualTo(String value) {
            addCriterion("org_number =", value, "orgNumber");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andOrgNumberNotEqualTo(String value) {
            addCriterion("org_number <>", value, "orgNumber");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andOrgNumberGreaterThan(String value) {
            addCriterion("org_number >", value, "orgNumber");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andOrgNumberGreaterThanOrEqualTo(String value) {
            addCriterion("org_number >=", value, "orgNumber");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andOrgNumberLessThan(String value) {
            addCriterion("org_number <", value, "orgNumber");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andOrgNumberLessThanOrEqualTo(String value) {
            addCriterion("org_number <=", value, "orgNumber");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andOrgNumberLike(String value) {
            addCriterion("org_number like", value, "orgNumber");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andOrgNumberNotLike(String value) {
            addCriterion("org_number not like", value, "orgNumber");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andOrgNumberIn(List<String> values) {
            addCriterion("org_number in", values, "orgNumber");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andOrgNumberNotIn(List<String> values) {
            addCriterion("org_number not in", values, "orgNumber");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andOrgNumberBetween(String value1, String value2) {
            addCriterion("org_number between", value1, value2, "orgNumber");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andOrgNumberNotBetween(String value1, String value2) {
            addCriterion("org_number not between", value1, value2, "orgNumber");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andAddressEqualTo(Long value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andAddressNotEqualTo(Long value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andAddressGreaterThan(Long value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andAddressGreaterThanOrEqualTo(Long value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andAddressLessThan(Long value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andAddressLessThanOrEqualTo(Long value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andAddressIn(List<Long> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andAddressNotIn(List<Long> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andAddressBetween(Long value1, Long value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andAddressNotBetween(Long value1, Long value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLogoPicIsNull() {
            addCriterion("logo_pic is null");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLogoPicIsNotNull() {
            addCriterion("logo_pic is not null");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLogoPicEqualTo(String value) {
            addCriterion("logo_pic =", value, "logoPic");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLogoPicNotEqualTo(String value) {
            addCriterion("logo_pic <>", value, "logoPic");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLogoPicGreaterThan(String value) {
            addCriterion("logo_pic >", value, "logoPic");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLogoPicGreaterThanOrEqualTo(String value) {
            addCriterion("logo_pic >=", value, "logoPic");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLogoPicLessThan(String value) {
            addCriterion("logo_pic <", value, "logoPic");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLogoPicLessThanOrEqualTo(String value) {
            addCriterion("logo_pic <=", value, "logoPic");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLogoPicLike(String value) {
            addCriterion("logo_pic like", value, "logoPic");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLogoPicNotLike(String value) {
            addCriterion("logo_pic not like", value, "logoPic");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLogoPicIn(List<String> values) {
            addCriterion("logo_pic in", values, "logoPic");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLogoPicNotIn(List<String> values) {
            addCriterion("logo_pic not in", values, "logoPic");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLogoPicBetween(String value1, String value2) {
            addCriterion("logo_pic between", value1, value2, "logoPic");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLogoPicNotBetween(String value1, String value2) {
            addCriterion("logo_pic not between", value1, value2, "logoPic");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andBriefIsNull() {
            addCriterion("brief is null");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andBriefIsNotNull() {
            addCriterion("brief is not null");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andBriefEqualTo(String value) {
            addCriterion("brief =", value, "brief");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andBriefNotEqualTo(String value) {
            addCriterion("brief <>", value, "brief");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andBriefGreaterThan(String value) {
            addCriterion("brief >", value, "brief");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andBriefGreaterThanOrEqualTo(String value) {
            addCriterion("brief >=", value, "brief");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andBriefLessThan(String value) {
            addCriterion("brief <", value, "brief");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andBriefLessThanOrEqualTo(String value) {
            addCriterion("brief <=", value, "brief");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andBriefLike(String value) {
            addCriterion("brief like", value, "brief");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andBriefNotLike(String value) {
            addCriterion("brief not like", value, "brief");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andBriefIn(List<String> values) {
            addCriterion("brief in", values, "brief");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andBriefNotIn(List<String> values) {
            addCriterion("brief not in", values, "brief");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andBriefBetween(String value1, String value2) {
            addCriterion("brief between", value1, value2, "brief");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andBriefNotBetween(String value1, String value2) {
            addCriterion("brief not between", value1, value2, "brief");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLegalPersonIsNull() {
            addCriterion("legal_person is null");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLegalPersonIsNotNull() {
            addCriterion("legal_person is not null");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLegalPersonEqualTo(String value) {
            addCriterion("legal_person =", value, "legalPerson");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLegalPersonNotEqualTo(String value) {
            addCriterion("legal_person <>", value, "legalPerson");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLegalPersonGreaterThan(String value) {
            addCriterion("legal_person >", value, "legalPerson");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLegalPersonGreaterThanOrEqualTo(String value) {
            addCriterion("legal_person >=", value, "legalPerson");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLegalPersonLessThan(String value) {
            addCriterion("legal_person <", value, "legalPerson");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLegalPersonLessThanOrEqualTo(String value) {
            addCriterion("legal_person <=", value, "legalPerson");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLegalPersonLike(String value) {
            addCriterion("legal_person like", value, "legalPerson");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLegalPersonNotLike(String value) {
            addCriterion("legal_person not like", value, "legalPerson");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLegalPersonIn(List<String> values) {
            addCriterion("legal_person in", values, "legalPerson");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLegalPersonNotIn(List<String> values) {
            addCriterion("legal_person not in", values, "legalPerson");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLegalPersonBetween(String value1, String value2) {
            addCriterion("legal_person between", value1, value2, "legalPerson");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLegalPersonNotBetween(String value1, String value2) {
            addCriterion("legal_person not between", value1, value2, "legalPerson");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLegalPersonCardIdIsNull() {
            addCriterion("legal_person_card_id is null");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLegalPersonCardIdIsNotNull() {
            addCriterion("legal_person_card_id is not null");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLegalPersonCardIdEqualTo(String value) {
            addCriterion("legal_person_card_id =", value, "legalPersonCardId");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLegalPersonCardIdNotEqualTo(String value) {
            addCriterion("legal_person_card_id <>", value, "legalPersonCardId");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLegalPersonCardIdGreaterThan(String value) {
            addCriterion("legal_person_card_id >", value, "legalPersonCardId");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLegalPersonCardIdGreaterThanOrEqualTo(String value) {
            addCriterion("legal_person_card_id >=", value, "legalPersonCardId");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLegalPersonCardIdLessThan(String value) {
            addCriterion("legal_person_card_id <", value, "legalPersonCardId");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLegalPersonCardIdLessThanOrEqualTo(String value) {
            addCriterion("legal_person_card_id <=", value, "legalPersonCardId");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLegalPersonCardIdLike(String value) {
            addCriterion("legal_person_card_id like", value, "legalPersonCardId");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLegalPersonCardIdNotLike(String value) {
            addCriterion("legal_person_card_id not like", value, "legalPersonCardId");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLegalPersonCardIdIn(List<String> values) {
            addCriterion("legal_person_card_id in", values, "legalPersonCardId");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLegalPersonCardIdNotIn(List<String> values) {
            addCriterion("legal_person_card_id not in", values, "legalPersonCardId");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLegalPersonCardIdBetween(String value1, String value2) {
            addCriterion("legal_person_card_id between", value1, value2, "legalPersonCardId");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andLegalPersonCardIdNotBetween(String value1, String value2) {
            addCriterion("legal_person_card_id not between", value1, value2, "legalPersonCardId");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andBankUserIsNull() {
            addCriterion("bank_user is null");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andBankUserIsNotNull() {
            addCriterion("bank_user is not null");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andBankUserEqualTo(String value) {
            addCriterion("bank_user =", value, "bankUser");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andBankUserNotEqualTo(String value) {
            addCriterion("bank_user <>", value, "bankUser");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andBankUserGreaterThan(String value) {
            addCriterion("bank_user >", value, "bankUser");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andBankUserGreaterThanOrEqualTo(String value) {
            addCriterion("bank_user >=", value, "bankUser");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andBankUserLessThan(String value) {
            addCriterion("bank_user <", value, "bankUser");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andBankUserLessThanOrEqualTo(String value) {
            addCriterion("bank_user <=", value, "bankUser");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andBankUserLike(String value) {
            addCriterion("bank_user like", value, "bankUser");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andBankUserNotLike(String value) {
            addCriterion("bank_user not like", value, "bankUser");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andBankUserIn(List<String> values) {
            addCriterion("bank_user in", values, "bankUser");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andBankUserNotIn(List<String> values) {
            addCriterion("bank_user not in", values, "bankUser");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andBankUserBetween(String value1, String value2) {
            addCriterion("bank_user between", value1, value2, "bankUser");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andBankUserNotBetween(String value1, String value2) {
            addCriterion("bank_user not between", value1, value2, "bankUser");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andBankNameIsNull() {
            addCriterion("bank_name is null");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andBankNameIsNotNull() {
            addCriterion("bank_name is not null");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andBankNameEqualTo(String value) {
            addCriterion("bank_name =", value, "bankName");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andBankNameNotEqualTo(String value) {
            addCriterion("bank_name <>", value, "bankName");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andBankNameGreaterThan(String value) {
            addCriterion("bank_name >", value, "bankName");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_name >=", value, "bankName");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andBankNameLessThan(String value) {
            addCriterion("bank_name <", value, "bankName");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("bank_name <=", value, "bankName");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andBankNameLike(String value) {
            addCriterion("bank_name like", value, "bankName");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andBankNameNotLike(String value) {
            addCriterion("bank_name not like", value, "bankName");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andBankNameIn(List<String> values) {
            addCriterion("bank_name in", values, "bankName");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andBankNameNotIn(List<String> values) {
            addCriterion("bank_name not in", values, "bankName");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("bank_name between", value1, value2, "bankName");
            return (Criteria) this;
    }

    public TbSellerExample.Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("bank_name not between", value1, value2, "bankName");
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
