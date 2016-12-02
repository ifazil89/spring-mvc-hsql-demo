package com.fazil.springhiber.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.fazil.springhiber.model.UserLoginInfo;

@Repository(value="userDao")
public class UserDAOImpl extends ApplicationDAO<Long, UserLoginInfo> implements UserDAO {

	@Override
	public UserLoginInfo findById(long id) {
		return getByKey(id);
	}

	@Override
	public List<UserLoginInfo> findAllUsers() {
		return (List<UserLoginInfo>)createEntityCriteria().list();
	}

}
