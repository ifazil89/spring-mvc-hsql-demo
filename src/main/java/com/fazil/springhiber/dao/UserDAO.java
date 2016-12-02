package com.fazil.springhiber.dao;

import java.util.List;

import com.fazil.springhiber.model.UserLoginInfo;

public interface UserDAO {

	UserLoginInfo findById(long id);
	List<UserLoginInfo> findAllUsers();
}
