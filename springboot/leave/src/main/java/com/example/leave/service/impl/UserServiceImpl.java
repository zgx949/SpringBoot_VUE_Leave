package com.example.leave.service.impl;

import com.example.leave.entity.User;
import com.example.leave.mapper.UserMapper;
import com.example.leave.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: 实验室
 * @Date: 2021-1-15 11:33:26
 * @Description：
 */

@Service("UserService")
public class UserServiceImpl implements UserService{
    @Autowired
    UserMapper userMapper;

    @Override
    public User Login(String username,String password){

        return userMapper.Login(username,password);
    }
    @Override
    public User Check(String token){
        User user = userMapper.Check(token);
        user.isLogin = true;
        return user;
//        return userMapper.Check(token);
    }

}

