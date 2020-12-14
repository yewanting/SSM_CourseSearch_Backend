package cn.java.service;
 /*
 * @Author:叶婉婷
 * @DATE:2020/12/1
 *
 */

public interface CourseService {
    public String getSearchCourse(String searchText ,int curpage,long pagesize,String[]searchwebsite,int isFree,int isSort,int minprice,int maxprice);
    public String getCount(String searchText,int curpage,long pagesize,String[]searchwebsite,int isFree,int isSort,int minprice,int maxprice);
    public String getdiscoverygoods(String coursetotallabel);



}
