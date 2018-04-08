package com.oldsCare.dao;

import com.oldsCare.pojo.HealthRecord;
import com.oldsCare.vo.HealthRecordVO;

import java.util.List;

public interface HealthRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(HealthRecord record);

    int insertSelective(HealthRecord record);

    HealthRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HealthRecord record);

    int updateByPrimaryKey(HealthRecord record);

    HealthRecordVO selectNow(Long userId);

    List<HealthRecordVO> selectSevenDay(Long userId);
}