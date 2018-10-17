package com.design.picwanna.service;

import com.design.picwanna.entity.RolePermission;
import com.design.picwanna.entity.key.RolePermissionKey;

import java.util.List;

public interface RolePermissionService extends BaseService<RolePermission, RolePermissionKey> {
    List<RolePermission> findAllByRoleId(Integer roleId);
}
