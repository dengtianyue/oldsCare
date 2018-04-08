package com.oldsCare.service;

import com.oldsCare.common.ServerResponse;
import com.oldsCare.pojo.EnvironmentRecord;
import com.oldsCare.vo.EnvironmentRecordVO;

import java.util.List;

/**
 * @program: oldsCare
 * @description:
 * @author: bufang
 * @create: 2018-04-08 17:56
 **/
public interface IEnvService {

    /**
     * 获取当前用户7天内环境数据记录
     * @param userId
     * @return
     */
    ServerResponse<List<EnvironmentRecordVO>> select7Day(Long userId);

    /**
     * 查询当前环境数据
     * @param userId
     * @return
     */
    ServerResponse<EnvironmentRecordVO> selectNow(Long userId);
}
