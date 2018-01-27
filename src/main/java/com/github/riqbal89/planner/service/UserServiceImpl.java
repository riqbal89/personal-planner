package com.github.riqbal89.planner.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.github.riqbal89.planner.dao.UserDao;
import com.github.riqbal89.planner.entities.Login;
import com.github.riqbal89.planner.entities.User;

public class UserServiceImpl implements UserService {
	
	@Autowired
	public UserDao userDao;
	
	public void register(User user) {
		userDao.register(user);
	}
	
	public User validateUser(Login login) {
		return userDao.validateUser(login);
	}

}
