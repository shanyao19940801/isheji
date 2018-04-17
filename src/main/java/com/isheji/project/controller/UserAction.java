package com.isheji.project.controller;

import com.isheji.project.entity.UserInfo;
import com.isheji.project.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by user on 2018/4/11.
 */
@Controller
@RequestMapping("/user")
public class UserAction {
    @Autowired
    IUserService userService;

    @RequestMapping("/regist")
    public String regist(UserInfo user, Model model){

        user.setAvatar("34");
        user.setUserName("wer");
        userService.register(user);

        model.addAttribute("msg", "注册成功");
        //注册成功后跳转success.jsp页面
        return "success";
    }

    @RequestMapping(value = "/user/",method = RequestMethod.GET)
    public ResponseEntity<List<UserInfo>> listAlluser() {
        List<UserInfo> list = userService.findAllUser();
        if (list == null || list.isEmpty()) {
            return new ResponseEntity<List<UserInfo>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<UserInfo>>(list, HttpStatus.OK);
    }
}
