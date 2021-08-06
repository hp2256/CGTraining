package com.hp.springmvc;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
public boolean isUserValid(String user, String password) {
	if(user.equals("hp")&& password.equals("pass"))
		return true;
	return false;
}
}
