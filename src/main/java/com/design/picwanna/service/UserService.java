package com.design.picwanna.service;

import com.design.picwanna.entity.User;

import java.util.Optional;

public interface UserService extends BaseService<User, String> {

    Optional<User> findByUserName(String username);

    Optional<User> findByEmail(String email);
}
