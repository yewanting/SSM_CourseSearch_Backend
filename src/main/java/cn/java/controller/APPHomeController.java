package cn.java.controller;/*
 * @Author:叶婉婷
 * @DATE:2020/12/16
 *
 */

import cn.java.bean.SearchCourseData;
import cn.java.service.APPHomeService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin
public class APPHomeController {
    @Autowired
    private APPHomeService appHomeService;

    //获取手机版的首页的免费课程
    @RequestMapping(value = "/api/get_app_free_goods",produces="application/json;charset=UTF-8")
    @ResponseBody
    public String getAPPFreeCourse(@RequestBody String params) throws Exception{

        return appHomeService.getFreeCourse();
    }

    //获取手机版的首页的热门课程
    @RequestMapping(value = "/api/get_app_top_goods",produces="application/json;charset=UTF-8")
    @ResponseBody
    public String getAPPTopCourse(@RequestBody String params) throws Exception{

        return appHomeService.getTopCourse();
    }

    //获取手机版的首页的推荐课程
    @RequestMapping(value = "/api/get_app_good_goods",produces="application/json;charset=UTF-8")
    @ResponseBody
    public String getAPPGoodCourse(@RequestBody String params) throws Exception{

        return appHomeService.getGoodCourse();
    }
}
