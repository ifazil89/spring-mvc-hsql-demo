package com.fazil.springhiber.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fazil.springhiber.dao.UserDAO;
import com.fazil.springhiber.model.UserDetail;
import com.fazil.springhiber.model.UserLoginDetail;

@Service(value="userSerive")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDao;
	
	@Override
	public UserLoginDetail findById(long id) {
		return userDao.findById(id);
	}

	@Override
	public List<UserLoginDetail> findAllUsers() {
		return userDao.findAllUsers();
	}

	@Override
	public UserDetail getUserDetailByLogin(UserLoginDetail user) {
		return userDao.getUserDetailByLogin(user);
	}

}
