package com.design.picwanna.service.impl;

import com.design.picwanna.dao.MessageDao;
import com.design.picwanna.entity.Message;
import com.design.picwanna.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * className: MessageServiceImpl
 * description: TODO
 *
 * @author lh
 * @version 1.0
 * @date 18-10-14
 */
@Service
@CacheConfig(cacheNames = "messageCache")
public class MessageServiceImpl implements MessageService {
    @Autowired
    private MessageDao messageDao;

    @Override
    public Message saveAndFlush(Message record) {
        return messageDao.saveAndFlush(record);
    }

    @Override
    public void deleteById(Integer integer) {
        messageDao.deleteById(integer);
    }

    @Override
    public Optional<Message> findById(Integer integer) {
        return messageDao.findById(integer);
    }

    @Override
    public List<Message> findAll() {
        return messageDao.findAll();
    }

    @Override
    public Message save(Message record) {
        return messageDao.save(record);
    }
}
