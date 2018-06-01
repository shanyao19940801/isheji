package com.isheji.project.dao;

import com.isheji.project.entity.Love;

public interface LoveMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Love record);

    int insertSelective(Love record);

    Love selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Love record);

    int updateByPrimaryKey(Love record);
}