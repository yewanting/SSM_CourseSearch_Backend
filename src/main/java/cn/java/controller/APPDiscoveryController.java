package cn.java.controller;/*
 * @Author:叶婉婷
 * @DATE:2020/12/16
 *
 */

import cn.java.service.APPCourseService;
import cn.java.service.APPDiscoveryService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin
public class APPDiscoveryController {

    @Autowired
    private APPDiscoveryService appDiscoveryService;

    //获取手机版的搜索页的课程数
    @RequestMapping(value = "/api/get_app_disco_goods",produces="application/json;charset=UTF-8")
    @ResponseBody
    public String getSearchCourse(@RequestBody String params) throws Exception{


        JSONObject jsonObject = JSONObject.fromObject(params);
        System.out.println(params);
        return appDiscoveryService.getDiscoveryCourse(jsonObject.getString("coursetotallabel"),
                jsonObject.getInt("isFree"), jsonObject.getInt("isSort")
        );
    }
}
