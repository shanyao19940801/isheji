package com.isheji.project.controller;

import com.isheji.project.entity.UserInfo;
import com.isheji.project.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by user on 2018/4/11.
 */
@Controller
@RequestMapping("/user")
public class UserAction {
    @Autowired
    IUserService userService;

    @RequestMapping("regist")
    public String regist(UserInfo user, Model model){

        user.setAvatar("34");
        user.setUserName("wer");
        userService.register(user);

        model.addAttribute("msg", "注册成功");
        //注册成功后跳转success.jsp页面
        return "success";
    }
}
