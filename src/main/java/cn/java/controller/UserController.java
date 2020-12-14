package cn.java.controller;/*
 * @Author:叶婉婷
 * @DATE:2020/12/2
 *
 */

import cn.java.bean.User;
import cn.java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    //用户注册信息
    @RequestMapping(value = "/api/postuserinfo",produces="application/json;charset=UTF-8")
    @ResponseBody
    public String postUserInfo(@RequestBody User user) throws Exception{
        return userService.postUserInfo(user.getUsername(), user.getPassword());
    }

    //用户登录信息
    @RequestMapping(value = "/api/getuserinfo",produces="application/json;charset=UTF-8")
    @ResponseBody
    public String getUserInfo(@RequestBody User user) throws Exception{
        return userService.getUserInfo(user.getUsername(), user.getPassword());
    }


}
