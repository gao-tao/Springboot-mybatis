package com.java.demo.mapper;

import com.java.demo.entry.Role;
import org.springframework.stereotype.Repository;

public interface RoleMapper {
    int insert(Role record);

    int insertSelective(Role record);
}