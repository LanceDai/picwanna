package com.design.picwanna.service;

/**
 * @author lh
 * @Date: 2018/10/3
 * @Description:
 */
public interface RedisTestService {

    boolean set(String key, Object value);

    Object get(String key);

    boolean remove(String key);
}
