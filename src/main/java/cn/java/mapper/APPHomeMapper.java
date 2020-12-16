package cn.java.mapper;/*
 * @Author:叶婉婷
 * @DATE:2020/12/16
 *
 */

import cn.java.bean.Coursetable;

import java.util.List;

public interface APPHomeMapper {
    public List<Coursetable> getFreeCourse();
    public List<Coursetable> getTopCourse();
    public List<Coursetable> getGoodCourse();
}
