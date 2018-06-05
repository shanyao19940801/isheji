package com.isheji.project.controller;

import com.isheji.project.common.utils.ResultUtil;
import com.isheji.project.entity.ImageList;
import com.isheji.project.entity.Msg;
import com.isheji.project.service.IImageListService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController()
@RequestMapping(value = "/image")
@CrossOrigin
public class ImageListController {
    private static Logger logger = LoggerFactory.getLogger(ImageListController.class);
    @Resource
    IImageListService imageListService;

    @RequestMapping(value = "/getList", method = RequestMethod.GET)
    public Msg getImageList(HttpServletRequest request) {
        logger.info("getList");
        String sIndex = request.getParameter("pageIndex");
        String sSize = request.getParameter("pageSize");
        String sType = request.getParameter("type");
        if(sIndex == null || sSize == null) {
            return ResultUtil.error(1,"参数错误");
        }
        int pageIndex = Integer.parseInt(sIndex);
        int pageSize = Integer.parseInt(sSize);
        int type = 0;
        if(sType != null) {
           type = Integer.parseInt(sType);
        }

        List<ImageList> list = null;
        try {
            list = imageListService.getImageListWithTypeAndPageIndexAndPageSize(pageIndex, pageSize, type);
            return ResultUtil.success(list);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtil.error(9999,"系统出错，请联系管理员");
        }
    }

    @RequestMapping(value = "/addList", method = RequestMethod.POST)
    public Msg addImageList(@RequestBody List<ImageList> imageListList) {
        System.out.println("addList post receive " + imageListList.toString());
        if(imageListList.size() == 0) {
            return ResultUtil.error(2,"list不能为空");
        }
        imageListService.addImageList(imageListList);
        return ResultUtil.success();

    }

    @RequestMapping(value = "/getPages", method = RequestMethod.GET)
    public Msg getPages(@RequestParam(value="type",defaultValue="0", required =false) int type ,
                        @RequestParam(value="pageSize",defaultValue="10", required =false) int pageSize ) {
        //TODO
        System.out.println("getPages post receive type" + type +"<<");
        System.out.println("getPages post receive pageSize" + pageSize +"<<");
        return ResultUtil.success(imageListService.getPages(type, pageSize ));
    }

    @RequestMapping(value = "/deleteList",  method = RequestMethod.POST)
    public Msg deleteImageList(@RequestBody List<String> list){
        System.out.println("id  is :"+list.toString());
        if(list ==null||list.size() ==0) {
            return ResultUtil.error(2, "ID不能为空！");
        }
        imageListService.dellist(list);
        return ResultUtil.success();
    }
}