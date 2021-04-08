package com.qingzhi.pojo;

import java.util.ArrayList;
import java.util.List;

public class QzLiuyanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QzLiuyanExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLyTimeIsNull() {
            addCriterion("ly_time is null");
            return (Criteria) this;
        }

        public Criteria andLyTimeIsNotNull() {
            addCriterion("ly_time is not null");
            return (Criteria) this;
        }

        public Criteria andLyTimeEqualTo(String value) {
            addCriterion("ly_time =", value, "lyTime");
            return (Criteria) this;
        }

        public Criteria andLyTimeNotEqualTo(String value) {
            addCriterion("ly_time <>", value, "lyTime");
            return (Criteria) this;
        }

        public Criteria andLyTimeGreaterThan(String value) {
            addCriterion("ly_time >", value, "lyTime");
            return (Criteria) this;
        }

        public Criteria andLyTimeGreaterThanOrEqualTo(String value) {
            addCriterion("ly_time >=", value, "lyTime");
            return (Criteria) this;
        }

        public Criteria andLyTimeLessThan(String value) {
            addCriterion("ly_time <", value, "lyTime");
            return (Criteria) this;
        }

        public Criteria andLyTimeLessThanOrEqualTo(String value) {
            addCriterion("ly_time <=", value, "lyTime");
            return (Criteria) this;
        }

        public Criteria andLyTimeLike(String value) {
            addCriterion("ly_time like", value, "lyTime");
            return (Criteria) this;
        }

        public Criteria andLyTimeNotLike(String value) {
            addCriterion("ly_time not like", value, "lyTime");
            return (Criteria) this;
        }

        public Criteria andLyTimeIn(List<String> values) {
            addCriterion("ly_time in", values, "lyTime");
            return (Criteria) this;
        }

        public Criteria andLyTimeNotIn(List<String> values) {
            addCriterion("ly_time not in", values, "lyTime");
            return (Criteria) this;
        }

        public Criteria andLyTimeBetween(String value1, String value2) {
            addCriterion("ly_time between", value1, value2, "lyTime");
            return (Criteria) this;
        }

        public Criteria andLyTimeNotBetween(String value1, String value2) {
            addCriterion("ly_time not between", value1, value2, "lyTime");
            return (Criteria) this;
        }

        public Criteria andLyNeirongIsNull() {
            addCriterion("ly_neirong is null");
            return (Criteria) this;
        }

        public Criteria andLyNeirongIsNotNull() {
            addCriterion("ly_neirong is not null");
            return (Criteria) this;
        }

        public Criteria andLyNeirongEqualTo(String value) {
            addCriterion("ly_neirong =", value, "lyNeirong");
            return (Criteria) this;
        }

        public Criteria andLyNeirongNotEqualTo(String value) {
            addCriterion("ly_neirong <>", value, "lyNeirong");
            return (Criteria) this;
        }

        public Criteria andLyNeirongGreaterThan(String value) {
            addCriterion("ly_neirong >", value, "lyNeirong");
            return (Criteria) this;
        }

        public Criteria andLyNeirongGreaterThanOrEqualTo(String value) {
            addCriterion("ly_neirong >=", value, "lyNeirong");
            return (Criteria) this;
        }

        public Criteria andLyNeirongLessThan(String value) {
            addCriterion("ly_neirong <", value, "lyNeirong");
            return (Criteria) this;
        }

        public Criteria andLyNeirongLessThanOrEqualTo(String value) {
            addCriterion("ly_neirong <=", value, "lyNeirong");
            return (Criteria) this;
        }

        public Criteria andLyNeirongLike(String value) {
            addCriterion("ly_neirong like", value, "lyNeirong");
            return (Criteria) this;
        }

        public Criteria andLyNeirongNotLike(String value) {
            addCriterion("ly_neirong not like", value, "lyNeirong");
            return (Criteria) this;
        }

        public Criteria andLyNeirongIn(List<String> values) {
            addCriterion("ly_neirong in", values, "lyNeirong");
            return (Criteria) this;
        }

        public Criteria andLyNeirongNotIn(List<String> values) {
            addCriterion("ly_neirong not in", values, "lyNeirong");
            return (Criteria) this;
        }

        public Criteria andLyNeirongBetween(String value1, String value2) {
            addCriterion("ly_neirong between", value1, value2, "lyNeirong");
            return (Criteria) this;
        }

        public Criteria andLyNeirongNotBetween(String value1, String value2) {
            addCriterion("ly_neirong not between", value1, value2, "lyNeirong");
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