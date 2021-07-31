package com.example.leave.mapper;

import com.example.leave.entity.Leave;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author: 实验室
 * @Date: 2021-7-15 11:33:26
 * @Description：
 */
@Mapper
public interface LeaveMapper {
//    Leave Lookup(@Param("username") String username);
    @Select("select * FROM `leave` WHERE username = #{username}")
    List<Leave> Lookup(String username);
//    List<Leave> Lookup(@Param("username") String username);


    @Insert("INSERT INTO `leave` (`username`, `nickname`, `reason`, `start_time`, `end_time`, `create_time`, `data`) "
            +
            "VALUES (#{username}, #{nickname}, #{reason}, #{start_time}, #{end_time}, #{create_time}, #{data})")
    void insert(String username, String nickname,
                String reason, Integer start_time,
                Integer end_time, Integer create_time,
                String data);
}
