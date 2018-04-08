package com.oldsCare.service;

import com.oldsCare.common.ServerResponse;
import com.oldsCare.vo.HealthRecordVO;

import java.util.List;

/**
 * @program: oldsCare
 * @description:
 * @author: bufang
 * @create: 2018-04-08 17:56
 **/
public interface IHealthService {


    /**
     * 查询7天内数据
     * @param userId
     * @return
     */
    ServerResponse<List<HealthRecordVO>> selectSevenDay(Long userId);

    /**
     * 查询实时健康数据
     * @param userId
     * @return
     */
    ServerResponse<HealthRecordVO> selectNow(Long userId);

}
