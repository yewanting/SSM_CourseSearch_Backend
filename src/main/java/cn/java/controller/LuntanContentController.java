package cn.java.controller;/*
 * @Author:叶婉婷
 * @DATE:2020/12/3
 *
 */

import cn.java.bean.TransMultiData;
import cn.java.service.LuntanContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin
public class LuntanContentController {
    @Autowired
    LuntanContentService luntanContentService;


    //查询论坛内容
    @RequestMapping(value = "/api/getluntancontent",produces="application/json;charset=UTF-8")
    @ResponseBody
    public String getLuntanContent(@RequestBody TransMultiData transMultiData) throws Exception{
        System.out.println("查询用户的所有论坛"+transMultiData.getToken());
        return luntanContentService.getLuntanContent(transMultiData.getToken(),
                transMultiData.getLuntanName(),transMultiData.getCurpage());
    }

    //添加论坛内容
    @RequestMapping(value = "/api/postluntancontent",produces="application/json;charset=UTF-8")
    @ResponseBody
    public String postLuntanContent(@RequestBody TransMultiData transMultiData) throws Exception{
        System.out.println("添加用户计划"+transMultiData.getToken());
        return luntanContentService.postUserLuntanContent(transMultiData.getToken(),transMultiData.getWhoAdd(),
                transMultiData.getAddTime(),transMultiData.getContent(),
                transMultiData.getLuntanName());
    }
}
