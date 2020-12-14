package cn.java.service.impl;
/*
 * @Author:叶婉婷
 * @DATE:2020/12/3
 *
 */


import cn.java.bean.Coursetable;
import cn.java.bean.Star;
import cn.java.bean.UserEnterluntan;
import cn.java.mapper.UserEnterluntanMapper;
import cn.java.mapper.UserMapper;
import cn.java.service.UserEnterluntanService;
import cn.java.service.UserService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Service
public class UserEnterluntanServiceImpl implements UserEnterluntanService {
    @Autowired
    UserMapper userMapper;

    @Autowired
    UserEnterluntanMapper userEnterluntanMapper;

    @Transactional   //使用事务管理
    public String getUserLuntanName(String token){
        String username = userMapper.getUserName(token);
        if(username.equals(""))
        {
            return "-1";
        }else
        {
            try {
               List<UserEnterluntan> userEnterluntans = userEnterluntanMapper.getUserLuntanName(username);
                return JSON.toJSONString(userEnterluntans);
            }catch (Exception e)
            {
                e.printStackTrace();
                return "-1";
            }
        }
    }

    @Transactional   //使用事务管理
    public String postUserLuntanName(String token,String luntanname[],String entertime){
        String username = userMapper.getUserName(token);
        if(username.equals(""))
        {
            return "-1";
        }else
        {
            try {
                Map map = new HashMap<>();
                int count = 0;
                for(String name:luntanname)
                {
                    map.put("username",username);
                    map.put("luntanname",name);
                    map.put("entertime",entertime);
                    count += userEnterluntanMapper.postUserLuntanName(map);
                    map.clear();
                }
                if(count>0)
                {
                    return "1";
                }else
                {
                    return "-1";
                }

            }catch (Exception e)
            {
                e.printStackTrace();
                return "-1";
            }
        }
    }
}
