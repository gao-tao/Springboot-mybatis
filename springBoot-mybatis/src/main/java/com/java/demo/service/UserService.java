package com.java.demo.service;

import com.java.demo.entry.User;

import java.util.List;

/**
 * Created by GaoTao on 2017/12/19.
 */
public interface UserService {

    List<User> find();

    User findById(Integer id);
}
