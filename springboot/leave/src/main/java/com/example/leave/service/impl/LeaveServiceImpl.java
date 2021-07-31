package com.example.leave.service.impl;

import com.example.leave.entity.Leave;
import com.example.leave.mapper.LeaveMapper;
import com.example.leave.service.LeaveService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 左手
 * @Date: 2021-1-15 11:33:26
 * @Description：
 */

@Service("LeaveService")
public class LeaveServiceImpl implements LeaveService {
    @Autowired
    LeaveMapper leaveMapper;


    @Override
    public List<Leave> Lookup(String username){
        return leaveMapper.Lookup(username);
    }

    @Override
    public void add(String username, String nickname,
                    String reason, Integer start_time,
                    Integer end_time, Integer create_time,
                    String data){

        leaveMapper.insert(username, nickname, reason, start_time, end_time, create_time, data);

    }
}
