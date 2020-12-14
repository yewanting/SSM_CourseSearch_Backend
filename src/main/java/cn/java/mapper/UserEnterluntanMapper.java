package cn.java.mapper;
/*
 * @Author:叶婉婷
 * @DATE:2020/12/3
 *
 */

import cn.java.bean.UserEnterluntan;

import java.util.List;
import java.util.Map;

public interface UserEnterluntanMapper {

    //根据用户名查看论坛名字
    public List<UserEnterluntan> getUserLuntanName(String username);

    //用户添加论坛
    public long postUserLuntanName(Map map);
}
