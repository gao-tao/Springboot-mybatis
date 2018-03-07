package com.java.demo.entry;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.beans.Transient;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode
public class Role implements Serializable{
    private Integer id;

    private String roleName;

    private List<Permission> permissionList;// 一个角色对应多个权限

    @Transient
    public List<String> getPermissionsName() {
        List<String> list = new ArrayList<>();
        List<Permission> perlist = getPermissionList();
        for (Permission per : perlist) {
            list.add(per.getPermissionName());
        }
        return list;
    }
}