package com.isheji.project.service.Impl;

import com.isheji.project.dao.ImageDetailMapper;
import com.isheji.project.entity.ImageDetail;
import com.isheji.project.service.IImageDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("imageDetailService")
public class ImageDetailServiceImpl implements IImageDetailService {
    @Autowired
    ImageDetailMapper imageDetailMapper;

    @Transactional
    public List<ImageDetail> getImageDetailByListId(String id, String flag) {
        //TODO 这儿的flag
        return imageDetailMapper.getImageDetailByListId(id);
//        return imageDetailRepo.getImageDetail(id,flag);

    }

    @Transactional
    public void addImageList(List<ImageDetail> imageDetailList) {
        for (ImageDetail imageDetail : imageDetailList) {
            imageDetailMapper.insert(imageDetail);
        }
    }

}
