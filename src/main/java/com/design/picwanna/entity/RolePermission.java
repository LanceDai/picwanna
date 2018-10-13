package com.design.picwanna.entity;

import com.design.picwanna.entity.key.RolePermissionKey;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.io.Serializable;

/**
 * className: RolePermission
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
@IdClass(RolePermissionKey.class)
@Table(catalog = "picwanna", name = "pic_role_permission")
public class RolePermission implements Serializable {
    @Id
    @Basic
    @Column(name = "ROLE_ID")
    private Integer roleId;

    @Id
    @Basic
    @Column(name = "PERMISSION_ID")
    private Integer permissionId;
}
