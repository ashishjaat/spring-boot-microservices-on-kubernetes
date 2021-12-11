package com.user.management.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.shared.dtos.model.User;


public interface UserRepository extends MongoRepository<User, Integer> {

	User findByUserName(String username);

}
