package com.isheji.project.dao;

import com.isheji.project.entity.UserAuths;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAuthsDao {
    int deleteByPrimaryKey(Integer authId);

    int insert(UserAuths record);

    int insertSelective(UserAuths record);

    UserAuths selectByPrimaryKey(Integer authId);

    int updateByPrimaryKeySelective(UserAuths record);

    int updateByPrimaryKey(UserAuths record);
}