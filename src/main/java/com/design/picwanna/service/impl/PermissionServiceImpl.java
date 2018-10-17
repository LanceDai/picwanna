package com.design.picwanna.service.impl;

import com.design.picwanna.dao.PermissionDao;
import com.design.picwanna.entity.Permission;
import com.design.picwanna.entity.RolePermission;
import com.design.picwanna.service.PermissionService;
import com.design.picwanna.service.RolePermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * className: PermissionServiceImpl
 * description: TODO
 *
 * @author lh
 * @version 1.0
 * @date 18-10-14
 */
@Service
@CacheConfig(cacheNames = "permissionCache")
public class PermissionServiceImpl implements PermissionService {
    @Autowired
    private PermissionDao permissionDao;
    @Autowired
    private RolePermissionService rolePermissionService;

    @Override
    public Permission saveAndFlush(Permission record) {
        return permissionDao.saveAndFlush(record);
    }

    @Override
    public void deleteById(Integer integer) {
        permissionDao.deleteById(integer);
    }

    @Override
    public Optional<Permission> findById(Integer integer) {
        return permissionDao.findById(integer);
    }

    @Override
    public List<Permission> findAll() {
        return permissionDao.findAll();
    }

    @Override
    public Permission save(Permission record) {
        return permissionDao.save(record);
    }

    @Override
    public List<Permission> findAllPermissionByRoleId(Integer roleId) {
        List<Permission> permissionList = new ArrayList<>();
        List<RolePermission> list = rolePermissionService.findAllByRoleId(roleId);
        for (RolePermission rolePermission : rolePermissionService.findAllByRoleId(roleId)){
            Integer id = rolePermission.getPermissionId();
            permissionList.add(permissionDao.findById(id).get());
        }
        return permissionList;
    }
}
