package com.design.picwanna.entity;

import com.design.picwanna.entity.key.VisitLogKey;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.io.Serializable;

/**
 * className: VisitLog
 * description: TODO
 *
 * @author lh
 * @version 1.0
 * @date 18-10-12
 */
@Data
@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Entity
@IdClass(VisitLogKey.class)
@Table(catalog = "picwanna", name = "pic_visit_log")
public class VisitLog implements Serializable {
    @Id
    @Basic
    @Column(name = "USER_ID")
    private String userId;

    @Id
    @Basic
    @Column(name = "PIC_ID")
    private Long picId;

    @Id
    @Basic
    @Column(name = "VISIT_TIME")
    private String visitTime;
}
