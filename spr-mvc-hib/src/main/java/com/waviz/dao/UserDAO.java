package com.waviz.dao;

import com.waviz.model.User;

public interface UserDAO {

	public void addUser(User user);
	public boolean checkUser(User user);
}
