package com.github.riqbal89.planner.service;

import com.github.riqbal89.planner.entities.Login;
import com.github.riqbal89.planner.entities.User;

public interface UserService {
	
	public void register(User user);
	
	public User validateUser(Login login);

}
