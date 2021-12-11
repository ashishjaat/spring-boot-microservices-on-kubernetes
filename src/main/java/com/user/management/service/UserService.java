package com.user.management.service;

import com.shared.dtos.model.User;


public interface UserService {

	User save(User save);

	User findByUsername(String username);
    
}
