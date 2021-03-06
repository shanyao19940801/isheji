package com.isheji.project.dao;

import com.isheji.project.entity.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    private static Logger logger = LoggerFactory.getLogger(UserInfoDaoTest.class);
    @Autowired
    UserInfoDao userInfoDao;
    @Test
    public void insert() throws Exception {
        logger.error("sdfad");
        UserInfo userInfo = new UserInfo();
        userInfo.setAvatar("01");
        userInfo.setUserName("lin09");
        userInfo.setcDelete(70000001);
        userInfo.setRole("admin");
        userInfo.setSex("男");
        userInfo.setAge(90);
        userInfoDao.insert(userInfo);
    }
    @Test
    public void selectByid() {
        UserInfo userInfo = userInfoDao.selectByPrimaryKey(100000000);
        System.out.println(userInfo.getAge());
    }
    @Test
    public void findAllUser() {
        List<UserInfo> list = userInfoDao.selectAll();

        System.out.printf("");
    }

}