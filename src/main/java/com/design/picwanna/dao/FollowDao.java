package com.design.picwanna.dao;

import com.design.picwanna.entity.Follow;
import com.design.picwanna.entity.key.FollowKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * className: FollowDao
 * description: TODO
 *
 * @author lh
 * @version 1.0
 * @date 18-10-12
 */
@Repository
public interface FollowDao extends JpaRepository<Follow, FollowKey> {

}
