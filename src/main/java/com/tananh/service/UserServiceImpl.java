package com.tananh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tananh.exception.UserException;
import com.tananh.modal.User;
import com.tananh.respository.UserResponsitory;

@Service 
public class UserServiceImpl implements UserService{

	@Autowired private UserResponsitory userResponsitory;

	@Override
	public List<User> getAllUser() throws UserException {
		List<User> users = userResponsitory.findAll();
		return users;
	}
}
