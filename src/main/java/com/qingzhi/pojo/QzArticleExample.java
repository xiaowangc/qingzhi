package com.qingzhi.pojo;

import java.util.ArrayList;
import java.util.List;

public class QzArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QzArticleExample() {
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

        public Criteria andArtNameIsNull() {
            addCriterion("art_name is null");
            return (Criteria) this;
        }

        public Criteria andArtNameIsNotNull() {
            addCriterion("art_name is not null");
            return (Criteria) this;
        }

        public Criteria andArtNameEqualTo(String value) {
            addCriterion("art_name =", value, "artName");
            return (Criteria) this;
        }

        public Criteria andArtNameNotEqualTo(String value) {
            addCriterion("art_name <>", value, "artName");
            return (Criteria) this;
        }

        public Criteria andArtNameGreaterThan(String value) {
            addCriterion("art_name >", value, "artName");
            return (Criteria) this;
        }

        public Criteria andArtNameGreaterThanOrEqualTo(String value) {
            addCriterion("art_name >=", value, "artName");
            return (Criteria) this;
        }

        public Criteria andArtNameLessThan(String value) {
            addCriterion("art_name <", value, "artName");
            return (Criteria) this;
        }

        public Criteria andArtNameLessThanOrEqualTo(String value) {
            addCriterion("art_name <=", value, "artName");
            return (Criteria) this;
        }

        public Criteria andArtNameLike(String value) {
            addCriterion("art_name like", value, "artName");
            return (Criteria) this;
        }

        public Criteria andArtNameNotLike(String value) {
            addCriterion("art_name not like", value, "artName");
            return (Criteria) this;
        }

        public Criteria andArtNameIn(List<String> values) {
            addCriterion("art_name in", values, "artName");
            return (Criteria) this;
        }

        public Criteria andArtNameNotIn(List<String> values) {
            addCriterion("art_name not in", values, "artName");
            return (Criteria) this;
        }

        public Criteria andArtNameBetween(String value1, String value2) {
            addCriterion("art_name between", value1, value2, "artName");
            return (Criteria) this;
        }

        public Criteria andArtNameNotBetween(String value1, String value2) {
            addCriterion("art_name not between", value1, value2, "artName");
            return (Criteria) this;
        }

        public Criteria andArtDuineiIsNull() {
            addCriterion("art_duinei is null");
            return (Criteria) this;
        }

        public Criteria andArtDuineiIsNotNull() {
            addCriterion("art_duinei is not null");
            return (Criteria) this;
        }

        public Criteria andArtDuineiEqualTo(String value) {
            addCriterion("art_duinei =", value, "artDuinei");
            return (Criteria) this;
        }

        public Criteria andArtDuineiNotEqualTo(String value) {
            addCriterion("art_duinei <>", value, "artDuinei");
            return (Criteria) this;
        }

        public Criteria andArtDuineiGreaterThan(String value) {
            addCriterion("art_duinei >", value, "artDuinei");
            return (Criteria) this;
        }

        public Criteria andArtDuineiGreaterThanOrEqualTo(String value) {
            addCriterion("art_duinei >=", value, "artDuinei");
            return (Criteria) this;
        }

        public Criteria andArtDuineiLessThan(String value) {
            addCriterion("art_duinei <", value, "artDuinei");
            return (Criteria) this;
        }

        public Criteria andArtDuineiLessThanOrEqualTo(String value) {
            addCriterion("art_duinei <=", value, "artDuinei");
            return (Criteria) this;
        }

        public Criteria andArtDuineiLike(String value) {
            addCriterion("art_duinei like", value, "artDuinei");
            return (Criteria) this;
        }

        public Criteria andArtDuineiNotLike(String value) {
            addCriterion("art_duinei not like", value, "artDuinei");
            return (Criteria) this;
        }

        public Criteria andArtDuineiIn(List<String> values) {
            addCriterion("art_duinei in", values, "artDuinei");
            return (Criteria) this;
        }

        public Criteria andArtDuineiNotIn(List<String> values) {
            addCriterion("art_duinei not in", values, "artDuinei");
            return (Criteria) this;
        }

        public Criteria andArtDuineiBetween(String value1, String value2) {
            addCriterion("art_duinei between", value1, value2, "artDuinei");
            return (Criteria) this;
        }

        public Criteria andArtDuineiNotBetween(String value1, String value2) {
            addCriterion("art_duinei not between", value1, value2, "artDuinei");
            return (Criteria) this;
        }

        public Criteria andArtTimeIsNull() {
            addCriterion("art_time is null");
            return (Criteria) this;
        }

        public Criteria andArtTimeIsNotNull() {
            addCriterion("art_time is not null");
            return (Criteria) this;
        }

        public Criteria andArtTimeEqualTo(String value) {
            addCriterion("art_time =", value, "artTime");
            return (Criteria) this;
        }

        public Criteria andArtTimeNotEqualTo(String value) {
            addCriterion("art_time <>", value, "artTime");
            return (Criteria) this;
        }

        public Criteria andArtTimeGreaterThan(String value) {
            addCriterion("art_time >", value, "artTime");
            return (Criteria) this;
        }

        public Criteria andArtTimeGreaterThanOrEqualTo(String value) {
            addCriterion("art_time >=", value, "artTime");
            return (Criteria) this;
        }

        public Criteria andArtTimeLessThan(String value) {
            addCriterion("art_time <", value, "artTime");
            return (Criteria) this;
        }

        public Criteria andArtTimeLessThanOrEqualTo(String value) {
            addCriterion("art_time <=", value, "artTime");
            return (Criteria) this;
        }

        public Criteria andArtTimeLike(String value) {
            addCriterion("art_time like", value, "artTime");
            return (Criteria) this;
        }

        public Criteria andArtTimeNotLike(String value) {
            addCriterion("art_time not like", value, "artTime");
            return (Criteria) this;
        }

        public Criteria andArtTimeIn(List<String> values) {
            addCriterion("art_time in", values, "artTime");
            return (Criteria) this;
        }

        public Criteria andArtTimeNotIn(List<String> values) {
            addCriterion("art_time not in", values, "artTime");
            return (Criteria) this;
        }

        public Criteria andArtTimeBetween(String value1, String value2) {
            addCriterion("art_time between", value1, value2, "artTime");
            return (Criteria) this;
        }

        public Criteria andArtTimeNotBetween(String value1, String value2) {
            addCriterion("art_time not between", value1, value2, "artTime");
            return (Criteria) this;
        }

        public Criteria andArtSiteIsNull() {
            addCriterion("art_site is null");
            return (Criteria) this;
        }

        public Criteria andArtSiteIsNotNull() {
            addCriterion("art_site is not null");
            return (Criteria) this;
        }

        public Criteria andArtSiteEqualTo(String value) {
            addCriterion("art_site =", value, "artSite");
            return (Criteria) this;
        }

        public Criteria andArtSiteNotEqualTo(String value) {
            addCriterion("art_site <>", value, "artSite");
            return (Criteria) this;
        }

        public Criteria andArtSiteGreaterThan(String value) {
            addCriterion("art_site >", value, "artSite");
            return (Criteria) this;
        }

        public Criteria andArtSiteGreaterThanOrEqualTo(String value) {
            addCriterion("art_site >=", value, "artSite");
            return (Criteria) this;
        }

        public Criteria andArtSiteLessThan(String value) {
            addCriterion("art_site <", value, "artSite");
            return (Criteria) this;
        }

        public Criteria andArtSiteLessThanOrEqualTo(String value) {
            addCriterion("art_site <=", value, "artSite");
            return (Criteria) this;
        }

        public Criteria andArtSiteLike(String value) {
            addCriterion("art_site like", value, "artSite");
            return (Criteria) this;
        }

        public Criteria andArtSiteNotLike(String value) {
            addCriterion("art_site not like", value, "artSite");
            return (Criteria) this;
        }

        public Criteria andArtSiteIn(List<String> values) {
            addCriterion("art_site in", values, "artSite");
            return (Criteria) this;
        }

        public Criteria andArtSiteNotIn(List<String> values) {
            addCriterion("art_site not in", values, "artSite");
            return (Criteria) this;
        }

        public Criteria andArtSiteBetween(String value1, String value2) {
            addCriterion("art_site between", value1, value2, "artSite");
            return (Criteria) this;
        }

        public Criteria andArtSiteNotBetween(String value1, String value2) {
            addCriterion("art_site not between", value1, value2, "artSite");
            return (Criteria) this;
        }

        public Criteria andArtLeirongIsNull() {
            addCriterion("art_leirong is null");
            return (Criteria) this;
        }

        public Criteria andArtLeirongIsNotNull() {
            addCriterion("art_leirong is not null");
            return (Criteria) this;
        }

        public Criteria andArtLeirongEqualTo(String value) {
            addCriterion("art_leirong =", value, "artLeirong");
            return (Criteria) this;
        }

        public Criteria andArtLeirongNotEqualTo(String value) {
            addCriterion("art_leirong <>", value, "artLeirong");
            return (Criteria) this;
        }

        public Criteria andArtLeirongGreaterThan(String value) {
            addCriterion("art_leirong >", value, "artLeirong");
            return (Criteria) this;
        }

        public Criteria andArtLeirongGreaterThanOrEqualTo(String value) {
            addCriterion("art_leirong >=", value, "artLeirong");
            return (Criteria) this;
        }

        public Criteria andArtLeirongLessThan(String value) {
            addCriterion("art_leirong <", value, "artLeirong");
            return (Criteria) this;
        }

        public Criteria andArtLeirongLessThanOrEqualTo(String value) {
            addCriterion("art_leirong <=", value, "artLeirong");
            return (Criteria) this;
        }

        public Criteria andArtLeirongLike(String value) {
            addCriterion("art_leirong like", value, "artLeirong");
            return (Criteria) this;
        }

        public Criteria andArtLeirongNotLike(String value) {
            addCriterion("art_leirong not like", value, "artLeirong");
            return (Criteria) this;
        }

        public Criteria andArtLeirongIn(List<String> values) {
            addCriterion("art_leirong in", values, "artLeirong");
            return (Criteria) this;
        }

        public Criteria andArtLeirongNotIn(List<String> values) {
            addCriterion("art_leirong not in", values, "artLeirong");
            return (Criteria) this;
        }

        public Criteria andArtLeirongBetween(String value1, String value2) {
            addCriterion("art_leirong between", value1, value2, "artLeirong");
            return (Criteria) this;
        }

        public Criteria andArtLeirongNotBetween(String value1, String value2) {
            addCriterion("art_leirong not between", value1, value2, "artLeirong");
            return (Criteria) this;
        }

        public Criteria andArtXqrsIsNull() {
            addCriterion("art_xqrs is null");
            return (Criteria) this;
        }

        public Criteria andArtXqrsIsNotNull() {
            addCriterion("art_xqrs is not null");
            return (Criteria) this;
        }

        public Criteria andArtXqrsEqualTo(String value) {
            addCriterion("art_xqrs =", value, "artXqrs");
            return (Criteria) this;
        }

        public Criteria andArtXqrsNotEqualTo(String value) {
            addCriterion("art_xqrs <>", value, "artXqrs");
            return (Criteria) this;
        }

        public Criteria andArtXqrsGreaterThan(String value) {
            addCriterion("art_xqrs >", value, "artXqrs");
            return (Criteria) this;
        }

        public Criteria andArtXqrsGreaterThanOrEqualTo(String value) {
            addCriterion("art_xqrs >=", value, "artXqrs");
            return (Criteria) this;
        }

        public Criteria andArtXqrsLessThan(String value) {
            addCriterion("art_xqrs <", value, "artXqrs");
            return (Criteria) this;
        }

        public Criteria andArtXqrsLessThanOrEqualTo(String value) {
            addCriterion("art_xqrs <=", value, "artXqrs");
            return (Criteria) this;
        }

        public Criteria andArtXqrsLike(String value) {
            addCriterion("art_xqrs like", value, "artXqrs");
            return (Criteria) this;
        }

        public Criteria andArtXqrsNotLike(String value) {
            addCriterion("art_xqrs not like", value, "artXqrs");
            return (Criteria) this;
        }

        public Criteria andArtXqrsIn(List<String> values) {
            addCriterion("art_xqrs in", values, "artXqrs");
            return (Criteria) this;
        }

        public Criteria andArtXqrsNotIn(List<String> values) {
            addCriterion("art_xqrs not in", values, "artXqrs");
            return (Criteria) this;
        }

        public Criteria andArtXqrsBetween(String value1, String value2) {
            addCriterion("art_xqrs between", value1, value2, "artXqrs");
            return (Criteria) this;
        }

        public Criteria andArtXqrsNotBetween(String value1, String value2) {
            addCriterion("art_xqrs not between", value1, value2, "artXqrs");
            return (Criteria) this;
        }

        public Criteria andArtYyrsIsNull() {
            addCriterion("art_yyrs is null");
            return (Criteria) this;
        }

        public Criteria andArtYyrsIsNotNull() {
            addCriterion("art_yyrs is not null");
            return (Criteria) this;
        }

        public Criteria andArtYyrsEqualTo(String value) {
            addCriterion("art_yyrs =", value, "artYyrs");
            return (Criteria) this;
        }

        public Criteria andArtYyrsNotEqualTo(String value) {
            addCriterion("art_yyrs <>", value, "artYyrs");
            return (Criteria) this;
        }

        public Criteria andArtYyrsGreaterThan(String value) {
            addCriterion("art_yyrs >", value, "artYyrs");
            return (Criteria) this;
        }

        public Criteria andArtYyrsGreaterThanOrEqualTo(String value) {
            addCriterion("art_yyrs >=", value, "artYyrs");
            return (Criteria) this;
        }

        public Criteria andArtYyrsLessThan(String value) {
            addCriterion("art_yyrs <", value, "artYyrs");
            return (Criteria) this;
        }

        public Criteria andArtYyrsLessThanOrEqualTo(String value) {
            addCriterion("art_yyrs <=", value, "artYyrs");
            return (Criteria) this;
        }

        public Criteria andArtYyrsLike(String value) {
            addCriterion("art_yyrs like", value, "artYyrs");
            return (Criteria) this;
        }

        public Criteria andArtYyrsNotLike(String value) {
            addCriterion("art_yyrs not like", value, "artYyrs");
            return (Criteria) this;
        }

        public Criteria andArtYyrsIn(List<String> values) {
            addCriterion("art_yyrs in", values, "artYyrs");
            return (Criteria) this;
        }

        public Criteria andArtYyrsNotIn(List<String> values) {
            addCriterion("art_yyrs not in", values, "artYyrs");
            return (Criteria) this;
        }

        public Criteria andArtYyrsBetween(String value1, String value2) {
            addCriterion("art_yyrs between", value1, value2, "artYyrs");
            return (Criteria) this;
        }

        public Criteria andArtYyrsNotBetween(String value1, String value2) {
            addCriterion("art_yyrs not between", value1, value2, "artYyrs");
            return (Criteria) this;
        }

        public Criteria andArtStateIsNull() {
            addCriterion("art_state is null");
            return (Criteria) this;
        }

        public Criteria andArtStateIsNotNull() {
            addCriterion("art_state is not null");
            return (Criteria) this;
        }

        public Criteria andArtStateEqualTo(String value) {
            addCriterion("art_state =", value, "artState");
            return (Criteria) this;
        }

        public Criteria andArtStateNotEqualTo(String value) {
            addCriterion("art_state <>", value, "artState");
            return (Criteria) this;
        }

        public Criteria andArtStateGreaterThan(String value) {
            addCriterion("art_state >", value, "artState");
            return (Criteria) this;
        }

        public Criteria andArtStateGreaterThanOrEqualTo(String value) {
            addCriterion("art_state >=", value, "artState");
            return (Criteria) this;
        }

        public Criteria andArtStateLessThan(String value) {
            addCriterion("art_state <", value, "artState");
            return (Criteria) this;
        }

        public Criteria andArtStateLessThanOrEqualTo(String value) {
            addCriterion("art_state <=", value, "artState");
            return (Criteria) this;
        }

        public Criteria andArtStateLike(String value) {
            addCriterion("art_state like", value, "artState");
            return (Criteria) this;
        }

        public Criteria andArtStateNotLike(String value) {
            addCriterion("art_state not like", value, "artState");
            return (Criteria) this;
        }

        public Criteria andArtStateIn(List<String> values) {
            addCriterion("art_state in", values, "artState");
            return (Criteria) this;
        }

        public Criteria andArtStateNotIn(List<String> values) {
            addCriterion("art_state not in", values, "artState");
            return (Criteria) this;
        }

        public Criteria andArtStateBetween(String value1, String value2) {
            addCriterion("art_state between", value1, value2, "artState");
            return (Criteria) this;
        }

        public Criteria andArtStateNotBetween(String value1, String value2) {
            addCriterion("art_state not between", value1, value2, "artState");
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