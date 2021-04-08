package com.qingzhi.pojo;

import java.util.ArrayList;
import java.util.List;

public class QzTuiwenExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QzTuiwenExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTwBiaotiIsNull() {
            addCriterion("tw_biaoti is null");
            return (Criteria) this;
        }

        public Criteria andTwBiaotiIsNotNull() {
            addCriterion("tw_biaoti is not null");
            return (Criteria) this;
        }

        public Criteria andTwBiaotiEqualTo(String value) {
            addCriterion("tw_biaoti =", value, "twBiaoti");
            return (Criteria) this;
        }

        public Criteria andTwBiaotiNotEqualTo(String value) {
            addCriterion("tw_biaoti <>", value, "twBiaoti");
            return (Criteria) this;
        }

        public Criteria andTwBiaotiGreaterThan(String value) {
            addCriterion("tw_biaoti >", value, "twBiaoti");
            return (Criteria) this;
        }

        public Criteria andTwBiaotiGreaterThanOrEqualTo(String value) {
            addCriterion("tw_biaoti >=", value, "twBiaoti");
            return (Criteria) this;
        }

        public Criteria andTwBiaotiLessThan(String value) {
            addCriterion("tw_biaoti <", value, "twBiaoti");
            return (Criteria) this;
        }

        public Criteria andTwBiaotiLessThanOrEqualTo(String value) {
            addCriterion("tw_biaoti <=", value, "twBiaoti");
            return (Criteria) this;
        }

        public Criteria andTwBiaotiLike(String value) {
            addCriterion("tw_biaoti like", value, "twBiaoti");
            return (Criteria) this;
        }

        public Criteria andTwBiaotiNotLike(String value) {
            addCriterion("tw_biaoti not like", value, "twBiaoti");
            return (Criteria) this;
        }

        public Criteria andTwBiaotiIn(List<String> values) {
            addCriterion("tw_biaoti in", values, "twBiaoti");
            return (Criteria) this;
        }

        public Criteria andTwBiaotiNotIn(List<String> values) {
            addCriterion("tw_biaoti not in", values, "twBiaoti");
            return (Criteria) this;
        }

        public Criteria andTwBiaotiBetween(String value1, String value2) {
            addCriterion("tw_biaoti between", value1, value2, "twBiaoti");
            return (Criteria) this;
        }

        public Criteria andTwBiaotiNotBetween(String value1, String value2) {
            addCriterion("tw_biaoti not between", value1, value2, "twBiaoti");
            return (Criteria) this;
        }

        public Criteria andTwTupianIsNull() {
            addCriterion("tw_tupian is null");
            return (Criteria) this;
        }

        public Criteria andTwTupianIsNotNull() {
            addCriterion("tw_tupian is not null");
            return (Criteria) this;
        }

        public Criteria andTwTupianEqualTo(String value) {
            addCriterion("tw_tupian =", value, "twTupian");
            return (Criteria) this;
        }

        public Criteria andTwTupianNotEqualTo(String value) {
            addCriterion("tw_tupian <>", value, "twTupian");
            return (Criteria) this;
        }

        public Criteria andTwTupianGreaterThan(String value) {
            addCriterion("tw_tupian >", value, "twTupian");
            return (Criteria) this;
        }

        public Criteria andTwTupianGreaterThanOrEqualTo(String value) {
            addCriterion("tw_tupian >=", value, "twTupian");
            return (Criteria) this;
        }

        public Criteria andTwTupianLessThan(String value) {
            addCriterion("tw_tupian <", value, "twTupian");
            return (Criteria) this;
        }

        public Criteria andTwTupianLessThanOrEqualTo(String value) {
            addCriterion("tw_tupian <=", value, "twTupian");
            return (Criteria) this;
        }

        public Criteria andTwTupianLike(String value) {
            addCriterion("tw_tupian like", value, "twTupian");
            return (Criteria) this;
        }

        public Criteria andTwTupianNotLike(String value) {
            addCriterion("tw_tupian not like", value, "twTupian");
            return (Criteria) this;
        }

        public Criteria andTwTupianIn(List<String> values) {
            addCriterion("tw_tupian in", values, "twTupian");
            return (Criteria) this;
        }

        public Criteria andTwTupianNotIn(List<String> values) {
            addCriterion("tw_tupian not in", values, "twTupian");
            return (Criteria) this;
        }

        public Criteria andTwTupianBetween(String value1, String value2) {
            addCriterion("tw_tupian between", value1, value2, "twTupian");
            return (Criteria) this;
        }

        public Criteria andTwTupianNotBetween(String value1, String value2) {
            addCriterion("tw_tupian not between", value1, value2, "twTupian");
            return (Criteria) this;
        }

        public Criteria andTwLianjieIsNull() {
            addCriterion("tw_lianjie is null");
            return (Criteria) this;
        }

        public Criteria andTwLianjieIsNotNull() {
            addCriterion("tw_lianjie is not null");
            return (Criteria) this;
        }

        public Criteria andTwLianjieEqualTo(String value) {
            addCriterion("tw_lianjie =", value, "twLianjie");
            return (Criteria) this;
        }

        public Criteria andTwLianjieNotEqualTo(String value) {
            addCriterion("tw_lianjie <>", value, "twLianjie");
            return (Criteria) this;
        }

        public Criteria andTwLianjieGreaterThan(String value) {
            addCriterion("tw_lianjie >", value, "twLianjie");
            return (Criteria) this;
        }

        public Criteria andTwLianjieGreaterThanOrEqualTo(String value) {
            addCriterion("tw_lianjie >=", value, "twLianjie");
            return (Criteria) this;
        }

        public Criteria andTwLianjieLessThan(String value) {
            addCriterion("tw_lianjie <", value, "twLianjie");
            return (Criteria) this;
        }

        public Criteria andTwLianjieLessThanOrEqualTo(String value) {
            addCriterion("tw_lianjie <=", value, "twLianjie");
            return (Criteria) this;
        }

        public Criteria andTwLianjieLike(String value) {
            addCriterion("tw_lianjie like", value, "twLianjie");
            return (Criteria) this;
        }

        public Criteria andTwLianjieNotLike(String value) {
            addCriterion("tw_lianjie not like", value, "twLianjie");
            return (Criteria) this;
        }

        public Criteria andTwLianjieIn(List<String> values) {
            addCriterion("tw_lianjie in", values, "twLianjie");
            return (Criteria) this;
        }

        public Criteria andTwLianjieNotIn(List<String> values) {
            addCriterion("tw_lianjie not in", values, "twLianjie");
            return (Criteria) this;
        }

        public Criteria andTwLianjieBetween(String value1, String value2) {
            addCriterion("tw_lianjie between", value1, value2, "twLianjie");
            return (Criteria) this;
        }

        public Criteria andTwLianjieNotBetween(String value1, String value2) {
            addCriterion("tw_lianjie not between", value1, value2, "twLianjie");
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