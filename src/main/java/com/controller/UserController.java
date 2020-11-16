package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.User;
import com.service.UserService;

@CrossOrigin(allowCredentials="true",origins ="http://localhost:4200")
@RestController
@RequestMapping(value="UserWebService")
public class UserController {

	@Autowired
	UserService userService;
	
	// Autre façon de faire possible @RequestMapping(value="/user", method=RequestMethod.POST)
	@PostMapping(value="/user")
	public User saveUser(@RequestBody User user) {
		return userService.saveOrUpdateUser(user);
	}
	
	@PutMapping(value="/user")
	public User updateUser(@RequestBody User user) {
		return userService.saveOrUpdateUser(user);
	}

	@DeleteMapping(value="/user/{id}")
	public void deleteUser(@PathVariable("id") Long id) {
		userService.deleteUser(id);
	}
	
	@GetMapping(value="/user/{id}")
	public User findUser(@PathVariable("id") Long id) {
		return userService.findUser(id);
	}
	
	@GetMapping(value="/users")
	public List<User> findUser() {
		return userService.findUsers();
	}
}



