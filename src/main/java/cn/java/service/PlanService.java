package cn.java.service;/*
 * @Author:叶婉婷
 * @DATE:2020/12/3
 *
 */

public interface PlanService {

    //显示用户的所有计划
    public String getPlan(String token);

    //插入用户计划
    public String insertPlan(String token,String date,String content,String ifSuccess,String score);

    //修改用户计划
    public String updatePlan(String token,String date,String content,String ifSuccess,String score,long id);

    //删除用户计划
    public String deletePlan(String token,long id);

}
