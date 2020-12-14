package cn.java.service.impl;/*
 * @Author:叶婉婷
 * @DATE:2020/12/3
 *
 */


import cn.java.bean.Plan;
import cn.java.mapper.PlanMapper;
import cn.java.mapper.UserMapper;
import cn.java.service.PlanService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PlanServiceImpl implements PlanService {
    @Autowired
    UserMapper userMapper;

    @Autowired
    PlanMapper planMapper;

    @Transactional   //使用事务管理
    public String getPlan(String token){
        String username = userMapper.getUserName(token);
        if(username.equals(""))
        {
            return "-1";
        }else
        {
            try {
                List<Plan> plans = planMapper.getPlan(username);
                return JSON.toJSONString(plans);
            }catch (Exception e)
            {
                e.printStackTrace();
                return "-1";
            }
        }
    }


    @Transactional   //使用事务管理
    public String insertPlan(String token,String date,String content,String ifSuccess,String score){
        String username = userMapper.getUserName(token);
        if(username.equals(""))
        {
            return "-1";
        }else
        {
            try {
               Map map = new HashMap();
               map.put("date",date);
               map.put("content",content);
               map.put("ifSuccess",ifSuccess);
               map.put("score",score);
               map.put("username",username);
               int count = planMapper.insertPlan(map);
               if(count>0)
               {
                   return "1";
               }else {
                   return "-1";
               }
            }catch (Exception e)
            {
                e.printStackTrace();
                return "-1";
            }
        }
    }


    @Transactional   //使用事务管理
    public String updatePlan(String token,String date,String content,String ifSuccess,String score,long id){
        String username = userMapper.getUserName(token);
        System.out.println(username);
        if(username.equals(""))
        {
            return "-1";
        }else
        {
            try {
                Map map = new HashMap();
                map.put("date",date);
                map.put("content",content);
                map.put("ifSuccess",ifSuccess);
                map.put("score",score);
                map.put("id",id);
//                int count = planMapper.updatePlan(map);
                System.out.println(planMapper.updatePlan(map));
                return "1";
//                if(count>0)
//                {
//                    return "1";
//                }else {
//                    return "-1";
//                }
            }catch (Exception e)
            {
                e.printStackTrace();
                return "-1";
            }
        }
    }


    @Transactional   //使用事务管理
    public String deletePlan(String token,long id){
        String username = userMapper.getUserName(token);
        if(username.equals(""))
        {
            return "-1";
        }else
        {
            try {
                System.out.println(planMapper.deletePlan(id));
                return "1";

            }catch (Exception e)
            {
                e.printStackTrace();
                return "-1";
            }
        }
    }
}
