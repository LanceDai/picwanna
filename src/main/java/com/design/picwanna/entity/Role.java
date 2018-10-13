package com.design.picwanna.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.io.Serializable;

/**
 * className: Role
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
@Table(catalog = "picwanna", name = "pic_role")
public class Role implements Serializable {
    @Id
    @Basic
    @Column(name = "ROLE_ID")
    private Integer roleId;

    @Basic
    @Column(name = "ROLE_NAME")
    private String roleName;

}
