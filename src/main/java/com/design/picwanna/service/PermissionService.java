package com.design.picwanna.service;

import com.design.picwanna.entity.Permission;

import java.util.List;

public interface PermissionService extends BaseService<Permission, Integer>{
    List<Permission> findAllPermissionByRoleId(Integer roleId);
}
