package cn.java.mapper;/*
 * @Author:叶婉婷
 * @DATE:2020/12/3
 *
 */

import cn.java.bean.Plan;
import java.util.List;
import java.util.Map;

public interface PlanMapper {
    //获取计划
    public List<Plan> getPlan(String token);

    //添加计划
    public int insertPlan(Map map);

    //修改计划
    public int updatePlan(Map map);


    //删除计划
    public int deletePlan(long id);
}
