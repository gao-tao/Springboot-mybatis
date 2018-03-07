package com.java.demo.mapper;

import com.java.demo.entry.Permission;
import org.springframework.stereotype.Repository;

public interface PermissionMapper {
    int insert(Permission record);

    int insertSelective(Permission record);
}