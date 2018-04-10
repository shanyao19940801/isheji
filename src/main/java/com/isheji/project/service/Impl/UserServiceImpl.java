package com.isheji.project.service.Impl;

import com.isheji.project.dao.UserInfoDao;
import com.isheji.project.entity.UserInfo;
import com.isheji.project.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * Created by shanyao on 2018/4/10.
 */
@Service("userServcie")
public class UserServiceImpl implements IUserService {
    @Autowired
    UserInfoDao userInfoDao;


    @Override
    public void insertUserInfo(UserInfo userInfo) {
        userInfoDao.insert(userInfo);
    }
}
