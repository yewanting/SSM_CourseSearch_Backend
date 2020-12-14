package cn.java.controller;/*
 * @Author:叶婉婷
 * @DATE:2020/12/2
 *
 */

import cn.java.bean.TransMultiData;
import cn.java.service.StarService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin
public class StarController {
    @Autowired
    private StarService starService;

    //获取收藏的课程
    @RequestMapping(value = "/api/selectuserstar",produces="application/json;charset=UTF-8")
    @ResponseBody
    public String selectUserStar(@RequestBody String tokenObject) throws Exception{
        JSONObject jsonObject = JSONObject.fromObject(tokenObject);
        String token = jsonObject.getString("token");
        return starService.selectUserStar(token);
    }


    //添加收藏的课程
    @RequestMapping(value = "/api/insertuserstar",produces="application/json;charset=UTF-8")
    @ResponseBody
    public String insertUserStar(@RequestBody TransMultiData transMultiData) throws Exception{
//        System.out.println(transMultiData.getToken());
        return starService.insertUserStar(transMultiData.getToken(),transMultiData.getCourseid());
    }


    //删除收藏的课程
    @RequestMapping(value = "/api/deleteuserstar",produces="application/json;charset=UTF-8")
    @ResponseBody
    public String deleteUserStar(@RequestBody TransMultiData transMultiData) throws Exception{
//        System.out.println(transMultiData.getToken());
        return starService.deleteUserStar(transMultiData.getToken(),transMultiData.getCourseid());
    }



}
