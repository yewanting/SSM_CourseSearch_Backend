package cn.java.mapper;/*
 * @Author:叶婉婷
 * @DATE:2020/12/16
 *
 */

import cn.java.bean.Coursetable;

import java.util.List;
import java.util.Map;

public interface APPCourseMapper {

    //免费课程,排序综合
    public List<Coursetable> getAllSearchCourseFree(Map paramMap);

    //免费课程,销量从高到低
    public List<Coursetable> getAllSearchCourseFreePopular(Map paramMap);

    //付费课程，排序综合
    public List<Coursetable> getAllSearchCourseCost(Map paramMap);

    //付费课程，价格排序从低到高
    public List<Coursetable> getAllSearchCourseCostPriceASC(Map paramMap);


    //付费课程，价格排序从高到低
    public List<Coursetable> getAllSearchCourseCostPriceDESC(Map paramMap);


    //付费课程，销量从高到低
    public List<Coursetable> getAllSearchCourseCostPopular(Map paramMap);
}
