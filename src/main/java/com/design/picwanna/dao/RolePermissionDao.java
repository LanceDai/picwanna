package com.design.picwanna.dao;

import com.design.picwanna.entity.RolePermission;
import com.design.picwanna.entity.key.RolePermissionKey;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * className: RolePermissionDao
 * description: TODO
 *
 * @author lh
 * @version 1.0
 * @date 18-10-12
 */
public interface RolePermissionDao extends JpaRepository<RolePermission, RolePermissionKey> {
    List<RolePermission> findAllByRoleId(Integer roleId);
}
