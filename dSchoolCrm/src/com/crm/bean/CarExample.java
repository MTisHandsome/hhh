package com.crm.bean;

import java.util.ArrayList;
import java.util.List;

public class CarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarExample() {
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

        public Criteria andCarIdIsNull() {
            addCriterion("car_id is null");
            return (Criteria) this;
        }

        public Criteria andCarIdIsNotNull() {
            addCriterion("car_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarIdEqualTo(Integer value) {
            addCriterion("car_id =", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotEqualTo(Integer value) {
            addCriterion("car_id <>", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThan(Integer value) {
            addCriterion("car_id >", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_id >=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThan(Integer value) {
            addCriterion("car_id <", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThanOrEqualTo(Integer value) {
            addCriterion("car_id <=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdIn(List<Integer> values) {
            addCriterion("car_id in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotIn(List<Integer> values) {
            addCriterion("car_id not in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdBetween(Integer value1, Integer value2) {
            addCriterion("car_id between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotBetween(Integer value1, Integer value2) {
            addCriterion("car_id not between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andCarCardIsNull() {
            addCriterion("car_card is null");
            return (Criteria) this;
        }

        public Criteria andCarCardIsNotNull() {
            addCriterion("car_card is not null");
            return (Criteria) this;
        }

        public Criteria andCarCardEqualTo(String value) {
            addCriterion("car_card =", value, "carCard");
            return (Criteria) this;
        }

        public Criteria andCarCardNotEqualTo(String value) {
            addCriterion("car_card <>", value, "carCard");
            return (Criteria) this;
        }

        public Criteria andCarCardGreaterThan(String value) {
            addCriterion("car_card >", value, "carCard");
            return (Criteria) this;
        }

        public Criteria andCarCardGreaterThanOrEqualTo(String value) {
            addCriterion("car_card >=", value, "carCard");
            return (Criteria) this;
        }

        public Criteria andCarCardLessThan(String value) {
            addCriterion("car_card <", value, "carCard");
            return (Criteria) this;
        }

        public Criteria andCarCardLessThanOrEqualTo(String value) {
            addCriterion("car_card <=", value, "carCard");
            return (Criteria) this;
        }

        public Criteria andCarCardLike(String value) {
            addCriterion("car_card like", value, "carCard");
            return (Criteria) this;
        }

        public Criteria andCarCardNotLike(String value) {
            addCriterion("car_card not like", value, "carCard");
            return (Criteria) this;
        }

        public Criteria andCarCardIn(List<String> values) {
            addCriterion("car_card in", values, "carCard");
            return (Criteria) this;
        }

        public Criteria andCarCardNotIn(List<String> values) {
            addCriterion("car_card not in", values, "carCard");
            return (Criteria) this;
        }

        public Criteria andCarCardBetween(String value1, String value2) {
            addCriterion("car_card between", value1, value2, "carCard");
            return (Criteria) this;
        }

        public Criteria andCarCardNotBetween(String value1, String value2) {
            addCriterion("car_card not between", value1, value2, "carCard");
            return (Criteria) this;
        }

        public Criteria andCarShapeIsNull() {
            addCriterion("car_shape is null");
            return (Criteria) this;
        }

        public Criteria andCarShapeIsNotNull() {
            addCriterion("car_shape is not null");
            return (Criteria) this;
        }

        public Criteria andCarShapeEqualTo(String value) {
            addCriterion("car_shape =", value, "carShape");
            return (Criteria) this;
        }

        public Criteria andCarShapeNotEqualTo(String value) {
            addCriterion("car_shape <>", value, "carShape");
            return (Criteria) this;
        }

        public Criteria andCarShapeGreaterThan(String value) {
            addCriterion("car_shape >", value, "carShape");
            return (Criteria) this;
        }

        public Criteria andCarShapeGreaterThanOrEqualTo(String value) {
            addCriterion("car_shape >=", value, "carShape");
            return (Criteria) this;
        }

        public Criteria andCarShapeLessThan(String value) {
            addCriterion("car_shape <", value, "carShape");
            return (Criteria) this;
        }

        public Criteria andCarShapeLessThanOrEqualTo(String value) {
            addCriterion("car_shape <=", value, "carShape");
            return (Criteria) this;
        }

        public Criteria andCarShapeLike(String value) {
            addCriterion("car_shape like", value, "carShape");
            return (Criteria) this;
        }

        public Criteria andCarShapeNotLike(String value) {
            addCriterion("car_shape not like", value, "carShape");
            return (Criteria) this;
        }

        public Criteria andCarShapeIn(List<String> values) {
            addCriterion("car_shape in", values, "carShape");
            return (Criteria) this;
        }

        public Criteria andCarShapeNotIn(List<String> values) {
            addCriterion("car_shape not in", values, "carShape");
            return (Criteria) this;
        }

        public Criteria andCarShapeBetween(String value1, String value2) {
            addCriterion("car_shape between", value1, value2, "carShape");
            return (Criteria) this;
        }

        public Criteria andCarShapeNotBetween(String value1, String value2) {
            addCriterion("car_shape not between", value1, value2, "carShape");
            return (Criteria) this;
        }

        public Criteria andRepairIdIsNull() {
            addCriterion("repair_id is null");
            return (Criteria) this;
        }

        public Criteria andRepairIdIsNotNull() {
            addCriterion("repair_id is not null");
            return (Criteria) this;
        }

        public Criteria andRepairIdEqualTo(Integer value) {
            addCriterion("repair_id =", value, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdNotEqualTo(Integer value) {
            addCriterion("repair_id <>", value, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdGreaterThan(Integer value) {
            addCriterion("repair_id >", value, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("repair_id >=", value, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdLessThan(Integer value) {
            addCriterion("repair_id <", value, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdLessThanOrEqualTo(Integer value) {
            addCriterion("repair_id <=", value, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdIn(List<Integer> values) {
            addCriterion("repair_id in", values, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdNotIn(List<Integer> values) {
            addCriterion("repair_id not in", values, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdBetween(Integer value1, Integer value2) {
            addCriterion("repair_id between", value1, value2, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdNotBetween(Integer value1, Integer value2) {
            addCriterion("repair_id not between", value1, value2, "repairId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdIsNull() {
            addCriterion("school_id is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIdIsNotNull() {
            addCriterion("school_id is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolIdEqualTo(Integer value) {
            addCriterion("school_id =", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotEqualTo(Integer value) {
            addCriterion("school_id <>", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdGreaterThan(Integer value) {
            addCriterion("school_id >", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("school_id >=", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdLessThan(Integer value) {
            addCriterion("school_id <", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdLessThanOrEqualTo(Integer value) {
            addCriterion("school_id <=", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdIn(List<Integer> values) {
            addCriterion("school_id in", values, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotIn(List<Integer> values) {
            addCriterion("school_id not in", values, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdBetween(Integer value1, Integer value2) {
            addCriterion("school_id between", value1, value2, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotBetween(Integer value1, Integer value2) {
            addCriterion("school_id not between", value1, value2, "schoolId");
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