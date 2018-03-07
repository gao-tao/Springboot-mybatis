package com.java.demo.service.impl;

import com.java.demo.mapper.UserMapper;
import com.java.demo.entry.User;
import com.java.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by GaoTao on 2017/12/19.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> find(){
      return  userMapper.selectAll();
    }
    @Override
    public User findById(Integer id){
        return  userMapper.selectByPrimaryKey(id);
    }

}
