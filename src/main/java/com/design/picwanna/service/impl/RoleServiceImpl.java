package com.design.picwanna.service.impl;

import com.design.picwanna.dao.RoleDao;
import com.design.picwanna.entity.Role;
import com.design.picwanna.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * className: RoleServiceImpl
 * description: TODO
 *
 * @author lh
 * @version 1.0
 * @date 18-10-14
 */
@Service
@CacheConfig(cacheNames = "roleCache")
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleDao roleDao;

    @Override
    public Role saveAndFlush(Role record) {
        return roleDao.saveAndFlush(record);
    }

    @Override
    public void deleteById(Integer integer) {
        roleDao.deleteById(integer);
    }

    @Override
    public Optional<Role> findById(Integer integer) {
        return roleDao.findById(integer);
    }

    @Override
    public List<Role> findAll() {
        return roleDao.findAll();
    }

    @Override
    public Role save(Role record) {
        return roleDao.save(record);
    }
}
