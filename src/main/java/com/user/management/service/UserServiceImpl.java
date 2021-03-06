package com.user.management.service;

import com.user.management.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shared.dtos.model.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
    UserRepository userRepository;
	
	@Override
    public User save(User user) {
        return userRepository.save(user);
    }
	
	@Override
	public User findByUsername(String username) {
		return userRepository.findByUserName(username);
	};

}
