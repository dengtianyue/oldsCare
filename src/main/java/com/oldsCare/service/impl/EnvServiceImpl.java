package com.oldsCare.service.impl;

import com.google.common.collect.Lists;
import com.oldsCare.common.Const;
import com.oldsCare.common.ResponseCode;
import com.oldsCare.common.ServerResponse;
import com.oldsCare.dao.EnvironmentRecordMapper;
import com.oldsCare.pojo.EnvironmentRecord;
import com.oldsCare.service.IEnvService;
import com.oldsCare.vo.EnvironmentRecordVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * @program: oldsCare
 * @description:
 * @author: bufang
 * @create: 2018-04-08 17:56
 **/
@Service("iEnvService")
public class EnvServiceImpl implements IEnvService {

    @Autowired
    private EnvironmentRecordMapper environmentRecordMapper;

    /**
     * 获取当前用户7天内环境数据记录
     *
     * @param userId
     * @return
     */
    @Override
    public ServerResponse<List<EnvironmentRecordVO>> select7Day(Long userId) {
        if(userId == null){
            return  ServerResponse.createByErrorCodeMessage(ResponseCode.ILLEGAL_ARGUMENT.getCode(),"用户id为空");
        }
        List<EnvironmentRecordVO> environmentRecordList ;
        environmentRecordList  = environmentRecordMapper.select7Day(userId);
        if (environmentRecordList.isEmpty()){
            return  ServerResponse.createByErrorCodeMessage(ResponseCode.ERROR.getCode(),"查询不到环境数据");
        }
        return ServerResponse.createBySuccess(environmentRecordList);

    }

    /**
     * 查询当前环境数据
     *
     * @param userId
     * @return
     */
    @Override
    public ServerResponse<EnvironmentRecordVO> selectNow(Long userId) {
        if(userId == null){
            return  ServerResponse.createByErrorCodeMessage(ResponseCode.ILLEGAL_ARGUMENT.getCode(),"用户id为空");
        }

        EnvironmentRecordVO environmentRecordVO = environmentRecordMapper.selectNow(userId);
        if(environmentRecordVO == null){
            return  ServerResponse.createByErrorCodeMessage(ResponseCode.ERROR.getCode(),"查询不到环境数据");
        }
        if(environmentRecordVO.getGas()>= Const.GASMAX){
            environmentRecordVO.setIsGas(1);
        }
        return ServerResponse.createBySuccess(environmentRecordVO);
    }
}
