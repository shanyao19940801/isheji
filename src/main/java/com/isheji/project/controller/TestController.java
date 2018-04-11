package com.isheji.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by user on 2018/4/8.
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping(value = "/testadd")
    public void test() {
        System.out.println("test");
    }
}
