package cn.java.service.impl;/*
 * @Author:叶婉婷
 * @DATE:2020/12/16
 *
 */


import cn.java.bean.Coursetable;
import cn.java.mapper.APPDiscoveryMapper;
import cn.java.service.APPDiscoveryService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class APPDiscoveryServiceImpl implements APPDiscoveryService {
    @Autowired
    APPDiscoveryMapper appDiscoveryMapper;


    public String getDiscoveryCourse(String coursetotallabel,int isFree,int isSort){
        List<Coursetable> coursetableList = null;
        System.out.println("1111");
        if(isFree==0||isFree==-1)//免费课程
        {
            if (isSort == 3) {
                //免费课程综合
                coursetableList = appDiscoveryMapper.getAllSearchCourseFree(coursetotallabel);
            } else {
                //免费课程销量从高到低
                coursetableList = appDiscoveryMapper.getAllSearchCourseFreePopular(coursetotallabel);
            }
        }else if(isFree==1)
        {
            if(isSort==0)
            {
                //付费课程综合
                coursetableList = appDiscoveryMapper.getAllSearchCourseCost(coursetotallabel);
            }else if(isSort==1)
            {
                //付费课程价格从低到高排序
                coursetableList = appDiscoveryMapper.getAllSearchCourseCostPriceASC(coursetotallabel);
            }else if(isSort==2)
            {
                //付费课程价格从高到低排序
                coursetableList = appDiscoveryMapper.getAllSearchCourseCostPriceDESC(coursetotallabel);
            }else if(isSort==3)
            {
                //付费课程销量从高到低
                coursetableList = appDiscoveryMapper.getAllSearchCourseCostPopular(coursetotallabel);
            }
        }
        System.out.println("22222");

        return JSON.toJSONString(coursetableList);
    }
}
