package com.fazil.springhiber.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fazil.springhiber.dao.UserDAO;
import com.fazil.springhiber.model.User;

@Service(value="userSerive")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDao;
	
	@Override
	public User findById(long id) {
		return userDao.findById(id);
	}

	@Override
	public List<User> findAllUsers() {
		return userDao.findAllUsers();
	}

}
