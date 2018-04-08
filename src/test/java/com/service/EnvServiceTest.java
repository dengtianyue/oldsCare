package com.service;

import com.alibaba.fastjson.JSON;
import com.oldsCare.common.ServerResponse;
import com.oldsCare.pojo.EnvironmentRecord;
import com.oldsCare.service.IEnvService;
import com.oldsCare.vo.EnvironmentRecordVO;
import org.junit.Test;

import javax.annotation.Resource;
import com.TestBase;
import java.util.List;

/**
 * @program: oldsCare
 * @description:
 * @author: bufang
 * @create: 2018-04-08 19:24
 **/

public class EnvServiceTest extends TestBase{

    @Resource
    private IEnvService iEnvService;


    @Test
    public void testSelect7Day(){
        Long userId = 1L;
        ServerResponse<List<EnvironmentRecordVO>> environmentRecordList = iEnvService.select7Day(userId);
        System.out.println(JSON.toJSON(environmentRecordList));
    }

    @Test
    public void testSelectNow(){
        Long userId = 1L;
        ServerResponse<EnvironmentRecordVO> environmentRecordVO= iEnvService.selectNow(userId);
        System.out.println(JSON.toJSON(environmentRecordVO));
    }

}
