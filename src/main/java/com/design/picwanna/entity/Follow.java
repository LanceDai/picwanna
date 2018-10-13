package com.design.picwanna.entity;

import com.design.picwanna.entity.key.FollowKey;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.io.Serializable;

/**
 * className: Follow
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
@IdClass(FollowKey.class)
@Table(catalog = "picwanna", name = "pic_follow")
public class Follow implements Serializable {
    /**
     * 粉丝
     */
    @Id
    @Basic
    @Column(name = "FOLLOW_ID")
    private String followId;

    /**
     * 被关注者
     */
    @Id
    @Basic
    @Column(name = "FOLLOWED_ID")
    private String followedId;

    @Basic
    @Column(name = "CREATE_TIME")
    private String createTime;


}
