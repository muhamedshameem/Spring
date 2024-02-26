package com.example.spring.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.Entity.User;
import com.example.spring.Repository.UserRepositorySql;
import com.example.spring.service.UserService;


@Service
public class UserServiceImpl implements UserService{
	
	
	private  UserRepositorySql userRepository;

    // Constructor injection
	@Autowired
    public UserServiceImpl(UserRepositorySql userRepository) {
        this.userRepository = userRepository;
    }
	@Override
	public User getUserById(Long userId) {
		// TODO Auto-generated method stub
		Optional<User> optionalUser = userRepository.findById(userId);
        return optionalUser.get();
	}
	@Override
    public User createUser(User user) {
      return userRepository.save(user);
    }
	@Override
	public List<User> getAllUsers() {
        return userRepository.findAll();
    }

}
