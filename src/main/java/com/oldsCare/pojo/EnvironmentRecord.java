package com.oldsCare.pojo;

import java.util.Date;

public class EnvironmentRecord {
    private Long id;

    private Long userId;

    private Double gas;

    private Double temperature;

    private Double humidity;

    private String creator;

    private String editor;

    private Date createTime;

    private Date editTime;

    private Byte isDeleted;

    public EnvironmentRecord(Long id, Long userId, Double gas, Double temperature, Double humidity, String creator, String editor, Date createTime, Date editTime, Byte isDeleted) {
        this.id = id;
        this.userId = userId;
        this.gas = gas;
        this.temperature = temperature;
        this.humidity = humidity;
        this.creator = creator;
        this.editor = editor;
        this.createTime = createTime;
        this.editTime = editTime;
        this.isDeleted = isDeleted;
    }

    public EnvironmentRecord() {
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

    public Double getGas() {
        return gas;
    }

    public void setGas(Double gas) {
        this.gas = gas;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getHumidity() {
        return humidity;
    }

    public void setHumidity(Double humidity) {
        this.humidity = humidity;
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