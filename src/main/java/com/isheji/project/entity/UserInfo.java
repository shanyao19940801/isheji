package com.isheji.project.entity;

import java.util.Date;

public class UserInfo {
    private Integer userId;

    private String userName;

    private String avatar;

    private Integer cDelete;

    private String role;

    private String sex;

    private Integer age;

    private Date inserDate;

    private Date updateDate;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public Integer getcDelete() {
        return cDelete;
    }

    public void setcDelete(Integer cDelete) {
        this.cDelete = cDelete;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getInserDate() {
        return inserDate;
    }

    public void setInserDate(Date inserDate) {
        this.inserDate = inserDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}