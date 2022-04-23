
package com.pinyougou.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class TbUserExample {
  protected String orderByClause;

  protected boolean distinct;

  public static class Criteria extends TbUserExample.GeneratedCriteria {
    protected Criteria() {
            super();
    }

  }

  protected List<TbUserExample.Criteria> oredCriteria;

  public TbUserExample() {
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

  public List<TbUserExample.Criteria> getOredCriteria() {
        return oredCriteria;
  }

  public void or(TbUserExample.Criteria criteria) {
        oredCriteria.add(criteria);
  }

  public TbUserExample.Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
  }

  public TbUserExample.Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
  }

  protected TbUserExample.Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
  }

  public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
  }

  protected static abstract class GeneratedCriteria {
    protected List<TbUserExample.Criterion> criteria;

    protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
    }

    public boolean isValid() {
            return criteria.size() > 0;
    }

    public List<TbUserExample.Criterion> getAllCriteria() {
            return criteria;
    }

    public List<TbUserExample.Criterion> getCriteria() {
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

    public TbUserExample.Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andCreatedIsNull() {
            addCriterion("created is null");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andCreatedIsNotNull() {
            addCriterion("created is not null");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andCreatedEqualTo(Date value) {
            addCriterion("created =", value, "created");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andCreatedNotEqualTo(Date value) {
            addCriterion("created <>", value, "created");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andCreatedGreaterThan(Date value) {
            addCriterion("created >", value, "created");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("created >=", value, "created");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andCreatedLessThan(Date value) {
            addCriterion("created <", value, "created");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andCreatedLessThanOrEqualTo(Date value) {
            addCriterion("created <=", value, "created");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andCreatedIn(List<Date> values) {
            addCriterion("created in", values, "created");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andCreatedNotIn(List<Date> values) {
            addCriterion("created not in", values, "created");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andCreatedBetween(Date value1, Date value2) {
            addCriterion("created between", value1, value2, "created");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andCreatedNotBetween(Date value1, Date value2) {
            addCriterion("created not between", value1, value2, "created");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andUpdatedIsNull() {
            addCriterion("updated is null");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andUpdatedIsNotNull() {
            addCriterion("updated is not null");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andUpdatedEqualTo(Date value) {
            addCriterion("updated =", value, "updated");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andUpdatedNotEqualTo(Date value) {
            addCriterion("updated <>", value, "updated");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andUpdatedGreaterThan(Date value) {
            addCriterion("updated >", value, "updated");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andUpdatedGreaterThanOrEqualTo(Date value) {
            addCriterion("updated >=", value, "updated");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andUpdatedLessThan(Date value) {
            addCriterion("updated <", value, "updated");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andUpdatedLessThanOrEqualTo(Date value) {
            addCriterion("updated <=", value, "updated");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andUpdatedIn(List<Date> values) {
            addCriterion("updated in", values, "updated");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andUpdatedNotIn(List<Date> values) {
            addCriterion("updated not in", values, "updated");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andUpdatedBetween(Date value1, Date value2) {
            addCriterion("updated between", value1, value2, "updated");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andUpdatedNotBetween(Date value1, Date value2) {
            addCriterion("updated not between", value1, value2, "updated");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andSourceTypeIsNull() {
            addCriterion("source_type is null");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andSourceTypeIsNotNull() {
            addCriterion("source_type is not null");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andSourceTypeEqualTo(String value) {
            addCriterion("source_type =", value, "sourceType");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andSourceTypeNotEqualTo(String value) {
            addCriterion("source_type <>", value, "sourceType");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andSourceTypeGreaterThan(String value) {
            addCriterion("source_type >", value, "sourceType");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andSourceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("source_type >=", value, "sourceType");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andSourceTypeLessThan(String value) {
            addCriterion("source_type <", value, "sourceType");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andSourceTypeLessThanOrEqualTo(String value) {
            addCriterion("source_type <=", value, "sourceType");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andSourceTypeLike(String value) {
            addCriterion("source_type like", value, "sourceType");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andSourceTypeNotLike(String value) {
            addCriterion("source_type not like", value, "sourceType");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andSourceTypeIn(List<String> values) {
            addCriterion("source_type in", values, "sourceType");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andSourceTypeNotIn(List<String> values) {
            addCriterion("source_type not in", values, "sourceType");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andSourceTypeBetween(String value1, String value2) {
            addCriterion("source_type between", value1, value2, "sourceType");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andSourceTypeNotBetween(String value1, String value2) {
            addCriterion("source_type not between", value1, value2, "sourceType");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andNickNameIsNull() {
            addCriterion("nick_name is null");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andNickNameIsNotNull() {
            addCriterion("nick_name is not null");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andNickNameEqualTo(String value) {
            addCriterion("nick_name =", value, "nickName");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andNickNameNotEqualTo(String value) {
            addCriterion("nick_name <>", value, "nickName");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andNickNameGreaterThan(String value) {
            addCriterion("nick_name >", value, "nickName");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("nick_name >=", value, "nickName");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andNickNameLessThan(String value) {
            addCriterion("nick_name <", value, "nickName");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andNickNameLessThanOrEqualTo(String value) {
            addCriterion("nick_name <=", value, "nickName");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andNickNameLike(String value) {
            addCriterion("nick_name like", value, "nickName");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andNickNameNotLike(String value) {
            addCriterion("nick_name not like", value, "nickName");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andNickNameIn(List<String> values) {
            addCriterion("nick_name in", values, "nickName");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andNickNameNotIn(List<String> values) {
            addCriterion("nick_name not in", values, "nickName");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("nick_name between", value1, value2, "nickName");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("nick_name not between", value1, value2, "nickName");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andHeadPicIsNull() {
            addCriterion("head_pic is null");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andHeadPicIsNotNull() {
            addCriterion("head_pic is not null");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andHeadPicEqualTo(String value) {
            addCriterion("head_pic =", value, "headPic");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andHeadPicNotEqualTo(String value) {
            addCriterion("head_pic <>", value, "headPic");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andHeadPicGreaterThan(String value) {
            addCriterion("head_pic >", value, "headPic");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andHeadPicGreaterThanOrEqualTo(String value) {
            addCriterion("head_pic >=", value, "headPic");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andHeadPicLessThan(String value) {
            addCriterion("head_pic <", value, "headPic");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andHeadPicLessThanOrEqualTo(String value) {
            addCriterion("head_pic <=", value, "headPic");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andHeadPicLike(String value) {
            addCriterion("head_pic like", value, "headPic");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andHeadPicNotLike(String value) {
            addCriterion("head_pic not like", value, "headPic");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andHeadPicIn(List<String> values) {
            addCriterion("head_pic in", values, "headPic");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andHeadPicNotIn(List<String> values) {
            addCriterion("head_pic not in", values, "headPic");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andHeadPicBetween(String value1, String value2) {
            addCriterion("head_pic between", value1, value2, "headPic");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andHeadPicNotBetween(String value1, String value2) {
            addCriterion("head_pic not between", value1, value2, "headPic");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andQqIsNull() {
            addCriterion("qq is null");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andQqIsNotNull() {
            addCriterion("qq is not null");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andQqEqualTo(String value) {
            addCriterion("qq =", value, "qq");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andQqNotEqualTo(String value) {
            addCriterion("qq <>", value, "qq");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andQqGreaterThan(String value) {
            addCriterion("qq >", value, "qq");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("qq >=", value, "qq");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andQqLessThan(String value) {
            addCriterion("qq <", value, "qq");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("qq <=", value, "qq");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andQqLike(String value) {
            addCriterion("qq like", value, "qq");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andQqNotLike(String value) {
            addCriterion("qq not like", value, "qq");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andQqIn(List<String> values) {
            addCriterion("qq in", values, "qq");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andQqNotIn(List<String> values) {
            addCriterion("qq not in", values, "qq");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andQqBetween(String value1, String value2) {
            addCriterion("qq between", value1, value2, "qq");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("qq not between", value1, value2, "qq");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andAccountBalanceIsNull() {
            addCriterion("account_balance is null");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andAccountBalanceIsNotNull() {
            addCriterion("account_balance is not null");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andAccountBalanceEqualTo(Long value) {
            addCriterion("account_balance =", value, "accountBalance");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andAccountBalanceNotEqualTo(Long value) {
            addCriterion("account_balance <>", value, "accountBalance");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andAccountBalanceGreaterThan(Long value) {
            addCriterion("account_balance >", value, "accountBalance");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andAccountBalanceGreaterThanOrEqualTo(Long value) {
            addCriterion("account_balance >=", value, "accountBalance");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andAccountBalanceLessThan(Long value) {
            addCriterion("account_balance <", value, "accountBalance");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andAccountBalanceLessThanOrEqualTo(Long value) {
            addCriterion("account_balance <=", value, "accountBalance");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andAccountBalanceIn(List<Long> values) {
            addCriterion("account_balance in", values, "accountBalance");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andAccountBalanceNotIn(List<Long> values) {
            addCriterion("account_balance not in", values, "accountBalance");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andAccountBalanceBetween(Long value1, Long value2) {
            addCriterion("account_balance between", value1, value2, "accountBalance");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andAccountBalanceNotBetween(Long value1, Long value2) {
            addCriterion("account_balance not between", value1, value2, "accountBalance");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andIsMobileCheckIsNull() {
            addCriterion("is_mobile_check is null");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andIsMobileCheckIsNotNull() {
            addCriterion("is_mobile_check is not null");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andIsMobileCheckEqualTo(String value) {
            addCriterion("is_mobile_check =", value, "isMobileCheck");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andIsMobileCheckNotEqualTo(String value) {
            addCriterion("is_mobile_check <>", value, "isMobileCheck");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andIsMobileCheckGreaterThan(String value) {
            addCriterion("is_mobile_check >", value, "isMobileCheck");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andIsMobileCheckGreaterThanOrEqualTo(String value) {
            addCriterion("is_mobile_check >=", value, "isMobileCheck");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andIsMobileCheckLessThan(String value) {
            addCriterion("is_mobile_check <", value, "isMobileCheck");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andIsMobileCheckLessThanOrEqualTo(String value) {
            addCriterion("is_mobile_check <=", value, "isMobileCheck");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andIsMobileCheckLike(String value) {
            addCriterion("is_mobile_check like", value, "isMobileCheck");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andIsMobileCheckNotLike(String value) {
            addCriterion("is_mobile_check not like", value, "isMobileCheck");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andIsMobileCheckIn(List<String> values) {
            addCriterion("is_mobile_check in", values, "isMobileCheck");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andIsMobileCheckNotIn(List<String> values) {
            addCriterion("is_mobile_check not in", values, "isMobileCheck");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andIsMobileCheckBetween(String value1, String value2) {
            addCriterion("is_mobile_check between", value1, value2, "isMobileCheck");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andIsMobileCheckNotBetween(String value1, String value2) {
            addCriterion("is_mobile_check not between", value1, value2, "isMobileCheck");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andIsEmailCheckIsNull() {
            addCriterion("is_email_check is null");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andIsEmailCheckIsNotNull() {
            addCriterion("is_email_check is not null");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andIsEmailCheckEqualTo(String value) {
            addCriterion("is_email_check =", value, "isEmailCheck");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andIsEmailCheckNotEqualTo(String value) {
            addCriterion("is_email_check <>", value, "isEmailCheck");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andIsEmailCheckGreaterThan(String value) {
            addCriterion("is_email_check >", value, "isEmailCheck");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andIsEmailCheckGreaterThanOrEqualTo(String value) {
            addCriterion("is_email_check >=", value, "isEmailCheck");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andIsEmailCheckLessThan(String value) {
            addCriterion("is_email_check <", value, "isEmailCheck");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andIsEmailCheckLessThanOrEqualTo(String value) {
            addCriterion("is_email_check <=", value, "isEmailCheck");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andIsEmailCheckLike(String value) {
            addCriterion("is_email_check like", value, "isEmailCheck");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andIsEmailCheckNotLike(String value) {
            addCriterion("is_email_check not like", value, "isEmailCheck");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andIsEmailCheckIn(List<String> values) {
            addCriterion("is_email_check in", values, "isEmailCheck");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andIsEmailCheckNotIn(List<String> values) {
            addCriterion("is_email_check not in", values, "isEmailCheck");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andIsEmailCheckBetween(String value1, String value2) {
            addCriterion("is_email_check between", value1, value2, "isEmailCheck");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andIsEmailCheckNotBetween(String value1, String value2) {
            addCriterion("is_email_check not between", value1, value2, "isEmailCheck");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andUserLevelIsNull() {
            addCriterion("user_level is null");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andUserLevelIsNotNull() {
            addCriterion("user_level is not null");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andUserLevelEqualTo(Integer value) {
            addCriterion("user_level =", value, "userLevel");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andUserLevelNotEqualTo(Integer value) {
            addCriterion("user_level <>", value, "userLevel");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andUserLevelGreaterThan(Integer value) {
            addCriterion("user_level >", value, "userLevel");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andUserLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_level >=", value, "userLevel");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andUserLevelLessThan(Integer value) {
            addCriterion("user_level <", value, "userLevel");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andUserLevelLessThanOrEqualTo(Integer value) {
            addCriterion("user_level <=", value, "userLevel");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andUserLevelIn(List<Integer> values) {
            addCriterion("user_level in", values, "userLevel");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andUserLevelNotIn(List<Integer> values) {
            addCriterion("user_level not in", values, "userLevel");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andUserLevelBetween(Integer value1, Integer value2) {
            addCriterion("user_level between", value1, value2, "userLevel");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andUserLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("user_level not between", value1, value2, "userLevel");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andPointsIsNull() {
            addCriterion("points is null");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andPointsIsNotNull() {
            addCriterion("points is not null");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andPointsEqualTo(Integer value) {
            addCriterion("points =", value, "points");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andPointsNotEqualTo(Integer value) {
            addCriterion("points <>", value, "points");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andPointsGreaterThan(Integer value) {
            addCriterion("points >", value, "points");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andPointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("points >=", value, "points");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andPointsLessThan(Integer value) {
            addCriterion("points <", value, "points");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andPointsLessThanOrEqualTo(Integer value) {
            addCriterion("points <=", value, "points");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andPointsIn(List<Integer> values) {
            addCriterion("points in", values, "points");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andPointsNotIn(List<Integer> values) {
            addCriterion("points not in", values, "points");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andPointsBetween(Integer value1, Integer value2) {
            addCriterion("points between", value1, value2, "points");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andPointsNotBetween(Integer value1, Integer value2) {
            addCriterion("points not between", value1, value2, "points");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andExperienceValueIsNull() {
            addCriterion("experience_value is null");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andExperienceValueIsNotNull() {
            addCriterion("experience_value is not null");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andExperienceValueEqualTo(Integer value) {
            addCriterion("experience_value =", value, "experienceValue");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andExperienceValueNotEqualTo(Integer value) {
            addCriterion("experience_value <>", value, "experienceValue");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andExperienceValueGreaterThan(Integer value) {
            addCriterion("experience_value >", value, "experienceValue");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andExperienceValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("experience_value >=", value, "experienceValue");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andExperienceValueLessThan(Integer value) {
            addCriterion("experience_value <", value, "experienceValue");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andExperienceValueLessThanOrEqualTo(Integer value) {
            addCriterion("experience_value <=", value, "experienceValue");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andExperienceValueIn(List<Integer> values) {
            addCriterion("experience_value in", values, "experienceValue");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andExperienceValueNotIn(List<Integer> values) {
            addCriterion("experience_value not in", values, "experienceValue");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andExperienceValueBetween(Integer value1, Integer value2) {
            addCriterion("experience_value between", value1, value2, "experienceValue");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andExperienceValueNotBetween(Integer value1, Integer value2) {
            addCriterion("experience_value not between", value1, value2, "experienceValue");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andBirthdayEqualTo(Date value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andBirthdayNotEqualTo(Date value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andBirthdayGreaterThan(Date value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andBirthdayLessThan(Date value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andBirthdayIn(List<Date> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andBirthdayNotIn(List<Date> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andLastLoginTimeIsNull() {
            addCriterion("last_login_time is null");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andLastLoginTimeIsNotNull() {
            addCriterion("last_login_time is not null");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andLastLoginTimeEqualTo(Date value) {
            addCriterion("last_login_time =", value, "lastLoginTime");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andLastLoginTimeNotEqualTo(Date value) {
            addCriterion("last_login_time <>", value, "lastLoginTime");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andLastLoginTimeGreaterThan(Date value) {
            addCriterion("last_login_time >", value, "lastLoginTime");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andLastLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_login_time >=", value, "lastLoginTime");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andLastLoginTimeLessThan(Date value) {
            addCriterion("last_login_time <", value, "lastLoginTime");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andLastLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_login_time <=", value, "lastLoginTime");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andLastLoginTimeIn(List<Date> values) {
            addCriterion("last_login_time in", values, "lastLoginTime");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andLastLoginTimeNotIn(List<Date> values) {
            addCriterion("last_login_time not in", values, "lastLoginTime");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andLastLoginTimeBetween(Date value1, Date value2) {
            addCriterion("last_login_time between", value1, value2, "lastLoginTime");
            return (Criteria) this;
    }

    public TbUserExample.Criteria andLastLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_login_time not between", value1, value2, "lastLoginTime");
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
