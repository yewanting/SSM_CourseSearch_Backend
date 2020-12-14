package cn.java.service;/*
 * @Author:叶婉婷
 * @DATE:2020/12/2
 *
 */

public interface UserService {

    //用户注册
    public String postUserInfo(String username,String password);

    //用户登录
    public String getUserInfo(String username,String password);
}
