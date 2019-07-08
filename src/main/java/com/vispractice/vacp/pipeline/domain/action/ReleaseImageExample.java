package com.vispractice.vacp.pipeline.domain.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReleaseImageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReleaseImageExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNull() {
            addCriterion("TASK_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("TASK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(Long value) {
            addCriterion("TASK_ID =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(Long value) {
            addCriterion("TASK_ID <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(Long value) {
            addCriterion("TASK_ID >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(Long value) {
            addCriterion("TASK_ID >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(Long value) {
            addCriterion("TASK_ID <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(Long value) {
            addCriterion("TASK_ID <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<Long> values) {
            addCriterion("TASK_ID in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<Long> values) {
            addCriterion("TASK_ID not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(Long value1, Long value2) {
            addCriterion("TASK_ID between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(Long value1, Long value2) {
            addCriterion("TASK_ID not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andPipelineTypeIsNull() {
            addCriterion("PIPELINE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPipelineTypeIsNotNull() {
            addCriterion("PIPELINE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPipelineTypeEqualTo(String value) {
            addCriterion("PIPELINE_TYPE =", value, "pipelineType");
            return (Criteria) this;
        }

        public Criteria andPipelineTypeNotEqualTo(String value) {
            addCriterion("PIPELINE_TYPE <>", value, "pipelineType");
            return (Criteria) this;
        }

        public Criteria andPipelineTypeGreaterThan(String value) {
            addCriterion("PIPELINE_TYPE >", value, "pipelineType");
            return (Criteria) this;
        }

        public Criteria andPipelineTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PIPELINE_TYPE >=", value, "pipelineType");
            return (Criteria) this;
        }

        public Criteria andPipelineTypeLessThan(String value) {
            addCriterion("PIPELINE_TYPE <", value, "pipelineType");
            return (Criteria) this;
        }

        public Criteria andPipelineTypeLessThanOrEqualTo(String value) {
            addCriterion("PIPELINE_TYPE <=", value, "pipelineType");
            return (Criteria) this;
        }

        public Criteria andPipelineTypeLike(String value) {
            addCriterion("PIPELINE_TYPE like", value, "pipelineType");
            return (Criteria) this;
        }

        public Criteria andPipelineTypeNotLike(String value) {
            addCriterion("PIPELINE_TYPE not like", value, "pipelineType");
            return (Criteria) this;
        }

        public Criteria andPipelineTypeIn(List<String> values) {
            addCriterion("PIPELINE_TYPE in", values, "pipelineType");
            return (Criteria) this;
        }

        public Criteria andPipelineTypeNotIn(List<String> values) {
            addCriterion("PIPELINE_TYPE not in", values, "pipelineType");
            return (Criteria) this;
        }

        public Criteria andPipelineTypeBetween(String value1, String value2) {
            addCriterion("PIPELINE_TYPE between", value1, value2, "pipelineType");
            return (Criteria) this;
        }

        public Criteria andPipelineTypeNotBetween(String value1, String value2) {
            addCriterion("PIPELINE_TYPE not between", value1, value2, "pipelineType");
            return (Criteria) this;
        }

        public Criteria andReleaseIsNull() {
            addCriterion("RELEASE is null");
            return (Criteria) this;
        }

        public Criteria andReleaseIsNotNull() {
            addCriterion("RELEASE is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseEqualTo(String value) {
            addCriterion("RELEASE =", value, "release");
            return (Criteria) this;
        }

        public Criteria andReleaseNotEqualTo(String value) {
            addCriterion("RELEASE <>", value, "release");
            return (Criteria) this;
        }

        public Criteria andReleaseGreaterThan(String value) {
            addCriterion("RELEASE >", value, "release");
            return (Criteria) this;
        }

        public Criteria andReleaseGreaterThanOrEqualTo(String value) {
            addCriterion("RELEASE >=", value, "release");
            return (Criteria) this;
        }

        public Criteria andReleaseLessThan(String value) {
            addCriterion("RELEASE <", value, "release");
            return (Criteria) this;
        }

        public Criteria andReleaseLessThanOrEqualTo(String value) {
            addCriterion("RELEASE <=", value, "release");
            return (Criteria) this;
        }

        public Criteria andReleaseLike(String value) {
            addCriterion("RELEASE like", value, "release");
            return (Criteria) this;
        }

        public Criteria andReleaseNotLike(String value) {
            addCriterion("RELEASE not like", value, "release");
            return (Criteria) this;
        }

        public Criteria andReleaseIn(List<String> values) {
            addCriterion("RELEASE in", values, "release");
            return (Criteria) this;
        }

        public Criteria andReleaseNotIn(List<String> values) {
            addCriterion("RELEASE not in", values, "release");
            return (Criteria) this;
        }

        public Criteria andReleaseBetween(String value1, String value2) {
            addCriterion("RELEASE between", value1, value2, "release");
            return (Criteria) this;
        }

        public Criteria andReleaseNotBetween(String value1, String value2) {
            addCriterion("RELEASE not between", value1, value2, "release");
            return (Criteria) this;
        }

        public Criteria andMarkIsNull() {
            addCriterion("MARK is null");
            return (Criteria) this;
        }

        public Criteria andMarkIsNotNull() {
            addCriterion("MARK is not null");
            return (Criteria) this;
        }

        public Criteria andMarkEqualTo(String value) {
            addCriterion("MARK =", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotEqualTo(String value) {
            addCriterion("MARK <>", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThan(String value) {
            addCriterion("MARK >", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThanOrEqualTo(String value) {
            addCriterion("MARK >=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThan(String value) {
            addCriterion("MARK <", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThanOrEqualTo(String value) {
            addCriterion("MARK <=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLike(String value) {
            addCriterion("MARK like", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotLike(String value) {
            addCriterion("MARK not like", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkIn(List<String> values) {
            addCriterion("MARK in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotIn(List<String> values) {
            addCriterion("MARK not in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkBetween(String value1, String value2) {
            addCriterion("MARK between", value1, value2, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotBetween(String value1, String value2) {
            addCriterion("MARK not between", value1, value2, "mark");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("CREATED_BY is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("CREATED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(Long value) {
            addCriterion("CREATED_BY =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(Long value) {
            addCriterion("CREATED_BY <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(Long value) {
            addCriterion("CREATED_BY >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(Long value) {
            addCriterion("CREATED_BY >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(Long value) {
            addCriterion("CREATED_BY <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(Long value) {
            addCriterion("CREATED_BY <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<Long> values) {
            addCriterion("CREATED_BY in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<Long> values) {
            addCriterion("CREATED_BY not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(Long value1, Long value2) {
            addCriterion("CREATED_BY between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(Long value1, Long value2) {
            addCriterion("CREATED_BY not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreationDateIsNull() {
            addCriterion("CREATION_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreationDateIsNotNull() {
            addCriterion("CREATION_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreationDateEqualTo(Date value) {
            addCriterion("CREATION_DATE =", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotEqualTo(Date value) {
            addCriterion("CREATION_DATE <>", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThan(Date value) {
            addCriterion("CREATION_DATE >", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATION_DATE >=", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThan(Date value) {
            addCriterion("CREATION_DATE <", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATION_DATE <=", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateIn(List<Date> values) {
            addCriterion("CREATION_DATE in", values, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotIn(List<Date> values) {
            addCriterion("CREATION_DATE not in", values, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateBetween(Date value1, Date value2) {
            addCriterion("CREATION_DATE between", value1, value2, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATION_DATE not between", value1, value2, "creationDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByIsNull() {
            addCriterion("LAST_UPDATED_BY is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByIsNotNull() {
            addCriterion("LAST_UPDATED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByEqualTo(Long value) {
            addCriterion("LAST_UPDATED_BY =", value, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByNotEqualTo(Long value) {
            addCriterion("LAST_UPDATED_BY <>", value, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByGreaterThan(Long value) {
            addCriterion("LAST_UPDATED_BY >", value, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByGreaterThanOrEqualTo(Long value) {
            addCriterion("LAST_UPDATED_BY >=", value, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByLessThan(Long value) {
            addCriterion("LAST_UPDATED_BY <", value, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByLessThanOrEqualTo(Long value) {
            addCriterion("LAST_UPDATED_BY <=", value, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByIn(List<Long> values) {
            addCriterion("LAST_UPDATED_BY in", values, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByNotIn(List<Long> values) {
            addCriterion("LAST_UPDATED_BY not in", values, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByBetween(Long value1, Long value2) {
            addCriterion("LAST_UPDATED_BY between", value1, value2, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByNotBetween(Long value1, Long value2) {
            addCriterion("LAST_UPDATED_BY not between", value1, value2, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedDateIsNull() {
            addCriterion("LAST_UPDATED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedDateIsNotNull() {
            addCriterion("LAST_UPDATED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedDateEqualTo(Date value) {
            addCriterion("LAST_UPDATED_DATE =", value, "lastUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedDateNotEqualTo(Date value) {
            addCriterion("LAST_UPDATED_DATE <>", value, "lastUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedDateGreaterThan(Date value) {
            addCriterion("LAST_UPDATED_DATE >", value, "lastUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATED_DATE >=", value, "lastUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedDateLessThan(Date value) {
            addCriterion("LAST_UPDATED_DATE <", value, "lastUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedDateLessThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATED_DATE <=", value, "lastUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedDateIn(List<Date> values) {
            addCriterion("LAST_UPDATED_DATE in", values, "lastUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedDateNotIn(List<Date> values) {
            addCriterion("LAST_UPDATED_DATE not in", values, "lastUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedDateBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATED_DATE between", value1, value2, "lastUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedDateNotBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATED_DATE not between", value1, value2, "lastUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andEnabledFlagIsNull() {
            addCriterion("ENABLED_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andEnabledFlagIsNotNull() {
            addCriterion("ENABLED_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledFlagEqualTo(String value) {
            addCriterion("ENABLED_FLAG =", value, "enabledFlag");
            return (Criteria) this;
        }

        public Criteria andEnabledFlagNotEqualTo(String value) {
            addCriterion("ENABLED_FLAG <>", value, "enabledFlag");
            return (Criteria) this;
        }

        public Criteria andEnabledFlagGreaterThan(String value) {
            addCriterion("ENABLED_FLAG >", value, "enabledFlag");
            return (Criteria) this;
        }

        public Criteria andEnabledFlagGreaterThanOrEqualTo(String value) {
            addCriterion("ENABLED_FLAG >=", value, "enabledFlag");
            return (Criteria) this;
        }

        public Criteria andEnabledFlagLessThan(String value) {
            addCriterion("ENABLED_FLAG <", value, "enabledFlag");
            return (Criteria) this;
        }

        public Criteria andEnabledFlagLessThanOrEqualTo(String value) {
            addCriterion("ENABLED_FLAG <=", value, "enabledFlag");
            return (Criteria) this;
        }

        public Criteria andEnabledFlagLike(String value) {
            addCriterion("ENABLED_FLAG like", value, "enabledFlag");
            return (Criteria) this;
        }

        public Criteria andEnabledFlagNotLike(String value) {
            addCriterion("ENABLED_FLAG not like", value, "enabledFlag");
            return (Criteria) this;
        }

        public Criteria andEnabledFlagIn(List<String> values) {
            addCriterion("ENABLED_FLAG in", values, "enabledFlag");
            return (Criteria) this;
        }

        public Criteria andEnabledFlagNotIn(List<String> values) {
            addCriterion("ENABLED_FLAG not in", values, "enabledFlag");
            return (Criteria) this;
        }

        public Criteria andEnabledFlagBetween(String value1, String value2) {
            addCriterion("ENABLED_FLAG between", value1, value2, "enabledFlag");
            return (Criteria) this;
        }

        public Criteria andEnabledFlagNotBetween(String value1, String value2) {
            addCriterion("ENABLED_FLAG not between", value1, value2, "enabledFlag");
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