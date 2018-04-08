package com.oldsCare.vo;

import com.oldsCare.pojo.User;

/**
 * @program: oldsCare
 * @description:
 * @author: bufang
 * @create: 2018-04-08 17:14
 **/
public class UserVO {
    private Long id;

    private String username;

    private String password;

    private String telephone;

    private String address;

    private Integer role;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public static UserVO toVOFromEntity(User user) {
        if (user == null) {
            return null;
        }
        UserVO userVO = new UserVO();
        userVO.setId(user.getId());
        userVO.setUsername(user.getUsername());
        userVO.setPassword(user.getPassword());
        userVO.setTelephone(user.getTelephone());
        userVO.setAddress(user.getAddress());
        userVO.setRole(user.getRole());
        return userVO;
    }
}
