package com.isheji.project.service;

import com.isheji.project.entity.UserInfo;

import java.util.List;

/**
 * Created by shanyao on 2018/4/10.
 */
public interface IUserService {

    public void register(UserInfo userInfo);

    /**
     * 分页查询,
     * 如果要查询所有offset或者limit任何一个为0即可
     * @param offset
     * @param limit
     * @return
     */
    List<UserInfo> findAllUser(int offset, int limit);

    UserInfo findById(int id);

    /**
     * 判断userinfo是否存在，存在返回true，不存在返回：false
     * @param userInfo
     * @return
     */
    boolean isUserExist(UserInfo userInfo);

    boolean isIdentifierExist(String identifier);
}
