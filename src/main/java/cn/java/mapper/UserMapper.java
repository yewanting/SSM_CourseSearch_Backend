package cn.java.mapper;/*
 * @Author:叶婉婷
 * @DATE:2020/12/2
 *
 */

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public interface UserMapper {

    //注册
    public int postUserInfo(Map map);

    //登录
    public long getUserInfoId(Map map);

    //每次登录更新token值
    public int updateToken(Map map);

    //判断用户是否合法
    public String getUserName(String token);
}
