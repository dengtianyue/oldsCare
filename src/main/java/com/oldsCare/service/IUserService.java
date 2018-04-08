package com.oldsCare.service;

import com.oldsCare.common.ServerResponse;
import com.oldsCare.pojo.User;
import com.oldsCare.vo.UserVO;

/**
 * Created by tyt
 */
public interface IUserService {

    ServerResponse<UserVO> login(String username, String passwrod);

    ServerResponse<String> register(User user);

    ServerResponse<String> checkValid(String str, String type);

    ServerResponse<UserVO> updateInformation(User user);

    ServerResponse<UserVO> getInformation(Long userId);

}
