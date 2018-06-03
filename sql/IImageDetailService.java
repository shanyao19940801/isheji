package com.isheji.project.service;

import com.isheji.project.entity.ImageDetail;

import java.util.List;

/**
 * Created by shanyao on 2018/6/3.
 */
public interface IImageDetailService {
    List<ImageDetail> getImageDetailByListId(String id, String flag);

    void addImageList(List<ImageDetail> imageDetailList);
}
