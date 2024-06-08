package com.tananh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tananh.exception.UserException;
import com.tananh.modal.User;
import com.tananh.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired private UserService userService;
	
	@GetMapping()
	public ResponseEntity<List<User>> getAllUser() throws UserException{
		List<User> users = userService.getAllUser();
		return ResponseEntity.ok(users);
	}
}
