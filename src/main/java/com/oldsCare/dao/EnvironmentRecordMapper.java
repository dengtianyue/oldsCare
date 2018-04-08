package com.oldsCare.dao;

import com.oldsCare.pojo.EnvironmentRecord;
import com.oldsCare.vo.EnvironmentRecordVO;

import java.util.List;

public interface EnvironmentRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EnvironmentRecord record);

    int insertSelective(EnvironmentRecord record);

    EnvironmentRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EnvironmentRecord record);

    int updateByPrimaryKey(EnvironmentRecord record);

    List<EnvironmentRecordVO> select7Day(Long userId);

    EnvironmentRecordVO selectNow(Long userId);
}