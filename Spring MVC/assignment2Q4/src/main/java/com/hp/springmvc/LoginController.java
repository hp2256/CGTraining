package com.hp.springmvc;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:~/test");
		dataSource.setUsername("sa");
		dataSource.setPassword("");

		return dataSource;
	}

	@Bean
	public UserDao getContactDAO() {
		return new UserDao(getDataSource());
	}

	@Autowired
	LoginService loginService;

	@Autowired
	UserDao userdao;

	@Autowired
	User user;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginPage() {
		return "login";
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String showRegisterPage() {
		return "register";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public void register(@RequestParam String name, @RequestParam String password, @RequestParam String email,
			ModelMap model) {
		userdao.insertUser(new User(name, password, email));
		/*
		 * if (loginService.isUserValid(new User(name, password, email))) { return
		 * "success"; } else { return "error"; }
		 */
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String handleLoginRequest(@RequestParam String name, @RequestParam String password,
			@RequestParam String email, ModelMap model) {
		if (userdao.findById(name) != null) {
			return "success";
		} else {
			return "error";
		}
	}
}