package com.fazil.springhiber.service;

import java.util.List;

import com.fazil.springhiber.model.UserDetail;
import com.fazil.springhiber.model.UserLoginDetail;

public interface UserService {

	UserLoginDetail findById(long id);
	List<UserLoginDetail> findAllUsers();
	UserDetail getUserDetailByLogin(UserLoginDetail user);
}
