package com.oldsCare.pojo;

import java.util.Date;

public class User {
    private Long id;

    private String username;

    private String password;

    private String telephone;

    private String address;

    private Integer role;

    private String creator;

    private String editor;

    private Date createTime;

    private Date editTime;

    private Byte isDeleted;

    public User(Long id, String username, String password, String telephone, String address, Integer role, String creator, String editor, Date createTime, Date editTime, Byte isDeleted) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.telephone = telephone;
        this.address = address;
        this.role = role;
        this.creator = creator;
        this.editor = editor;
        this.createTime = createTime;
        this.editTime = editTime;
        this.isDeleted = isDeleted;
    }

    public User() {
        super();
    }

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
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor == null ? null : editor.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getEditTime() {
        return editTime;
    }

    public void setEditTime(Date editTime) {
        this.editTime = editTime;
    }

    public Byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }
}