package com.example.leave.mapper;


import com.example.leave.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


/**
 * @author: 实验室
 * @Date: 2021-7-15 11:33:26
 * @Description：
 */

@Mapper
public interface UserMapper {
    @Select("select * from user where username = #{username} and password = #{password}")
    User Login(@Param("username") String username, @Param("password") String password);
    //public User Login(String username,String password);

    @Select("select * from user where token = #{token}")
    User Check(@Param("token") String token);
}

