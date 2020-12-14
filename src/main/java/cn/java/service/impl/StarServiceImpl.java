package cn.java.service.impl;
/*
 * @Author:叶婉婷
 * @DATE:2020/12/2
 *
 */

import cn.java.bean.CourseStarunion;
import cn.java.bean.Coursetable;
import cn.java.bean.Star;
import cn.java.mapper.StarMapper;
import cn.java.mapper.UserMapper;
import cn.java.service.StarService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Service
public class StarServiceImpl implements StarService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    StarMapper starMapper;

    @Transactional   //使用事务管理
    public String selectUserStar(String token){

        if(token.equals("")||token.equals("null"))
        {
            return "-1";
        }else
        {
            String username = userMapper.getUserName(token);
            if(username.equals(""))
            {
                return "-1";
            }else
            {
                try {
                    List <Star> starList = starMapper.getStarCourse(username);
                    List<CourseStarunion> courseStarunions = new LinkedList<>();
                    for(Star star : starList)
                    {
                        CourseStarunion courseStarunion = new CourseStarunion();
                        courseStarunion.setId(Integer.parseInt(star.getCourseid()));
                        courseStarunion.setUsername(star.getUsername());
                        courseStarunion.setCourseid(star.getCourseid());
                        courseStarunion.setCoursedes(star.getCoursetable().getCoursedes());
                        courseStarunion.setCourseimghref(star.getCoursetable().getCourseimghref());
                        courseStarunion.setCourselabel(star.getCoursetable().getCourselabel());
                        courseStarunion.setCourselabel(star.getCoursetable().getCourselabel());
                        courseStarunion.setCourselevel(star.getCoursetable().getCourselevel());
                        courseStarunion.setCoursenumber(star.getCoursetable().getCoursenumber());
                        courseStarunion.setCourseprice(star.getCoursetable().getCourseprice());
                        courseStarunion.setCoursesourse(star.getCoursetable().getCoursesourse());
                        courseStarunion.setCoursetitle(star.getCoursetable().getCoursetitle());
                        courseStarunion.setCoursetotallabel(star.getCoursetable().getCoursetotallabel());
                        courseStarunion.setCoursevediohref(star.getCoursetable().getCoursevediohref());

                        courseStarunions.add(courseStarunion);
                    }

                    return JSON.toJSONString(courseStarunions);
                }catch (Exception e)
                {
                    e.printStackTrace();
                    return "-1";
                }
            }
        }

    }

    @Transactional   //使用事务管理
    public String insertUserStar(String token,String courseid){
        String username = userMapper.getUserName(token);
        if(username.equals(""))
        {
            return "-1";
        }else
        {
            try {
                Map map = new HashMap();
                map.put("username",username);
                map.put("courseid",courseid);
                int count = starMapper.insertStarCourse(map);
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
    public String deleteUserStar(String token,String courseid){
        String username = userMapper.getUserName(token);
        if(username.equals(""))
        {
            return "-1";
        }else
        {
            try {

                int count = starMapper.deleteStarCourse(courseid);
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
}
