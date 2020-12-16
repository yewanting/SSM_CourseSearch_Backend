package cn.java.controller;/*
 * @Author:叶婉婷
 * @DATE:2020/12/16
 *
 */


import cn.java.bean.SearchCourseData;
import cn.java.service.APPCourseService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin
public class APPCourseController {
    @Autowired
    private APPCourseService appCourseService;

    //获取手机版的搜索页的课程数
    @RequestMapping(value = "/api/get_app_searchgoods",produces="application/json;charset=UTF-8")
    @ResponseBody
    public String getSearchCourse(@RequestBody String params) throws Exception{

//        System.out.println(params);
        JSONObject jsonObject = JSONObject.fromObject(params);

        return appCourseService.getSearchCourse(jsonObject.getString("searchtext"),
                jsonObject.getInt("isFree"), jsonObject.getInt("isSort")
        );
    }
}
