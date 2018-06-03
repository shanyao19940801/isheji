package com.isheji.project.service;

import com.isheji.project.entity.ImageList;

import java.util.List;

/**
 * Created by shanyao on 2018/6/3.
 */
public interface IImageListService {
    List<ImageList> getImageListWithTypeAndPageIndexAndPageSize(int pageIndex, int pageSize, int type);

    void addImageList(List<ImageList> imageListList);

    @Deprecated  //TODO
    String getPages(int type, int pageSize);

    void dellist(List<String> list);
}
