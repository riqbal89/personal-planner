package com.github.riqbal89.planner.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.github.riqbal89.planner.entities.User;

public class UserMapper implements RowMapper<User> {

	public User mapRow(ResultSet resultSet, int arg1) throws SQLException {

		User user = new User();

		user.setId(resultSet.getInt("id"));
		user.setUsername(resultSet.getString("username"));
		user.setPassword(resultSet.getString("password"));
		user.setFirstname(resultSet.getString("firstname"));
		user.setSurname(resultSet.getString("lastname"));
		user.setEmail(resultSet.getString("email"));
		return user;
	}

}
