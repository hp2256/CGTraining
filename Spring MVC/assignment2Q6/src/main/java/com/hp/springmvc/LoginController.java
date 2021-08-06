package com.hp.springmvc;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	@Autowired
	Customer customer;

	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public String showLoginPage(ModelMap m) {
		m.addAttribute("customer", new Customer());
		return "registration";
	}

	/*
	 * @RequestMapping(value = "/registration", method = RequestMethod.POST) public
	 * String regForm(@Valid @ModelAttribute("customer") Customer c, BindingResult
	 * br) { if (br.hasErrors()) { return "registration"; } return "success"; }
	 */
	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public String handleLoginRequest(@Valid @ModelAttribute("customer") Customer customer,

			BindingResult errors, ModelMap model) {
		// model.addAttribute("customer", new Customer());
		if (errors.hasErrors()) {
			return "registration";
		}
		return "success";
		/*
		 * if (loginService.isUserValid(new Customer(name, password, email))) {
		 * model.put("name", name); model.put("pass", password); model.put("email",
		 * email); return "success"; } else { return "error"; }
		 */

	}

}