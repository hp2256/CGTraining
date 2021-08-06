package com.hp.springbootstarter.Q2;

import org.springframework.stereotype.Service;

@Service
public class ValidateService {
	User u = new User("hp", "pass");

	public String validateUser(User user) {
		if (user.id.equals(u.getId()) && user.password.equals(u.getPassword()))
			return "valid user";
		else
			return "Invalid user";
	}
}
