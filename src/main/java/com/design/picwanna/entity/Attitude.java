package com.design.picwanna.entity;

import com.design.picwanna.entity.key.AttitudeKey;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Lazy;

import javax.persistence.*;
import java.io.Serializable;

/**
 * className: Attitude
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
@IdClass(AttitudeKey.class)
//@Embeddable
@Table(catalog = "picwanna", name = "pic_attitude")
public class Attitude implements Serializable {
    @Id
    @Basic
    @Column(name = "USER_ID")
    private String userId;

    @Id
    @Basic
    @Column(name = "PIC_ID")
    private Long picId;
//    @EmbeddedId
//    private AttitudeKey Id;

    /**
     * -1踩 0无 1赞
     */
    @Basic
    @Column(name = "ATTITUDE")
    private Integer attitude;

    /**
     * 0无 1收藏
     */
    @Basic
    @Column(name = "COLLECT")
    private Integer collect;
}
