package com.po.konkurs.service.impl;

import com.po.konkurs.model.User;
import com.po.konkurs.repository.UserDao;
import com.po.konkurs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class DefaultUserService implements UserService {

    UserDao userDao;

    @Autowired
    public DefaultUserService(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User saveOrUpdate(User user) {
        return userDao.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.findAll();
    }

    @Override
    public User getUserByEmail(String email) {
        return userDao.findOneByEmail(email);
    }
}