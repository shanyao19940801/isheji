package com.isheji.project.spring;

import com.isheji.project.dao.UserInfoDao;
import com.isheji.project.service.IUserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by shanyao on 2018/4/10.
 */
public class SpringTest {
    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/spring/spring-mybatis.xml");
        IUserService userService = (IUserService) context.getBean("userServcie");
        UserInfoDao userInfoDao = (UserInfoDao) context.getBean("userInfoDao");
    }
}
