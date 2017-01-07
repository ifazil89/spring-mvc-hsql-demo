package com.fazil.springhiber.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.hibernate.internal.CriteriaImpl.CriterionEntry;
import org.springframework.stereotype.Repository;

import com.fazil.springhiber.model.UserDetail;
import com.fazil.springhiber.model.UserLoginDetail;

@Repository(value="userDao")
public class UserDAOImpl extends ApplicationDAO<Long, UserLoginDetail> implements UserDAO {

	@Override
	public UserLoginDetail findById(long id) {
		return getByKey(id);
	}

	@Override
	public List<UserLoginDetail> findAllUsers() {
		return (List<UserLoginDetail>)createEntityCriteria().list();
	}

	@Override
	public UserDetail getUserDetailByLogin(UserLoginDetail user) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.and(Restrictions.eq("userName", user.getUserName()), Restrictions.eq("password", user.getPassword())));
		UserLoginDetail userInfo =  (UserLoginDetail) criteria.uniqueResult();
		if(userInfo != null){
			return userInfo.getUser();
		}
		return null;
	}

}
