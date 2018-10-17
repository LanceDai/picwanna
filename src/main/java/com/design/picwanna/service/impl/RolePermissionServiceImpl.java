package com.design.picwanna.service.impl;

import com.design.picwanna.dao.RolePermissionDao;
import com.design.picwanna.entity.RolePermission;
import com.design.picwanna.entity.key.RolePermissionKey;
import com.design.picwanna.service.RolePermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * className: RolePermissionServiceImpl
 * description: TODO
 *
 * @author lh
 * @version 1.0
 * @date 18-10-14
 */
@Service
public class RolePermissionServiceImpl implements RolePermissionService {
    @Autowired
    private RolePermissionDao rolePermissionDao;

    @Override
    public RolePermission saveAndFlush(RolePermission record) {
        return rolePermissionDao.saveAndFlush(record);
    }

    @Override
    public void deleteById(RolePermissionKey rolePermissionKey) {
        rolePermissionDao.deleteById(rolePermissionKey);
    }

    @Override
    public Optional<RolePermission> findById(RolePermissionKey rolePermissionKey) {
        return rolePermissionDao.findById(rolePermissionKey);
    }

    @Override
    public List<RolePermission> findAll() {
        return rolePermissionDao.findAll();
    }

    @Override
    public RolePermission save(RolePermission record) {
        return rolePermissionDao.save(record);
    }

    @Override
    public List<RolePermission> findAllByRoleId(Integer roleId) {
        return rolePermissionDao.findAllByRoleId(roleId);
    }
}
