package com.po.konkurs.service;

import com.po.konkurs.model.User;

import java.util.List;

public interface UserService {
    public User saveOrUpdate(User user);
    public List<User> getAllUsers();
    public User getUserByEmail(String email);
}
