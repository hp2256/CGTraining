package com.hp.springmvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepositry employeeRepositry;

	public List<Employee> getEmployeesByPage(int pageid, int total) {
		return employeeRepositry.getEmployeesByPage(pageid, total);
	}

	public void setEmployeeRepositry(EmployeeRepositry employeeRepositry) {
		this.employeeRepositry = employeeRepositry;
	}
}
