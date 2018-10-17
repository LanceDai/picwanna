package com.design.picwanna.config;


import com.design.picwanna.entity.Permission;
import com.design.picwanna.entity.User;
import com.design.picwanna.service.PermissionService;
import com.design.picwanna.service.RolePermissionService;
import com.design.picwanna.service.RoleService;
import com.design.picwanna.service.UserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ShiroRealm extends AuthorizingRealm {
    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;
    @Autowired
    private PermissionService permissionService;
    @Autowired
    private RolePermissionService rolePermissionService;


    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //授权逻辑
        String name = (String) principalCollection.getPrimaryPrincipal();

        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();

        Optional<User> chechUser = userService.findByUserName(name);
        if (!chechUser.isPresent()){
            chechUser = userService.findByEmail(name);
        }
        User user = chechUser.get();

        Integer roleId = user.getRoleId();
        //角色授权
        simpleAuthorizationInfo.addRole(roleService.findById(roleId).get().getRoleName());
        //权限授权
        List<Permission> list = permissionService.findAllPermissionByRoleId(roleId);
        for (Permission permission : permissionService.findAllPermissionByRoleId(roleId)){
            simpleAuthorizationInfo.addStringPermission(permission.getPermissionName());
        }

        return simpleAuthorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //认证逻辑
        if (authenticationToken.getPrincipal() == null){
            return null;
        }
        //判断用户名
        String name = authenticationToken.getPrincipal().toString();

        Optional<User> checkUser = userService.findByUserName(name);
        if (!checkUser.isPresent()){
            checkUser = userService.findByEmail(name);
            if (!checkUser.isPresent()){
                return null;
            }
        }
        User user = checkUser.get();
        //判断密码
        //parameter1 需要返回给login方法的数据
        //parameter1 数据库密码
        return new SimpleAuthenticationInfo(name, user.getPassword(), getName());
    }
}
