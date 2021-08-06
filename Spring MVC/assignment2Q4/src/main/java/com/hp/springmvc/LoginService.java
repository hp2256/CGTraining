package com.hp.springmvc;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
public boolean isUserValid(User user) {
	if(user.name.equals("hp")&& user.password.equals("pass"))
		return true;
	return false;
}
}
