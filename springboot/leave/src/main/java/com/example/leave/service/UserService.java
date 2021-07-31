package com.example.leave.service;

import com.example.leave.entity.User;


/**
 * @author: 实验室
 * @Date: 2021-1-15 11:33:26
 * @Description：
 */

public interface UserService {
    public User Login(String username,String password);
    public User Check(String token);
}
