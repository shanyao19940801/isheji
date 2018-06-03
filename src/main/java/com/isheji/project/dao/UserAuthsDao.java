package com.isheji.project.dao;

import com.isheji.project.entity.UserAuths;
import com.isheji.project.entity.UserInfo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserAuthsDao extends Mapper<UserAuths>{
    /*int deleteByPrimaryKey(Integer authId);

    int insert(UserAuths record);

    int insertSelective(UserAuths record);

    UserAuths selectByPrimaryKey(Integer authId);

    int updateByPrimaryKeySelective(UserAuths record);

    int updateByPrimaryKey(UserAuths record);


    List<UserInfo> findUserAll();*/
    UserAuths findUserAuthByIdentifier(String identifier);
}