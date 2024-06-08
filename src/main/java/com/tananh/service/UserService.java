package com.tananh.service;

import java.util.List;

import com.tananh.exception.UserException;
import com.tananh.modal.User;

public interface UserService {
	public List<User> getAllUser() throws UserException;
}
