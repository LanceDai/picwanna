package com.design.picwanna.dao;

import com.design.picwanna.entity.Attitude;
import com.design.picwanna.entity.key.AttitudeKey;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * className: AttitudeDao
 * description: TODO
 *
 * @author lh
 * @version 1.0
 * @date 18-10-12
 */
@Repository
public interface AttitudeDao extends JpaRepository<Attitude, AttitudeKey> {
    /**
     * decription:
     *
     * @param userId
     * @param picId
     * @return void
     */
//    @Transactional
//    void deleteById(AttitudeKey attitudeKey);

//    @Override
//    @Transactional
//    Attitude getOne(AttitudeKey attitudeKey);


//    Attitude findByUserIdAndPicId(String userId, Long picId);

    @Override
    Optional<Attitude> findById(AttitudeKey attitudeKey);

}
