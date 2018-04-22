package com.isheji.project.pagehelper;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.isheji.project.dao.UserInfoDao;
import com.isheji.project.entity.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by shanyao on 2018/4/22.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/spring/spring-context.xml")
public class UserInfoPageHelper {
    @Autowired
    UserInfoDao userInfoDao;
    @Test
    public void testPageHelper() {
        PageHelper.offsetPage(0,0);
        List<UserInfo> list1 = userInfoDao.selectAll();
//        List<UserInfo> list = userInfoDao.findUserAll();

/*        PageInfo<UserInfo> pageInfo = new PageInfo<>(list);
        System.out.println(list.size());*/

    }


}
