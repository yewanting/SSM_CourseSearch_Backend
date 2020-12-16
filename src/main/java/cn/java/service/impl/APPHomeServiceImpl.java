package cn.java.service.impl;/*
 * @Author:叶婉婷
 * @DATE:2020/12/16
 *
 */

import cn.java.bean.Coursetable;
import cn.java.mapper.APPCourseMapper;
import cn.java.mapper.APPHomeMapper;
import cn.java.service.APPHomeService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class APPHomeServiceImpl implements APPHomeService {
    @Autowired
    APPHomeMapper appHomeMapper;


    public String getFreeCourse(){
        List<Coursetable> coursetableList = null;
        coursetableList = appHomeMapper.getFreeCourse();
        return JSON.toJSONString(coursetableList);
    }
    public String getTopCourse(){
        List<Coursetable> coursetableList = null;
        coursetableList = appHomeMapper.getTopCourse();
        return JSON.toJSONString(coursetableList);

    }
    public String getGoodCourse(){
        List<Coursetable> coursetableList = null;
        coursetableList = appHomeMapper.getGoodCourse();
        return JSON.toJSONString(coursetableList);

    }

}
