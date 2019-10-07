package com.dingdang.employee.pojo;

import java.util.ArrayList;
import java.util.List;

public class HrBaseinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HrBaseinfoExample() {
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

        public Criteria andBaIdIsNull() {
            addCriterion("ba_id is null");
            return (Criteria) this;
        }

        public Criteria andBaIdIsNotNull() {
            addCriterion("ba_id is not null");
            return (Criteria) this;
        }

        public Criteria andBaIdEqualTo(Integer value) {
            addCriterion("ba_id =", value, "baId");
            return (Criteria) this;
        }

        public Criteria andBaIdNotEqualTo(Integer value) {
            addCriterion("ba_id <>", value, "baId");
            return (Criteria) this;
        }

        public Criteria andBaIdGreaterThan(Integer value) {
            addCriterion("ba_id >", value, "baId");
            return (Criteria) this;
        }

        public Criteria andBaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ba_id >=", value, "baId");
            return (Criteria) this;
        }

        public Criteria andBaIdLessThan(Integer value) {
            addCriterion("ba_id <", value, "baId");
            return (Criteria) this;
        }

        public Criteria andBaIdLessThanOrEqualTo(Integer value) {
            addCriterion("ba_id <=", value, "baId");
            return (Criteria) this;
        }

        public Criteria andBaIdIn(List<Integer> values) {
            addCriterion("ba_id in", values, "baId");
            return (Criteria) this;
        }

        public Criteria andBaIdNotIn(List<Integer> values) {
            addCriterion("ba_id not in", values, "baId");
            return (Criteria) this;
        }

        public Criteria andBaIdBetween(Integer value1, Integer value2) {
            addCriterion("ba_id between", value1, value2, "baId");
            return (Criteria) this;
        }

        public Criteria andBaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ba_id not between", value1, value2, "baId");
            return (Criteria) this;
        }

        public Criteria andBaNameIsNull() {
            addCriterion("ba_name is null");
            return (Criteria) this;
        }

        public Criteria andBaNameIsNotNull() {
            addCriterion("ba_name is not null");
            return (Criteria) this;
        }

        public Criteria andBaNameEqualTo(String value) {
            addCriterion("ba_name =", value, "baName");
            return (Criteria) this;
        }

        public Criteria andBaNameNotEqualTo(String value) {
            addCriterion("ba_name <>", value, "baName");
            return (Criteria) this;
        }

        public Criteria andBaNameGreaterThan(String value) {
            addCriterion("ba_name >", value, "baName");
            return (Criteria) this;
        }

        public Criteria andBaNameGreaterThanOrEqualTo(String value) {
            addCriterion("ba_name >=", value, "baName");
            return (Criteria) this;
        }

        public Criteria andBaNameLessThan(String value) {
            addCriterion("ba_name <", value, "baName");
            return (Criteria) this;
        }

        public Criteria andBaNameLessThanOrEqualTo(String value) {
            addCriterion("ba_name <=", value, "baName");
            return (Criteria) this;
        }

        public Criteria andBaNameLike(String value) {
            addCriterion("ba_name like", value, "baName");
            return (Criteria) this;
        }

        public Criteria andBaNameNotLike(String value) {
            addCriterion("ba_name not like", value, "baName");
            return (Criteria) this;
        }

        public Criteria andBaNameIn(List<String> values) {
            addCriterion("ba_name in", values, "baName");
            return (Criteria) this;
        }

        public Criteria andBaNameNotIn(List<String> values) {
            addCriterion("ba_name not in", values, "baName");
            return (Criteria) this;
        }

        public Criteria andBaNameBetween(String value1, String value2) {
            addCriterion("ba_name between", value1, value2, "baName");
            return (Criteria) this;
        }

        public Criteria andBaNameNotBetween(String value1, String value2) {
            addCriterion("ba_name not between", value1, value2, "baName");
            return (Criteria) this;
        }

        public Criteria andBaSexIsNull() {
            addCriterion("ba_sex is null");
            return (Criteria) this;
        }

        public Criteria andBaSexIsNotNull() {
            addCriterion("ba_sex is not null");
            return (Criteria) this;
        }

        public Criteria andBaSexEqualTo(String value) {
            addCriterion("ba_sex =", value, "baSex");
            return (Criteria) this;
        }

        public Criteria andBaSexNotEqualTo(String value) {
            addCriterion("ba_sex <>", value, "baSex");
            return (Criteria) this;
        }

        public Criteria andBaSexGreaterThan(String value) {
            addCriterion("ba_sex >", value, "baSex");
            return (Criteria) this;
        }

        public Criteria andBaSexGreaterThanOrEqualTo(String value) {
            addCriterion("ba_sex >=", value, "baSex");
            return (Criteria) this;
        }

        public Criteria andBaSexLessThan(String value) {
            addCriterion("ba_sex <", value, "baSex");
            return (Criteria) this;
        }

        public Criteria andBaSexLessThanOrEqualTo(String value) {
            addCriterion("ba_sex <=", value, "baSex");
            return (Criteria) this;
        }

        public Criteria andBaSexLike(String value) {
            addCriterion("ba_sex like", value, "baSex");
            return (Criteria) this;
        }

        public Criteria andBaSexNotLike(String value) {
            addCriterion("ba_sex not like", value, "baSex");
            return (Criteria) this;
        }

        public Criteria andBaSexIn(List<String> values) {
            addCriterion("ba_sex in", values, "baSex");
            return (Criteria) this;
        }

        public Criteria andBaSexNotIn(List<String> values) {
            addCriterion("ba_sex not in", values, "baSex");
            return (Criteria) this;
        }

        public Criteria andBaSexBetween(String value1, String value2) {
            addCriterion("ba_sex between", value1, value2, "baSex");
            return (Criteria) this;
        }

        public Criteria andBaSexNotBetween(String value1, String value2) {
            addCriterion("ba_sex not between", value1, value2, "baSex");
            return (Criteria) this;
        }

        public Criteria andBaAgeIsNull() {
            addCriterion("ba_age is null");
            return (Criteria) this;
        }

        public Criteria andBaAgeIsNotNull() {
            addCriterion("ba_age is not null");
            return (Criteria) this;
        }

        public Criteria andBaAgeEqualTo(Integer value) {
            addCriterion("ba_age =", value, "baAge");
            return (Criteria) this;
        }

        public Criteria andBaAgeNotEqualTo(Integer value) {
            addCriterion("ba_age <>", value, "baAge");
            return (Criteria) this;
        }

        public Criteria andBaAgeGreaterThan(Integer value) {
            addCriterion("ba_age >", value, "baAge");
            return (Criteria) this;
        }

        public Criteria andBaAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ba_age >=", value, "baAge");
            return (Criteria) this;
        }

        public Criteria andBaAgeLessThan(Integer value) {
            addCriterion("ba_age <", value, "baAge");
            return (Criteria) this;
        }

        public Criteria andBaAgeLessThanOrEqualTo(Integer value) {
            addCriterion("ba_age <=", value, "baAge");
            return (Criteria) this;
        }

        public Criteria andBaAgeIn(List<Integer> values) {
            addCriterion("ba_age in", values, "baAge");
            return (Criteria) this;
        }

        public Criteria andBaAgeNotIn(List<Integer> values) {
            addCriterion("ba_age not in", values, "baAge");
            return (Criteria) this;
        }

        public Criteria andBaAgeBetween(Integer value1, Integer value2) {
            addCriterion("ba_age between", value1, value2, "baAge");
            return (Criteria) this;
        }

        public Criteria andBaAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("ba_age not between", value1, value2, "baAge");
            return (Criteria) this;
        }

        public Criteria andBaIdcardIsNull() {
            addCriterion("ba_IDcard is null");
            return (Criteria) this;
        }

        public Criteria andBaIdcardIsNotNull() {
            addCriterion("ba_IDcard is not null");
            return (Criteria) this;
        }

        public Criteria andBaIdcardEqualTo(String value) {
            addCriterion("ba_IDcard =", value, "baIdcard");
            return (Criteria) this;
        }

        public Criteria andBaIdcardNotEqualTo(String value) {
            addCriterion("ba_IDcard <>", value, "baIdcard");
            return (Criteria) this;
        }

        public Criteria andBaIdcardGreaterThan(String value) {
            addCriterion("ba_IDcard >", value, "baIdcard");
            return (Criteria) this;
        }

        public Criteria andBaIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("ba_IDcard >=", value, "baIdcard");
            return (Criteria) this;
        }

        public Criteria andBaIdcardLessThan(String value) {
            addCriterion("ba_IDcard <", value, "baIdcard");
            return (Criteria) this;
        }

        public Criteria andBaIdcardLessThanOrEqualTo(String value) {
            addCriterion("ba_IDcard <=", value, "baIdcard");
            return (Criteria) this;
        }

        public Criteria andBaIdcardLike(String value) {
            addCriterion("ba_IDcard like", value, "baIdcard");
            return (Criteria) this;
        }

        public Criteria andBaIdcardNotLike(String value) {
            addCriterion("ba_IDcard not like", value, "baIdcard");
            return (Criteria) this;
        }

        public Criteria andBaIdcardIn(List<String> values) {
            addCriterion("ba_IDcard in", values, "baIdcard");
            return (Criteria) this;
        }

        public Criteria andBaIdcardNotIn(List<String> values) {
            addCriterion("ba_IDcard not in", values, "baIdcard");
            return (Criteria) this;
        }

        public Criteria andBaIdcardBetween(String value1, String value2) {
            addCriterion("ba_IDcard between", value1, value2, "baIdcard");
            return (Criteria) this;
        }

        public Criteria andBaIdcardNotBetween(String value1, String value2) {
            addCriterion("ba_IDcard not between", value1, value2, "baIdcard");
            return (Criteria) this;
        }

        public Criteria andBaBirthIsNull() {
            addCriterion("ba_birth is null");
            return (Criteria) this;
        }

        public Criteria andBaBirthIsNotNull() {
            addCriterion("ba_birth is not null");
            return (Criteria) this;
        }

        public Criteria andBaBirthEqualTo(String value) {
            addCriterion("ba_birth =", value, "baBirth");
            return (Criteria) this;
        }

        public Criteria andBaBirthNotEqualTo(String value) {
            addCriterion("ba_birth <>", value, "baBirth");
            return (Criteria) this;
        }

        public Criteria andBaBirthGreaterThan(String value) {
            addCriterion("ba_birth >", value, "baBirth");
            return (Criteria) this;
        }

        public Criteria andBaBirthGreaterThanOrEqualTo(String value) {
            addCriterion("ba_birth >=", value, "baBirth");
            return (Criteria) this;
        }

        public Criteria andBaBirthLessThan(String value) {
            addCriterion("ba_birth <", value, "baBirth");
            return (Criteria) this;
        }

        public Criteria andBaBirthLessThanOrEqualTo(String value) {
            addCriterion("ba_birth <=", value, "baBirth");
            return (Criteria) this;
        }

        public Criteria andBaBirthLike(String value) {
            addCriterion("ba_birth like", value, "baBirth");
            return (Criteria) this;
        }

        public Criteria andBaBirthNotLike(String value) {
            addCriterion("ba_birth not like", value, "baBirth");
            return (Criteria) this;
        }

        public Criteria andBaBirthIn(List<String> values) {
            addCriterion("ba_birth in", values, "baBirth");
            return (Criteria) this;
        }

        public Criteria andBaBirthNotIn(List<String> values) {
            addCriterion("ba_birth not in", values, "baBirth");
            return (Criteria) this;
        }

        public Criteria andBaBirthBetween(String value1, String value2) {
            addCriterion("ba_birth between", value1, value2, "baBirth");
            return (Criteria) this;
        }

        public Criteria andBaBirthNotBetween(String value1, String value2) {
            addCriterion("ba_birth not between", value1, value2, "baBirth");
            return (Criteria) this;
        }

        public Criteria andBaNationIsNull() {
            addCriterion("ba_nation is null");
            return (Criteria) this;
        }

        public Criteria andBaNationIsNotNull() {
            addCriterion("ba_nation is not null");
            return (Criteria) this;
        }

        public Criteria andBaNationEqualTo(String value) {
            addCriterion("ba_nation =", value, "baNation");
            return (Criteria) this;
        }

        public Criteria andBaNationNotEqualTo(String value) {
            addCriterion("ba_nation <>", value, "baNation");
            return (Criteria) this;
        }

        public Criteria andBaNationGreaterThan(String value) {
            addCriterion("ba_nation >", value, "baNation");
            return (Criteria) this;
        }

        public Criteria andBaNationGreaterThanOrEqualTo(String value) {
            addCriterion("ba_nation >=", value, "baNation");
            return (Criteria) this;
        }

        public Criteria andBaNationLessThan(String value) {
            addCriterion("ba_nation <", value, "baNation");
            return (Criteria) this;
        }

        public Criteria andBaNationLessThanOrEqualTo(String value) {
            addCriterion("ba_nation <=", value, "baNation");
            return (Criteria) this;
        }

        public Criteria andBaNationLike(String value) {
            addCriterion("ba_nation like", value, "baNation");
            return (Criteria) this;
        }

        public Criteria andBaNationNotLike(String value) {
            addCriterion("ba_nation not like", value, "baNation");
            return (Criteria) this;
        }

        public Criteria andBaNationIn(List<String> values) {
            addCriterion("ba_nation in", values, "baNation");
            return (Criteria) this;
        }

        public Criteria andBaNationNotIn(List<String> values) {
            addCriterion("ba_nation not in", values, "baNation");
            return (Criteria) this;
        }

        public Criteria andBaNationBetween(String value1, String value2) {
            addCriterion("ba_nation between", value1, value2, "baNation");
            return (Criteria) this;
        }

        public Criteria andBaNationNotBetween(String value1, String value2) {
            addCriterion("ba_nation not between", value1, value2, "baNation");
            return (Criteria) this;
        }

        public Criteria andBaMarriageIsNull() {
            addCriterion("ba_marriage is null");
            return (Criteria) this;
        }

        public Criteria andBaMarriageIsNotNull() {
            addCriterion("ba_marriage is not null");
            return (Criteria) this;
        }

        public Criteria andBaMarriageEqualTo(String value) {
            addCriterion("ba_marriage =", value, "baMarriage");
            return (Criteria) this;
        }

        public Criteria andBaMarriageNotEqualTo(String value) {
            addCriterion("ba_marriage <>", value, "baMarriage");
            return (Criteria) this;
        }

        public Criteria andBaMarriageGreaterThan(String value) {
            addCriterion("ba_marriage >", value, "baMarriage");
            return (Criteria) this;
        }

        public Criteria andBaMarriageGreaterThanOrEqualTo(String value) {
            addCriterion("ba_marriage >=", value, "baMarriage");
            return (Criteria) this;
        }

        public Criteria andBaMarriageLessThan(String value) {
            addCriterion("ba_marriage <", value, "baMarriage");
            return (Criteria) this;
        }

        public Criteria andBaMarriageLessThanOrEqualTo(String value) {
            addCriterion("ba_marriage <=", value, "baMarriage");
            return (Criteria) this;
        }

        public Criteria andBaMarriageLike(String value) {
            addCriterion("ba_marriage like", value, "baMarriage");
            return (Criteria) this;
        }

        public Criteria andBaMarriageNotLike(String value) {
            addCriterion("ba_marriage not like", value, "baMarriage");
            return (Criteria) this;
        }

        public Criteria andBaMarriageIn(List<String> values) {
            addCriterion("ba_marriage in", values, "baMarriage");
            return (Criteria) this;
        }

        public Criteria andBaMarriageNotIn(List<String> values) {
            addCriterion("ba_marriage not in", values, "baMarriage");
            return (Criteria) this;
        }

        public Criteria andBaMarriageBetween(String value1, String value2) {
            addCriterion("ba_marriage between", value1, value2, "baMarriage");
            return (Criteria) this;
        }

        public Criteria andBaMarriageNotBetween(String value1, String value2) {
            addCriterion("ba_marriage not between", value1, value2, "baMarriage");
            return (Criteria) this;
        }

        public Criteria andBaVisageIsNull() {
            addCriterion("ba_visage is null");
            return (Criteria) this;
        }

        public Criteria andBaVisageIsNotNull() {
            addCriterion("ba_visage is not null");
            return (Criteria) this;
        }

        public Criteria andBaVisageEqualTo(String value) {
            addCriterion("ba_visage =", value, "baVisage");
            return (Criteria) this;
        }

        public Criteria andBaVisageNotEqualTo(String value) {
            addCriterion("ba_visage <>", value, "baVisage");
            return (Criteria) this;
        }

        public Criteria andBaVisageGreaterThan(String value) {
            addCriterion("ba_visage >", value, "baVisage");
            return (Criteria) this;
        }

        public Criteria andBaVisageGreaterThanOrEqualTo(String value) {
            addCriterion("ba_visage >=", value, "baVisage");
            return (Criteria) this;
        }

        public Criteria andBaVisageLessThan(String value) {
            addCriterion("ba_visage <", value, "baVisage");
            return (Criteria) this;
        }

        public Criteria andBaVisageLessThanOrEqualTo(String value) {
            addCriterion("ba_visage <=", value, "baVisage");
            return (Criteria) this;
        }

        public Criteria andBaVisageLike(String value) {
            addCriterion("ba_visage like", value, "baVisage");
            return (Criteria) this;
        }

        public Criteria andBaVisageNotLike(String value) {
            addCriterion("ba_visage not like", value, "baVisage");
            return (Criteria) this;
        }

        public Criteria andBaVisageIn(List<String> values) {
            addCriterion("ba_visage in", values, "baVisage");
            return (Criteria) this;
        }

        public Criteria andBaVisageNotIn(List<String> values) {
            addCriterion("ba_visage not in", values, "baVisage");
            return (Criteria) this;
        }

        public Criteria andBaVisageBetween(String value1, String value2) {
            addCriterion("ba_visage between", value1, value2, "baVisage");
            return (Criteria) this;
        }

        public Criteria andBaVisageNotBetween(String value1, String value2) {
            addCriterion("ba_visage not between", value1, value2, "baVisage");
            return (Criteria) this;
        }

        public Criteria andBaHomeIsNull() {
            addCriterion("ba_home is null");
            return (Criteria) this;
        }

        public Criteria andBaHomeIsNotNull() {
            addCriterion("ba_home is not null");
            return (Criteria) this;
        }

        public Criteria andBaHomeEqualTo(String value) {
            addCriterion("ba_home =", value, "baHome");
            return (Criteria) this;
        }

        public Criteria andBaHomeNotEqualTo(String value) {
            addCriterion("ba_home <>", value, "baHome");
            return (Criteria) this;
        }

        public Criteria andBaHomeGreaterThan(String value) {
            addCriterion("ba_home >", value, "baHome");
            return (Criteria) this;
        }

        public Criteria andBaHomeGreaterThanOrEqualTo(String value) {
            addCriterion("ba_home >=", value, "baHome");
            return (Criteria) this;
        }

        public Criteria andBaHomeLessThan(String value) {
            addCriterion("ba_home <", value, "baHome");
            return (Criteria) this;
        }

        public Criteria andBaHomeLessThanOrEqualTo(String value) {
            addCriterion("ba_home <=", value, "baHome");
            return (Criteria) this;
        }

        public Criteria andBaHomeLike(String value) {
            addCriterion("ba_home like", value, "baHome");
            return (Criteria) this;
        }

        public Criteria andBaHomeNotLike(String value) {
            addCriterion("ba_home not like", value, "baHome");
            return (Criteria) this;
        }

        public Criteria andBaHomeIn(List<String> values) {
            addCriterion("ba_home in", values, "baHome");
            return (Criteria) this;
        }

        public Criteria andBaHomeNotIn(List<String> values) {
            addCriterion("ba_home not in", values, "baHome");
            return (Criteria) this;
        }

        public Criteria andBaHomeBetween(String value1, String value2) {
            addCriterion("ba_home between", value1, value2, "baHome");
            return (Criteria) this;
        }

        public Criteria andBaHomeNotBetween(String value1, String value2) {
            addCriterion("ba_home not between", value1, value2, "baHome");
            return (Criteria) this;
        }

        public Criteria andBaTelIsNull() {
            addCriterion("ba_tel is null");
            return (Criteria) this;
        }

        public Criteria andBaTelIsNotNull() {
            addCriterion("ba_tel is not null");
            return (Criteria) this;
        }

        public Criteria andBaTelEqualTo(String value) {
            addCriterion("ba_tel =", value, "baTel");
            return (Criteria) this;
        }

        public Criteria andBaTelNotEqualTo(String value) {
            addCriterion("ba_tel <>", value, "baTel");
            return (Criteria) this;
        }

        public Criteria andBaTelGreaterThan(String value) {
            addCriterion("ba_tel >", value, "baTel");
            return (Criteria) this;
        }

        public Criteria andBaTelGreaterThanOrEqualTo(String value) {
            addCriterion("ba_tel >=", value, "baTel");
            return (Criteria) this;
        }

        public Criteria andBaTelLessThan(String value) {
            addCriterion("ba_tel <", value, "baTel");
            return (Criteria) this;
        }

        public Criteria andBaTelLessThanOrEqualTo(String value) {
            addCriterion("ba_tel <=", value, "baTel");
            return (Criteria) this;
        }

        public Criteria andBaTelLike(String value) {
            addCriterion("ba_tel like", value, "baTel");
            return (Criteria) this;
        }

        public Criteria andBaTelNotLike(String value) {
            addCriterion("ba_tel not like", value, "baTel");
            return (Criteria) this;
        }

        public Criteria andBaTelIn(List<String> values) {
            addCriterion("ba_tel in", values, "baTel");
            return (Criteria) this;
        }

        public Criteria andBaTelNotIn(List<String> values) {
            addCriterion("ba_tel not in", values, "baTel");
            return (Criteria) this;
        }

        public Criteria andBaTelBetween(String value1, String value2) {
            addCriterion("ba_tel between", value1, value2, "baTel");
            return (Criteria) this;
        }

        public Criteria andBaTelNotBetween(String value1, String value2) {
            addCriterion("ba_tel not between", value1, value2, "baTel");
            return (Criteria) this;
        }

        public Criteria andBaAddressIsNull() {
            addCriterion("ba_address is null");
            return (Criteria) this;
        }

        public Criteria andBaAddressIsNotNull() {
            addCriterion("ba_address is not null");
            return (Criteria) this;
        }

        public Criteria andBaAddressEqualTo(String value) {
            addCriterion("ba_address =", value, "baAddress");
            return (Criteria) this;
        }

        public Criteria andBaAddressNotEqualTo(String value) {
            addCriterion("ba_address <>", value, "baAddress");
            return (Criteria) this;
        }

        public Criteria andBaAddressGreaterThan(String value) {
            addCriterion("ba_address >", value, "baAddress");
            return (Criteria) this;
        }

        public Criteria andBaAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ba_address >=", value, "baAddress");
            return (Criteria) this;
        }

        public Criteria andBaAddressLessThan(String value) {
            addCriterion("ba_address <", value, "baAddress");
            return (Criteria) this;
        }

        public Criteria andBaAddressLessThanOrEqualTo(String value) {
            addCriterion("ba_address <=", value, "baAddress");
            return (Criteria) this;
        }

        public Criteria andBaAddressLike(String value) {
            addCriterion("ba_address like", value, "baAddress");
            return (Criteria) this;
        }

        public Criteria andBaAddressNotLike(String value) {
            addCriterion("ba_address not like", value, "baAddress");
            return (Criteria) this;
        }

        public Criteria andBaAddressIn(List<String> values) {
            addCriterion("ba_address in", values, "baAddress");
            return (Criteria) this;
        }

        public Criteria andBaAddressNotIn(List<String> values) {
            addCriterion("ba_address not in", values, "baAddress");
            return (Criteria) this;
        }

        public Criteria andBaAddressBetween(String value1, String value2) {
            addCriterion("ba_address between", value1, value2, "baAddress");
            return (Criteria) this;
        }

        public Criteria andBaAddressNotBetween(String value1, String value2) {
            addCriterion("ba_address not between", value1, value2, "baAddress");
            return (Criteria) this;
        }

        public Criteria andBaCultureIsNull() {
            addCriterion("ba_culture is null");
            return (Criteria) this;
        }

        public Criteria andBaCultureIsNotNull() {
            addCriterion("ba_culture is not null");
            return (Criteria) this;
        }

        public Criteria andBaCultureEqualTo(String value) {
            addCriterion("ba_culture =", value, "baCulture");
            return (Criteria) this;
        }

        public Criteria andBaCultureNotEqualTo(String value) {
            addCriterion("ba_culture <>", value, "baCulture");
            return (Criteria) this;
        }

        public Criteria andBaCultureGreaterThan(String value) {
            addCriterion("ba_culture >", value, "baCulture");
            return (Criteria) this;
        }

        public Criteria andBaCultureGreaterThanOrEqualTo(String value) {
            addCriterion("ba_culture >=", value, "baCulture");
            return (Criteria) this;
        }

        public Criteria andBaCultureLessThan(String value) {
            addCriterion("ba_culture <", value, "baCulture");
            return (Criteria) this;
        }

        public Criteria andBaCultureLessThanOrEqualTo(String value) {
            addCriterion("ba_culture <=", value, "baCulture");
            return (Criteria) this;
        }

        public Criteria andBaCultureLike(String value) {
            addCriterion("ba_culture like", value, "baCulture");
            return (Criteria) this;
        }

        public Criteria andBaCultureNotLike(String value) {
            addCriterion("ba_culture not like", value, "baCulture");
            return (Criteria) this;
        }

        public Criteria andBaCultureIn(List<String> values) {
            addCriterion("ba_culture in", values, "baCulture");
            return (Criteria) this;
        }

        public Criteria andBaCultureNotIn(List<String> values) {
            addCriterion("ba_culture not in", values, "baCulture");
            return (Criteria) this;
        }

        public Criteria andBaCultureBetween(String value1, String value2) {
            addCriterion("ba_culture between", value1, value2, "baCulture");
            return (Criteria) this;
        }

        public Criteria andBaCultureNotBetween(String value1, String value2) {
            addCriterion("ba_culture not between", value1, value2, "baCulture");
            return (Criteria) this;
        }

        public Criteria andEmIsstockIsNull() {
            addCriterion("em_isstock is null");
            return (Criteria) this;
        }

        public Criteria andEmIsstockIsNotNull() {
            addCriterion("em_isstock is not null");
            return (Criteria) this;
        }

        public Criteria andEmIsstockEqualTo(String value) {
            addCriterion("em_isstock =", value, "emIsstock");
            return (Criteria) this;
        }

        public Criteria andEmIsstockNotEqualTo(String value) {
            addCriterion("em_isstock <>", value, "emIsstock");
            return (Criteria) this;
        }

        public Criteria andEmIsstockGreaterThan(String value) {
            addCriterion("em_isstock >", value, "emIsstock");
            return (Criteria) this;
        }

        public Criteria andEmIsstockGreaterThanOrEqualTo(String value) {
            addCriterion("em_isstock >=", value, "emIsstock");
            return (Criteria) this;
        }

        public Criteria andEmIsstockLessThan(String value) {
            addCriterion("em_isstock <", value, "emIsstock");
            return (Criteria) this;
        }

        public Criteria andEmIsstockLessThanOrEqualTo(String value) {
            addCriterion("em_isstock <=", value, "emIsstock");
            return (Criteria) this;
        }

        public Criteria andEmIsstockLike(String value) {
            addCriterion("em_isstock like", value, "emIsstock");
            return (Criteria) this;
        }

        public Criteria andEmIsstockNotLike(String value) {
            addCriterion("em_isstock not like", value, "emIsstock");
            return (Criteria) this;
        }

        public Criteria andEmIsstockIn(List<String> values) {
            addCriterion("em_isstock in", values, "emIsstock");
            return (Criteria) this;
        }

        public Criteria andEmIsstockNotIn(List<String> values) {
            addCriterion("em_isstock not in", values, "emIsstock");
            return (Criteria) this;
        }

        public Criteria andEmIsstockBetween(String value1, String value2) {
            addCriterion("em_isstock between", value1, value2, "emIsstock");
            return (Criteria) this;
        }

        public Criteria andEmIsstockNotBetween(String value1, String value2) {
            addCriterion("em_isstock not between", value1, value2, "emIsstock");
            return (Criteria) this;
        }

        public Criteria andEmBzIsNull() {
            addCriterion("em_bz is null");
            return (Criteria) this;
        }

        public Criteria andEmBzIsNotNull() {
            addCriterion("em_bz is not null");
            return (Criteria) this;
        }

        public Criteria andEmBzEqualTo(String value) {
            addCriterion("em_bz =", value, "emBz");
            return (Criteria) this;
        }

        public Criteria andEmBzNotEqualTo(String value) {
            addCriterion("em_bz <>", value, "emBz");
            return (Criteria) this;
        }

        public Criteria andEmBzGreaterThan(String value) {
            addCriterion("em_bz >", value, "emBz");
            return (Criteria) this;
        }

        public Criteria andEmBzGreaterThanOrEqualTo(String value) {
            addCriterion("em_bz >=", value, "emBz");
            return (Criteria) this;
        }

        public Criteria andEmBzLessThan(String value) {
            addCriterion("em_bz <", value, "emBz");
            return (Criteria) this;
        }

        public Criteria andEmBzLessThanOrEqualTo(String value) {
            addCriterion("em_bz <=", value, "emBz");
            return (Criteria) this;
        }

        public Criteria andEmBzLike(String value) {
            addCriterion("em_bz like", value, "emBz");
            return (Criteria) this;
        }

        public Criteria andEmBzNotLike(String value) {
            addCriterion("em_bz not like", value, "emBz");
            return (Criteria) this;
        }

        public Criteria andEmBzIn(List<String> values) {
            addCriterion("em_bz in", values, "emBz");
            return (Criteria) this;
        }

        public Criteria andEmBzNotIn(List<String> values) {
            addCriterion("em_bz not in", values, "emBz");
            return (Criteria) this;
        }

        public Criteria andEmBzBetween(String value1, String value2) {
            addCriterion("em_bz between", value1, value2, "emBz");
            return (Criteria) this;
        }

        public Criteria andEmBzNotBetween(String value1, String value2) {
            addCriterion("em_bz not between", value1, value2, "emBz");
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