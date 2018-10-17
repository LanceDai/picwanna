//package com.design.picwanna.service.impl;
//
//import com.design.picwanna.dao.PicDao;
//import com.design.picwanna.entity.Pic;
//import com.design.picwanna.service.PicService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cache.annotation.CacheConfig;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.stereotype.Service;
//
///**
// * className: PicServiceImpl
// * description: TODO
// *
// * @author lh
// * @version 1.0
// * @date 18-10-14
// */
//@Service
//@CacheConfig(cacheNames = "picCache")
//public class PicServiceImpl implements PicService {
//    @Autowired
//    private PicDao picDao;
//
//
//    @Override
//    public Pic sava(Pic pic) {
//        return picDao.save(pic);
//    }
//
//    @Override
//    public Page<Pic> findAllByUserId(String userId, Pageable pageable) {
//        return picDao.findAllByUserId(userId, pageable);
//    }
//
//    @Override
//    public Page<Pic> findAllByTagsContaining(String tag, Pageable pageable) {
//        return picDao.findAllByTagsContaining(tag, pageable);
//    }
//
//    @Override
//    public Page<Pic> findAll(Pageable pageable) {
//        return picDao.findAll(pageable);
//    }
//
//    @Override
//    public void delete(Pic pic) {
//        picDao.delete(pic);
//    }
//}
