package com.design.picwanna.service.impl;

import com.design.picwanna.service.RedisTestService;
import com.design.picwanna.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author lh
 * @Date: 2018/10/3
 * @Description:
 */
@Service
public class RedisTestServiceImpl implements RedisTestService {
    @Resource
    private RedisUtil redisUtil;

    @Override
    public boolean set(String key, Object value) {
        return redisUtil.set(key, value);
    }

    @Override
    public Object get(String key) {
        return redisUtil.get(key);
    }

    @Override
    public boolean remove(String key) {
        long num = redisUtil.setRemove(key);
        if (num > 0){
            return true;
        }
        return false;
    }
}
