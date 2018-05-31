package com.isheji.project.controller;

import com.isheji.project.common.utils.Access;
import com.isheji.project.common.utils.ResultUtil;
import com.isheji.project.entity.ImageDetail;
import com.isheji.project.entity.Msg;
import com.isheji.project.service.ImageDetailService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping(value = "/image")
@CrossOrigin
public class ImageDetailController {

    @Resource
    ImageDetailService imageDetailService;

    private static final Log logger = LogFactory.getLog(ImageDetailController.class);

    //TODO 不明白access干嘛的
    @Access
    @RequestMapping(value = "/getDetail", method = RequestMethod.GET)
    public Msg getImageDetail(HttpServletRequest request) {
        logger.info("getImageDetail开始");
        String id = request.getParameter("id");
        String flag = request.getAttribute("flag").toString();
        if(id == null) {
            return ResultUtil.error(3,"id不能为空");
        }
        return ResultUtil.success(imageDetailService.getImageDetail(id,flag));
    }

    @RequestMapping(value = "/addDetail",  method = RequestMethod.POST)
    public Msg addImageDetail(@RequestBody List<ImageDetail> imageDetailList) {
        logger.info("addImageDetail开始");
        if(imageDetailList.size() == 0) {
            return ResultUtil.error(2,"list不能为空");
        }
        imageDetailService.addImageList(imageDetailList);
        return ResultUtil.success();
    }
}