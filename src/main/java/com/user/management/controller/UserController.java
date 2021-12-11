package com.user.management.controller;

import com.user.management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import com.shared.dtos.model.User;

@RestController
@RequestMapping(value="/users")
public class UserController {
	
	@Autowired
    UserService userService;
	
	@RequestMapping(value = "/create/user", method = RequestMethod.POST)
	public User createUser(@RequestBody User user) {
		return userService.save(user);
	}
	
	@RequestMapping(value = "/get/user", method = RequestMethod.GET)
	public User getUser(@RequestParam String username) {
		return userService.findByUsername(username);
	}
	
}
