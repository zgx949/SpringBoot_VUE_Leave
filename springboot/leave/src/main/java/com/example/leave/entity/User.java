package com.example.leave.entity;

import com.example.leave.mapper.UserMapper;
import com.example.leave.service.UserService;
import com.example.leave.service.impl.UserServiceImpl;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;

public class User {


    private int id;
    private String username;
    private String password;
    private String token;
    private int leader;
    private String nickname;
    public boolean isLogin;

    public void setLogin(boolean login) {
        isLogin = login;
    }

    public User() {
    }

    public User(String token) {
        this.token = token;


//        this.isLogin =  temp.token.equals(this.token);
//        this.username = temp.getUsername();
//        this.nickname = temp.getNickname();

    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getLeader() {
        return leader;
    }

    public void setLeader(int leader) {
        this.leader = leader;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    private String data;

}
