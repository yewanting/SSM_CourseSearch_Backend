package cn.java.service.impl;/*
 * @Author:叶婉婷
 * @DATE:2020/12/16
 *
 */

import cn.java.bean.Coursetable;
import cn.java.mapper.APPCourseMapper;
import cn.java.service.APPCourseService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class APPCourseServiceImpl implements APPCourseService {
    @Autowired
    APPCourseMapper appCourseMapper;


    //获取搜索结果的课程
    @Transactional   //使用事务管理
    public String getSearchCourse(String searchText,int isFree,int isSort){
        List<Coursetable> coursetableList = null;
        Map paramMap = new HashMap();
        paramMap.put("searchText",searchText);
        if(isFree==0) {
            if (isSort == 3) {
                //免费课程综合
                coursetableList = appCourseMapper.getAllSearchCourseFree(paramMap);
            } else {
                //免费课程销量从高到低
                coursetableList = appCourseMapper.getAllSearchCourseFreePopular(paramMap);
            }
        }else if(isFree==1)
        {
            if(isSort==0)
            {
                //付费课程综合
                coursetableList = appCourseMapper.getAllSearchCourseCost(paramMap);
            }else if(isSort==1)
            {
                //付费课程价格从低到高排序
                coursetableList = appCourseMapper.getAllSearchCourseCostPriceASC(paramMap);
            }else if(isSort==2)
            {
                //付费课程价格从高到低排序
                coursetableList = appCourseMapper.getAllSearchCourseCostPriceDESC(paramMap);
            }else if(isSort==3)
            {
                //付费课程销量从高到低
                coursetableList = appCourseMapper.getAllSearchCourseCostPopular(paramMap);
            }
        }

        return JSON.toJSONString(coursetableList);

    }
}
