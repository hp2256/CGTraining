package com.hp.springbootdata.A3Q5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@RequestMapping("/employees")
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}

	@RequestMapping("/employees/{id}")
	public Employee getEmp(@PathVariable int id) {
		return employeeService.getEmp(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/employees")
	public void addEmp(@RequestBody Employee emp) {
		employeeService.addEmployee(emp);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/employees/{id}")
	public void updateEmp(@RequestBody Employee emp) {
		employeeService.updateEmployee(emp);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/employees/{id}")
	public void deleteEmp(@PathVariable int id) {
		employeeService.deleteEmployee(id);
	}
}
