package com.fazil.springhiber.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.fazil.springhiber.model.User;

@Repository(value="userDao")
public class UserDAOImpl extends ApplicationDAO<Long, User> implements UserDAO {

	@Override
	public User findById(long id) {
		return getByKey(id);
	}

	@Override
	public List<User> findAllUsers() {
		return (List<User>)createEntityCriteria().list();
	}

}
