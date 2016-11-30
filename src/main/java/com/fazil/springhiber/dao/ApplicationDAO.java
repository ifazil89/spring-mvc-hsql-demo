package com.fazil.springhiber.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;



public abstract class ApplicationDAO<PK extends Serializable,T> {

	private final Class<T> persistenceClass;
	
	@Autowired
	private SessionFactory sessionFactory;
	
	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public ApplicationDAO() {
		this.persistenceClass = (Class<T>)((ParameterizedType)this.getClass().getGenericSuperclass()).getActualTypeArguments()[1];
	}
	
	public T getByKey(PK key){
		return (T) getSession().get(persistenceClass, key);
	}
	
	protected Criteria createEntityCriteria() {
		return getSession().createCriteria(persistenceClass);
		
	}
}
