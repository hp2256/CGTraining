package com.hp.springmvc;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	JdbcTemplate jdbcTemplate;

	public UserDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public List<User> findAll() {
		return jdbcTemplate.query("select * from person", new BeanPropertyRowMapper());
	}

	public User findById(String name) {
		return jdbcTemplate.queryForObject("select * from person where name=?", new BeanPropertyRowMapper<>(User.class),
				name);
	}

	public int insertUser(User user) {
		return jdbcTemplate.update("insert into person (name, password, email) values (?,?,?) ", user.name,
				user.password, user.email);
	}

}
