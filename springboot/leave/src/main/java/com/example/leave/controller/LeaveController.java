package com.example.leave.controller;

import com.example.leave.api.CommonResult;
import com.example.leave.entity.Leave;
import com.example.leave.entity.User;
import com.example.leave.service.UserService;
import com.example.leave.service.impl.LeaveServiceImpl;
import com.example.leave.service.impl.UserServiceImpl;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: 实验室
 * @Date: 2021-1-15 11:33:26
 * @Description：
 */

@ResponseBody
@RestController
public class LeaveController {
    @Autowired
    LeaveServiceImpl leaveService;

    @Autowired
    UserServiceImpl userService;

    @RequestMapping(value = "/lookup")
    public CommonResult login(@RequestBody Leave leave) {

        String username = leave.getUsername();

        List data_list = leaveService.Lookup(username);

        if( !data_list.isEmpty()){
            return CommonResult.success(data_list);
        }
        else{
            return CommonResult.validateFailed("账号密码错误");
        }
    }

    @PostMapping(value = "/add")
    public CommonResult addLeave(@RequestBody Leave leave){

        if(leave.token == null || leave.token.equals("")){
            return CommonResult.validateFailed("请先登录");
        }
//        User user = new User(leave.token);
        User user = userService.Check(leave.token);
        if(user.isLogin == true){
            String username = user.getUsername();
            String nickname = user.getNickname();

//            Leave leave_temp = new Leave();
//            leave_temp.setUsername(username);
//            leave_temp.setNickname(nickname);
//            leave_temp.setReason(leave.getReason());
//            leave_temp.setStart_time(leave.getStart_time());
//            leave_temp.setEnd_time(leave.getEnd_time());
//            leave_temp.setCreate_time(leave.getCreate_time());
//            leave_temp.setData(leave.getData());
//            leave_temp.setLeader_one(0);
//            leave_temp.setLeader_two(0);
//            leave_temp.setLeader_three(0);


            leaveService.add(username, nickname,
                    leave.getReason(),
                    leave.getStart_time(),
                    leave.getEnd_time(),
                    leave.getCreate_time(),
                    leave.getData()
            );
            System.out.println(leave.getNickname() + "：假条添加成功");
            return CommonResult.success(leave.getNickname() + "添加假条成功");
        }
        return CommonResult.validateFailed("登录过期");
    }
}

