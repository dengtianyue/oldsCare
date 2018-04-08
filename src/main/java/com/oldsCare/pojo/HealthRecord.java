package com.oldsCare.pojo;

import java.util.Date;

public class HealthRecord {
    private Long id;

    private Long userId;

    private Double heartRate;

    private Double bloodOxygen;

    private String creator;

    private String editor;

    private Date createTime;

    private Date editTime;

    private Byte isDeleted;

    public HealthRecord(Long id, Long userId, Double heartRate, Double bloodOxygen, String creator, String editor, Date createTime, Date editTime, Byte isDeleted) {
        this.id = id;
        this.userId = userId;
        this.heartRate = heartRate;
        this.bloodOxygen = bloodOxygen;
        this.creator = creator;
        this.editor = editor;
        this.createTime = createTime;
        this.editTime = editTime;
        this.isDeleted = isDeleted;
    }

    public HealthRecord() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Double getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(Double heartRate) {
        this.heartRate = heartRate;
    }

    public void setBloodOxygen(Double bloodOxygen) {
        this.bloodOxygen = bloodOxygen;
    }

    public Double getBloodOxygen() {
        return bloodOxygen;
    }



    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor == null ? null : editor.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getEditTime() {
        return editTime;
    }

    public void setEditTime(Date editTime) {
        this.editTime = editTime;
    }

    public Byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }
}