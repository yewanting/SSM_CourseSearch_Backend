package cn.java.mapper;/*
 * @Author:叶婉婷
 * @DATE:2020/12/1
 *
 */

import cn.java.bean.Coursetable;

import java.util.List;
import java.util.Map;

public interface CourseMapper {

    //查询发现页的课程
    public List<Coursetable> getDiscoveryGoods(String coursetotallabel);

    //无价格区间所有搜索的课程
    public List<Coursetable> getAllSearchCourse(Map paramMap);

    //无价格区间所有搜索的课程按价格从低到高排序
    public List<Coursetable> getAllSearchCoursePirceASC(Map paramMap);

    //无价格区间所有搜索的课程按价格从高到低排序
    public List<Coursetable> getAllSearchCoursePirceDESC(Map paramMap);

    //无价格区间所有搜索的课程按销量从高到低排序
    public List<Coursetable> getAllSearchCoursePopularDESC(Map paramMap);


    //免费课程,排序综合
    public List<Coursetable> getAllSearchCourseFree(Map paramMap);

    //免费课程,销量从高到低
    public List<Coursetable> getAllSearchCourseFreePopular(Map paramMap);


    //有价格区间，排序综合的查询
    public List<Coursetable> getAllSearchCourseInterVal(Map paramMap);

    //有价格区间，价格排序从低到高
    public List<Coursetable> getAllSearchCourseInterValPriceASC(Map paramMap);

    //有价格区间，价格排序从低到高
    public List<Coursetable> getAllSearchCourseInterValPriceDES(Map paramMap);

    //有价格区间，销量从高到低
    public List<Coursetable> getAllSearchCourseInterValPopular(Map paramMap);





    //付费课程，排序综合
    public List<Coursetable> getAllSearchCourseCost(Map paramMap);

    //付费课程，价格排序从低到高
    public List<Coursetable> getAllSearchCourseCostPriceASC(Map paramMap);


    //付费课程，价格排序从高到低
    public List<Coursetable> getAllSearchCourseCostPriceDESC(Map paramMap);


    //付费课程，销量从高到低
    public List<Coursetable> getAllSearchCourseCostPopular(Map paramMap);



    //查询课程数量,有价格区间
    public long getSearchCourseInterValCount(Map paramMap);

    //查询课程数量,免费+付费课程
    public long getSearchCourseCount(Map paramMap);

    //查询课程数量，免费课程
    public long getSearchCourseFreeCount(Map paramMap);

    //查询课程数量，付费课程
    public long getSearchCourseCostCount(Map paramMap);





}
