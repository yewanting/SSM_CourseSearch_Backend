package cn.java.service.impl;/*
 * @Author:叶婉婷
 * @DATE:2020/12/2
 *
 */

import cn.java.mapper.UserMapper;
import cn.java.service.UserService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Transactional   //使用事务管理
    public String postUserInfo(String username,String password){
        UUID uuid = UUID.randomUUID();
        System.out.println(uuid);
        Map map = new HashMap();
        map.put("username",username);
        map.put("password",password);
        map.put("token",uuid.toString());
        try{
            int count = userMapper.postUserInfo(map);
//            System.out.println("注册成功！");
            return "1";

        }catch (Exception e)
        {
            e.printStackTrace();
            return "-1";
        }

    }

    @Transactional   //使用事务管理
    public String getUserInfo(String username,String password){
        long id = -1;
        Map map = new HashMap();
        map.put("username",username);
        map.put("password",password);
        try{
            id = userMapper.getUserInfoId(map);
            if(id!=-1)
            {
//                System.out.println("登录成功！");
                UUID uuid = UUID.randomUUID();
                Map map2 = new HashMap();
                map2.put("username",username);
                map2.put("token",uuid.toString());
                int count = userMapper.updateToken(map2);
                if(count>0)
                {
                    return JSON.toJSONString(uuid.toString());
                }else
                {
                    return "-1";
                }

            }else
            {
//                System.out.println("该用户不存在");
                return "-1";
            }

        }catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("登录失败！");
            return "-1";
        }


    }


}
