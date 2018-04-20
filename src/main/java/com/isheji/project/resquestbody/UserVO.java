package com.isheji.project.resquestbody;

import com.isheji.project.entity.UserInfo;

/**
 * Created by shanyao on 2018/4/20.
 */
public class UserVO extends UserInfo {
    private String username;
    private String password;
    private String identity_type;
    private String identifier;//唯一标识 邮箱之类

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

    public String getIdentity_type() {
        return identity_type;
    }

    public void setIdentity_type(String identity_type) {
        this.identity_type = identity_type;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
}
