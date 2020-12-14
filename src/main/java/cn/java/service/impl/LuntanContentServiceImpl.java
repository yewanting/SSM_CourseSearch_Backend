package cn.java.service.impl;
/*
 * @Author:叶婉婷
 * @DATE:2020/12/3
 *
 */

import cn.java.bean.LuntanContent;
import cn.java.mapper.LuntanContentMapper;
import cn.java.mapper.UserMapper;
import cn.java.service.LuntanContentService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class LuntanContentServiceImpl implements LuntanContentService {
    @Autowired
    UserMapper userMapper;

    @Autowired
    LuntanContentMapper luntanContentMapper;

    @Transactional   //使用事务管理
    public String postUserLuntanContent(String token,String who_add,String add_time,String content,String luntanname){
        String username = userMapper.getUserName(token);
        if(username.equals(""))
        {
            return "-1";
        }else
        {
            try {
                Map map = new HashMap();
                map.put("who_add",who_add);
                map.put("add_time",add_time);
                map.put("content",content);
                map.put("luntanname",luntanname);
                map.put("username",username);
                int count = luntanContentMapper.postUserLuntanContent(map);
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
    public String getLuntanContent(String token,String luntanname,int curpage){
        String username = userMapper.getUserName(token);
        if(username.equals(""))
        {
            return "-1";
        }else
        {
            try {
                Map map = new HashMap();
                map.put("luntanname",luntanname);
                map.put("curluntanpage",(curpage-1)*5);
                List<LuntanContent> luntanContents = luntanContentMapper.getLuntanContent(map);
                return JSON.toJSONString(luntanContents);
            }catch (Exception e)
            {
                e.printStackTrace();
                return "-1";
            }
        }
    }
}
