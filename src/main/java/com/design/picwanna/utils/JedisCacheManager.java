package com.design.picwanna.utils;

import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheException;
import org.apache.shiro.cache.CacheManager;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * className: JedisCacheManager
 * description: TODO
 *
 * @author lh
 * @version 1.0
 * @date 18-10-19
 */

public class JedisCacheManager implements CacheManager {
    private final ConcurrentMap<String, Cache> caches = new ConcurrentHashMap<String, Cache>(16);
    @Override
    public <K, V> Cache<K, V> getCache(String s) throws CacheException {
        Cache cache = caches.get(s);
        if (cache == null){
            cache = new JedisCache();
            caches.put(s, cache);
        }
        return null;
    }
}
