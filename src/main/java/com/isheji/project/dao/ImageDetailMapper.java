package com.isheji.project.dao;

import com.isheji.project.entity.ImageDetail;
import tk.mybatis.mapper.common.Mapper;
//import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ImageDetailMapper extends Mapper<ImageDetail>{
    int deleteByPrimaryKey(Integer id);

    int insert(ImageDetail record);

    int insertSelective(ImageDetail record);

    ImageDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ImageDetail record);

    int updateByPrimaryKey(ImageDetail record);

    List<ImageDetail> getImageDetailByListId(String id);
}