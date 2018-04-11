package com.isheji.project.service;

import com.isheji.project.entity.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by shanyao on 2018/4/10.
 */
@RunWith(SpringJUnit4ClassRunner.class) //指定测试用例的运行器 这里是指定了Junit4
@ContextConfiguration("classpath:/spring/spring-context.xml")
//@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
//不添加此设置,测试service层的事务管理
//service层与dao层的测试时相同的,不同之处,在于service多数都在配置文件中配置了spring的事务管理
public class UserServiceImplTest {
    @Autowired
    IUserService userService;
    @Test
    public void insertUserInfo() throws Exception {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName("service");
        userService.register(userInfo);
    }

}