package com.vispractice.vacp.deployment.service.domain;

import java.util.Date;

public class Service {
    private Long id;

    private String uuid;

    private String name;

    private String code;

    private Long deploymentId;

    private Long imageId;

    private String imageTag;

    private String imageMark;

    private String autoScale;

    private Integer cpuUtil;

    private Integer minEngines;

    private Integer maxEngines;

    private Float cpu;

    private Integer mem;

    private String command;

    private String postStart;

    private String preStop;

    private String gr;

    private String cmdAgrs;

    private Long createdBy;

    private Date creationDate;

    private Long lastUpdatedBy;

    private Date lastUpdatedDate;

    private String enabledFlag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Long getDeploymentId() {
        return deploymentId;
    }

    public void setDeploymentId(Long deploymentId) {
        this.deploymentId = deploymentId;
    }

    public Long getImageId() {
        return imageId;
    }

    public void setImageId(Long imageId) {
        this.imageId = imageId;
    }

    public String getImageTag() {
        return imageTag;
    }

    public void setImageTag(String imageTag) {
        this.imageTag = imageTag == null ? null : imageTag.trim();
    }

    public String getImageMark() {
        return imageMark;
    }

    public void setImageMark(String imageMark) {
        this.imageMark = imageMark == null ? null : imageMark.trim();
    }

    public String getAutoScale() {
        return autoScale;
    }

    public void setAutoScale(String autoScale) {
        this.autoScale = autoScale == null ? null : autoScale.trim();
    }

    public Integer getCpuUtil() {
        return cpuUtil;
    }

    public void setCpuUtil(Integer cpuUtil) {
        this.cpuUtil = cpuUtil;
    }

    public Integer getMinEngines() {
        return minEngines;
    }

    public void setMinEngines(Integer minEngines) {
        this.minEngines = minEngines;
    }

    public Integer getMaxEngines() {
        return maxEngines;
    }

    public void setMaxEngines(Integer maxEngines) {
        this.maxEngines = maxEngines;
    }

    public Float getCpu() {
        return cpu;
    }

    public void setCpu(Float cpu) {
        this.cpu = cpu;
    }

    public Integer getMem() {
        return mem;
    }

    public void setMem(Integer mem) {
        this.mem = mem;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command == null ? null : command.trim();
    }

    public String getPostStart() {
        return postStart;
    }

    public void setPostStart(String postStart) {
        this.postStart = postStart == null ? null : postStart.trim();
    }

    public String getPreStop() {
        return preStop;
    }

    public void setPreStop(String preStop) {
        this.preStop = preStop == null ? null : preStop.trim();
    }

    public String getGr() {
        return gr;
    }

    public void setGr(String gr) {
        this.gr = gr == null ? null : gr.trim();
    }

    public String getCmdAgrs() {
        return cmdAgrs;
    }

    public void setCmdAgrs(String cmdAgrs) {
        this.cmdAgrs = cmdAgrs == null ? null : cmdAgrs.trim();
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Long getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(Long lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public String getEnabledFlag() {
        return enabledFlag;
    }

    public void setEnabledFlag(String enabledFlag) {
        this.enabledFlag = enabledFlag == null ? null : enabledFlag.trim();
    }
}