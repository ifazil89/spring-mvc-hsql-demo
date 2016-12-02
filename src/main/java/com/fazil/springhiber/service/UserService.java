package com.fazil.springhiber.service;

import java.util.List;

import com.fazil.springhiber.model.UserLoginInfo;

public interface UserService {

	UserLoginInfo findById(long id);
	List<UserLoginInfo> findAllUsers();
}
