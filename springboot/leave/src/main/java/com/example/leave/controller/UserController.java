package com.example.leave.controller;

import com.example.leave.api.CommonResult;
import com.example.leave.entity.User;
import com.example.leave.service.UserService;
import com.example.leave.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: 实验室
 * @Date: 2021-1-15 11:33:26
 * @Description：
 */
@ResponseBody
@RestController
public class UserController {
    @Autowired
    UserServiceImpl userService;

    @RequestMapping(value = "/login")
    public CommonResult login(@RequestBody User user) {

        //String username= request.getParameter("username");
        //String password= request.getParameter("password");
        String username=user.getUsername();
        String password=user.getPassword();

        //输出测试
//        System.out.println("11111111");
//        System.out.println(username);
//        System.out.println(password);

        user = userService.Login(username,password);
        if(user != null){

            Map<String, Object> data = new HashMap<>();
            data.put("id", user.getId());
            data.put("username", user.getUsername());
            data.put("token", user.getToken());
            data.put("data", user.getData());
            data.put("leader", user.getLeader());
            data.put("nickname", user.getNickname());
            return CommonResult.success(data);
        }
        else{
            return CommonResult.validateFailed("账号密码错误");
        }
    }
}

