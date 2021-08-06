package com.hp.springbootstarter.Q2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserAuthController {
	@Autowired
	ValidateService validateService;

	@RequestMapping(method = RequestMethod.POST, value = "/userauth")
	public String userAuth(@RequestBody User user) {
		return validateService.validateUser(user);
	}

}
