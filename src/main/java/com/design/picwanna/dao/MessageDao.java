package com.design.picwanna.dao;

import com.design.picwanna.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * className: MessageDao
 * description: TODO
 *
 * @author lh
 * @version 1.0
 * @date 18-10-12
 */
@Repository
public interface MessageDao extends JpaRepository<Message, Integer> {

}
