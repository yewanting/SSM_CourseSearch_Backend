package cn.java.controller;/*
 * @Author:叶婉婷
 * @DATE:2020/12/3
 *
 */

import cn.java.bean.TransMultiData;
import cn.java.service.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin
public class PlanController {

    @Autowired
    private PlanService planService;

    //获取用户计划
    @RequestMapping(value = "/api/selectplan",produces="application/json;charset=UTF-8")
    @ResponseBody
    public String selectUserPlan(@RequestBody TransMultiData transMultiData) throws Exception{
        System.out.println("获取用户计划"+transMultiData.getToken());
        return planService.getPlan(transMultiData.getToken());
    }

    //添加用户计划
    @RequestMapping(value = "/api/insertuserplan",produces="application/json;charset=UTF-8")
    @ResponseBody
    public String insertUserPlan(@RequestBody TransMultiData transMultiData) throws Exception{
        System.out.println("添加用户计划"+transMultiData.getToken());
        return planService.insertPlan(transMultiData.getToken(),transMultiData.getDate(),
                transMultiData.getContent(),transMultiData.getIfSuccess(),transMultiData.getScore());
    }

    //修改用户计划
    @RequestMapping(value = "/api/updateuserplan",produces="application/json;charset=UTF-8")
    @ResponseBody
    public String updateUserPlan(@RequestBody TransMultiData transMultiData) throws Exception{
        System.out.println("修改用户计划"+transMultiData.getToken());
        return planService.updatePlan(transMultiData.getToken(),transMultiData.getDate(),
                transMultiData.getContent(),transMultiData.getIfSuccess(),
                transMultiData.getScore(),transMultiData.getId());
    }

    //删除用户计划
    @RequestMapping(value = "/api/deleteuserplan",produces="application/json;charset=UTF-8")
    @ResponseBody
    public String deleteUserPlan(@RequestBody TransMultiData transMultiData) throws Exception{
        System.out.println("删除用户计划"+transMultiData.getToken());
        return planService.deletePlan(transMultiData.getToken(),transMultiData.getId());
    }
}
