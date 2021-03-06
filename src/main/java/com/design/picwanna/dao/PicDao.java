//package com.design.picwanna.dao;
//
//import com.design.picwanna.entity.Pic;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
//
///**
// * className: PicDao
// * description: TODO
// *
// * @author lh
// * @version 1.0
// * @date 18-10-12
// */
//public interface PicDao extends ElasticsearchRepository<Pic, Long> {
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
