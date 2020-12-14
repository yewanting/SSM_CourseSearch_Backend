package cn.java.service;
/*
 * @Author:叶婉婷
 * @DATE:2020/12/3
 *
 */

public interface LuntanContentService {

    //获取论坛内容
    public String getLuntanContent(String token,String luntanname,int curpage);


    //提交论坛内容
    public String postUserLuntanContent(String token,String who_add,String add_time,String content,String luntanname);



}
