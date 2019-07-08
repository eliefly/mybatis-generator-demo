package com.vispractice.vacp.product.domain.image;

import java.util.Date;

public class ImageVersion {
    private Long id;

    private Long imageId;

    private Long imageConfigInstance;

    private String address;

    private String tag;

    private String state;

    private Long size;

    private Integer percent;

    private Date uploadTime;

    private String lastest;

    private String release;

    private String mark;

    private String downloadUrl;

    private String source;

    private Date createDownloadDate;

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

    public Long getImageId() {
        return imageId;
    }

    public void setImageId(Long imageId) {
        this.imageId = imageId;
    }

    public Long getImageConfigInstance() {
        return imageConfigInstance;
    }

    public void setImageConfigInstance(Long imageConfigInstance) {
        this.imageConfigInstance = imageConfigInstance;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public Integer getPercent() {
        return percent;
    }

    public void setPercent(Integer percent) {
        this.percent = percent;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getLastest() {
        return lastest;
    }

    public void setLastest(String lastest) {
        this.lastest = lastest == null ? null : lastest.trim();
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

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl == null ? null : downloadUrl.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public Date getCreateDownloadDate() {
        return createDownloadDate;
    }

    public void setCreateDownloadDate(Date createDownloadDate) {
        this.createDownloadDate = createDownloadDate;
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