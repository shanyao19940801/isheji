package com.isheji.project.service.Impl;

import com.github.pagehelper.PageHelper;
import com.isheji.project.dao.ImageListMapper;
import com.isheji.project.entity.ImageList;
import com.isheji.project.service.IImageListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ImageListServiceImpl implements IImageListService {
    @Autowired
    ImageListMapper imageListMapper;

    @Transactional
    public List<ImageList> getImageListWithTypeAndPageIndexAndPageSize(int pageIndex, int pageSize, int type) {
        PageHelper.offsetPage(pageIndex, pageSize);
        return imageListMapper.getImageListWithType(type);
    }

    @Transactional
    public void addImageList(List<ImageList> imageListList) {
        for (ImageList imageList : imageListList)
        imageListMapper.insert(imageList);
    }

    public String getPages(int type, int pageSize) {
//        return imageListMapper.getPages(type, pageSize);
        return "2";
    }

    @Transactional
    public void dellist(List<String> ids){
        for (String imageListId : ids) {
            imageListMapper.deleteByPrimaryKey(imageListId);
        }
    }
}
