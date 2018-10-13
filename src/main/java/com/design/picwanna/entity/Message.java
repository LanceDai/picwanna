package com.design.picwanna.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.io.Serializable;

/**
 * className: Message
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
@Table(catalog = "picwanna", name = "pic_message")
public class Message implements Serializable {
    @Id
    @Basic
    @Column(name = "MESSAGE_ID")
    private Integer messageId;

    @Basic
    @Column(name = "MESSAGE_CONTENT")
    private String messageContent;

    @Basic
    @Column(name = "USER_ID")
    private String userId;

    @Basic
    @Column(name = "MESSAGE_TIME")
    private String messageTime;

    @Basic
    @Column(name = "MESSAGE_TITLE")
    private String messageTitle;

}
