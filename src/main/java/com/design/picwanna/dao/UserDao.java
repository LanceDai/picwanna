package com.design.picwanna.dao;

import com.design.picwanna.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * className: UserDao
 * description: TODO
 *
 * @author lh
 * @version 1.0
 * @date 18-10-12
 */
public interface UserDao extends JpaRepository<User, String> {

    Optional<User> findByUserName(String username);

    Optional<User> findByEmail(String email);
}
