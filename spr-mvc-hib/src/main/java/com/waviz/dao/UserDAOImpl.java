package com.waviz.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.waviz.model.User;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void addUser(User user) {
		
		getCurrentSession().save(user);
	}

	@Override
	public boolean checkUser(User user) {
		
		
		User getUser = (User) getCurrentSession().get(User.class, user.getEmail());
		
		String password = getUser.getPassword();
		
		if(user.getPassword().equals(password)){
			return true;
		}
		return false;
		
	}


}
