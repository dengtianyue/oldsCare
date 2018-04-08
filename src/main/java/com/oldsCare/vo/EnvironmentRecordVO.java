package com.oldsCare.vo;

import com.oldsCare.pojo.EnvironmentRecord;

import java.util.Date;

/**
 * @program: oldsCare
 * @description:
 * @author: bufang
 * @create: 2018-04-08 18:08
 **/
public class EnvironmentRecordVO {

    private Long userId;

    private Double gas;

    private Double temperature;

    private Double humidity;

    private String createTime;

    private Integer isGas = 0;

    public Integer getIsGas() {
        return isGas;
    }

    public void setIsGas(Integer isGas) {
        this.isGas = isGas;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
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

    public static EnvironmentRecordVO toVOFromEntity(EnvironmentRecord environmentRecord) {
        if (environmentRecord == null) {
            return null;
        }
        EnvironmentRecordVO environmentRecordVO = new EnvironmentRecordVO();
        environmentRecordVO.setUserId(environmentRecord.getUserId());
        environmentRecordVO.setGas(environmentRecord.getGas());
        environmentRecordVO.setTemperature(environmentRecord.getTemperature());
        environmentRecordVO.setHumidity(environmentRecord.getHumidity());

        return environmentRecordVO;
    }

    public EnvironmentRecordVO(Long userId, Double gas, Double temperature, Double humidity, String createTime) {
        this.userId = userId;
        this.gas = gas;
        this.temperature = temperature;
        this.humidity = humidity;
        this.createTime = createTime;
    }

    public EnvironmentRecordVO() {
    }
}
