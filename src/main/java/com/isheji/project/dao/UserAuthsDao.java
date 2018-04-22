package com.isheji.project.dao;

import com.isheji.project.entity.UserAuths;
import com.isheji.project.entity.UserInfo;

import java.util.List;

public interface UserAuthsDao {
    int deleteByPrimaryKey(Integer authId);

    int insert(UserAuths record);

    int insertSelective(UserAuths record);

    UserAuths selectByPrimaryKey(Integer authId);

    int updateByPrimaryKeySelective(UserAuths record);

    int updateByPrimaryKey(UserAuths record);

    UserAuths findUserAuthByIdentifier(String identifier);

    List<UserInfo> findUserAll();
}