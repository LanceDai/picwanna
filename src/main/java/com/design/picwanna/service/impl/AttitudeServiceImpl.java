package com.design.picwanna.service.impl;

import com.design.picwanna.dao.AttitudeDao;
import com.design.picwanna.entity.Attitude;
import com.design.picwanna.entity.key.AttitudeKey;
import com.design.picwanna.service.AttitudeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

/**
 * className: AttitudeServiceImpl
 * description: TODO
 *
 * @author lh
 * @version 1.0
 * @date 18-10-13
 */
@Service
@CacheConfig(cacheNames="attitudeCache")
public class AttitudeServiceImpl implements AttitudeService  {
    @Autowired
    private AttitudeDao attitudeDao;

    /*
    *@CachePut:改变key中的数据 每次都会调用
    *@CacheEvict:删除对应key（整个删了）
    *@Cacheable:第一次调用后重复调用从redis里走，不走数据库
    * */

    @CachePut(key = "'list'")
    @Override
    public Attitude saveAndFlush(Attitude record) {
        return attitudeDao.saveAndFlush(record);
    }

    @CacheEvict(key = "'list'")
    @Override
    public void deleteById(AttitudeKey attitudeKey) {
        attitudeDao.deleteById(attitudeKey);
    }

    @Cacheable(key = "'attitude'")
    @Override
    public Optional<Attitude> findById(AttitudeKey attitudeKey) {
        return attitudeDao.findById(attitudeKey);
    }

    @Cacheable(key = "'list'")
    @Override
    public List<Attitude> findAll() {
        System.out.println("--------------------------------------");
        return attitudeDao.findAll();
    }

    @CachePut(key = "'list'")
    @Override
    public Attitude save(Attitude record) {
        return attitudeDao.save(record);
    }
}
