package com.example.spring.service;

import java.util.List;

import com.example.spring.Entity.User;

public interface UserService {
//	User createUser(User user);

    public User getUserById(Long userId);
    public List<User> getAllUsers();
    User createUser(User user);

}
