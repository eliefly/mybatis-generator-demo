package com.vispractice.vacp.pipeline.domain.action;

import java.util.Date;

public class ReleaseImageInstance {
    private Long id;

    private Long releaseImageId;

    private Long pipelineInstanceId;

    private Long releasePlanInstanceId;

    private Date startTime;

    private Date finishTime;

    private String result;

    private Long duration;

    private String state;

    private String current;

    private String release;

    private String mark;

    private Long executor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getReleaseImageId() {
        return releaseImageId;
    }

    public void setReleaseImageId(Long releaseImageId) {
        this.releaseImageId = releaseImageId;
    }

    public Long getPipelineInstanceId() {
        return pipelineInstanceId;
    }

    public void setPipelineInstanceId(Long pipelineInstanceId) {
        this.pipelineInstanceId = pipelineInstanceId;
    }

    public Long getReleasePlanInstanceId() {
        return releasePlanInstanceId;
    }

    public void setReleasePlanInstanceId(Long releasePlanInstanceId) {
        this.releasePlanInstanceId = releasePlanInstanceId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getCurrent() {
        return current;
    }

    public void setCurrent(String current) {
        this.current = current == null ? null : current.trim();
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release == null ? null : release.trim();
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }

    public Long getExecutor() {
        return executor;
    }

    public void setExecutor(Long executor) {
        this.executor = executor;
    }
}