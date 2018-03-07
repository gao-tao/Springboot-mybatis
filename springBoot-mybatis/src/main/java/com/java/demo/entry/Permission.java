package com.java.demo.entry;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode
public class Permission implements Serializable {
    private Integer id;

    private String permissionName;

    private Integer roleId;

}