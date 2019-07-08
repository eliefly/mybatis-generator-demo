package com.vispractice.vacp.pipeline.domain.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReleaseImageInstanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReleaseImageInstanceExample() {
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

        public Criteria andReleaseImageIdIsNull() {
            addCriterion("RELEASE_IMAGE_ID is null");
            return (Criteria) this;
        }

        public Criteria andReleaseImageIdIsNotNull() {
            addCriterion("RELEASE_IMAGE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseImageIdEqualTo(Long value) {
            addCriterion("RELEASE_IMAGE_ID =", value, "releaseImageId");
            return (Criteria) this;
        }

        public Criteria andReleaseImageIdNotEqualTo(Long value) {
            addCriterion("RELEASE_IMAGE_ID <>", value, "releaseImageId");
            return (Criteria) this;
        }

        public Criteria andReleaseImageIdGreaterThan(Long value) {
            addCriterion("RELEASE_IMAGE_ID >", value, "releaseImageId");
            return (Criteria) this;
        }

        public Criteria andReleaseImageIdGreaterThanOrEqualTo(Long value) {
            addCriterion("RELEASE_IMAGE_ID >=", value, "releaseImageId");
            return (Criteria) this;
        }

        public Criteria andReleaseImageIdLessThan(Long value) {
            addCriterion("RELEASE_IMAGE_ID <", value, "releaseImageId");
            return (Criteria) this;
        }

        public Criteria andReleaseImageIdLessThanOrEqualTo(Long value) {
            addCriterion("RELEASE_IMAGE_ID <=", value, "releaseImageId");
            return (Criteria) this;
        }

        public Criteria andReleaseImageIdIn(List<Long> values) {
            addCriterion("RELEASE_IMAGE_ID in", values, "releaseImageId");
            return (Criteria) this;
        }

        public Criteria andReleaseImageIdNotIn(List<Long> values) {
            addCriterion("RELEASE_IMAGE_ID not in", values, "releaseImageId");
            return (Criteria) this;
        }

        public Criteria andReleaseImageIdBetween(Long value1, Long value2) {
            addCriterion("RELEASE_IMAGE_ID between", value1, value2, "releaseImageId");
            return (Criteria) this;
        }

        public Criteria andReleaseImageIdNotBetween(Long value1, Long value2) {
            addCriterion("RELEASE_IMAGE_ID not between", value1, value2, "releaseImageId");
            return (Criteria) this;
        }

        public Criteria andPipelineInstanceIdIsNull() {
            addCriterion("PIPELINE_INSTANCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andPipelineInstanceIdIsNotNull() {
            addCriterion("PIPELINE_INSTANCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPipelineInstanceIdEqualTo(Long value) {
            addCriterion("PIPELINE_INSTANCE_ID =", value, "pipelineInstanceId");
            return (Criteria) this;
        }

        public Criteria andPipelineInstanceIdNotEqualTo(Long value) {
            addCriterion("PIPELINE_INSTANCE_ID <>", value, "pipelineInstanceId");
            return (Criteria) this;
        }

        public Criteria andPipelineInstanceIdGreaterThan(Long value) {
            addCriterion("PIPELINE_INSTANCE_ID >", value, "pipelineInstanceId");
            return (Criteria) this;
        }

        public Criteria andPipelineInstanceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PIPELINE_INSTANCE_ID >=", value, "pipelineInstanceId");
            return (Criteria) this;
        }

        public Criteria andPipelineInstanceIdLessThan(Long value) {
            addCriterion("PIPELINE_INSTANCE_ID <", value, "pipelineInstanceId");
            return (Criteria) this;
        }

        public Criteria andPipelineInstanceIdLessThanOrEqualTo(Long value) {
            addCriterion("PIPELINE_INSTANCE_ID <=", value, "pipelineInstanceId");
            return (Criteria) this;
        }

        public Criteria andPipelineInstanceIdIn(List<Long> values) {
            addCriterion("PIPELINE_INSTANCE_ID in", values, "pipelineInstanceId");
            return (Criteria) this;
        }

        public Criteria andPipelineInstanceIdNotIn(List<Long> values) {
            addCriterion("PIPELINE_INSTANCE_ID not in", values, "pipelineInstanceId");
            return (Criteria) this;
        }

        public Criteria andPipelineInstanceIdBetween(Long value1, Long value2) {
            addCriterion("PIPELINE_INSTANCE_ID between", value1, value2, "pipelineInstanceId");
            return (Criteria) this;
        }

        public Criteria andPipelineInstanceIdNotBetween(Long value1, Long value2) {
            addCriterion("PIPELINE_INSTANCE_ID not between", value1, value2, "pipelineInstanceId");
            return (Criteria) this;
        }

        public Criteria andReleasePlanInstanceIdIsNull() {
            addCriterion("RELEASE_PLAN_INSTANCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andReleasePlanInstanceIdIsNotNull() {
            addCriterion("RELEASE_PLAN_INSTANCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andReleasePlanInstanceIdEqualTo(Long value) {
            addCriterion("RELEASE_PLAN_INSTANCE_ID =", value, "releasePlanInstanceId");
            return (Criteria) this;
        }

        public Criteria andReleasePlanInstanceIdNotEqualTo(Long value) {
            addCriterion("RELEASE_PLAN_INSTANCE_ID <>", value, "releasePlanInstanceId");
            return (Criteria) this;
        }

        public Criteria andReleasePlanInstanceIdGreaterThan(Long value) {
            addCriterion("RELEASE_PLAN_INSTANCE_ID >", value, "releasePlanInstanceId");
            return (Criteria) this;
        }

        public Criteria andReleasePlanInstanceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("RELEASE_PLAN_INSTANCE_ID >=", value, "releasePlanInstanceId");
            return (Criteria) this;
        }

        public Criteria andReleasePlanInstanceIdLessThan(Long value) {
            addCriterion("RELEASE_PLAN_INSTANCE_ID <", value, "releasePlanInstanceId");
            return (Criteria) this;
        }

        public Criteria andReleasePlanInstanceIdLessThanOrEqualTo(Long value) {
            addCriterion("RELEASE_PLAN_INSTANCE_ID <=", value, "releasePlanInstanceId");
            return (Criteria) this;
        }

        public Criteria andReleasePlanInstanceIdIn(List<Long> values) {
            addCriterion("RELEASE_PLAN_INSTANCE_ID in", values, "releasePlanInstanceId");
            return (Criteria) this;
        }

        public Criteria andReleasePlanInstanceIdNotIn(List<Long> values) {
            addCriterion("RELEASE_PLAN_INSTANCE_ID not in", values, "releasePlanInstanceId");
            return (Criteria) this;
        }

        public Criteria andReleasePlanInstanceIdBetween(Long value1, Long value2) {
            addCriterion("RELEASE_PLAN_INSTANCE_ID between", value1, value2, "releasePlanInstanceId");
            return (Criteria) this;
        }

        public Criteria andReleasePlanInstanceIdNotBetween(Long value1, Long value2) {
            addCriterion("RELEASE_PLAN_INSTANCE_ID not between", value1, value2, "releasePlanInstanceId");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("START_TIME =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("START_TIME <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("START_TIME >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("START_TIME >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("START_TIME <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("START_TIME <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("START_TIME in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("START_TIME not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("START_TIME between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("START_TIME not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIsNull() {
            addCriterion("FINISH_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIsNotNull() {
            addCriterion("FINISH_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFinishTimeEqualTo(Date value) {
            addCriterion("FINISH_TIME =", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotEqualTo(Date value) {
            addCriterion("FINISH_TIME <>", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThan(Date value) {
            addCriterion("FINISH_TIME >", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FINISH_TIME >=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThan(Date value) {
            addCriterion("FINISH_TIME <", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThanOrEqualTo(Date value) {
            addCriterion("FINISH_TIME <=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIn(List<Date> values) {
            addCriterion("FINISH_TIME in", values, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotIn(List<Date> values) {
            addCriterion("FINISH_TIME not in", values, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeBetween(Date value1, Date value2) {
            addCriterion("FINISH_TIME between", value1, value2, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotBetween(Date value1, Date value2) {
            addCriterion("FINISH_TIME not between", value1, value2, "finishTime");
            return (Criteria) this;
        }

        public Criteria andResultIsNull() {
            addCriterion("RESULT is null");
            return (Criteria) this;
        }

        public Criteria andResultIsNotNull() {
            addCriterion("RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andResultEqualTo(String value) {
            addCriterion("RESULT =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(String value) {
            addCriterion("RESULT <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(String value) {
            addCriterion("RESULT >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(String value) {
            addCriterion("RESULT >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(String value) {
            addCriterion("RESULT <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(String value) {
            addCriterion("RESULT <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLike(String value) {
            addCriterion("RESULT like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotLike(String value) {
            addCriterion("RESULT not like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<String> values) {
            addCriterion("RESULT in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<String> values) {
            addCriterion("RESULT not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(String value1, String value2) {
            addCriterion("RESULT between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(String value1, String value2) {
            addCriterion("RESULT not between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andDurationIsNull() {
            addCriterion("DURATION is null");
            return (Criteria) this;
        }

        public Criteria andDurationIsNotNull() {
            addCriterion("DURATION is not null");
            return (Criteria) this;
        }

        public Criteria andDurationEqualTo(Long value) {
            addCriterion("DURATION =", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotEqualTo(Long value) {
            addCriterion("DURATION <>", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThan(Long value) {
            addCriterion("DURATION >", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThanOrEqualTo(Long value) {
            addCriterion("DURATION >=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThan(Long value) {
            addCriterion("DURATION <", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThanOrEqualTo(Long value) {
            addCriterion("DURATION <=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationIn(List<Long> values) {
            addCriterion("DURATION in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotIn(List<Long> values) {
            addCriterion("DURATION not in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationBetween(Long value1, Long value2) {
            addCriterion("DURATION between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotBetween(Long value1, Long value2) {
            addCriterion("DURATION not between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("STATE like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("STATE not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("STATE not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andCurrentIsNull() {
            addCriterion("CURRENT is null");
            return (Criteria) this;
        }

        public Criteria andCurrentIsNotNull() {
            addCriterion("CURRENT is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentEqualTo(String value) {
            addCriterion("CURRENT =", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentNotEqualTo(String value) {
            addCriterion("CURRENT <>", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentGreaterThan(String value) {
            addCriterion("CURRENT >", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENT >=", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentLessThan(String value) {
            addCriterion("CURRENT <", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentLessThanOrEqualTo(String value) {
            addCriterion("CURRENT <=", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentLike(String value) {
            addCriterion("CURRENT like", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentNotLike(String value) {
            addCriterion("CURRENT not like", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentIn(List<String> values) {
            addCriterion("CURRENT in", values, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentNotIn(List<String> values) {
            addCriterion("CURRENT not in", values, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentBetween(String value1, String value2) {
            addCriterion("CURRENT between", value1, value2, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentNotBetween(String value1, String value2) {
            addCriterion("CURRENT not between", value1, value2, "current");
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

        public Criteria andExecutorIsNull() {
            addCriterion("EXECUTOR is null");
            return (Criteria) this;
        }

        public Criteria andExecutorIsNotNull() {
            addCriterion("EXECUTOR is not null");
            return (Criteria) this;
        }

        public Criteria andExecutorEqualTo(Long value) {
            addCriterion("EXECUTOR =", value, "executor");
            return (Criteria) this;
        }

        public Criteria andExecutorNotEqualTo(Long value) {
            addCriterion("EXECUTOR <>", value, "executor");
            return (Criteria) this;
        }

        public Criteria andExecutorGreaterThan(Long value) {
            addCriterion("EXECUTOR >", value, "executor");
            return (Criteria) this;
        }

        public Criteria andExecutorGreaterThanOrEqualTo(Long value) {
            addCriterion("EXECUTOR >=", value, "executor");
            return (Criteria) this;
        }

        public Criteria andExecutorLessThan(Long value) {
            addCriterion("EXECUTOR <", value, "executor");
            return (Criteria) this;
        }

        public Criteria andExecutorLessThanOrEqualTo(Long value) {
            addCriterion("EXECUTOR <=", value, "executor");
            return (Criteria) this;
        }

        public Criteria andExecutorIn(List<Long> values) {
            addCriterion("EXECUTOR in", values, "executor");
            return (Criteria) this;
        }

        public Criteria andExecutorNotIn(List<Long> values) {
            addCriterion("EXECUTOR not in", values, "executor");
            return (Criteria) this;
        }

        public Criteria andExecutorBetween(Long value1, Long value2) {
            addCriterion("EXECUTOR between", value1, value2, "executor");
            return (Criteria) this;
        }

        public Criteria andExecutorNotBetween(Long value1, Long value2) {
            addCriterion("EXECUTOR not between", value1, value2, "executor");
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