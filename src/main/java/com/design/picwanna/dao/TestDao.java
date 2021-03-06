package com.design.picwanna.dao;

import com.design.picwanna.entity.Test;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Cacheable;
import java.util.List;
@Repository
public interface TestDao extends ElasticsearchRepository<Test, Long> {
    Page<Test> findAllByContentContaining(String content, Pageable pageable);
}
