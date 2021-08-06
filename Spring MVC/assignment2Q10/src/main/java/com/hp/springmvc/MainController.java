package com.hp.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@Autowired
	EmployeeRepo employeeRepo;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String viewHome() {
		return "home";
	}

	/**
	 * Handle request to download an Excel document
	 */
	@RequestMapping(value = "/downloadExcel", method = RequestMethod.GET)
	public ModelAndView downloadExcel() {
		// create some sample data

		// return a view which will be resolved by an excel view resolver
		return new ModelAndView(new ExcelBuilder(), "employees", employeeRepo.getEmp());
	}
}