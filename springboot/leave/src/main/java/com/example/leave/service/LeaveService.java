package com.example.leave.service;


import com.example.leave.entity.Leave;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author: 左手
 * @Date: 2021-07-15 11:33:26
 * @Description：
 */
public interface LeaveService {

//    @Select("select * FROM `leave` WHERE username = #{username}")
    List<Leave> Lookup(String username);

    void add(String username, String nickname,
             String reason, Integer start_time,
             Integer end_time, Integer create_time,
             String data);

}
