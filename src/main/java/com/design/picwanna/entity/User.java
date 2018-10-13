package com.design.picwanna.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.io.Serializable;

/**
 * className: User
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
@Table(catalog = "picwanna", name = "pic_user")
public class User implements Serializable {
    @Id
    @Basic
    @Column(name = "USER_ID")
    private String userId;

    @Basic
    @Column(name = "SIGN")
    private String sign;

    @Basic
    @Column(name = "ROLE_ID")
    private Integer roleId;

    @Basic
    @Email(message = "邮箱格式不正确")
    @Column(name = "EMAIL")
    private String email;

    @Basic
    @Column(name = "USER_NAME")
    private String userName;

    @Basic
    @Column(name = "USER_PASSWORD")
    private String password;

    @Basic
    @Column(name = "ICON")
    private String icon;

    @Basic
    @Column(name = "LAST_TIME")
    private String lastTime;
}
