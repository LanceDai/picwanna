//package com.design.picwanna.service;
//
//import com.design.picwanna.entity.Pic;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
//
//import java.util.List;
//
//public interface PicService {
//
//    Pic sava(Pic pic);
//
//    Page<Pic> findAllByUserId(String userId, Pageable pageable);
//
//    Page<Pic> findAllByTagsContaining(String tag, Pageable pageable);
//
//    Page<Pic> findAll(Pageable pageable);
//
//    void delete(Pic pic);
//}
