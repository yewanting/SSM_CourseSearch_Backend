package cn.java.controller;/*
 * @Author:叶婉婷
 * @DATE:2020/12/1
 *
 */

import cn.java.bean.SearchCourseData;
import cn.java.bean.TransCourseData;
import cn.java.service.CourseService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;


@Controller
@CrossOrigin
public class CourseController {
    @Autowired
    private CourseService courseService;

    //获取网页版的发现页的课程数
    @RequestMapping(value = "/api/gethomegoods",produces="application/json;charset=UTF-8")
    @ResponseBody
    public String getDiscoveryGoods(@RequestBody TransCourseData formatTransDate) throws Exception{
        System.out.println(formatTransDate.getCoursetotallabel());
        return courseService.getdiscoverygoods(formatTransDate.getCoursetotallabel());
    }


    //获取网页版的搜索页的课程数
    @RequestMapping(value = "/api/postdata",produces="application/json;charset=UTF-8")
    @ResponseBody
    public String getSearchCourse(@RequestBody String params) throws Exception{

//        System.out.println(params);
        JSONObject jsonObject = JSONObject.fromObject(params);
        SearchCourseData searchCourseData=(SearchCourseData)JSONObject.toBean(jsonObject,SearchCourseData.class);

        int minprice=-1;
        int maxprice=-1;
        if(jsonObject.getString("minprice").equals(""))
        {
            minprice=-1;
        }else
        {
            minprice = Integer.parseInt(jsonObject.getString("minprice"));
        }
        if(jsonObject.getString("maxprice").equals(""))
        {
           maxprice=-1;
        }else {
            maxprice= Integer.parseInt(jsonObject.getString("maxprice"));
        }

        return courseService.getSearchCourse(jsonObject.getString("searchtext"),
                jsonObject.getInt("curpage"),jsonObject.getLong("pagesize"), searchCourseData.getSearchwebsite(),
                jsonObject.getInt("isFree"), jsonObject.getInt("isSort"),minprice,
                maxprice
                );

    }

//    //获取搜索结果的课程总数，方便后面分页
    @RequestMapping(value = "/api/getcount",produces="application/json;charset=UTF-8")
    @ResponseBody
    public String getCount(@RequestBody String params) throws Exception{
        JSONObject jsonObject = JSONObject.fromObject(params);
        SearchCourseData searchCourseData=(SearchCourseData)JSONObject.toBean(jsonObject,SearchCourseData.class);
        int minprice=-1;
        int maxprice=-1;
        if(jsonObject.getString("minprice").equals(""))
        {
            minprice=-1;
        }else
        {
            minprice = Integer.parseInt(jsonObject.getString("minprice"));
        }
        if(jsonObject.getString("maxprice").equals(""))
        {
            maxprice=-1;
        }else {
            maxprice= Integer.parseInt(jsonObject.getString("maxprice"));
        }


        return courseService.getCount(jsonObject.getString("searchtext"),
                jsonObject.getInt("curpage"),jsonObject.getLong("pagesize"), searchCourseData.getSearchwebsite(),
                jsonObject.getInt("isFree"), jsonObject.getInt("isSort"),minprice,
                maxprice);
    }



}
