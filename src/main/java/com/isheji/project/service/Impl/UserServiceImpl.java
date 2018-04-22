package com.isheji.project.service.Impl;

import com.github.pagehelper.PageHelper;
import com.isheji.project.dao.UserAuthsDao;
import com.isheji.project.dao.UserInfoDao;
import com.isheji.project.entity.UserInfo;
import com.isheji.project.service.IUserService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by shanyao on 2018/4/10.
 */
@Service("userServcie")
public class UserServiceImpl implements IUserService {
    @Autowired
    UserInfoDao userInfoDao;
    @Autowired
    UserAuthsDao userAuthsDao;

    @Override
    public void register(UserInfo userInfo) {
        userInfoDao.insert(userInfo);
    }

    @Override
    public List<UserInfo> findAllUser(int offset, int limit) {
        PageHelper.offsetPage(offset, limit);
        return userInfoDao.selectAll();
    }


    @Override
    public UserInfo findById(int id) {
        return userInfoDao.selectByPrimaryKey(id);
    }

    @Override
    public boolean isUserExist(UserInfo userInfo) {
        return !(userInfoDao.selectByPrimaryKey(userInfo.getUserId()) == null);
    }

    /**
     * 根据用户唯一标识查询用户登录auth
     * @param identifier
     * @return
     */
    @Override
    public boolean isIdentifierExist(String identifier) {

        return !(userAuthsDao.findUserAuthByIdentifier(identifier) == null);
    }

    /**
     * 分页
     * @param num
     * @param size
     * @return
     */
    public List<UserInfo> selectByPageNumSize(int num, int size) {
        PageHelper.offsetPage(num,size);
//        return userInfoDao.selectAll();
        return null;
    }
}
