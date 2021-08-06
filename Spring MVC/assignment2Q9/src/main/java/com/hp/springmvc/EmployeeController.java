package com.hp.springmvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@RequestMapping(value = "/Index")
	public String Index() {
		return "Index";
	}

	@RequestMapping(value = "/resgister/{page_id}", method = RequestMethod.GET)
	public ModelAndView Index(@PathVariable int page_id) {
		int total = 5;

		List<Employee> list = employeeService.getEmployeesByPage(page_id, total);

		return new ModelAndView("showAllEmployees", "list", list);
	}


}
