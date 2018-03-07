package com.java.demo.entry;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.beans.Transient;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@EqualsAndHashCode
public class User implements Serializable{

    private Integer id;

    private String userName;

    private String password;

   /* private List<Role> roleList;// 一个用户具有多个角色

    @Transient
    public Set<String> getRolesName() {
        List<Role> roles = getRoleList();
        Set<String> set = new HashSet<>();
        for (Role role : roles) {
            set.add(role.getRoleName());
        }
        return set;
    }*/
}