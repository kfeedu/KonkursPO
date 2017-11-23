package com.po.konkurs.repository;

import com.po.konkurs.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository("userRepository")
public interface UserDao extends JpaRepository<User,Long> {
    public User findOneByEmail(String email);
}
