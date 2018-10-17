package com.design.picwanna.service.impl;

import com.design.picwanna.dao.VisitLogDao;
import com.design.picwanna.entity.VisitLog;
import com.design.picwanna.entity.key.VisitLogKey;
import com.design.picwanna.service.VisitLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * className: VisitLogServiceImpl
 * description: TODO
 *
 * @author lh
 * @version 1.0
 * @date 18-10-14
 */
@Service
public class VisitLogServiceImpl implements VisitLogService {
    @Autowired
    private VisitLogDao visitLogDao;

    @Override
    public VisitLog saveAndFlush(VisitLog record) {
        return visitLogDao.saveAndFlush(record);
    }

    @Override
    public void deleteById(VisitLogKey visitLogKey) {
        visitLogDao.deleteById(visitLogKey);
    }

    @Override
    public Optional<VisitLog> findById(VisitLogKey visitLogKey) {
        return visitLogDao.findById(visitLogKey);
    }

    @Override
    public List<VisitLog> findAll() {
        return visitLogDao.findAll();
    }

    @Override
    public VisitLog save(VisitLog record) {
        return visitLogDao.save(record);
    }
}
