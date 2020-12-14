package cn.java.mapper;/*
 * @Author:叶婉婷
 * @DATE:2020/12/2
 *
 */

import cn.java.bean.Star;

import java.util.List;
import java.util.Map;

public interface StarMapper {

    //获取收藏的课程
    public List<Star> getStarCourse(String token);

    //添加收藏的课程
    public int insertStarCourse(Map map);

    //删除收藏的课程
    public int deleteStarCourse(String courseid);
}
