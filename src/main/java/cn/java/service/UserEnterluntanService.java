package cn.java.service;
/*
 * @Author:叶婉婷
 * @DATE:2020/12/3
 *
 */

public interface UserEnterluntanService {

    //查看用户加入的论坛名
    public String getUserLuntanName(String token);

    //添加用户论坛
    public String postUserLuntanName(String token,String luntanname[],String entertime);
}
