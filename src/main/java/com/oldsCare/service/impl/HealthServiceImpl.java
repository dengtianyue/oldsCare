package com.oldsCare.service.impl;

import com.oldsCare.common.ResponseCode;
import com.oldsCare.common.ServerResponse;
import com.oldsCare.dao.HealthRecordMapper;
import com.oldsCare.service.IHealthService;
import com.oldsCare.vo.HealthRecordVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: oldsCare
 * @description:
 * @author: bufang
 * @create: 2018-04-08 17:57
 **/
@Service("iHealthService")
public class HealthServiceImpl implements IHealthService {

    @Autowired
    private HealthRecordMapper healthRecordMapper;


    /**
     * 查询7天内数据
     *
     * @param userId
     * @return
     */
    @Override
    public ServerResponse<List<HealthRecordVO>> selectSevenDay(Long userId) {
        if(userId == null){
            return  ServerResponse.createByErrorCodeMessage(ResponseCode.ILLEGAL_ARGUMENT.getCode(),"用户id为空");
        }
        List<HealthRecordVO> healthRecordVOList ;
        healthRecordVOList  = healthRecordMapper.selectSevenDay(userId);
        if (healthRecordVOList.isEmpty()){
            return  ServerResponse.createByErrorCodeMessage(ResponseCode.ERROR.getCode(),"查询不到环境数据");
        }
        return ServerResponse.createBySuccess(healthRecordVOList);
    }

    /**
     * 查询实时健康数据
     *
     * @param userId
     * @return
     */
    @Override
    public ServerResponse<HealthRecordVO> selectNow(Long userId) {
        if(userId == null){
            return  ServerResponse.createByErrorCodeMessage(ResponseCode.ILLEGAL_ARGUMENT.getCode(),"用户id为空");
        }

        HealthRecordVO healthRecordVO = healthRecordMapper.selectNow(userId);
        if(healthRecordVO == null){
            return  ServerResponse.createByErrorCodeMessage(ResponseCode.ERROR.getCode(),"查询不到环境数据");
        }

        return ServerResponse.createBySuccess(healthRecordVO);
    }
}
