package com.fly.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserInfoExample() {
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

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("Fuser_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("Fuser_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("Fuser_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("Fuser_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("Fuser_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("Fuser_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("Fuser_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("Fuser_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("Fuser_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("Fuser_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("Fuser_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("Fuser_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("Fuser_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("Fuser_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andAccountIsNull() {
            addCriterion("Faccount is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("Faccount is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("Faccount =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("Faccount <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("Faccount >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("Faccount >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("Faccount <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("Faccount <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("Faccount like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("Faccount not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("Faccount in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("Faccount not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("Faccount between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("Faccount not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNull() {
            addCriterion("Fopen_id is null");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNotNull() {
            addCriterion("Fopen_id is not null");
            return (Criteria) this;
        }

        public Criteria andOpenIdEqualTo(String value) {
            addCriterion("Fopen_id =", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotEqualTo(String value) {
            addCriterion("Fopen_id <>", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThan(String value) {
            addCriterion("Fopen_id >", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("Fopen_id >=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThan(String value) {
            addCriterion("Fopen_id <", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThanOrEqualTo(String value) {
            addCriterion("Fopen_id <=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLike(String value) {
            addCriterion("Fopen_id like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotLike(String value) {
            addCriterion("Fopen_id not like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdIn(List<String> values) {
            addCriterion("Fopen_id in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotIn(List<String> values) {
            addCriterion("Fopen_id not in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdBetween(String value1, String value2) {
            addCriterion("Fopen_id between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotBetween(String value1, String value2) {
            addCriterion("Fopen_id not between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenKeyIsNull() {
            addCriterion("Fopen_key is null");
            return (Criteria) this;
        }

        public Criteria andOpenKeyIsNotNull() {
            addCriterion("Fopen_key is not null");
            return (Criteria) this;
        }

        public Criteria andOpenKeyEqualTo(String value) {
            addCriterion("Fopen_key =", value, "openKey");
            return (Criteria) this;
        }

        public Criteria andOpenKeyNotEqualTo(String value) {
            addCriterion("Fopen_key <>", value, "openKey");
            return (Criteria) this;
        }

        public Criteria andOpenKeyGreaterThan(String value) {
            addCriterion("Fopen_key >", value, "openKey");
            return (Criteria) this;
        }

        public Criteria andOpenKeyGreaterThanOrEqualTo(String value) {
            addCriterion("Fopen_key >=", value, "openKey");
            return (Criteria) this;
        }

        public Criteria andOpenKeyLessThan(String value) {
            addCriterion("Fopen_key <", value, "openKey");
            return (Criteria) this;
        }

        public Criteria andOpenKeyLessThanOrEqualTo(String value) {
            addCriterion("Fopen_key <=", value, "openKey");
            return (Criteria) this;
        }

        public Criteria andOpenKeyLike(String value) {
            addCriterion("Fopen_key like", value, "openKey");
            return (Criteria) this;
        }

        public Criteria andOpenKeyNotLike(String value) {
            addCriterion("Fopen_key not like", value, "openKey");
            return (Criteria) this;
        }

        public Criteria andOpenKeyIn(List<String> values) {
            addCriterion("Fopen_key in", values, "openKey");
            return (Criteria) this;
        }

        public Criteria andOpenKeyNotIn(List<String> values) {
            addCriterion("Fopen_key not in", values, "openKey");
            return (Criteria) this;
        }

        public Criteria andOpenKeyBetween(String value1, String value2) {
            addCriterion("Fopen_key between", value1, value2, "openKey");
            return (Criteria) this;
        }

        public Criteria andOpenKeyNotBetween(String value1, String value2) {
            addCriterion("Fopen_key not between", value1, value2, "openKey");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdIsNull() {
            addCriterion("Fwx_open_id is null");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdIsNotNull() {
            addCriterion("Fwx_open_id is not null");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdEqualTo(String value) {
            addCriterion("Fwx_open_id =", value, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdNotEqualTo(String value) {
            addCriterion("Fwx_open_id <>", value, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdGreaterThan(String value) {
            addCriterion("Fwx_open_id >", value, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("Fwx_open_id >=", value, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdLessThan(String value) {
            addCriterion("Fwx_open_id <", value, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdLessThanOrEqualTo(String value) {
            addCriterion("Fwx_open_id <=", value, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdLike(String value) {
            addCriterion("Fwx_open_id like", value, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdNotLike(String value) {
            addCriterion("Fwx_open_id not like", value, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdIn(List<String> values) {
            addCriterion("Fwx_open_id in", values, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdNotIn(List<String> values) {
            addCriterion("Fwx_open_id not in", values, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdBetween(String value1, String value2) {
            addCriterion("Fwx_open_id between", value1, value2, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdNotBetween(String value1, String value2) {
            addCriterion("Fwx_open_id not between", value1, value2, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andQqOpenIdIsNull() {
            addCriterion("Fqq_open_id is null");
            return (Criteria) this;
        }

        public Criteria andQqOpenIdIsNotNull() {
            addCriterion("Fqq_open_id is not null");
            return (Criteria) this;
        }

        public Criteria andQqOpenIdEqualTo(String value) {
            addCriterion("Fqq_open_id =", value, "qqOpenId");
            return (Criteria) this;
        }

        public Criteria andQqOpenIdNotEqualTo(String value) {
            addCriterion("Fqq_open_id <>", value, "qqOpenId");
            return (Criteria) this;
        }

        public Criteria andQqOpenIdGreaterThan(String value) {
            addCriterion("Fqq_open_id >", value, "qqOpenId");
            return (Criteria) this;
        }

        public Criteria andQqOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("Fqq_open_id >=", value, "qqOpenId");
            return (Criteria) this;
        }

        public Criteria andQqOpenIdLessThan(String value) {
            addCriterion("Fqq_open_id <", value, "qqOpenId");
            return (Criteria) this;
        }

        public Criteria andQqOpenIdLessThanOrEqualTo(String value) {
            addCriterion("Fqq_open_id <=", value, "qqOpenId");
            return (Criteria) this;
        }

        public Criteria andQqOpenIdLike(String value) {
            addCriterion("Fqq_open_id like", value, "qqOpenId");
            return (Criteria) this;
        }

        public Criteria andQqOpenIdNotLike(String value) {
            addCriterion("Fqq_open_id not like", value, "qqOpenId");
            return (Criteria) this;
        }

        public Criteria andQqOpenIdIn(List<String> values) {
            addCriterion("Fqq_open_id in", values, "qqOpenId");
            return (Criteria) this;
        }

        public Criteria andQqOpenIdNotIn(List<String> values) {
            addCriterion("Fqq_open_id not in", values, "qqOpenId");
            return (Criteria) this;
        }

        public Criteria andQqOpenIdBetween(String value1, String value2) {
            addCriterion("Fqq_open_id between", value1, value2, "qqOpenId");
            return (Criteria) this;
        }

        public Criteria andQqOpenIdNotBetween(String value1, String value2) {
            addCriterion("Fqq_open_id not between", value1, value2, "qqOpenId");
            return (Criteria) this;
        }

        public Criteria andBindWxIsNull() {
            addCriterion("Fbind_wx is null");
            return (Criteria) this;
        }

        public Criteria andBindWxIsNotNull() {
            addCriterion("Fbind_wx is not null");
            return (Criteria) this;
        }

        public Criteria andBindWxEqualTo(String value) {
            addCriterion("Fbind_wx =", value, "bindWx");
            return (Criteria) this;
        }

        public Criteria andBindWxNotEqualTo(String value) {
            addCriterion("Fbind_wx <>", value, "bindWx");
            return (Criteria) this;
        }

        public Criteria andBindWxGreaterThan(String value) {
            addCriterion("Fbind_wx >", value, "bindWx");
            return (Criteria) this;
        }

        public Criteria andBindWxGreaterThanOrEqualTo(String value) {
            addCriterion("Fbind_wx >=", value, "bindWx");
            return (Criteria) this;
        }

        public Criteria andBindWxLessThan(String value) {
            addCriterion("Fbind_wx <", value, "bindWx");
            return (Criteria) this;
        }

        public Criteria andBindWxLessThanOrEqualTo(String value) {
            addCriterion("Fbind_wx <=", value, "bindWx");
            return (Criteria) this;
        }

        public Criteria andBindWxLike(String value) {
            addCriterion("Fbind_wx like", value, "bindWx");
            return (Criteria) this;
        }

        public Criteria andBindWxNotLike(String value) {
            addCriterion("Fbind_wx not like", value, "bindWx");
            return (Criteria) this;
        }

        public Criteria andBindWxIn(List<String> values) {
            addCriterion("Fbind_wx in", values, "bindWx");
            return (Criteria) this;
        }

        public Criteria andBindWxNotIn(List<String> values) {
            addCriterion("Fbind_wx not in", values, "bindWx");
            return (Criteria) this;
        }

        public Criteria andBindWxBetween(String value1, String value2) {
            addCriterion("Fbind_wx between", value1, value2, "bindWx");
            return (Criteria) this;
        }

        public Criteria andBindWxNotBetween(String value1, String value2) {
            addCriterion("Fbind_wx not between", value1, value2, "bindWx");
            return (Criteria) this;
        }

        public Criteria andBindQqIsNull() {
            addCriterion("Fbind_qq is null");
            return (Criteria) this;
        }

        public Criteria andBindQqIsNotNull() {
            addCriterion("Fbind_qq is not null");
            return (Criteria) this;
        }

        public Criteria andBindQqEqualTo(String value) {
            addCriterion("Fbind_qq =", value, "bindQq");
            return (Criteria) this;
        }

        public Criteria andBindQqNotEqualTo(String value) {
            addCriterion("Fbind_qq <>", value, "bindQq");
            return (Criteria) this;
        }

        public Criteria andBindQqGreaterThan(String value) {
            addCriterion("Fbind_qq >", value, "bindQq");
            return (Criteria) this;
        }

        public Criteria andBindQqGreaterThanOrEqualTo(String value) {
            addCriterion("Fbind_qq >=", value, "bindQq");
            return (Criteria) this;
        }

        public Criteria andBindQqLessThan(String value) {
            addCriterion("Fbind_qq <", value, "bindQq");
            return (Criteria) this;
        }

        public Criteria andBindQqLessThanOrEqualTo(String value) {
            addCriterion("Fbind_qq <=", value, "bindQq");
            return (Criteria) this;
        }

        public Criteria andBindQqLike(String value) {
            addCriterion("Fbind_qq like", value, "bindQq");
            return (Criteria) this;
        }

        public Criteria andBindQqNotLike(String value) {
            addCriterion("Fbind_qq not like", value, "bindQq");
            return (Criteria) this;
        }

        public Criteria andBindQqIn(List<String> values) {
            addCriterion("Fbind_qq in", values, "bindQq");
            return (Criteria) this;
        }

        public Criteria andBindQqNotIn(List<String> values) {
            addCriterion("Fbind_qq not in", values, "bindQq");
            return (Criteria) this;
        }

        public Criteria andBindQqBetween(String value1, String value2) {
            addCriterion("Fbind_qq between", value1, value2, "bindQq");
            return (Criteria) this;
        }

        public Criteria andBindQqNotBetween(String value1, String value2) {
            addCriterion("Fbind_qq not between", value1, value2, "bindQq");
            return (Criteria) this;
        }

        public Criteria andWxOpenKeyIsNull() {
            addCriterion("Fwx_open_key is null");
            return (Criteria) this;
        }

        public Criteria andWxOpenKeyIsNotNull() {
            addCriterion("Fwx_open_key is not null");
            return (Criteria) this;
        }

        public Criteria andWxOpenKeyEqualTo(String value) {
            addCriterion("Fwx_open_key =", value, "wxOpenKey");
            return (Criteria) this;
        }

        public Criteria andWxOpenKeyNotEqualTo(String value) {
            addCriterion("Fwx_open_key <>", value, "wxOpenKey");
            return (Criteria) this;
        }

        public Criteria andWxOpenKeyGreaterThan(String value) {
            addCriterion("Fwx_open_key >", value, "wxOpenKey");
            return (Criteria) this;
        }

        public Criteria andWxOpenKeyGreaterThanOrEqualTo(String value) {
            addCriterion("Fwx_open_key >=", value, "wxOpenKey");
            return (Criteria) this;
        }

        public Criteria andWxOpenKeyLessThan(String value) {
            addCriterion("Fwx_open_key <", value, "wxOpenKey");
            return (Criteria) this;
        }

        public Criteria andWxOpenKeyLessThanOrEqualTo(String value) {
            addCriterion("Fwx_open_key <=", value, "wxOpenKey");
            return (Criteria) this;
        }

        public Criteria andWxOpenKeyLike(String value) {
            addCriterion("Fwx_open_key like", value, "wxOpenKey");
            return (Criteria) this;
        }

        public Criteria andWxOpenKeyNotLike(String value) {
            addCriterion("Fwx_open_key not like", value, "wxOpenKey");
            return (Criteria) this;
        }

        public Criteria andWxOpenKeyIn(List<String> values) {
            addCriterion("Fwx_open_key in", values, "wxOpenKey");
            return (Criteria) this;
        }

        public Criteria andWxOpenKeyNotIn(List<String> values) {
            addCriterion("Fwx_open_key not in", values, "wxOpenKey");
            return (Criteria) this;
        }

        public Criteria andWxOpenKeyBetween(String value1, String value2) {
            addCriterion("Fwx_open_key between", value1, value2, "wxOpenKey");
            return (Criteria) this;
        }

        public Criteria andWxOpenKeyNotBetween(String value1, String value2) {
            addCriterion("Fwx_open_key not between", value1, value2, "wxOpenKey");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("Fgender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("Fgender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("Fgender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("Fgender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("Fgender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("Fgender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("Fgender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("Fgender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("Fgender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("Fgender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("Fgender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("Fgender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("Fgender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("Fgender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andSignIsNull() {
            addCriterion("Fsign is null");
            return (Criteria) this;
        }

        public Criteria andSignIsNotNull() {
            addCriterion("Fsign is not null");
            return (Criteria) this;
        }

        public Criteria andSignEqualTo(String value) {
            addCriterion("Fsign =", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotEqualTo(String value) {
            addCriterion("Fsign <>", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignGreaterThan(String value) {
            addCriterion("Fsign >", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignGreaterThanOrEqualTo(String value) {
            addCriterion("Fsign >=", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignLessThan(String value) {
            addCriterion("Fsign <", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignLessThanOrEqualTo(String value) {
            addCriterion("Fsign <=", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignLike(String value) {
            addCriterion("Fsign like", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotLike(String value) {
            addCriterion("Fsign not like", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignIn(List<String> values) {
            addCriterion("Fsign in", values, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotIn(List<String> values) {
            addCriterion("Fsign not in", values, "sign");
            return (Criteria) this;
        }

        public Criteria andSignBetween(String value1, String value2) {
            addCriterion("Fsign between", value1, value2, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotBetween(String value1, String value2) {
            addCriterion("Fsign not between", value1, value2, "sign");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNull() {
            addCriterion("Fnick_name is null");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNotNull() {
            addCriterion("Fnick_name is not null");
            return (Criteria) this;
        }

        public Criteria andNickNameEqualTo(String value) {
            addCriterion("Fnick_name =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotEqualTo(String value) {
            addCriterion("Fnick_name <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThan(String value) {
            addCriterion("Fnick_name >", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("Fnick_name >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThan(String value) {
            addCriterion("Fnick_name <", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThanOrEqualTo(String value) {
            addCriterion("Fnick_name <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLike(String value) {
            addCriterion("Fnick_name like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotLike(String value) {
            addCriterion("Fnick_name not like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameIn(List<String> values) {
            addCriterion("Fnick_name in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotIn(List<String> values) {
            addCriterion("Fnick_name not in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("Fnick_name between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("Fnick_name not between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andFaceUrlIsNull() {
            addCriterion("Fface_url is null");
            return (Criteria) this;
        }

        public Criteria andFaceUrlIsNotNull() {
            addCriterion("Fface_url is not null");
            return (Criteria) this;
        }

        public Criteria andFaceUrlEqualTo(String value) {
            addCriterion("Fface_url =", value, "faceUrl");
            return (Criteria) this;
        }

        public Criteria andFaceUrlNotEqualTo(String value) {
            addCriterion("Fface_url <>", value, "faceUrl");
            return (Criteria) this;
        }

        public Criteria andFaceUrlGreaterThan(String value) {
            addCriterion("Fface_url >", value, "faceUrl");
            return (Criteria) this;
        }

        public Criteria andFaceUrlGreaterThanOrEqualTo(String value) {
            addCriterion("Fface_url >=", value, "faceUrl");
            return (Criteria) this;
        }

        public Criteria andFaceUrlLessThan(String value) {
            addCriterion("Fface_url <", value, "faceUrl");
            return (Criteria) this;
        }

        public Criteria andFaceUrlLessThanOrEqualTo(String value) {
            addCriterion("Fface_url <=", value, "faceUrl");
            return (Criteria) this;
        }

        public Criteria andFaceUrlLike(String value) {
            addCriterion("Fface_url like", value, "faceUrl");
            return (Criteria) this;
        }

        public Criteria andFaceUrlNotLike(String value) {
            addCriterion("Fface_url not like", value, "faceUrl");
            return (Criteria) this;
        }

        public Criteria andFaceUrlIn(List<String> values) {
            addCriterion("Fface_url in", values, "faceUrl");
            return (Criteria) this;
        }

        public Criteria andFaceUrlNotIn(List<String> values) {
            addCriterion("Fface_url not in", values, "faceUrl");
            return (Criteria) this;
        }

        public Criteria andFaceUrlBetween(String value1, String value2) {
            addCriterion("Fface_url between", value1, value2, "faceUrl");
            return (Criteria) this;
        }

        public Criteria andFaceUrlNotBetween(String value1, String value2) {
            addCriterion("Fface_url not between", value1, value2, "faceUrl");
            return (Criteria) this;
        }

        public Criteria andMediaIdIsNull() {
            addCriterion("Fmedia_id is null");
            return (Criteria) this;
        }

        public Criteria andMediaIdIsNotNull() {
            addCriterion("Fmedia_id is not null");
            return (Criteria) this;
        }

        public Criteria andMediaIdEqualTo(String value) {
            addCriterion("Fmedia_id =", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdNotEqualTo(String value) {
            addCriterion("Fmedia_id <>", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdGreaterThan(String value) {
            addCriterion("Fmedia_id >", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdGreaterThanOrEqualTo(String value) {
            addCriterion("Fmedia_id >=", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdLessThan(String value) {
            addCriterion("Fmedia_id <", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdLessThanOrEqualTo(String value) {
            addCriterion("Fmedia_id <=", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdLike(String value) {
            addCriterion("Fmedia_id like", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdNotLike(String value) {
            addCriterion("Fmedia_id not like", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdIn(List<String> values) {
            addCriterion("Fmedia_id in", values, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdNotIn(List<String> values) {
            addCriterion("Fmedia_id not in", values, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdBetween(String value1, String value2) {
            addCriterion("Fmedia_id between", value1, value2, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdNotBetween(String value1, String value2) {
            addCriterion("Fmedia_id not between", value1, value2, "mediaId");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNull() {
            addCriterion("Freal_name is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("Freal_name is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("Freal_name =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("Freal_name <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("Freal_name >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("Freal_name >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("Freal_name <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("Freal_name <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("Freal_name like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("Freal_name not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("Freal_name in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("Freal_name not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("Freal_name between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("Freal_name not between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("Femail is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("Femail is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("Femail =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("Femail <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("Femail >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("Femail >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("Femail <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("Femail <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("Femail like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("Femail not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("Femail in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("Femail not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("Femail between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("Femail not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailComfirmTagIsNull() {
            addCriterion("Femail_comfirm_tag is null");
            return (Criteria) this;
        }

        public Criteria andEmailComfirmTagIsNotNull() {
            addCriterion("Femail_comfirm_tag is not null");
            return (Criteria) this;
        }

        public Criteria andEmailComfirmTagEqualTo(Short value) {
            addCriterion("Femail_comfirm_tag =", value, "emailComfirmTag");
            return (Criteria) this;
        }

        public Criteria andEmailComfirmTagNotEqualTo(Short value) {
            addCriterion("Femail_comfirm_tag <>", value, "emailComfirmTag");
            return (Criteria) this;
        }

        public Criteria andEmailComfirmTagGreaterThan(Short value) {
            addCriterion("Femail_comfirm_tag >", value, "emailComfirmTag");
            return (Criteria) this;
        }

        public Criteria andEmailComfirmTagGreaterThanOrEqualTo(Short value) {
            addCriterion("Femail_comfirm_tag >=", value, "emailComfirmTag");
            return (Criteria) this;
        }

        public Criteria andEmailComfirmTagLessThan(Short value) {
            addCriterion("Femail_comfirm_tag <", value, "emailComfirmTag");
            return (Criteria) this;
        }

        public Criteria andEmailComfirmTagLessThanOrEqualTo(Short value) {
            addCriterion("Femail_comfirm_tag <=", value, "emailComfirmTag");
            return (Criteria) this;
        }

        public Criteria andEmailComfirmTagIn(List<Short> values) {
            addCriterion("Femail_comfirm_tag in", values, "emailComfirmTag");
            return (Criteria) this;
        }

        public Criteria andEmailComfirmTagNotIn(List<Short> values) {
            addCriterion("Femail_comfirm_tag not in", values, "emailComfirmTag");
            return (Criteria) this;
        }

        public Criteria andEmailComfirmTagBetween(Short value1, Short value2) {
            addCriterion("Femail_comfirm_tag between", value1, value2, "emailComfirmTag");
            return (Criteria) this;
        }

        public Criteria andEmailComfirmTagNotBetween(Short value1, Short value2) {
            addCriterion("Femail_comfirm_tag not between", value1, value2, "emailComfirmTag");
            return (Criteria) this;
        }

        public Criteria andQqnumberIsNull() {
            addCriterion("Fqqnumber is null");
            return (Criteria) this;
        }

        public Criteria andQqnumberIsNotNull() {
            addCriterion("Fqqnumber is not null");
            return (Criteria) this;
        }

        public Criteria andQqnumberEqualTo(String value) {
            addCriterion("Fqqnumber =", value, "qqnumber");
            return (Criteria) this;
        }

        public Criteria andQqnumberNotEqualTo(String value) {
            addCriterion("Fqqnumber <>", value, "qqnumber");
            return (Criteria) this;
        }

        public Criteria andQqnumberGreaterThan(String value) {
            addCriterion("Fqqnumber >", value, "qqnumber");
            return (Criteria) this;
        }

        public Criteria andQqnumberGreaterThanOrEqualTo(String value) {
            addCriterion("Fqqnumber >=", value, "qqnumber");
            return (Criteria) this;
        }

        public Criteria andQqnumberLessThan(String value) {
            addCriterion("Fqqnumber <", value, "qqnumber");
            return (Criteria) this;
        }

        public Criteria andQqnumberLessThanOrEqualTo(String value) {
            addCriterion("Fqqnumber <=", value, "qqnumber");
            return (Criteria) this;
        }

        public Criteria andQqnumberLike(String value) {
            addCriterion("Fqqnumber like", value, "qqnumber");
            return (Criteria) this;
        }

        public Criteria andQqnumberNotLike(String value) {
            addCriterion("Fqqnumber not like", value, "qqnumber");
            return (Criteria) this;
        }

        public Criteria andQqnumberIn(List<String> values) {
            addCriterion("Fqqnumber in", values, "qqnumber");
            return (Criteria) this;
        }

        public Criteria andQqnumberNotIn(List<String> values) {
            addCriterion("Fqqnumber not in", values, "qqnumber");
            return (Criteria) this;
        }

        public Criteria andQqnumberBetween(String value1, String value2) {
            addCriterion("Fqqnumber between", value1, value2, "qqnumber");
            return (Criteria) this;
        }

        public Criteria andQqnumberNotBetween(String value1, String value2) {
            addCriterion("Fqqnumber not between", value1, value2, "qqnumber");
            return (Criteria) this;
        }

        public Criteria andQqComfirmTagIsNull() {
            addCriterion("Fqq_comfirm_tag is null");
            return (Criteria) this;
        }

        public Criteria andQqComfirmTagIsNotNull() {
            addCriterion("Fqq_comfirm_tag is not null");
            return (Criteria) this;
        }

        public Criteria andQqComfirmTagEqualTo(Short value) {
            addCriterion("Fqq_comfirm_tag =", value, "qqComfirmTag");
            return (Criteria) this;
        }

        public Criteria andQqComfirmTagNotEqualTo(Short value) {
            addCriterion("Fqq_comfirm_tag <>", value, "qqComfirmTag");
            return (Criteria) this;
        }

        public Criteria andQqComfirmTagGreaterThan(Short value) {
            addCriterion("Fqq_comfirm_tag >", value, "qqComfirmTag");
            return (Criteria) this;
        }

        public Criteria andQqComfirmTagGreaterThanOrEqualTo(Short value) {
            addCriterion("Fqq_comfirm_tag >=", value, "qqComfirmTag");
            return (Criteria) this;
        }

        public Criteria andQqComfirmTagLessThan(Short value) {
            addCriterion("Fqq_comfirm_tag <", value, "qqComfirmTag");
            return (Criteria) this;
        }

        public Criteria andQqComfirmTagLessThanOrEqualTo(Short value) {
            addCriterion("Fqq_comfirm_tag <=", value, "qqComfirmTag");
            return (Criteria) this;
        }

        public Criteria andQqComfirmTagIn(List<Short> values) {
            addCriterion("Fqq_comfirm_tag in", values, "qqComfirmTag");
            return (Criteria) this;
        }

        public Criteria andQqComfirmTagNotIn(List<Short> values) {
            addCriterion("Fqq_comfirm_tag not in", values, "qqComfirmTag");
            return (Criteria) this;
        }

        public Criteria andQqComfirmTagBetween(Short value1, Short value2) {
            addCriterion("Fqq_comfirm_tag between", value1, value2, "qqComfirmTag");
            return (Criteria) this;
        }

        public Criteria andQqComfirmTagNotBetween(Short value1, Short value2) {
            addCriterion("Fqq_comfirm_tag not between", value1, value2, "qqComfirmTag");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("Ftelephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("Ftelephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("Ftelephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("Ftelephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("Ftelephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("Ftelephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("Ftelephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("Ftelephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("Ftelephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("Ftelephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("Ftelephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("Ftelephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("Ftelephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("Ftelephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneComfirmTagIsNull() {
            addCriterion("Ftelephone_comfirm_tag is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneComfirmTagIsNotNull() {
            addCriterion("Ftelephone_comfirm_tag is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneComfirmTagEqualTo(Short value) {
            addCriterion("Ftelephone_comfirm_tag =", value, "telephoneComfirmTag");
            return (Criteria) this;
        }

        public Criteria andTelephoneComfirmTagNotEqualTo(Short value) {
            addCriterion("Ftelephone_comfirm_tag <>", value, "telephoneComfirmTag");
            return (Criteria) this;
        }

        public Criteria andTelephoneComfirmTagGreaterThan(Short value) {
            addCriterion("Ftelephone_comfirm_tag >", value, "telephoneComfirmTag");
            return (Criteria) this;
        }

        public Criteria andTelephoneComfirmTagGreaterThanOrEqualTo(Short value) {
            addCriterion("Ftelephone_comfirm_tag >=", value, "telephoneComfirmTag");
            return (Criteria) this;
        }

        public Criteria andTelephoneComfirmTagLessThan(Short value) {
            addCriterion("Ftelephone_comfirm_tag <", value, "telephoneComfirmTag");
            return (Criteria) this;
        }

        public Criteria andTelephoneComfirmTagLessThanOrEqualTo(Short value) {
            addCriterion("Ftelephone_comfirm_tag <=", value, "telephoneComfirmTag");
            return (Criteria) this;
        }

        public Criteria andTelephoneComfirmTagIn(List<Short> values) {
            addCriterion("Ftelephone_comfirm_tag in", values, "telephoneComfirmTag");
            return (Criteria) this;
        }

        public Criteria andTelephoneComfirmTagNotIn(List<Short> values) {
            addCriterion("Ftelephone_comfirm_tag not in", values, "telephoneComfirmTag");
            return (Criteria) this;
        }

        public Criteria andTelephoneComfirmTagBetween(Short value1, Short value2) {
            addCriterion("Ftelephone_comfirm_tag between", value1, value2, "telephoneComfirmTag");
            return (Criteria) this;
        }

        public Criteria andTelephoneComfirmTagNotBetween(Short value1, Short value2) {
            addCriterion("Ftelephone_comfirm_tag not between", value1, value2, "telephoneComfirmTag");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("Fphone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("Fphone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("Fphone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("Fphone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("Fphone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("Fphone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("Fphone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("Fphone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("Fphone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("Fphone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("Fphone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("Fphone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("Fphone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("Fphone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("Fcompany is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("Fcompany is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("Fcompany =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("Fcompany <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("Fcompany >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("Fcompany >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("Fcompany <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("Fcompany <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("Fcompany like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("Fcompany not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("Fcompany in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("Fcompany not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("Fcompany between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("Fcompany not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("Fdepartment is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("Fdepartment is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("Fdepartment =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("Fdepartment <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("Fdepartment >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("Fdepartment >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("Fdepartment <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("Fdepartment <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("Fdepartment like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("Fdepartment not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("Fdepartment in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("Fdepartment not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("Fdepartment between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("Fdepartment not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("Fposition is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("Fposition is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("Fposition =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("Fposition <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("Fposition >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("Fposition >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("Fposition <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("Fposition <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("Fposition like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("Fposition not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("Fposition in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("Fposition not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("Fposition between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("Fposition not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andCardUrlIsNull() {
            addCriterion("Fcard_url is null");
            return (Criteria) this;
        }

        public Criteria andCardUrlIsNotNull() {
            addCriterion("Fcard_url is not null");
            return (Criteria) this;
        }

        public Criteria andCardUrlEqualTo(String value) {
            addCriterion("Fcard_url =", value, "cardUrl");
            return (Criteria) this;
        }

        public Criteria andCardUrlNotEqualTo(String value) {
            addCriterion("Fcard_url <>", value, "cardUrl");
            return (Criteria) this;
        }

        public Criteria andCardUrlGreaterThan(String value) {
            addCriterion("Fcard_url >", value, "cardUrl");
            return (Criteria) this;
        }

        public Criteria andCardUrlGreaterThanOrEqualTo(String value) {
            addCriterion("Fcard_url >=", value, "cardUrl");
            return (Criteria) this;
        }

        public Criteria andCardUrlLessThan(String value) {
            addCriterion("Fcard_url <", value, "cardUrl");
            return (Criteria) this;
        }

        public Criteria andCardUrlLessThanOrEqualTo(String value) {
            addCriterion("Fcard_url <=", value, "cardUrl");
            return (Criteria) this;
        }

        public Criteria andCardUrlLike(String value) {
            addCriterion("Fcard_url like", value, "cardUrl");
            return (Criteria) this;
        }

        public Criteria andCardUrlNotLike(String value) {
            addCriterion("Fcard_url not like", value, "cardUrl");
            return (Criteria) this;
        }

        public Criteria andCardUrlIn(List<String> values) {
            addCriterion("Fcard_url in", values, "cardUrl");
            return (Criteria) this;
        }

        public Criteria andCardUrlNotIn(List<String> values) {
            addCriterion("Fcard_url not in", values, "cardUrl");
            return (Criteria) this;
        }

        public Criteria andCardUrlBetween(String value1, String value2) {
            addCriterion("Fcard_url between", value1, value2, "cardUrl");
            return (Criteria) this;
        }

        public Criteria andCardUrlNotBetween(String value1, String value2) {
            addCriterion("Fcard_url not between", value1, value2, "cardUrl");
            return (Criteria) this;
        }

        public Criteria andIscomfirmedIsNull() {
            addCriterion("Fiscomfirmed is null");
            return (Criteria) this;
        }

        public Criteria andIscomfirmedIsNotNull() {
            addCriterion("Fiscomfirmed is not null");
            return (Criteria) this;
        }

        public Criteria andIscomfirmedEqualTo(Short value) {
            addCriterion("Fiscomfirmed =", value, "iscomfirmed");
            return (Criteria) this;
        }

        public Criteria andIscomfirmedNotEqualTo(Short value) {
            addCriterion("Fiscomfirmed <>", value, "iscomfirmed");
            return (Criteria) this;
        }

        public Criteria andIscomfirmedGreaterThan(Short value) {
            addCriterion("Fiscomfirmed >", value, "iscomfirmed");
            return (Criteria) this;
        }

        public Criteria andIscomfirmedGreaterThanOrEqualTo(Short value) {
            addCriterion("Fiscomfirmed >=", value, "iscomfirmed");
            return (Criteria) this;
        }

        public Criteria andIscomfirmedLessThan(Short value) {
            addCriterion("Fiscomfirmed <", value, "iscomfirmed");
            return (Criteria) this;
        }

        public Criteria andIscomfirmedLessThanOrEqualTo(Short value) {
            addCriterion("Fiscomfirmed <=", value, "iscomfirmed");
            return (Criteria) this;
        }

        public Criteria andIscomfirmedIn(List<Short> values) {
            addCriterion("Fiscomfirmed in", values, "iscomfirmed");
            return (Criteria) this;
        }

        public Criteria andIscomfirmedNotIn(List<Short> values) {
            addCriterion("Fiscomfirmed not in", values, "iscomfirmed");
            return (Criteria) this;
        }

        public Criteria andIscomfirmedBetween(Short value1, Short value2) {
            addCriterion("Fiscomfirmed between", value1, value2, "iscomfirmed");
            return (Criteria) this;
        }

        public Criteria andIscomfirmedNotBetween(Short value1, Short value2) {
            addCriterion("Fiscomfirmed not between", value1, value2, "iscomfirmed");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("Fcreate_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("Fcreate_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("Fcreate_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("Fcreate_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("Fcreate_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Fcreate_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("Fcreate_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("Fcreate_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("Fcreate_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("Fcreate_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("Fcreate_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("Fcreate_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andModTimeIsNull() {
            addCriterion("Fmod_time is null");
            return (Criteria) this;
        }

        public Criteria andModTimeIsNotNull() {
            addCriterion("Fmod_time is not null");
            return (Criteria) this;
        }

        public Criteria andModTimeEqualTo(Date value) {
            addCriterion("Fmod_time =", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeNotEqualTo(Date value) {
            addCriterion("Fmod_time <>", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeGreaterThan(Date value) {
            addCriterion("Fmod_time >", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Fmod_time >=", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeLessThan(Date value) {
            addCriterion("Fmod_time <", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeLessThanOrEqualTo(Date value) {
            addCriterion("Fmod_time <=", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeIn(List<Date> values) {
            addCriterion("Fmod_time in", values, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeNotIn(List<Date> values) {
            addCriterion("Fmod_time not in", values, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeBetween(Date value1, Date value2) {
            addCriterion("Fmod_time between", value1, value2, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeNotBetween(Date value1, Date value2) {
            addCriterion("Fmod_time not between", value1, value2, "modTime");
            return (Criteria) this;
        }

        public Criteria andCheckinTimeIsNull() {
            addCriterion("Fcheckin_time is null");
            return (Criteria) this;
        }

        public Criteria andCheckinTimeIsNotNull() {
            addCriterion("Fcheckin_time is not null");
            return (Criteria) this;
        }

        public Criteria andCheckinTimeEqualTo(Date value) {
            addCriterion("Fcheckin_time =", value, "checkinTime");
            return (Criteria) this;
        }

        public Criteria andCheckinTimeNotEqualTo(Date value) {
            addCriterion("Fcheckin_time <>", value, "checkinTime");
            return (Criteria) this;
        }

        public Criteria andCheckinTimeGreaterThan(Date value) {
            addCriterion("Fcheckin_time >", value, "checkinTime");
            return (Criteria) this;
        }

        public Criteria andCheckinTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Fcheckin_time >=", value, "checkinTime");
            return (Criteria) this;
        }

        public Criteria andCheckinTimeLessThan(Date value) {
            addCriterion("Fcheckin_time <", value, "checkinTime");
            return (Criteria) this;
        }

        public Criteria andCheckinTimeLessThanOrEqualTo(Date value) {
            addCriterion("Fcheckin_time <=", value, "checkinTime");
            return (Criteria) this;
        }

        public Criteria andCheckinTimeIn(List<Date> values) {
            addCriterion("Fcheckin_time in", values, "checkinTime");
            return (Criteria) this;
        }

        public Criteria andCheckinTimeNotIn(List<Date> values) {
            addCriterion("Fcheckin_time not in", values, "checkinTime");
            return (Criteria) this;
        }

        public Criteria andCheckinTimeBetween(Date value1, Date value2) {
            addCriterion("Fcheckin_time between", value1, value2, "checkinTime");
            return (Criteria) this;
        }

        public Criteria andCheckinTimeNotBetween(Date value1, Date value2) {
            addCriterion("Fcheckin_time not between", value1, value2, "checkinTime");
            return (Criteria) this;
        }

        public Criteria andSuffixuinIsNull() {
            addCriterion("FsuffixUin is null");
            return (Criteria) this;
        }

        public Criteria andSuffixuinIsNotNull() {
            addCriterion("FsuffixUin is not null");
            return (Criteria) this;
        }

        public Criteria andSuffixuinEqualTo(String value) {
            addCriterion("FsuffixUin =", value, "suffixuin");
            return (Criteria) this;
        }

        public Criteria andSuffixuinNotEqualTo(String value) {
            addCriterion("FsuffixUin <>", value, "suffixuin");
            return (Criteria) this;
        }

        public Criteria andSuffixuinGreaterThan(String value) {
            addCriterion("FsuffixUin >", value, "suffixuin");
            return (Criteria) this;
        }

        public Criteria andSuffixuinGreaterThanOrEqualTo(String value) {
            addCriterion("FsuffixUin >=", value, "suffixuin");
            return (Criteria) this;
        }

        public Criteria andSuffixuinLessThan(String value) {
            addCriterion("FsuffixUin <", value, "suffixuin");
            return (Criteria) this;
        }

        public Criteria andSuffixuinLessThanOrEqualTo(String value) {
            addCriterion("FsuffixUin <=", value, "suffixuin");
            return (Criteria) this;
        }

        public Criteria andSuffixuinLike(String value) {
            addCriterion("FsuffixUin like", value, "suffixuin");
            return (Criteria) this;
        }

        public Criteria andSuffixuinNotLike(String value) {
            addCriterion("FsuffixUin not like", value, "suffixuin");
            return (Criteria) this;
        }

        public Criteria andSuffixuinIn(List<String> values) {
            addCriterion("FsuffixUin in", values, "suffixuin");
            return (Criteria) this;
        }

        public Criteria andSuffixuinNotIn(List<String> values) {
            addCriterion("FsuffixUin not in", values, "suffixuin");
            return (Criteria) this;
        }

        public Criteria andSuffixuinBetween(String value1, String value2) {
            addCriterion("FsuffixUin between", value1, value2, "suffixuin");
            return (Criteria) this;
        }

        public Criteria andSuffixuinNotBetween(String value1, String value2) {
            addCriterion("FsuffixUin not between", value1, value2, "suffixuin");
            return (Criteria) this;
        }

        public Criteria andStandby1IsNull() {
            addCriterion("Fstandby1 is null");
            return (Criteria) this;
        }

        public Criteria andStandby1IsNotNull() {
            addCriterion("Fstandby1 is not null");
            return (Criteria) this;
        }

        public Criteria andStandby1EqualTo(String value) {
            addCriterion("Fstandby1 =", value, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby1NotEqualTo(String value) {
            addCriterion("Fstandby1 <>", value, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby1GreaterThan(String value) {
            addCriterion("Fstandby1 >", value, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby1GreaterThanOrEqualTo(String value) {
            addCriterion("Fstandby1 >=", value, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby1LessThan(String value) {
            addCriterion("Fstandby1 <", value, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby1LessThanOrEqualTo(String value) {
            addCriterion("Fstandby1 <=", value, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby1Like(String value) {
            addCriterion("Fstandby1 like", value, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby1NotLike(String value) {
            addCriterion("Fstandby1 not like", value, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby1In(List<String> values) {
            addCriterion("Fstandby1 in", values, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby1NotIn(List<String> values) {
            addCriterion("Fstandby1 not in", values, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby1Between(String value1, String value2) {
            addCriterion("Fstandby1 between", value1, value2, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby1NotBetween(String value1, String value2) {
            addCriterion("Fstandby1 not between", value1, value2, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby2IsNull() {
            addCriterion("Fstandby2 is null");
            return (Criteria) this;
        }

        public Criteria andStandby2IsNotNull() {
            addCriterion("Fstandby2 is not null");
            return (Criteria) this;
        }

        public Criteria andStandby2EqualTo(String value) {
            addCriterion("Fstandby2 =", value, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby2NotEqualTo(String value) {
            addCriterion("Fstandby2 <>", value, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby2GreaterThan(String value) {
            addCriterion("Fstandby2 >", value, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby2GreaterThanOrEqualTo(String value) {
            addCriterion("Fstandby2 >=", value, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby2LessThan(String value) {
            addCriterion("Fstandby2 <", value, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby2LessThanOrEqualTo(String value) {
            addCriterion("Fstandby2 <=", value, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby2Like(String value) {
            addCriterion("Fstandby2 like", value, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby2NotLike(String value) {
            addCriterion("Fstandby2 not like", value, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby2In(List<String> values) {
            addCriterion("Fstandby2 in", values, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby2NotIn(List<String> values) {
            addCriterion("Fstandby2 not in", values, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby2Between(String value1, String value2) {
            addCriterion("Fstandby2 between", value1, value2, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby2NotBetween(String value1, String value2) {
            addCriterion("Fstandby2 not between", value1, value2, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby3IsNull() {
            addCriterion("Fstandby3 is null");
            return (Criteria) this;
        }

        public Criteria andStandby3IsNotNull() {
            addCriterion("Fstandby3 is not null");
            return (Criteria) this;
        }

        public Criteria andStandby3EqualTo(String value) {
            addCriterion("Fstandby3 =", value, "standby3");
            return (Criteria) this;
        }

        public Criteria andStandby3NotEqualTo(String value) {
            addCriterion("Fstandby3 <>", value, "standby3");
            return (Criteria) this;
        }

        public Criteria andStandby3GreaterThan(String value) {
            addCriterion("Fstandby3 >", value, "standby3");
            return (Criteria) this;
        }

        public Criteria andStandby3GreaterThanOrEqualTo(String value) {
            addCriterion("Fstandby3 >=", value, "standby3");
            return (Criteria) this;
        }

        public Criteria andStandby3LessThan(String value) {
            addCriterion("Fstandby3 <", value, "standby3");
            return (Criteria) this;
        }

        public Criteria andStandby3LessThanOrEqualTo(String value) {
            addCriterion("Fstandby3 <=", value, "standby3");
            return (Criteria) this;
        }

        public Criteria andStandby3Like(String value) {
            addCriterion("Fstandby3 like", value, "standby3");
            return (Criteria) this;
        }

        public Criteria andStandby3NotLike(String value) {
            addCriterion("Fstandby3 not like", value, "standby3");
            return (Criteria) this;
        }

        public Criteria andStandby3In(List<String> values) {
            addCriterion("Fstandby3 in", values, "standby3");
            return (Criteria) this;
        }

        public Criteria andStandby3NotIn(List<String> values) {
            addCriterion("Fstandby3 not in", values, "standby3");
            return (Criteria) this;
        }

        public Criteria andStandby3Between(String value1, String value2) {
            addCriterion("Fstandby3 between", value1, value2, "standby3");
            return (Criteria) this;
        }

        public Criteria andStandby3NotBetween(String value1, String value2) {
            addCriterion("Fstandby3 not between", value1, value2, "standby3");
            return (Criteria) this;
        }

        public Criteria andStandby4IsNull() {
            addCriterion("Fstandby4 is null");
            return (Criteria) this;
        }

        public Criteria andStandby4IsNotNull() {
            addCriterion("Fstandby4 is not null");
            return (Criteria) this;
        }

        public Criteria andStandby4EqualTo(String value) {
            addCriterion("Fstandby4 =", value, "standby4");
            return (Criteria) this;
        }

        public Criteria andStandby4NotEqualTo(String value) {
            addCriterion("Fstandby4 <>", value, "standby4");
            return (Criteria) this;
        }

        public Criteria andStandby4GreaterThan(String value) {
            addCriterion("Fstandby4 >", value, "standby4");
            return (Criteria) this;
        }

        public Criteria andStandby4GreaterThanOrEqualTo(String value) {
            addCriterion("Fstandby4 >=", value, "standby4");
            return (Criteria) this;
        }

        public Criteria andStandby4LessThan(String value) {
            addCriterion("Fstandby4 <", value, "standby4");
            return (Criteria) this;
        }

        public Criteria andStandby4LessThanOrEqualTo(String value) {
            addCriterion("Fstandby4 <=", value, "standby4");
            return (Criteria) this;
        }

        public Criteria andStandby4Like(String value) {
            addCriterion("Fstandby4 like", value, "standby4");
            return (Criteria) this;
        }

        public Criteria andStandby4NotLike(String value) {
            addCriterion("Fstandby4 not like", value, "standby4");
            return (Criteria) this;
        }

        public Criteria andStandby4In(List<String> values) {
            addCriterion("Fstandby4 in", values, "standby4");
            return (Criteria) this;
        }

        public Criteria andStandby4NotIn(List<String> values) {
            addCriterion("Fstandby4 not in", values, "standby4");
            return (Criteria) this;
        }

        public Criteria andStandby4Between(String value1, String value2) {
            addCriterion("Fstandby4 between", value1, value2, "standby4");
            return (Criteria) this;
        }

        public Criteria andStandby4NotBetween(String value1, String value2) {
            addCriterion("Fstandby4 not between", value1, value2, "standby4");
            return (Criteria) this;
        }

        public Criteria andStandby5IsNull() {
            addCriterion("Fstandby5 is null");
            return (Criteria) this;
        }

        public Criteria andStandby5IsNotNull() {
            addCriterion("Fstandby5 is not null");
            return (Criteria) this;
        }

        public Criteria andStandby5EqualTo(String value) {
            addCriterion("Fstandby5 =", value, "standby5");
            return (Criteria) this;
        }

        public Criteria andStandby5NotEqualTo(String value) {
            addCriterion("Fstandby5 <>", value, "standby5");
            return (Criteria) this;
        }

        public Criteria andStandby5GreaterThan(String value) {
            addCriterion("Fstandby5 >", value, "standby5");
            return (Criteria) this;
        }

        public Criteria andStandby5GreaterThanOrEqualTo(String value) {
            addCriterion("Fstandby5 >=", value, "standby5");
            return (Criteria) this;
        }

        public Criteria andStandby5LessThan(String value) {
            addCriterion("Fstandby5 <", value, "standby5");
            return (Criteria) this;
        }

        public Criteria andStandby5LessThanOrEqualTo(String value) {
            addCriterion("Fstandby5 <=", value, "standby5");
            return (Criteria) this;
        }

        public Criteria andStandby5Like(String value) {
            addCriterion("Fstandby5 like", value, "standby5");
            return (Criteria) this;
        }

        public Criteria andStandby5NotLike(String value) {
            addCriterion("Fstandby5 not like", value, "standby5");
            return (Criteria) this;
        }

        public Criteria andStandby5In(List<String> values) {
            addCriterion("Fstandby5 in", values, "standby5");
            return (Criteria) this;
        }

        public Criteria andStandby5NotIn(List<String> values) {
            addCriterion("Fstandby5 not in", values, "standby5");
            return (Criteria) this;
        }

        public Criteria andStandby5Between(String value1, String value2) {
            addCriterion("Fstandby5 between", value1, value2, "standby5");
            return (Criteria) this;
        }

        public Criteria andStandby5NotBetween(String value1, String value2) {
            addCriterion("Fstandby5 not between", value1, value2, "standby5");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNull() {
            addCriterion("Faudit_state is null");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNotNull() {
            addCriterion("Faudit_state is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStateEqualTo(Integer value) {
            addCriterion("Faudit_state =", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotEqualTo(Integer value) {
            addCriterion("Faudit_state <>", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThan(Integer value) {
            addCriterion("Faudit_state >", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("Faudit_state >=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThan(Integer value) {
            addCriterion("Faudit_state <", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThanOrEqualTo(Integer value) {
            addCriterion("Faudit_state <=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateIn(List<Integer> values) {
            addCriterion("Faudit_state in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotIn(List<Integer> values) {
            addCriterion("Faudit_state not in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateBetween(Integer value1, Integer value2) {
            addCriterion("Faudit_state between", value1, value2, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotBetween(Integer value1, Integer value2) {
            addCriterion("Faudit_state not between", value1, value2, "auditState");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeIsNull() {
            addCriterion("Fsubmit_time is null");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeIsNotNull() {
            addCriterion("Fsubmit_time is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeEqualTo(Date value) {
            addCriterion("Fsubmit_time =", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotEqualTo(Date value) {
            addCriterion("Fsubmit_time <>", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeGreaterThan(Date value) {
            addCriterion("Fsubmit_time >", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Fsubmit_time >=", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeLessThan(Date value) {
            addCriterion("Fsubmit_time <", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeLessThanOrEqualTo(Date value) {
            addCriterion("Fsubmit_time <=", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeIn(List<Date> values) {
            addCriterion("Fsubmit_time in", values, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotIn(List<Date> values) {
            addCriterion("Fsubmit_time not in", values, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeBetween(Date value1, Date value2) {
            addCriterion("Fsubmit_time between", value1, value2, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotBetween(Date value1, Date value2) {
            addCriterion("Fsubmit_time not between", value1, value2, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitStateIsNull() {
            addCriterion("Fsubmit_state is null");
            return (Criteria) this;
        }

        public Criteria andSubmitStateIsNotNull() {
            addCriterion("Fsubmit_state is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitStateEqualTo(Integer value) {
            addCriterion("Fsubmit_state =", value, "submitState");
            return (Criteria) this;
        }

        public Criteria andSubmitStateNotEqualTo(Integer value) {
            addCriterion("Fsubmit_state <>", value, "submitState");
            return (Criteria) this;
        }

        public Criteria andSubmitStateGreaterThan(Integer value) {
            addCriterion("Fsubmit_state >", value, "submitState");
            return (Criteria) this;
        }

        public Criteria andSubmitStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("Fsubmit_state >=", value, "submitState");
            return (Criteria) this;
        }

        public Criteria andSubmitStateLessThan(Integer value) {
            addCriterion("Fsubmit_state <", value, "submitState");
            return (Criteria) this;
        }

        public Criteria andSubmitStateLessThanOrEqualTo(Integer value) {
            addCriterion("Fsubmit_state <=", value, "submitState");
            return (Criteria) this;
        }

        public Criteria andSubmitStateIn(List<Integer> values) {
            addCriterion("Fsubmit_state in", values, "submitState");
            return (Criteria) this;
        }

        public Criteria andSubmitStateNotIn(List<Integer> values) {
            addCriterion("Fsubmit_state not in", values, "submitState");
            return (Criteria) this;
        }

        public Criteria andSubmitStateBetween(Integer value1, Integer value2) {
            addCriterion("Fsubmit_state between", value1, value2, "submitState");
            return (Criteria) this;
        }

        public Criteria andSubmitStateNotBetween(Integer value1, Integer value2) {
            addCriterion("Fsubmit_state not between", value1, value2, "submitState");
            return (Criteria) this;
        }

        public Criteria andManageStateIsNull() {
            addCriterion("Fmanage_state is null");
            return (Criteria) this;
        }

        public Criteria andManageStateIsNotNull() {
            addCriterion("Fmanage_state is not null");
            return (Criteria) this;
        }

        public Criteria andManageStateEqualTo(Short value) {
            addCriterion("Fmanage_state =", value, "manageState");
            return (Criteria) this;
        }

        public Criteria andManageStateNotEqualTo(Short value) {
            addCriterion("Fmanage_state <>", value, "manageState");
            return (Criteria) this;
        }

        public Criteria andManageStateGreaterThan(Short value) {
            addCriterion("Fmanage_state >", value, "manageState");
            return (Criteria) this;
        }

        public Criteria andManageStateGreaterThanOrEqualTo(Short value) {
            addCriterion("Fmanage_state >=", value, "manageState");
            return (Criteria) this;
        }

        public Criteria andManageStateLessThan(Short value) {
            addCriterion("Fmanage_state <", value, "manageState");
            return (Criteria) this;
        }

        public Criteria andManageStateLessThanOrEqualTo(Short value) {
            addCriterion("Fmanage_state <=", value, "manageState");
            return (Criteria) this;
        }

        public Criteria andManageStateIn(List<Short> values) {
            addCriterion("Fmanage_state in", values, "manageState");
            return (Criteria) this;
        }

        public Criteria andManageStateNotIn(List<Short> values) {
            addCriterion("Fmanage_state not in", values, "manageState");
            return (Criteria) this;
        }

        public Criteria andManageStateBetween(Short value1, Short value2) {
            addCriterion("Fmanage_state between", value1, value2, "manageState");
            return (Criteria) this;
        }

        public Criteria andManageStateNotBetween(Short value1, Short value2) {
            addCriterion("Fmanage_state not between", value1, value2, "manageState");
            return (Criteria) this;
        }

        public Criteria andFirstComfirmTimeIsNull() {
            addCriterion("Ffirst_comfirm_time is null");
            return (Criteria) this;
        }

        public Criteria andFirstComfirmTimeIsNotNull() {
            addCriterion("Ffirst_comfirm_time is not null");
            return (Criteria) this;
        }

        public Criteria andFirstComfirmTimeEqualTo(Date value) {
            addCriterion("Ffirst_comfirm_time =", value, "firstComfirmTime");
            return (Criteria) this;
        }

        public Criteria andFirstComfirmTimeNotEqualTo(Date value) {
            addCriterion("Ffirst_comfirm_time <>", value, "firstComfirmTime");
            return (Criteria) this;
        }

        public Criteria andFirstComfirmTimeGreaterThan(Date value) {
            addCriterion("Ffirst_comfirm_time >", value, "firstComfirmTime");
            return (Criteria) this;
        }

        public Criteria andFirstComfirmTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Ffirst_comfirm_time >=", value, "firstComfirmTime");
            return (Criteria) this;
        }

        public Criteria andFirstComfirmTimeLessThan(Date value) {
            addCriterion("Ffirst_comfirm_time <", value, "firstComfirmTime");
            return (Criteria) this;
        }

        public Criteria andFirstComfirmTimeLessThanOrEqualTo(Date value) {
            addCriterion("Ffirst_comfirm_time <=", value, "firstComfirmTime");
            return (Criteria) this;
        }

        public Criteria andFirstComfirmTimeIn(List<Date> values) {
            addCriterion("Ffirst_comfirm_time in", values, "firstComfirmTime");
            return (Criteria) this;
        }

        public Criteria andFirstComfirmTimeNotIn(List<Date> values) {
            addCriterion("Ffirst_comfirm_time not in", values, "firstComfirmTime");
            return (Criteria) this;
        }

        public Criteria andFirstComfirmTimeBetween(Date value1, Date value2) {
            addCriterion("Ffirst_comfirm_time between", value1, value2, "firstComfirmTime");
            return (Criteria) this;
        }

        public Criteria andFirstComfirmTimeNotBetween(Date value1, Date value2) {
            addCriterion("Ffirst_comfirm_time not between", value1, value2, "firstComfirmTime");
            return (Criteria) this;
        }

        public Criteria andLastComfirmTimeIsNull() {
            addCriterion("Flast_comfirm_time is null");
            return (Criteria) this;
        }

        public Criteria andLastComfirmTimeIsNotNull() {
            addCriterion("Flast_comfirm_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastComfirmTimeEqualTo(Date value) {
            addCriterion("Flast_comfirm_time =", value, "lastComfirmTime");
            return (Criteria) this;
        }

        public Criteria andLastComfirmTimeNotEqualTo(Date value) {
            addCriterion("Flast_comfirm_time <>", value, "lastComfirmTime");
            return (Criteria) this;
        }

        public Criteria andLastComfirmTimeGreaterThan(Date value) {
            addCriterion("Flast_comfirm_time >", value, "lastComfirmTime");
            return (Criteria) this;
        }

        public Criteria andLastComfirmTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Flast_comfirm_time >=", value, "lastComfirmTime");
            return (Criteria) this;
        }

        public Criteria andLastComfirmTimeLessThan(Date value) {
            addCriterion("Flast_comfirm_time <", value, "lastComfirmTime");
            return (Criteria) this;
        }

        public Criteria andLastComfirmTimeLessThanOrEqualTo(Date value) {
            addCriterion("Flast_comfirm_time <=", value, "lastComfirmTime");
            return (Criteria) this;
        }

        public Criteria andLastComfirmTimeIn(List<Date> values) {
            addCriterion("Flast_comfirm_time in", values, "lastComfirmTime");
            return (Criteria) this;
        }

        public Criteria andLastComfirmTimeNotIn(List<Date> values) {
            addCriterion("Flast_comfirm_time not in", values, "lastComfirmTime");
            return (Criteria) this;
        }

        public Criteria andLastComfirmTimeBetween(Date value1, Date value2) {
            addCriterion("Flast_comfirm_time between", value1, value2, "lastComfirmTime");
            return (Criteria) this;
        }

        public Criteria andLastComfirmTimeNotBetween(Date value1, Date value2) {
            addCriterion("Flast_comfirm_time not between", value1, value2, "lastComfirmTime");
            return (Criteria) this;
        }

        public Criteria andCompanyBranchIsNull() {
            addCriterion("Fcompany_branch is null");
            return (Criteria) this;
        }

        public Criteria andCompanyBranchIsNotNull() {
            addCriterion("Fcompany_branch is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyBranchEqualTo(String value) {
            addCriterion("Fcompany_branch =", value, "companyBranch");
            return (Criteria) this;
        }

        public Criteria andCompanyBranchNotEqualTo(String value) {
            addCriterion("Fcompany_branch <>", value, "companyBranch");
            return (Criteria) this;
        }

        public Criteria andCompanyBranchGreaterThan(String value) {
            addCriterion("Fcompany_branch >", value, "companyBranch");
            return (Criteria) this;
        }

        public Criteria andCompanyBranchGreaterThanOrEqualTo(String value) {
            addCriterion("Fcompany_branch >=", value, "companyBranch");
            return (Criteria) this;
        }

        public Criteria andCompanyBranchLessThan(String value) {
            addCriterion("Fcompany_branch <", value, "companyBranch");
            return (Criteria) this;
        }

        public Criteria andCompanyBranchLessThanOrEqualTo(String value) {
            addCriterion("Fcompany_branch <=", value, "companyBranch");
            return (Criteria) this;
        }

        public Criteria andCompanyBranchLike(String value) {
            addCriterion("Fcompany_branch like", value, "companyBranch");
            return (Criteria) this;
        }

        public Criteria andCompanyBranchNotLike(String value) {
            addCriterion("Fcompany_branch not like", value, "companyBranch");
            return (Criteria) this;
        }

        public Criteria andCompanyBranchIn(List<String> values) {
            addCriterion("Fcompany_branch in", values, "companyBranch");
            return (Criteria) this;
        }

        public Criteria andCompanyBranchNotIn(List<String> values) {
            addCriterion("Fcompany_branch not in", values, "companyBranch");
            return (Criteria) this;
        }

        public Criteria andCompanyBranchBetween(String value1, String value2) {
            addCriterion("Fcompany_branch between", value1, value2, "companyBranch");
            return (Criteria) this;
        }

        public Criteria andCompanyBranchNotBetween(String value1, String value2) {
            addCriterion("Fcompany_branch not between", value1, value2, "companyBranch");
            return (Criteria) this;
        }

        public Criteria andConfirmedCountIsNull() {
            addCriterion("Fconfirmed_count is null");
            return (Criteria) this;
        }

        public Criteria andConfirmedCountIsNotNull() {
            addCriterion("Fconfirmed_count is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmedCountEqualTo(Integer value) {
            addCriterion("Fconfirmed_count =", value, "confirmedCount");
            return (Criteria) this;
        }

        public Criteria andConfirmedCountNotEqualTo(Integer value) {
            addCriterion("Fconfirmed_count <>", value, "confirmedCount");
            return (Criteria) this;
        }

        public Criteria andConfirmedCountGreaterThan(Integer value) {
            addCriterion("Fconfirmed_count >", value, "confirmedCount");
            return (Criteria) this;
        }

        public Criteria andConfirmedCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("Fconfirmed_count >=", value, "confirmedCount");
            return (Criteria) this;
        }

        public Criteria andConfirmedCountLessThan(Integer value) {
            addCriterion("Fconfirmed_count <", value, "confirmedCount");
            return (Criteria) this;
        }

        public Criteria andConfirmedCountLessThanOrEqualTo(Integer value) {
            addCriterion("Fconfirmed_count <=", value, "confirmedCount");
            return (Criteria) this;
        }

        public Criteria andConfirmedCountIn(List<Integer> values) {
            addCriterion("Fconfirmed_count in", values, "confirmedCount");
            return (Criteria) this;
        }

        public Criteria andConfirmedCountNotIn(List<Integer> values) {
            addCriterion("Fconfirmed_count not in", values, "confirmedCount");
            return (Criteria) this;
        }

        public Criteria andConfirmedCountBetween(Integer value1, Integer value2) {
            addCriterion("Fconfirmed_count between", value1, value2, "confirmedCount");
            return (Criteria) this;
        }

        public Criteria andConfirmedCountNotBetween(Integer value1, Integer value2) {
            addCriterion("Fconfirmed_count not between", value1, value2, "confirmedCount");
            return (Criteria) this;
        }

        public Criteria andOriginIsNull() {
            addCriterion("Forigin is null");
            return (Criteria) this;
        }

        public Criteria andOriginIsNotNull() {
            addCriterion("Forigin is not null");
            return (Criteria) this;
        }

        public Criteria andOriginEqualTo(String value) {
            addCriterion("Forigin =", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotEqualTo(String value) {
            addCriterion("Forigin <>", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginGreaterThan(String value) {
            addCriterion("Forigin >", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginGreaterThanOrEqualTo(String value) {
            addCriterion("Forigin >=", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLessThan(String value) {
            addCriterion("Forigin <", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLessThanOrEqualTo(String value) {
            addCriterion("Forigin <=", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLike(String value) {
            addCriterion("Forigin like", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotLike(String value) {
            addCriterion("Forigin not like", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginIn(List<String> values) {
            addCriterion("Forigin in", values, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotIn(List<String> values) {
            addCriterion("Forigin not in", values, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginBetween(String value1, String value2) {
            addCriterion("Forigin between", value1, value2, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotBetween(String value1, String value2) {
            addCriterion("Forigin not between", value1, value2, "origin");
            return (Criteria) this;
        }

        public Criteria andIsRedIsNull() {
            addCriterion("Fis_red is null");
            return (Criteria) this;
        }

        public Criteria andIsRedIsNotNull() {
            addCriterion("Fis_red is not null");
            return (Criteria) this;
        }

        public Criteria andIsRedEqualTo(Integer value) {
            addCriterion("Fis_red =", value, "isRed");
            return (Criteria) this;
        }

        public Criteria andIsRedNotEqualTo(Integer value) {
            addCriterion("Fis_red <>", value, "isRed");
            return (Criteria) this;
        }

        public Criteria andIsRedGreaterThan(Integer value) {
            addCriterion("Fis_red >", value, "isRed");
            return (Criteria) this;
        }

        public Criteria andIsRedGreaterThanOrEqualTo(Integer value) {
            addCriterion("Fis_red >=", value, "isRed");
            return (Criteria) this;
        }

        public Criteria andIsRedLessThan(Integer value) {
            addCriterion("Fis_red <", value, "isRed");
            return (Criteria) this;
        }

        public Criteria andIsRedLessThanOrEqualTo(Integer value) {
            addCriterion("Fis_red <=", value, "isRed");
            return (Criteria) this;
        }

        public Criteria andIsRedIn(List<Integer> values) {
            addCriterion("Fis_red in", values, "isRed");
            return (Criteria) this;
        }

        public Criteria andIsRedNotIn(List<Integer> values) {
            addCriterion("Fis_red not in", values, "isRed");
            return (Criteria) this;
        }

        public Criteria andIsRedBetween(Integer value1, Integer value2) {
            addCriterion("Fis_red between", value1, value2, "isRed");
            return (Criteria) this;
        }

        public Criteria andIsRedNotBetween(Integer value1, Integer value2) {
            addCriterion("Fis_red not between", value1, value2, "isRed");
            return (Criteria) this;
        }

        public Criteria andIsMobileRegIsNull() {
            addCriterion("Fis_mobile_reg is null");
            return (Criteria) this;
        }

        public Criteria andIsMobileRegIsNotNull() {
            addCriterion("Fis_mobile_reg is not null");
            return (Criteria) this;
        }

        public Criteria andIsMobileRegEqualTo(Short value) {
            addCriterion("Fis_mobile_reg =", value, "isMobileReg");
            return (Criteria) this;
        }

        public Criteria andIsMobileRegNotEqualTo(Short value) {
            addCriterion("Fis_mobile_reg <>", value, "isMobileReg");
            return (Criteria) this;
        }

        public Criteria andIsMobileRegGreaterThan(Short value) {
            addCriterion("Fis_mobile_reg >", value, "isMobileReg");
            return (Criteria) this;
        }

        public Criteria andIsMobileRegGreaterThanOrEqualTo(Short value) {
            addCriterion("Fis_mobile_reg >=", value, "isMobileReg");
            return (Criteria) this;
        }

        public Criteria andIsMobileRegLessThan(Short value) {
            addCriterion("Fis_mobile_reg <", value, "isMobileReg");
            return (Criteria) this;
        }

        public Criteria andIsMobileRegLessThanOrEqualTo(Short value) {
            addCriterion("Fis_mobile_reg <=", value, "isMobileReg");
            return (Criteria) this;
        }

        public Criteria andIsMobileRegIn(List<Short> values) {
            addCriterion("Fis_mobile_reg in", values, "isMobileReg");
            return (Criteria) this;
        }

        public Criteria andIsMobileRegNotIn(List<Short> values) {
            addCriterion("Fis_mobile_reg not in", values, "isMobileReg");
            return (Criteria) this;
        }

        public Criteria andIsMobileRegBetween(Short value1, Short value2) {
            addCriterion("Fis_mobile_reg between", value1, value2, "isMobileReg");
            return (Criteria) this;
        }

        public Criteria andIsMobileRegNotBetween(Short value1, Short value2) {
            addCriterion("Fis_mobile_reg not between", value1, value2, "isMobileReg");
            return (Criteria) this;
        }

        public Criteria andFaceNoticeIsNull() {
            addCriterion("Fface_notice is null");
            return (Criteria) this;
        }

        public Criteria andFaceNoticeIsNotNull() {
            addCriterion("Fface_notice is not null");
            return (Criteria) this;
        }

        public Criteria andFaceNoticeEqualTo(Short value) {
            addCriterion("Fface_notice =", value, "faceNotice");
            return (Criteria) this;
        }

        public Criteria andFaceNoticeNotEqualTo(Short value) {
            addCriterion("Fface_notice <>", value, "faceNotice");
            return (Criteria) this;
        }

        public Criteria andFaceNoticeGreaterThan(Short value) {
            addCriterion("Fface_notice >", value, "faceNotice");
            return (Criteria) this;
        }

        public Criteria andFaceNoticeGreaterThanOrEqualTo(Short value) {
            addCriterion("Fface_notice >=", value, "faceNotice");
            return (Criteria) this;
        }

        public Criteria andFaceNoticeLessThan(Short value) {
            addCriterion("Fface_notice <", value, "faceNotice");
            return (Criteria) this;
        }

        public Criteria andFaceNoticeLessThanOrEqualTo(Short value) {
            addCriterion("Fface_notice <=", value, "faceNotice");
            return (Criteria) this;
        }

        public Criteria andFaceNoticeIn(List<Short> values) {
            addCriterion("Fface_notice in", values, "faceNotice");
            return (Criteria) this;
        }

        public Criteria andFaceNoticeNotIn(List<Short> values) {
            addCriterion("Fface_notice not in", values, "faceNotice");
            return (Criteria) this;
        }

        public Criteria andFaceNoticeBetween(Short value1, Short value2) {
            addCriterion("Fface_notice between", value1, value2, "faceNotice");
            return (Criteria) this;
        }

        public Criteria andFaceNoticeNotBetween(Short value1, Short value2) {
            addCriterion("Fface_notice not between", value1, value2, "faceNotice");
            return (Criteria) this;
        }

        public Criteria andCaComfirmTagIsNull() {
            addCriterion("Fca_comfirm_tag is null");
            return (Criteria) this;
        }

        public Criteria andCaComfirmTagIsNotNull() {
            addCriterion("Fca_comfirm_tag is not null");
            return (Criteria) this;
        }

        public Criteria andCaComfirmTagEqualTo(Short value) {
            addCriterion("Fca_comfirm_tag =", value, "caComfirmTag");
            return (Criteria) this;
        }

        public Criteria andCaComfirmTagNotEqualTo(Short value) {
            addCriterion("Fca_comfirm_tag <>", value, "caComfirmTag");
            return (Criteria) this;
        }

        public Criteria andCaComfirmTagGreaterThan(Short value) {
            addCriterion("Fca_comfirm_tag >", value, "caComfirmTag");
            return (Criteria) this;
        }

        public Criteria andCaComfirmTagGreaterThanOrEqualTo(Short value) {
            addCriterion("Fca_comfirm_tag >=", value, "caComfirmTag");
            return (Criteria) this;
        }

        public Criteria andCaComfirmTagLessThan(Short value) {
            addCriterion("Fca_comfirm_tag <", value, "caComfirmTag");
            return (Criteria) this;
        }

        public Criteria andCaComfirmTagLessThanOrEqualTo(Short value) {
            addCriterion("Fca_comfirm_tag <=", value, "caComfirmTag");
            return (Criteria) this;
        }

        public Criteria andCaComfirmTagIn(List<Short> values) {
            addCriterion("Fca_comfirm_tag in", values, "caComfirmTag");
            return (Criteria) this;
        }

        public Criteria andCaComfirmTagNotIn(List<Short> values) {
            addCriterion("Fca_comfirm_tag not in", values, "caComfirmTag");
            return (Criteria) this;
        }

        public Criteria andCaComfirmTagBetween(Short value1, Short value2) {
            addCriterion("Fca_comfirm_tag between", value1, value2, "caComfirmTag");
            return (Criteria) this;
        }

        public Criteria andCaComfirmTagNotBetween(Short value1, Short value2) {
            addCriterion("Fca_comfirm_tag not between", value1, value2, "caComfirmTag");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNull() {
            addCriterion("Fdepartment_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("Fdepartment_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(String value) {
            addCriterion("Fdepartment_id =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(String value) {
            addCriterion("Fdepartment_id <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(String value) {
            addCriterion("Fdepartment_id >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(String value) {
            addCriterion("Fdepartment_id >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(String value) {
            addCriterion("Fdepartment_id <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(String value) {
            addCriterion("Fdepartment_id <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLike(String value) {
            addCriterion("Fdepartment_id like", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotLike(String value) {
            addCriterion("Fdepartment_id not like", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<String> values) {
            addCriterion("Fdepartment_id in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<String> values) {
            addCriterion("Fdepartment_id not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(String value1, String value2) {
            addCriterion("Fdepartment_id between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(String value1, String value2) {
            addCriterion("Fdepartment_id not between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andIsHideIsNull() {
            addCriterion("Fis_hide is null");
            return (Criteria) this;
        }

        public Criteria andIsHideIsNotNull() {
            addCriterion("Fis_hide is not null");
            return (Criteria) this;
        }

        public Criteria andIsHideEqualTo(Short value) {
            addCriterion("Fis_hide =", value, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideNotEqualTo(Short value) {
            addCriterion("Fis_hide <>", value, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideGreaterThan(Short value) {
            addCriterion("Fis_hide >", value, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideGreaterThanOrEqualTo(Short value) {
            addCriterion("Fis_hide >=", value, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideLessThan(Short value) {
            addCriterion("Fis_hide <", value, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideLessThanOrEqualTo(Short value) {
            addCriterion("Fis_hide <=", value, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideIn(List<Short> values) {
            addCriterion("Fis_hide in", values, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideNotIn(List<Short> values) {
            addCriterion("Fis_hide not in", values, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideBetween(Short value1, Short value2) {
            addCriterion("Fis_hide between", value1, value2, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideNotBetween(Short value1, Short value2) {
            addCriterion("Fis_hide not between", value1, value2, "isHide");
            return (Criteria) this;
        }

        public Criteria andExternalNameIsNull() {
            addCriterion("Fexternal_name is null");
            return (Criteria) this;
        }

        public Criteria andExternalNameIsNotNull() {
            addCriterion("Fexternal_name is not null");
            return (Criteria) this;
        }

        public Criteria andExternalNameEqualTo(String value) {
            addCriterion("Fexternal_name =", value, "externalName");
            return (Criteria) this;
        }

        public Criteria andExternalNameNotEqualTo(String value) {
            addCriterion("Fexternal_name <>", value, "externalName");
            return (Criteria) this;
        }

        public Criteria andExternalNameGreaterThan(String value) {
            addCriterion("Fexternal_name >", value, "externalName");
            return (Criteria) this;
        }

        public Criteria andExternalNameGreaterThanOrEqualTo(String value) {
            addCriterion("Fexternal_name >=", value, "externalName");
            return (Criteria) this;
        }

        public Criteria andExternalNameLessThan(String value) {
            addCriterion("Fexternal_name <", value, "externalName");
            return (Criteria) this;
        }

        public Criteria andExternalNameLessThanOrEqualTo(String value) {
            addCriterion("Fexternal_name <=", value, "externalName");
            return (Criteria) this;
        }

        public Criteria andExternalNameLike(String value) {
            addCriterion("Fexternal_name like", value, "externalName");
            return (Criteria) this;
        }

        public Criteria andExternalNameNotLike(String value) {
            addCriterion("Fexternal_name not like", value, "externalName");
            return (Criteria) this;
        }

        public Criteria andExternalNameIn(List<String> values) {
            addCriterion("Fexternal_name in", values, "externalName");
            return (Criteria) this;
        }

        public Criteria andExternalNameNotIn(List<String> values) {
            addCriterion("Fexternal_name not in", values, "externalName");
            return (Criteria) this;
        }

        public Criteria andExternalNameBetween(String value1, String value2) {
            addCriterion("Fexternal_name between", value1, value2, "externalName");
            return (Criteria) this;
        }

        public Criteria andExternalNameNotBetween(String value1, String value2) {
            addCriterion("Fexternal_name not between", value1, value2, "externalName");
            return (Criteria) this;
        }

        public Criteria andIdentityNoIsNull() {
            addCriterion("Fidentity_no is null");
            return (Criteria) this;
        }

        public Criteria andIdentityNoIsNotNull() {
            addCriterion("Fidentity_no is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityNoEqualTo(String value) {
            addCriterion("Fidentity_no =", value, "identityNo");
            return (Criteria) this;
        }

        public Criteria andIdentityNoNotEqualTo(String value) {
            addCriterion("Fidentity_no <>", value, "identityNo");
            return (Criteria) this;
        }

        public Criteria andIdentityNoGreaterThan(String value) {
            addCriterion("Fidentity_no >", value, "identityNo");
            return (Criteria) this;
        }

        public Criteria andIdentityNoGreaterThanOrEqualTo(String value) {
            addCriterion("Fidentity_no >=", value, "identityNo");
            return (Criteria) this;
        }

        public Criteria andIdentityNoLessThan(String value) {
            addCriterion("Fidentity_no <", value, "identityNo");
            return (Criteria) this;
        }

        public Criteria andIdentityNoLessThanOrEqualTo(String value) {
            addCriterion("Fidentity_no <=", value, "identityNo");
            return (Criteria) this;
        }

        public Criteria andIdentityNoLike(String value) {
            addCriterion("Fidentity_no like", value, "identityNo");
            return (Criteria) this;
        }

        public Criteria andIdentityNoNotLike(String value) {
            addCriterion("Fidentity_no not like", value, "identityNo");
            return (Criteria) this;
        }

        public Criteria andIdentityNoIn(List<String> values) {
            addCriterion("Fidentity_no in", values, "identityNo");
            return (Criteria) this;
        }

        public Criteria andIdentityNoNotIn(List<String> values) {
            addCriterion("Fidentity_no not in", values, "identityNo");
            return (Criteria) this;
        }

        public Criteria andIdentityNoBetween(String value1, String value2) {
            addCriterion("Fidentity_no between", value1, value2, "identityNo");
            return (Criteria) this;
        }

        public Criteria andIdentityNoNotBetween(String value1, String value2) {
            addCriterion("Fidentity_no not between", value1, value2, "identityNo");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
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