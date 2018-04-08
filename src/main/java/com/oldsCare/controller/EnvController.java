package com.oldsCare.controller;

import com.oldsCare.common.Const;
import com.oldsCare.common.ResponseCode;
import com.oldsCare.common.ServerResponse;
import com.oldsCare.pojo.EnvironmentRecord;
import com.oldsCare.pojo.User;
import com.oldsCare.service.IEnvService;
import com.oldsCare.vo.EnvironmentRecordVO;
import com.oldsCare.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @program: oldsCare
 * @description:
 * @author: bufang
 * @create: 2018-04-08 18:00
 **/
@Controller
@RequestMapping("/env/")
public class EnvController {

    @Autowired
    private IEnvService iEnvService;

    /**
     * 获取当前用户最后7天内的环境数据记录
     * @param session
     * @return
     */
    @RequestMapping("selectSevenDay.do")
    @ResponseBody
    public ServerResponse<List<EnvironmentRecordVO>> selectSevenDay(HttpSession session){
        UserVO user = (UserVO)session.getAttribute(Const.CURRENT_USER);
        if(user == null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),ResponseCode.NEED_LOGIN.getDesc());
        }
        return iEnvService.select7Day(user.getId());
    }

    /**
     * 查询当前环境数据
     * @param session
     * @return
     */
    @RequestMapping("selectNow.do")
    @ResponseBody
    public ServerResponse<EnvironmentRecordVO> selectNow(HttpSession session){
        UserVO user = (UserVO)session.getAttribute(Const.CURRENT_USER);
        if(user == null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),ResponseCode.NEED_LOGIN.getDesc());
        }
        return iEnvService.selectNow(user.getId());
    }


}
