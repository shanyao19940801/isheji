package com.isheji.project.service;

import com.isheji.project.entity.UserInfo;

import java.util.List;

/**
 * Created by shanyao on 2018/4/10.
 */
public interface IUserService {

    public void register(UserInfo userInfo);

    List<UserInfo> findAllUser();
}
