package com.fazil.springhiber.service;

import java.util.List;

import com.fazil.springhiber.model.User;

public interface UserService {

	User findById(long id);
	List<User> findAllUsers();
}
