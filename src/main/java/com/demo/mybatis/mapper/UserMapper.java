package com.demo.mybatis.mapper;

import com.demo.mybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {


    String version();

    String dbs();


    List<User> selectAll();

    int add(User user);

    int delete(int uid);




}
