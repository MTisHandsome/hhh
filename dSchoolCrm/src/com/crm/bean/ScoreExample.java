package com.crm.bean;

import java.util.ArrayList;
import java.util.List;

public class ScoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScoreExample() {
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

        public Criteria andScoreIdIsNull() {
            addCriterion("score_id is null");
            return (Criteria) this;
        }

        public Criteria andScoreIdIsNotNull() {
            addCriterion("score_id is not null");
            return (Criteria) this;
        }

        public Criteria andScoreIdEqualTo(Integer value) {
            addCriterion("score_id =", value, "scoreId");
            return (Criteria) this;
        }

        public Criteria andScoreIdNotEqualTo(Integer value) {
            addCriterion("score_id <>", value, "scoreId");
            return (Criteria) this;
        }

        public Criteria andScoreIdGreaterThan(Integer value) {
            addCriterion("score_id >", value, "scoreId");
            return (Criteria) this;
        }

        public Criteria andScoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("score_id >=", value, "scoreId");
            return (Criteria) this;
        }

        public Criteria andScoreIdLessThan(Integer value) {
            addCriterion("score_id <", value, "scoreId");
            return (Criteria) this;
        }

        public Criteria andScoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("score_id <=", value, "scoreId");
            return (Criteria) this;
        }

        public Criteria andScoreIdIn(List<Integer> values) {
            addCriterion("score_id in", values, "scoreId");
            return (Criteria) this;
        }

        public Criteria andScoreIdNotIn(List<Integer> values) {
            addCriterion("score_id not in", values, "scoreId");
            return (Criteria) this;
        }

        public Criteria andScoreIdBetween(Integer value1, Integer value2) {
            addCriterion("score_id between", value1, value2, "scoreId");
            return (Criteria) this;
        }

        public Criteria andScoreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("score_id not between", value1, value2, "scoreId");
            return (Criteria) this;
        }

        public Criteria andScoreScheduleIsNull() {
            addCriterion("score_schedule is null");
            return (Criteria) this;
        }

        public Criteria andScoreScheduleIsNotNull() {
            addCriterion("score_schedule is not null");
            return (Criteria) this;
        }

        public Criteria andScoreScheduleEqualTo(Integer value) {
            addCriterion("score_schedule =", value, "scoreSchedule");
            return (Criteria) this;
        }

        public Criteria andScoreScheduleNotEqualTo(Integer value) {
            addCriterion("score_schedule <>", value, "scoreSchedule");
            return (Criteria) this;
        }

        public Criteria andScoreScheduleGreaterThan(Integer value) {
            addCriterion("score_schedule >", value, "scoreSchedule");
            return (Criteria) this;
        }

        public Criteria andScoreScheduleGreaterThanOrEqualTo(Integer value) {
            addCriterion("score_schedule >=", value, "scoreSchedule");
            return (Criteria) this;
        }

        public Criteria andScoreScheduleLessThan(Integer value) {
            addCriterion("score_schedule <", value, "scoreSchedule");
            return (Criteria) this;
        }

        public Criteria andScoreScheduleLessThanOrEqualTo(Integer value) {
            addCriterion("score_schedule <=", value, "scoreSchedule");
            return (Criteria) this;
        }

        public Criteria andScoreScheduleIn(List<Integer> values) {
            addCriterion("score_schedule in", values, "scoreSchedule");
            return (Criteria) this;
        }

        public Criteria andScoreScheduleNotIn(List<Integer> values) {
            addCriterion("score_schedule not in", values, "scoreSchedule");
            return (Criteria) this;
        }

        public Criteria andScoreScheduleBetween(Integer value1, Integer value2) {
            addCriterion("score_schedule between", value1, value2, "scoreSchedule");
            return (Criteria) this;
        }

        public Criteria andScoreScheduleNotBetween(Integer value1, Integer value2) {
            addCriterion("score_schedule not between", value1, value2, "scoreSchedule");
            return (Criteria) this;
        }

        public Criteria andScoreTextIsNull() {
            addCriterion("score_text is null");
            return (Criteria) this;
        }

        public Criteria andScoreTextIsNotNull() {
            addCriterion("score_text is not null");
            return (Criteria) this;
        }

        public Criteria andScoreTextEqualTo(String value) {
            addCriterion("score_text =", value, "scoreText");
            return (Criteria) this;
        }

        public Criteria andScoreTextNotEqualTo(String value) {
            addCriterion("score_text <>", value, "scoreText");
            return (Criteria) this;
        }

        public Criteria andScoreTextGreaterThan(String value) {
            addCriterion("score_text >", value, "scoreText");
            return (Criteria) this;
        }

        public Criteria andScoreTextGreaterThanOrEqualTo(String value) {
            addCriterion("score_text >=", value, "scoreText");
            return (Criteria) this;
        }

        public Criteria andScoreTextLessThan(String value) {
            addCriterion("score_text <", value, "scoreText");
            return (Criteria) this;
        }

        public Criteria andScoreTextLessThanOrEqualTo(String value) {
            addCriterion("score_text <=", value, "scoreText");
            return (Criteria) this;
        }

        public Criteria andScoreTextLike(String value) {
            addCriterion("score_text like", value, "scoreText");
            return (Criteria) this;
        }

        public Criteria andScoreTextNotLike(String value) {
            addCriterion("score_text not like", value, "scoreText");
            return (Criteria) this;
        }

        public Criteria andScoreTextIn(List<String> values) {
            addCriterion("score_text in", values, "scoreText");
            return (Criteria) this;
        }

        public Criteria andScoreTextNotIn(List<String> values) {
            addCriterion("score_text not in", values, "scoreText");
            return (Criteria) this;
        }

        public Criteria andScoreTextBetween(String value1, String value2) {
            addCriterion("score_text between", value1, value2, "scoreText");
            return (Criteria) this;
        }

        public Criteria andScoreTextNotBetween(String value1, String value2) {
            addCriterion("score_text not between", value1, value2, "scoreText");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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