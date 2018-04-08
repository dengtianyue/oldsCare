package com.oldsCare.vo;

import com.oldsCare.pojo.HealthRecord;

/**
 * @program: oldsCare
 * @description:
 * @author: bufang
 * @create: 2018-04-08 18:07
 **/
public class HealthRecordVO {

    private Long userId;

    private Double heartRate;

    private Double bloodOxygen;

    private String date;

    private String hour;

    private String createTime;

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public Double getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(Double heartRate) {
        this.heartRate = heartRate;
    }

    public Double getBloodOxygen() {
        return bloodOxygen;
    }

    public void setBloodOxygen(Double bloodOxygen) {
        this.bloodOxygen = bloodOxygen;
    }



    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }



    public static HealthRecordVO toVOFromEntity(HealthRecord healthRecord) {
        if (healthRecord == null) {
            return null;
        }
        HealthRecordVO healthRecordVO = new HealthRecordVO();
        healthRecordVO.setUserId(healthRecord.getUserId());
        healthRecordVO.setHeartRate(healthRecord.getHeartRate());
        healthRecordVO.setBloodOxygen(healthRecord.getBloodOxygen());
        return healthRecordVO;
    }

    public HealthRecordVO() {
    }

    public HealthRecordVO(Long userId, Double heartRate, Double bloodOxygen, String date, String hour) {
        this.userId = userId;
        this.heartRate = heartRate;
        this.bloodOxygen = bloodOxygen;
        this.date = date;
        this.hour = hour;
    }

    public HealthRecordVO(Long userId, Double heartRate, Double bloodOxygen, String createTime) {
        this.userId = userId;
        this.heartRate = heartRate;
        this.bloodOxygen = bloodOxygen;
        this.createTime = createTime;
    }
}
