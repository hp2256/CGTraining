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

	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public String handleLoginRequest(@Valid @ModelAttribute("customer") Customer customer,

			BindingResult result, ModelMap model) {
		if (result.hasErrors()) {
			if (result.getFieldError("zipcode") == null && result.getGlobalError() != null) {

				model.addAttribute("zipError", result.getGlobalError().getDefaultMessage());

			}

			return "registration";
		}
		return "success";
	}

}