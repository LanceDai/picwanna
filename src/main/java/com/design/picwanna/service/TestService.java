package com.design.picwanna.service;

import com.design.picwanna.entity.Test;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TestService {
    Page<Test> findAllByContentContaining(String content, Pageable pageable);
}
