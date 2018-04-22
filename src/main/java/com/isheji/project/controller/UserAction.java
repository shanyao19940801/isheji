package com.isheji.project.controller;

import com.github.pagehelper.PageInfo;
import com.isheji.project.entity.UserInfo;
import com.isheji.project.resquestbody.UserVO;
import com.isheji.project.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.util.UriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by user on 2018/4/11.
 */
@Controller
//@RequestMapping("/user")
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

    //查询列表
    @RequestMapping(value = "/user/list",method = RequestMethod.GET)
    public ResponseEntity<PageInfo<UserInfo>> listAlluser(HttpServletRequest request) {
        int offset = Integer.parseInt(request.getParameter("offset"));
        int limit = Integer.parseInt(request.getParameter("limit"));
        List<UserInfo> list = userService.findAllUser(offset,limit);
        PageInfo pageInfo = new PageInfo(list);
        if (list == null || list.isEmpty()) {
            return new ResponseEntity<PageInfo<UserInfo>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<PageInfo<UserInfo>>(pageInfo, HttpStatus.OK);
    }

    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserInfo> getUser(@PathVariable("id") int id) {
        System.out.println("Fetching user with id" + id);
        UserInfo userInfo = userService.findById(id);
        if (userInfo == null) {
            return new ResponseEntity<UserInfo>(userInfo, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<UserInfo>(userInfo, HttpStatus.OK);
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public ResponseEntity createUser(@RequestBody UserVO userInfo, UriComponentsBuilder uriComponentsBuilder) {
        if (userService.isIdentifierExist(userInfo.getIdentifier())) {
            System.out.println("該用戶名已存在");
            return new ResponseEntity(HttpStatus.CONFLICT);
        }
        userService.register(userInfo);
        HttpHeaders httpHeaders= new HttpHeaders();
        httpHeaders.setLocation(uriComponentsBuilder.path("user/user{id}").buildAndExpand(userInfo.getUserId()).toUri());
        return new ResponseEntity(httpHeaders, HttpStatus.CREATED);
    }
}
