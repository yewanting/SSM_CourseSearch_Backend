package cn.java.service;/*
 * @Author:叶婉婷
 * @DATE:2020/12/16
 *
 */

import org.springframework.stereotype.Service;


public interface APPCourseService {
    public String getSearchCourse(String searchText,int isFree,int isSort);

}
