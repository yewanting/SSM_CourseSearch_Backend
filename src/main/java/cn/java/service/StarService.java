package cn.java.service;/*
 * @Author:叶婉婷
 * @DATE:2020/12/2
 *
 */

public interface StarService {

    //显示用户所收藏的课程
    public String selectUserStar(String token);

    //添加收藏的课程
    public String insertUserStar(String token,String courseid);


    //删除收藏的课程
    public String deleteUserStar(String token,String courseid);

}
