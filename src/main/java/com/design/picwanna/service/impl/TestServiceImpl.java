package com.design.picwanna.service.impl;

import com.design.picwanna.dao.TestDao;
import com.design.picwanna.entity.Test;
import com.design.picwanna.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * className: TestServiceImpl
 * description: TODO
 *
 * @author lh
 * @version 1.0
 * @date 18-10-16
 */
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    TestDao testDao;

    @Override
    public Page<Test> findAllByContentContaining(String content, Pageable pageable) {
        System.out.println(content);
        return testDao.findAllByContentContaining(content, pageable);
    }
}
