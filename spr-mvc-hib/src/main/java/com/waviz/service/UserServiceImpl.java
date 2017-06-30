package com.waviz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.waviz.dao.UserDAO;
import com.waviz.model.User;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;
	
	@Override
	public void addUser(User user) {
		
		userDAO.addUser(user);
		
	}

	@Override
	public boolean checkUser(User user) {
		boolean isValid = userDAO.checkUser(user);
		
		if(isValid){
			return true;
		}
		return isValid;
		
	}

}
