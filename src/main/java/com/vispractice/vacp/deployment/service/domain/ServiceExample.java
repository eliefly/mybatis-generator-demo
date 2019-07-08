package com.vispractice.vacp.deployment.service.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServiceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServiceExample() {
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

        public Criteria andUuidIsNull() {
            addCriterion("UUID is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("UUID is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("UUID =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("UUID <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("UUID >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("UUID >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("UUID <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("UUID <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion("UUID like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion("UUID not like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("UUID in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("UUID not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("UUID between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("UUID not between", value1, value2, "uuid");
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

        public Criteria andCodeIsNull() {
            addCriterion("CODE is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("CODE =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("CODE <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("CODE >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CODE >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("CODE <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("CODE <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("CODE like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("CODE not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("CODE in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("CODE not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("CODE between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("CODE not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andDeploymentIdIsNull() {
            addCriterion("DEPLOYMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andDeploymentIdIsNotNull() {
            addCriterion("DEPLOYMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDeploymentIdEqualTo(Long value) {
            addCriterion("DEPLOYMENT_ID =", value, "deploymentId");
            return (Criteria) this;
        }

        public Criteria andDeploymentIdNotEqualTo(Long value) {
            addCriterion("DEPLOYMENT_ID <>", value, "deploymentId");
            return (Criteria) this;
        }

        public Criteria andDeploymentIdGreaterThan(Long value) {
            addCriterion("DEPLOYMENT_ID >", value, "deploymentId");
            return (Criteria) this;
        }

        public Criteria andDeploymentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("DEPLOYMENT_ID >=", value, "deploymentId");
            return (Criteria) this;
        }

        public Criteria andDeploymentIdLessThan(Long value) {
            addCriterion("DEPLOYMENT_ID <", value, "deploymentId");
            return (Criteria) this;
        }

        public Criteria andDeploymentIdLessThanOrEqualTo(Long value) {
            addCriterion("DEPLOYMENT_ID <=", value, "deploymentId");
            return (Criteria) this;
        }

        public Criteria andDeploymentIdIn(List<Long> values) {
            addCriterion("DEPLOYMENT_ID in", values, "deploymentId");
            return (Criteria) this;
        }

        public Criteria andDeploymentIdNotIn(List<Long> values) {
            addCriterion("DEPLOYMENT_ID not in", values, "deploymentId");
            return (Criteria) this;
        }

        public Criteria andDeploymentIdBetween(Long value1, Long value2) {
            addCriterion("DEPLOYMENT_ID between", value1, value2, "deploymentId");
            return (Criteria) this;
        }

        public Criteria andDeploymentIdNotBetween(Long value1, Long value2) {
            addCriterion("DEPLOYMENT_ID not between", value1, value2, "deploymentId");
            return (Criteria) this;
        }

        public Criteria andImageIdIsNull() {
            addCriterion("IMAGE_ID is null");
            return (Criteria) this;
        }

        public Criteria andImageIdIsNotNull() {
            addCriterion("IMAGE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andImageIdEqualTo(Long value) {
            addCriterion("IMAGE_ID =", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdNotEqualTo(Long value) {
            addCriterion("IMAGE_ID <>", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdGreaterThan(Long value) {
            addCriterion("IMAGE_ID >", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdGreaterThanOrEqualTo(Long value) {
            addCriterion("IMAGE_ID >=", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdLessThan(Long value) {
            addCriterion("IMAGE_ID <", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdLessThanOrEqualTo(Long value) {
            addCriterion("IMAGE_ID <=", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdIn(List<Long> values) {
            addCriterion("IMAGE_ID in", values, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdNotIn(List<Long> values) {
            addCriterion("IMAGE_ID not in", values, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdBetween(Long value1, Long value2) {
            addCriterion("IMAGE_ID between", value1, value2, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdNotBetween(Long value1, Long value2) {
            addCriterion("IMAGE_ID not between", value1, value2, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageTagIsNull() {
            addCriterion("IMAGE_TAG is null");
            return (Criteria) this;
        }

        public Criteria andImageTagIsNotNull() {
            addCriterion("IMAGE_TAG is not null");
            return (Criteria) this;
        }

        public Criteria andImageTagEqualTo(String value) {
            addCriterion("IMAGE_TAG =", value, "imageTag");
            return (Criteria) this;
        }

        public Criteria andImageTagNotEqualTo(String value) {
            addCriterion("IMAGE_TAG <>", value, "imageTag");
            return (Criteria) this;
        }

        public Criteria andImageTagGreaterThan(String value) {
            addCriterion("IMAGE_TAG >", value, "imageTag");
            return (Criteria) this;
        }

        public Criteria andImageTagGreaterThanOrEqualTo(String value) {
            addCriterion("IMAGE_TAG >=", value, "imageTag");
            return (Criteria) this;
        }

        public Criteria andImageTagLessThan(String value) {
            addCriterion("IMAGE_TAG <", value, "imageTag");
            return (Criteria) this;
        }

        public Criteria andImageTagLessThanOrEqualTo(String value) {
            addCriterion("IMAGE_TAG <=", value, "imageTag");
            return (Criteria) this;
        }

        public Criteria andImageTagLike(String value) {
            addCriterion("IMAGE_TAG like", value, "imageTag");
            return (Criteria) this;
        }

        public Criteria andImageTagNotLike(String value) {
            addCriterion("IMAGE_TAG not like", value, "imageTag");
            return (Criteria) this;
        }

        public Criteria andImageTagIn(List<String> values) {
            addCriterion("IMAGE_TAG in", values, "imageTag");
            return (Criteria) this;
        }

        public Criteria andImageTagNotIn(List<String> values) {
            addCriterion("IMAGE_TAG not in", values, "imageTag");
            return (Criteria) this;
        }

        public Criteria andImageTagBetween(String value1, String value2) {
            addCriterion("IMAGE_TAG between", value1, value2, "imageTag");
            return (Criteria) this;
        }

        public Criteria andImageTagNotBetween(String value1, String value2) {
            addCriterion("IMAGE_TAG not between", value1, value2, "imageTag");
            return (Criteria) this;
        }

        public Criteria andImageMarkIsNull() {
            addCriterion("IMAGE_MARK is null");
            return (Criteria) this;
        }

        public Criteria andImageMarkIsNotNull() {
            addCriterion("IMAGE_MARK is not null");
            return (Criteria) this;
        }

        public Criteria andImageMarkEqualTo(String value) {
            addCriterion("IMAGE_MARK =", value, "imageMark");
            return (Criteria) this;
        }

        public Criteria andImageMarkNotEqualTo(String value) {
            addCriterion("IMAGE_MARK <>", value, "imageMark");
            return (Criteria) this;
        }

        public Criteria andImageMarkGreaterThan(String value) {
            addCriterion("IMAGE_MARK >", value, "imageMark");
            return (Criteria) this;
        }

        public Criteria andImageMarkGreaterThanOrEqualTo(String value) {
            addCriterion("IMAGE_MARK >=", value, "imageMark");
            return (Criteria) this;
        }

        public Criteria andImageMarkLessThan(String value) {
            addCriterion("IMAGE_MARK <", value, "imageMark");
            return (Criteria) this;
        }

        public Criteria andImageMarkLessThanOrEqualTo(String value) {
            addCriterion("IMAGE_MARK <=", value, "imageMark");
            return (Criteria) this;
        }

        public Criteria andImageMarkLike(String value) {
            addCriterion("IMAGE_MARK like", value, "imageMark");
            return (Criteria) this;
        }

        public Criteria andImageMarkNotLike(String value) {
            addCriterion("IMAGE_MARK not like", value, "imageMark");
            return (Criteria) this;
        }

        public Criteria andImageMarkIn(List<String> values) {
            addCriterion("IMAGE_MARK in", values, "imageMark");
            return (Criteria) this;
        }

        public Criteria andImageMarkNotIn(List<String> values) {
            addCriterion("IMAGE_MARK not in", values, "imageMark");
            return (Criteria) this;
        }

        public Criteria andImageMarkBetween(String value1, String value2) {
            addCriterion("IMAGE_MARK between", value1, value2, "imageMark");
            return (Criteria) this;
        }

        public Criteria andImageMarkNotBetween(String value1, String value2) {
            addCriterion("IMAGE_MARK not between", value1, value2, "imageMark");
            return (Criteria) this;
        }

        public Criteria andAutoScaleIsNull() {
            addCriterion("AUTO_SCALE is null");
            return (Criteria) this;
        }

        public Criteria andAutoScaleIsNotNull() {
            addCriterion("AUTO_SCALE is not null");
            return (Criteria) this;
        }

        public Criteria andAutoScaleEqualTo(String value) {
            addCriterion("AUTO_SCALE =", value, "autoScale");
            return (Criteria) this;
        }

        public Criteria andAutoScaleNotEqualTo(String value) {
            addCriterion("AUTO_SCALE <>", value, "autoScale");
            return (Criteria) this;
        }

        public Criteria andAutoScaleGreaterThan(String value) {
            addCriterion("AUTO_SCALE >", value, "autoScale");
            return (Criteria) this;
        }

        public Criteria andAutoScaleGreaterThanOrEqualTo(String value) {
            addCriterion("AUTO_SCALE >=", value, "autoScale");
            return (Criteria) this;
        }

        public Criteria andAutoScaleLessThan(String value) {
            addCriterion("AUTO_SCALE <", value, "autoScale");
            return (Criteria) this;
        }

        public Criteria andAutoScaleLessThanOrEqualTo(String value) {
            addCriterion("AUTO_SCALE <=", value, "autoScale");
            return (Criteria) this;
        }

        public Criteria andAutoScaleLike(String value) {
            addCriterion("AUTO_SCALE like", value, "autoScale");
            return (Criteria) this;
        }

        public Criteria andAutoScaleNotLike(String value) {
            addCriterion("AUTO_SCALE not like", value, "autoScale");
            return (Criteria) this;
        }

        public Criteria andAutoScaleIn(List<String> values) {
            addCriterion("AUTO_SCALE in", values, "autoScale");
            return (Criteria) this;
        }

        public Criteria andAutoScaleNotIn(List<String> values) {
            addCriterion("AUTO_SCALE not in", values, "autoScale");
            return (Criteria) this;
        }

        public Criteria andAutoScaleBetween(String value1, String value2) {
            addCriterion("AUTO_SCALE between", value1, value2, "autoScale");
            return (Criteria) this;
        }

        public Criteria andAutoScaleNotBetween(String value1, String value2) {
            addCriterion("AUTO_SCALE not between", value1, value2, "autoScale");
            return (Criteria) this;
        }

        public Criteria andCpuUtilIsNull() {
            addCriterion("CPU_UTIL is null");
            return (Criteria) this;
        }

        public Criteria andCpuUtilIsNotNull() {
            addCriterion("CPU_UTIL is not null");
            return (Criteria) this;
        }

        public Criteria andCpuUtilEqualTo(Integer value) {
            addCriterion("CPU_UTIL =", value, "cpuUtil");
            return (Criteria) this;
        }

        public Criteria andCpuUtilNotEqualTo(Integer value) {
            addCriterion("CPU_UTIL <>", value, "cpuUtil");
            return (Criteria) this;
        }

        public Criteria andCpuUtilGreaterThan(Integer value) {
            addCriterion("CPU_UTIL >", value, "cpuUtil");
            return (Criteria) this;
        }

        public Criteria andCpuUtilGreaterThanOrEqualTo(Integer value) {
            addCriterion("CPU_UTIL >=", value, "cpuUtil");
            return (Criteria) this;
        }

        public Criteria andCpuUtilLessThan(Integer value) {
            addCriterion("CPU_UTIL <", value, "cpuUtil");
            return (Criteria) this;
        }

        public Criteria andCpuUtilLessThanOrEqualTo(Integer value) {
            addCriterion("CPU_UTIL <=", value, "cpuUtil");
            return (Criteria) this;
        }

        public Criteria andCpuUtilIn(List<Integer> values) {
            addCriterion("CPU_UTIL in", values, "cpuUtil");
            return (Criteria) this;
        }

        public Criteria andCpuUtilNotIn(List<Integer> values) {
            addCriterion("CPU_UTIL not in", values, "cpuUtil");
            return (Criteria) this;
        }

        public Criteria andCpuUtilBetween(Integer value1, Integer value2) {
            addCriterion("CPU_UTIL between", value1, value2, "cpuUtil");
            return (Criteria) this;
        }

        public Criteria andCpuUtilNotBetween(Integer value1, Integer value2) {
            addCriterion("CPU_UTIL not between", value1, value2, "cpuUtil");
            return (Criteria) this;
        }

        public Criteria andMinEnginesIsNull() {
            addCriterion("MIN_ENGINES is null");
            return (Criteria) this;
        }

        public Criteria andMinEnginesIsNotNull() {
            addCriterion("MIN_ENGINES is not null");
            return (Criteria) this;
        }

        public Criteria andMinEnginesEqualTo(Integer value) {
            addCriterion("MIN_ENGINES =", value, "minEngines");
            return (Criteria) this;
        }

        public Criteria andMinEnginesNotEqualTo(Integer value) {
            addCriterion("MIN_ENGINES <>", value, "minEngines");
            return (Criteria) this;
        }

        public Criteria andMinEnginesGreaterThan(Integer value) {
            addCriterion("MIN_ENGINES >", value, "minEngines");
            return (Criteria) this;
        }

        public Criteria andMinEnginesGreaterThanOrEqualTo(Integer value) {
            addCriterion("MIN_ENGINES >=", value, "minEngines");
            return (Criteria) this;
        }

        public Criteria andMinEnginesLessThan(Integer value) {
            addCriterion("MIN_ENGINES <", value, "minEngines");
            return (Criteria) this;
        }

        public Criteria andMinEnginesLessThanOrEqualTo(Integer value) {
            addCriterion("MIN_ENGINES <=", value, "minEngines");
            return (Criteria) this;
        }

        public Criteria andMinEnginesIn(List<Integer> values) {
            addCriterion("MIN_ENGINES in", values, "minEngines");
            return (Criteria) this;
        }

        public Criteria andMinEnginesNotIn(List<Integer> values) {
            addCriterion("MIN_ENGINES not in", values, "minEngines");
            return (Criteria) this;
        }

        public Criteria andMinEnginesBetween(Integer value1, Integer value2) {
            addCriterion("MIN_ENGINES between", value1, value2, "minEngines");
            return (Criteria) this;
        }

        public Criteria andMinEnginesNotBetween(Integer value1, Integer value2) {
            addCriterion("MIN_ENGINES not between", value1, value2, "minEngines");
            return (Criteria) this;
        }

        public Criteria andMaxEnginesIsNull() {
            addCriterion("MAX_ENGINES is null");
            return (Criteria) this;
        }

        public Criteria andMaxEnginesIsNotNull() {
            addCriterion("MAX_ENGINES is not null");
            return (Criteria) this;
        }

        public Criteria andMaxEnginesEqualTo(Integer value) {
            addCriterion("MAX_ENGINES =", value, "maxEngines");
            return (Criteria) this;
        }

        public Criteria andMaxEnginesNotEqualTo(Integer value) {
            addCriterion("MAX_ENGINES <>", value, "maxEngines");
            return (Criteria) this;
        }

        public Criteria andMaxEnginesGreaterThan(Integer value) {
            addCriterion("MAX_ENGINES >", value, "maxEngines");
            return (Criteria) this;
        }

        public Criteria andMaxEnginesGreaterThanOrEqualTo(Integer value) {
            addCriterion("MAX_ENGINES >=", value, "maxEngines");
            return (Criteria) this;
        }

        public Criteria andMaxEnginesLessThan(Integer value) {
            addCriterion("MAX_ENGINES <", value, "maxEngines");
            return (Criteria) this;
        }

        public Criteria andMaxEnginesLessThanOrEqualTo(Integer value) {
            addCriterion("MAX_ENGINES <=", value, "maxEngines");
            return (Criteria) this;
        }

        public Criteria andMaxEnginesIn(List<Integer> values) {
            addCriterion("MAX_ENGINES in", values, "maxEngines");
            return (Criteria) this;
        }

        public Criteria andMaxEnginesNotIn(List<Integer> values) {
            addCriterion("MAX_ENGINES not in", values, "maxEngines");
            return (Criteria) this;
        }

        public Criteria andMaxEnginesBetween(Integer value1, Integer value2) {
            addCriterion("MAX_ENGINES between", value1, value2, "maxEngines");
            return (Criteria) this;
        }

        public Criteria andMaxEnginesNotBetween(Integer value1, Integer value2) {
            addCriterion("MAX_ENGINES not between", value1, value2, "maxEngines");
            return (Criteria) this;
        }

        public Criteria andCpuIsNull() {
            addCriterion("CPU is null");
            return (Criteria) this;
        }

        public Criteria andCpuIsNotNull() {
            addCriterion("CPU is not null");
            return (Criteria) this;
        }

        public Criteria andCpuEqualTo(Float value) {
            addCriterion("CPU =", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuNotEqualTo(Float value) {
            addCriterion("CPU <>", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuGreaterThan(Float value) {
            addCriterion("CPU >", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuGreaterThanOrEqualTo(Float value) {
            addCriterion("CPU >=", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuLessThan(Float value) {
            addCriterion("CPU <", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuLessThanOrEqualTo(Float value) {
            addCriterion("CPU <=", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuIn(List<Float> values) {
            addCriterion("CPU in", values, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuNotIn(List<Float> values) {
            addCriterion("CPU not in", values, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuBetween(Float value1, Float value2) {
            addCriterion("CPU between", value1, value2, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuNotBetween(Float value1, Float value2) {
            addCriterion("CPU not between", value1, value2, "cpu");
            return (Criteria) this;
        }

        public Criteria andMemIsNull() {
            addCriterion("MEM is null");
            return (Criteria) this;
        }

        public Criteria andMemIsNotNull() {
            addCriterion("MEM is not null");
            return (Criteria) this;
        }

        public Criteria andMemEqualTo(Integer value) {
            addCriterion("MEM =", value, "mem");
            return (Criteria) this;
        }

        public Criteria andMemNotEqualTo(Integer value) {
            addCriterion("MEM <>", value, "mem");
            return (Criteria) this;
        }

        public Criteria andMemGreaterThan(Integer value) {
            addCriterion("MEM >", value, "mem");
            return (Criteria) this;
        }

        public Criteria andMemGreaterThanOrEqualTo(Integer value) {
            addCriterion("MEM >=", value, "mem");
            return (Criteria) this;
        }

        public Criteria andMemLessThan(Integer value) {
            addCriterion("MEM <", value, "mem");
            return (Criteria) this;
        }

        public Criteria andMemLessThanOrEqualTo(Integer value) {
            addCriterion("MEM <=", value, "mem");
            return (Criteria) this;
        }

        public Criteria andMemIn(List<Integer> values) {
            addCriterion("MEM in", values, "mem");
            return (Criteria) this;
        }

        public Criteria andMemNotIn(List<Integer> values) {
            addCriterion("MEM not in", values, "mem");
            return (Criteria) this;
        }

        public Criteria andMemBetween(Integer value1, Integer value2) {
            addCriterion("MEM between", value1, value2, "mem");
            return (Criteria) this;
        }

        public Criteria andMemNotBetween(Integer value1, Integer value2) {
            addCriterion("MEM not between", value1, value2, "mem");
            return (Criteria) this;
        }

        public Criteria andCommandIsNull() {
            addCriterion("COMMAND is null");
            return (Criteria) this;
        }

        public Criteria andCommandIsNotNull() {
            addCriterion("COMMAND is not null");
            return (Criteria) this;
        }

        public Criteria andCommandEqualTo(String value) {
            addCriterion("COMMAND =", value, "command");
            return (Criteria) this;
        }

        public Criteria andCommandNotEqualTo(String value) {
            addCriterion("COMMAND <>", value, "command");
            return (Criteria) this;
        }

        public Criteria andCommandGreaterThan(String value) {
            addCriterion("COMMAND >", value, "command");
            return (Criteria) this;
        }

        public Criteria andCommandGreaterThanOrEqualTo(String value) {
            addCriterion("COMMAND >=", value, "command");
            return (Criteria) this;
        }

        public Criteria andCommandLessThan(String value) {
            addCriterion("COMMAND <", value, "command");
            return (Criteria) this;
        }

        public Criteria andCommandLessThanOrEqualTo(String value) {
            addCriterion("COMMAND <=", value, "command");
            return (Criteria) this;
        }

        public Criteria andCommandLike(String value) {
            addCriterion("COMMAND like", value, "command");
            return (Criteria) this;
        }

        public Criteria andCommandNotLike(String value) {
            addCriterion("COMMAND not like", value, "command");
            return (Criteria) this;
        }

        public Criteria andCommandIn(List<String> values) {
            addCriterion("COMMAND in", values, "command");
            return (Criteria) this;
        }

        public Criteria andCommandNotIn(List<String> values) {
            addCriterion("COMMAND not in", values, "command");
            return (Criteria) this;
        }

        public Criteria andCommandBetween(String value1, String value2) {
            addCriterion("COMMAND between", value1, value2, "command");
            return (Criteria) this;
        }

        public Criteria andCommandNotBetween(String value1, String value2) {
            addCriterion("COMMAND not between", value1, value2, "command");
            return (Criteria) this;
        }

        public Criteria andPostStartIsNull() {
            addCriterion("POST_START is null");
            return (Criteria) this;
        }

        public Criteria andPostStartIsNotNull() {
            addCriterion("POST_START is not null");
            return (Criteria) this;
        }

        public Criteria andPostStartEqualTo(String value) {
            addCriterion("POST_START =", value, "postStart");
            return (Criteria) this;
        }

        public Criteria andPostStartNotEqualTo(String value) {
            addCriterion("POST_START <>", value, "postStart");
            return (Criteria) this;
        }

        public Criteria andPostStartGreaterThan(String value) {
            addCriterion("POST_START >", value, "postStart");
            return (Criteria) this;
        }

        public Criteria andPostStartGreaterThanOrEqualTo(String value) {
            addCriterion("POST_START >=", value, "postStart");
            return (Criteria) this;
        }

        public Criteria andPostStartLessThan(String value) {
            addCriterion("POST_START <", value, "postStart");
            return (Criteria) this;
        }

        public Criteria andPostStartLessThanOrEqualTo(String value) {
            addCriterion("POST_START <=", value, "postStart");
            return (Criteria) this;
        }

        public Criteria andPostStartLike(String value) {
            addCriterion("POST_START like", value, "postStart");
            return (Criteria) this;
        }

        public Criteria andPostStartNotLike(String value) {
            addCriterion("POST_START not like", value, "postStart");
            return (Criteria) this;
        }

        public Criteria andPostStartIn(List<String> values) {
            addCriterion("POST_START in", values, "postStart");
            return (Criteria) this;
        }

        public Criteria andPostStartNotIn(List<String> values) {
            addCriterion("POST_START not in", values, "postStart");
            return (Criteria) this;
        }

        public Criteria andPostStartBetween(String value1, String value2) {
            addCriterion("POST_START between", value1, value2, "postStart");
            return (Criteria) this;
        }

        public Criteria andPostStartNotBetween(String value1, String value2) {
            addCriterion("POST_START not between", value1, value2, "postStart");
            return (Criteria) this;
        }

        public Criteria andPreStopIsNull() {
            addCriterion("PRE_STOP is null");
            return (Criteria) this;
        }

        public Criteria andPreStopIsNotNull() {
            addCriterion("PRE_STOP is not null");
            return (Criteria) this;
        }

        public Criteria andPreStopEqualTo(String value) {
            addCriterion("PRE_STOP =", value, "preStop");
            return (Criteria) this;
        }

        public Criteria andPreStopNotEqualTo(String value) {
            addCriterion("PRE_STOP <>", value, "preStop");
            return (Criteria) this;
        }

        public Criteria andPreStopGreaterThan(String value) {
            addCriterion("PRE_STOP >", value, "preStop");
            return (Criteria) this;
        }

        public Criteria andPreStopGreaterThanOrEqualTo(String value) {
            addCriterion("PRE_STOP >=", value, "preStop");
            return (Criteria) this;
        }

        public Criteria andPreStopLessThan(String value) {
            addCriterion("PRE_STOP <", value, "preStop");
            return (Criteria) this;
        }

        public Criteria andPreStopLessThanOrEqualTo(String value) {
            addCriterion("PRE_STOP <=", value, "preStop");
            return (Criteria) this;
        }

        public Criteria andPreStopLike(String value) {
            addCriterion("PRE_STOP like", value, "preStop");
            return (Criteria) this;
        }

        public Criteria andPreStopNotLike(String value) {
            addCriterion("PRE_STOP not like", value, "preStop");
            return (Criteria) this;
        }

        public Criteria andPreStopIn(List<String> values) {
            addCriterion("PRE_STOP in", values, "preStop");
            return (Criteria) this;
        }

        public Criteria andPreStopNotIn(List<String> values) {
            addCriterion("PRE_STOP not in", values, "preStop");
            return (Criteria) this;
        }

        public Criteria andPreStopBetween(String value1, String value2) {
            addCriterion("PRE_STOP between", value1, value2, "preStop");
            return (Criteria) this;
        }

        public Criteria andPreStopNotBetween(String value1, String value2) {
            addCriterion("PRE_STOP not between", value1, value2, "preStop");
            return (Criteria) this;
        }

        public Criteria andGrIsNull() {
            addCriterion("GR is null");
            return (Criteria) this;
        }

        public Criteria andGrIsNotNull() {
            addCriterion("GR is not null");
            return (Criteria) this;
        }

        public Criteria andGrEqualTo(String value) {
            addCriterion("GR =", value, "gr");
            return (Criteria) this;
        }

        public Criteria andGrNotEqualTo(String value) {
            addCriterion("GR <>", value, "gr");
            return (Criteria) this;
        }

        public Criteria andGrGreaterThan(String value) {
            addCriterion("GR >", value, "gr");
            return (Criteria) this;
        }

        public Criteria andGrGreaterThanOrEqualTo(String value) {
            addCriterion("GR >=", value, "gr");
            return (Criteria) this;
        }

        public Criteria andGrLessThan(String value) {
            addCriterion("GR <", value, "gr");
            return (Criteria) this;
        }

        public Criteria andGrLessThanOrEqualTo(String value) {
            addCriterion("GR <=", value, "gr");
            return (Criteria) this;
        }

        public Criteria andGrLike(String value) {
            addCriterion("GR like", value, "gr");
            return (Criteria) this;
        }

        public Criteria andGrNotLike(String value) {
            addCriterion("GR not like", value, "gr");
            return (Criteria) this;
        }

        public Criteria andGrIn(List<String> values) {
            addCriterion("GR in", values, "gr");
            return (Criteria) this;
        }

        public Criteria andGrNotIn(List<String> values) {
            addCriterion("GR not in", values, "gr");
            return (Criteria) this;
        }

        public Criteria andGrBetween(String value1, String value2) {
            addCriterion("GR between", value1, value2, "gr");
            return (Criteria) this;
        }

        public Criteria andGrNotBetween(String value1, String value2) {
            addCriterion("GR not between", value1, value2, "gr");
            return (Criteria) this;
        }

        public Criteria andCmdAgrsIsNull() {
            addCriterion("CMD_AGRS is null");
            return (Criteria) this;
        }

        public Criteria andCmdAgrsIsNotNull() {
            addCriterion("CMD_AGRS is not null");
            return (Criteria) this;
        }

        public Criteria andCmdAgrsEqualTo(String value) {
            addCriterion("CMD_AGRS =", value, "cmdAgrs");
            return (Criteria) this;
        }

        public Criteria andCmdAgrsNotEqualTo(String value) {
            addCriterion("CMD_AGRS <>", value, "cmdAgrs");
            return (Criteria) this;
        }

        public Criteria andCmdAgrsGreaterThan(String value) {
            addCriterion("CMD_AGRS >", value, "cmdAgrs");
            return (Criteria) this;
        }

        public Criteria andCmdAgrsGreaterThanOrEqualTo(String value) {
            addCriterion("CMD_AGRS >=", value, "cmdAgrs");
            return (Criteria) this;
        }

        public Criteria andCmdAgrsLessThan(String value) {
            addCriterion("CMD_AGRS <", value, "cmdAgrs");
            return (Criteria) this;
        }

        public Criteria andCmdAgrsLessThanOrEqualTo(String value) {
            addCriterion("CMD_AGRS <=", value, "cmdAgrs");
            return (Criteria) this;
        }

        public Criteria andCmdAgrsLike(String value) {
            addCriterion("CMD_AGRS like", value, "cmdAgrs");
            return (Criteria) this;
        }

        public Criteria andCmdAgrsNotLike(String value) {
            addCriterion("CMD_AGRS not like", value, "cmdAgrs");
            return (Criteria) this;
        }

        public Criteria andCmdAgrsIn(List<String> values) {
            addCriterion("CMD_AGRS in", values, "cmdAgrs");
            return (Criteria) this;
        }

        public Criteria andCmdAgrsNotIn(List<String> values) {
            addCriterion("CMD_AGRS not in", values, "cmdAgrs");
            return (Criteria) this;
        }

        public Criteria andCmdAgrsBetween(String value1, String value2) {
            addCriterion("CMD_AGRS between", value1, value2, "cmdAgrs");
            return (Criteria) this;
        }

        public Criteria andCmdAgrsNotBetween(String value1, String value2) {
            addCriterion("CMD_AGRS not between", value1, value2, "cmdAgrs");
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