package cn.java.service.impl;
/*
 * @Author:叶婉婷
 * @DATE:2020/12/1
 *
 */

import cn.java.bean.Coursetable;
import cn.java.mapper.CourseMapper;
import cn.java.service.CourseService;
import com.alibaba.fastjson.JSON;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    CourseMapper courseMapper;

    //获取搜索结果的课程
    @Transactional   //使用事务管理
    public String getSearchCourse(String searchText,int curpage,long pagesize,String[]searchwebsite,int isFree,int isSort,int minprice,int maxprice){
        List<Coursetable> coursetableList = null;
        Map paramMap = new HashMap();
        paramMap.put("searchText",searchText);
        paramMap.put("curpage",(curpage-1)*pagesize);
        paramMap.put("pagesize",pagesize);
        paramMap.put("searchwebsite",searchwebsite);
        paramMap.put("isFree",isFree);
        paramMap.put("isSort",isSort);
        paramMap.put("minprice",minprice);
        paramMap.put("maxprice",maxprice);
        if(minprice!=-1&&maxprice!=-1)
        {
            if(isSort==0)
            {
                //价格区间所有课程
                coursetableList = courseMapper.getAllSearchCourseInterVal(paramMap);
            }else if(isSort==1)
            {
                //价格区间所有课程按价格从低到高排序
                coursetableList = courseMapper.getAllSearchCourseInterValPriceASC(paramMap);
            }else if(isSort==2)
            {
                //价格区间所有课程按价格从高到低排序
                coursetableList = courseMapper.getAllSearchCourseInterValPriceDES(paramMap);
            }else if(isSort==3)
            {
                //价格区间所有课程按销量从高到低排序
                coursetableList = courseMapper.getAllSearchCourseInterValPopular(paramMap);
            }
        }else
        {
            if(isFree==-1)
            {
                if(isSort==0)
                {
                    //所有搜索的课程
                    coursetableList = courseMapper.getAllSearchCourse(paramMap);
                }else if(isSort==1)
                {
                    //所有搜索的课程按价格从低到高排序
                    coursetableList = courseMapper.getAllSearchCoursePirceASC(paramMap);
                }else if(isSort==2)
                {
                    //所有搜索的课程按价格从高到低排序
                    coursetableList = courseMapper.getAllSearchCoursePirceDESC(paramMap);
                }else if(isSort==3)
                {
                    //所有搜索的课程按销量从高到低排序
                    coursetableList = courseMapper.getAllSearchCoursePopularDESC(paramMap);
                }
            }else if(isFree==0)
            {
                if(isSort==3)
                {
                    //免费课程综合
                    coursetableList = courseMapper.getAllSearchCourseFree(paramMap);
                }else
                {
                    //免费课程销量从高到低
                        coursetableList = courseMapper.getAllSearchCourseFreePopular(paramMap);
                }
            }else if(isFree==1)
            {
                if(isSort==0)
                {
                    //付费课程综合
                    coursetableList = courseMapper.getAllSearchCourseCost(paramMap);
                }else if(isSort==1)
                {
                    //付费课程价格从低到高排序
                    coursetableList = courseMapper.getAllSearchCourseCostPriceASC(paramMap);
                }else if(isSort==2)
                {
                    //付费课程价格从高到低排序
                    coursetableList = courseMapper.getAllSearchCourseCostPriceDESC(paramMap);
                }else if(isSort==3)
                {
                    //付费课程销量从高到低
                    coursetableList = courseMapper.getAllSearchCourseCostPopular(paramMap);
                }
            }
        }


        return JSON.toJSONString(coursetableList);

    }




    //获取网页版发现页的课程
    @Transactional   //使用事务管理
    public String getdiscoverygoods(String coursetotallabel){
        List<Coursetable> coursetableList;
        coursetableList = courseMapper.getDiscoveryGoods(coursetotallabel);
        for(Coursetable course:coursetableList)
        {
            System.out.println(course);
        }
        return  JSON.toJSONString(coursetableList);
    }

    //搜索页的课程数量
    @Transactional   //使用事务管理
    public String getCount(String searchText,int curpage,long pagesize,String[]searchwebsite,int isFree,int isSort,int minprice,int maxprice) {

        HashMap paramMap = new HashMap();
        paramMap.put("searchText",searchText);
        paramMap.put("curpage",(curpage-1)*pagesize);
        paramMap.put("pagesize",pagesize);
        paramMap.put("searchwebsite",searchwebsite);
        paramMap.put("isFree",isFree);
        paramMap.put("isSort",isSort);
        paramMap.put("minprice",minprice);
        paramMap.put("maxprice",maxprice);

        long count =0;
        if(minprice!=-1&&maxprice!=-1)
        {
             count = courseMapper.getSearchCourseInterValCount(paramMap);
        }else {
            if(isFree==-1)
            {
                count = courseMapper.getSearchCourseCount(paramMap);
            }else if(isFree==0)
            {
                count = courseMapper.getSearchCourseFreeCount(paramMap);
            }else if(isFree==1)
            {
                  count = courseMapper.getSearchCourseCostCount(paramMap);
            }
        }


        JSONObject object = new JSONObject();
        object.put("COUNT(*)",count);

        return JSON.toJSONString(object);

    }
}
