package com.example.leave.entity;


import java.util.Date;

public class Leave {
    private int id;
    private String username;
    private String nickname;
    private int leader_one;
    private int leader_two;
    private int leader_three;
    private String data;
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Integer start_time;
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Integer end_time;
    private String reason;
    public String token;

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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getLeader_one() {
        return leader_one;
    }

    public void setLeader_one(int leader_one) {
        this.leader_one = leader_one;
    }

    public int getLeader_two() {
        return leader_two;
    }

    public void setLeader_two(int leader_two) {
        this.leader_two = leader_two;
    }

    public int getLeader_three() {
        return leader_three;
    }

    public void setLeader_three(int leader_three) {
        this.leader_three = leader_three;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Integer getStart_time() {
        return start_time;
    }

    public void setStart_time(Integer start_time) {
        this.start_time = start_time;
    }

    public Integer getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Integer end_time) {
        this.end_time = end_time;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getCreate_time() {
//        return new Date().getTime();
        return 1234567;
    }
}
