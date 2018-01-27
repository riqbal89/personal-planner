package com.github.riqbal89.planner.dao;

import com.github.riqbal89.planner.entities.Login;
import com.github.riqbal89.planner.entities.User;

public interface UserDao {

	public void register(User user);
	public User validateUser(Login login);
}
