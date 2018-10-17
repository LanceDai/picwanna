package com.design.picwanna.service.impl;

import com.design.picwanna.dao.FollowDao;
import com.design.picwanna.entity.Follow;
import com.design.picwanna.entity.key.FollowKey;
import com.design.picwanna.service.FollowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * className: FollowServiceImpl
 * description: TODO
 *
 * @author lh
 * @version 1.0
 * @date 18-10-14
 */
@Service
@CacheConfig(cacheNames = "followCache")
public class FollowServiceImpl implements FollowService {
    @Autowired
    private FollowDao followDao;

    @Override
    public Follow saveAndFlush(Follow record) {
        return followDao.saveAndFlush(record);
    }

    @Override
    public void deleteById(FollowKey followKey) {
        followDao.deleteById(followKey);
    }

    @Override
    public Optional<Follow> findById(FollowKey followKey) {
        return followDao.findById(followKey);
    }

    @Override
    public List<Follow> findAll() {
        return followDao.findAll();
    }

    @Override
    public Follow save(Follow record) {
        return followDao.save(record);
    }
}
