package com.service;

import com.TestBase;
import com.alibaba.fastjson.JSON;
import com.oldsCare.common.ServerResponse;
import com.oldsCare.service.IHealthService;
import com.oldsCare.vo.EnvironmentRecordVO;
import com.oldsCare.vo.HealthRecordVO;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: oldsCare
 * @description:
 * @author: bufang
 * @create: 2018-04-08 23:17
 **/
public class HealthServiceTest extends TestBase{

    @Resource
    private IHealthService iHealthService;

    @Test
    public void testSelect7Day(){
        Long userId = 1L;
        ServerResponse<List<HealthRecordVO>> healthRecordVOList = iHealthService.selectSevenDay(userId);
        System.out.println(JSON.toJSON(healthRecordVOList));
    }

    @Test
    public void testSelectNow(){
        Long userId = 1L;
        ServerResponse<HealthRecordVO> healthRecordVO= iHealthService.selectNow(userId);
        System.out.println(JSON.toJSON(healthRecordVO));
    }
}
