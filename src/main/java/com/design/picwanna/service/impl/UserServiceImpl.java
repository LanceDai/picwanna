package com.design.picwanna.service.impl;

import com.design.picwanna.dao.UserDao;
import com.design.picwanna.entity.User;
import com.design.picwanna.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * className: UserServiceImpl
 * description: TODO
 *
 * @author lh
 * @version 1.0
 * @date 18-10-14
 */
@Service
@CacheConfig(cacheNames = "picwanna")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User saveAndFlush(User record) {
        return userDao.saveAndFlush(record);
    }

    @Override
    public void deleteById(String s) {
        userDao.deleteById(s);
    }

    @Cacheable(value = "user", key = "#s")
    @Override
    public Optional<User> findById(String s) {
        System.out.println("第一次");
        return userDao.findById(s);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User save(User record) {
        return userDao.save(record);
    }


    @Override
    public Optional<User> findByUserName(String username) {
        return userDao.findByUserName(username);
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return userDao.findByEmail(email);
    }
}
