package com.github.riqbal89.planner.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.github.riqbal89.planner.entities.Login;
import com.github.riqbal89.planner.entities.User;
import com.github.riqbal89.planner.mapper.UserMapper;

@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	NamedParameterJdbcTemplate namedJdbcTemplate;
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		namedJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	public void register(User user) {
		SqlParameterSource userParameters = new BeanPropertySqlParameterSource(user);
		String sql = "INSERT INTO users (id, username, password, firstname, lastname, email) VALUES(:id, :username, :password, :firstname, :surname, :email)";
		
		// update(String sql, Object[] array);
		namedJdbcTemplate.update(sql, userParameters);
	}

	public User validateUser(Login login) {
		String sql = "Select * from users where username='" + login.getUsername() + "' and password='"
				+ login.getPassword() + "'";
		
		List<User> users = jdbcTemplate.query(sql, new UserMapper());
		return users.size() > 0 ? users.get(0) : null;
	}

}
