package com.design.picwanna.dao;

import com.design.picwanna.entity.VisitLog;
import com.design.picwanna.entity.key.VisitLogKey;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * className: VisitLogDao
 * description: TODO
 *
 * @author lh
 * @version 1.0
 * @date 18-10-12
 */
public interface VisitLogDao extends JpaRepository<VisitLog, VisitLogKey> {

}
