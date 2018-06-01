package com.isheji.project.service;

import com.isheji.project.dao.ImageDetailMapper;
import com.isheji.project.entity.ImageDetail;
import com.isheji.project.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ImageDetailService {
//    @Autowired
//    ImageDetailRepo imageDetailRepo;
    @Autowired
    ImageDetailMapper imageDetailMapper;

    @Transactional
    public List<ImageDetail> getImageDetail(String id, String flag) {
        return imageDetailMapper.getImageDetail(id, flag);
//        return imageDetailRepo.getImageDetail(id,flag);

    }

    @Transactional
    public void addImageList(List<ImageDetail> imageDetailList) {
        for (ImageDetail imageDetail : imageDetailList) {
            imageDetailMapper.insert(imageDetail);
        }
//        imageDetailRepo.addImageDetail(imageDetailList);
    }

}
