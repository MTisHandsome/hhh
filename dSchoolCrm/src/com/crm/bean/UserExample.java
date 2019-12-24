package com.crm.bean;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserEmalIsNull() {
            addCriterion("user_emal is null");
            return (Criteria) this;
        }

        public Criteria andUserEmalIsNotNull() {
            addCriterion("user_emal is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmalEqualTo(String value) {
            addCriterion("user_emal =", value, "userEmal");
            return (Criteria) this;
        }

        public Criteria andUserEmalNotEqualTo(String value) {
            addCriterion("user_emal <>", value, "userEmal");
            return (Criteria) this;
        }

        public Criteria andUserEmalGreaterThan(String value) {
            addCriterion("user_emal >", value, "userEmal");
            return (Criteria) this;
        }

        public Criteria andUserEmalGreaterThanOrEqualTo(String value) {
            addCriterion("user_emal >=", value, "userEmal");
            return (Criteria) this;
        }

        public Criteria andUserEmalLessThan(String value) {
            addCriterion("user_emal <", value, "userEmal");
            return (Criteria) this;
        }

        public Criteria andUserEmalLessThanOrEqualTo(String value) {
            addCriterion("user_emal <=", value, "userEmal");
            return (Criteria) this;
        }

        public Criteria andUserEmalLike(String value) {
            addCriterion("user_emal like", value, "userEmal");
            return (Criteria) this;
        }

        public Criteria andUserEmalNotLike(String value) {
            addCriterion("user_emal not like", value, "userEmal");
            return (Criteria) this;
        }

        public Criteria andUserEmalIn(List<String> values) {
            addCriterion("user_emal in", values, "userEmal");
            return (Criteria) this;
        }

        public Criteria andUserEmalNotIn(List<String> values) {
            addCriterion("user_emal not in", values, "userEmal");
            return (Criteria) this;
        }

        public Criteria andUserEmalBetween(String value1, String value2) {
            addCriterion("user_emal between", value1, value2, "userEmal");
            return (Criteria) this;
        }

        public Criteria andUserEmalNotBetween(String value1, String value2) {
            addCriterion("user_emal not between", value1, value2, "userEmal");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("user_password is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("user_password is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("user_password =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("user_password <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("user_password >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user_password >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("user_password <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("user_password <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("user_password like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("user_password not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("user_password in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("user_password not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("user_password between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("user_password not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNull() {
            addCriterion("user_sex is null");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNotNull() {
            addCriterion("user_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUserSexEqualTo(String value) {
            addCriterion("user_sex =", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotEqualTo(String value) {
            addCriterion("user_sex <>", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThan(String value) {
            addCriterion("user_sex >", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThanOrEqualTo(String value) {
            addCriterion("user_sex >=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThan(String value) {
            addCriterion("user_sex <", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThanOrEqualTo(String value) {
            addCriterion("user_sex <=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLike(String value) {
            addCriterion("user_sex like", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotLike(String value) {
            addCriterion("user_sex not like", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexIn(List<String> values) {
            addCriterion("user_sex in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotIn(List<String> values) {
            addCriterion("user_sex not in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexBetween(String value1, String value2) {
            addCriterion("user_sex between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotBetween(String value1, String value2) {
            addCriterion("user_sex not between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserDateIsNull() {
            addCriterion("user_date is null");
            return (Criteria) this;
        }

        public Criteria andUserDateIsNotNull() {
            addCriterion("user_date is not null");
            return (Criteria) this;
        }

        public Criteria andUserDateEqualTo(String value) {
            addCriterion("user_date =", value, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateNotEqualTo(String value) {
            addCriterion("user_date <>", value, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateGreaterThan(String value) {
            addCriterion("user_date >", value, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateGreaterThanOrEqualTo(String value) {
            addCriterion("user_date >=", value, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateLessThan(String value) {
            addCriterion("user_date <", value, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateLessThanOrEqualTo(String value) {
            addCriterion("user_date <=", value, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateLike(String value) {
            addCriterion("user_date like", value, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateNotLike(String value) {
            addCriterion("user_date not like", value, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateIn(List<String> values) {
            addCriterion("user_date in", values, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateNotIn(List<String> values) {
            addCriterion("user_date not in", values, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateBetween(String value1, String value2) {
            addCriterion("user_date between", value1, value2, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateNotBetween(String value1, String value2) {
            addCriterion("user_date not between", value1, value2, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserScheduleIsNull() {
            addCriterion("user_schedule is null");
            return (Criteria) this;
        }

        public Criteria andUserScheduleIsNotNull() {
            addCriterion("user_schedule is not null");
            return (Criteria) this;
        }

        public Criteria andUserScheduleEqualTo(Integer value) {
            addCriterion("user_schedule =", value, "userSchedule");
            return (Criteria) this;
        }

        public Criteria andUserScheduleNotEqualTo(Integer value) {
            addCriterion("user_schedule <>", value, "userSchedule");
            return (Criteria) this;
        }

        public Criteria andUserScheduleGreaterThan(Integer value) {
            addCriterion("user_schedule >", value, "userSchedule");
            return (Criteria) this;
        }

        public Criteria andUserScheduleGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_schedule >=", value, "userSchedule");
            return (Criteria) this;
        }

        public Criteria andUserScheduleLessThan(Integer value) {
            addCriterion("user_schedule <", value, "userSchedule");
            return (Criteria) this;
        }

        public Criteria andUserScheduleLessThanOrEqualTo(Integer value) {
            addCriterion("user_schedule <=", value, "userSchedule");
            return (Criteria) this;
        }

        public Criteria andUserScheduleIn(List<Integer> values) {
            addCriterion("user_schedule in", values, "userSchedule");
            return (Criteria) this;
        }

        public Criteria andUserScheduleNotIn(List<Integer> values) {
            addCriterion("user_schedule not in", values, "userSchedule");
            return (Criteria) this;
        }

        public Criteria andUserScheduleBetween(Integer value1, Integer value2) {
            addCriterion("user_schedule between", value1, value2, "userSchedule");
            return (Criteria) this;
        }

        public Criteria andUserScheduleNotBetween(Integer value1, Integer value2) {
            addCriterion("user_schedule not between", value1, value2, "userSchedule");
            return (Criteria) this;
        }

        public Criteria andTeaUseridIsNull() {
            addCriterion("tea_userid is null");
            return (Criteria) this;
        }

        public Criteria andTeaUseridIsNotNull() {
            addCriterion("tea_userid is not null");
            return (Criteria) this;
        }

        public Criteria andTeaUseridEqualTo(Integer value) {
            addCriterion("tea_userid =", value, "teaUserid");
            return (Criteria) this;
        }

        public Criteria andTeaUseridNotEqualTo(Integer value) {
            addCriterion("tea_userid <>", value, "teaUserid");
            return (Criteria) this;
        }

        public Criteria andTeaUseridGreaterThan(Integer value) {
            addCriterion("tea_userid >", value, "teaUserid");
            return (Criteria) this;
        }

        public Criteria andTeaUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("tea_userid >=", value, "teaUserid");
            return (Criteria) this;
        }

        public Criteria andTeaUseridLessThan(Integer value) {
            addCriterion("tea_userid <", value, "teaUserid");
            return (Criteria) this;
        }

        public Criteria andTeaUseridLessThanOrEqualTo(Integer value) {
            addCriterion("tea_userid <=", value, "teaUserid");
            return (Criteria) this;
        }

        public Criteria andTeaUseridIn(List<Integer> values) {
            addCriterion("tea_userid in", values, "teaUserid");
            return (Criteria) this;
        }

        public Criteria andTeaUseridNotIn(List<Integer> values) {
            addCriterion("tea_userid not in", values, "teaUserid");
            return (Criteria) this;
        }

        public Criteria andTeaUseridBetween(Integer value1, Integer value2) {
            addCriterion("tea_userid between", value1, value2, "teaUserid");
            return (Criteria) this;
        }

        public Criteria andTeaUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("tea_userid not between", value1, value2, "teaUserid");
            return (Criteria) this;
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