package com.fazil.springhiber.dao;

import java.util.List;

import com.fazil.springhiber.model.User;

public interface UserDAO {

	User findById(long id);
	List<User> findAllUsers();
}
