package com.fazil.springhiber.dao;

import java.util.List;

import com.fazil.springhiber.model.UserDetail;
import com.fazil.springhiber.model.UserLoginDetail;

public interface UserDAO {

	UserLoginDetail findById(long id);
	List<UserLoginDetail> findAllUsers();
	UserDetail getUserDetailByLogin(UserLoginDetail user);
}
