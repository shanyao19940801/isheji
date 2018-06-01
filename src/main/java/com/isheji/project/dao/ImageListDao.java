package com.isheji.project.dao;

import com.isheji.project.entity.ImageList;
import tk.mybatis.mapper.common.Mapper;

public interface ImageListDao extends Mapper<ImageList> {
    int deleteByPrimaryKey(String id);

    int insert(ImageList record);

    int insertSelective(ImageList record);

    ImageList selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ImageList record);

    int updateByPrimaryKey(ImageList record);
}