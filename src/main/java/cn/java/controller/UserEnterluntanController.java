package cn.java.controller;/*
 * @Author:叶婉婷
 * @DATE:2020/12/3
 *
 */

import cn.java.bean.TransMultiData;
import cn.java.bean.User;
import cn.java.service.UserEnterluntanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin
public class UserEnterluntanController {
    @Autowired
    UserEnterluntanService userEnterluntanService;

    //查询用户加入的论坛名
    @RequestMapping(value = "/api/getuserluntanname",produces="application/json;charset=UTF-8")
    @ResponseBody
    public String getUserLuntanName(@RequestBody TransMultiData transMultiData) throws Exception{
        return userEnterluntanService.getUserLuntanName(transMultiData.getToken());
    }

    //用户新添加论坛
    @RequestMapping(value = "/api/postuserluntanname",produces="application/json;charset=UTF-8")
    @ResponseBody
    public String postUserLuntanName(@RequestBody TransMultiData transMultiData) throws Exception{
        return userEnterluntanService.postUserLuntanName(transMultiData.getToken(), transMultiData.getLuntanNames(), transMultiData.getEntertime());
    }
}
