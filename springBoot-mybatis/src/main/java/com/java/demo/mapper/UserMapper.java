package com.java.demo.mapper;

import com.java.demo.entry.User;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserMapper {

    List<User> selectAll();

    User findByUserName(String name);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}