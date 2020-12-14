package cn.java.mapper;
/*
 * @Author:叶婉婷
 * @DATE:2020/12/3
 *
 */

import cn.java.bean.LuntanContent;

import java.util.List;
import java.util.Map;

public interface LuntanContentMapper {

    //查询论坛内容
    public List<LuntanContent> getLuntanContent(Map map);

    //提交论坛内容
    public int postUserLuntanContent(Map map);
}
