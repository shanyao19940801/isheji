package com.isheji.project.dao;

import com.isheji.project.entity.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by shanyao on 2018/4/10.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/spring/spring-context.xml")
public class UserInfoDaoTest {
    @Autowired
    UserInfoDao userInfoDao;
    @Test
    public void insert() throws Exception {
        UserInfo userInfo = new UserInfo();
        userInfo.setAvatar("01");
        userInfo.setUserName("lin08");
        userInfoDao.insert(userInfo);
    }
    @Test
    public void findAllUser() {
        List<UserInfo> list = userInfoDao.findAllUser();
        System.out.printf("");
    }

}