package com.hp.springmvc;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepositry {
	@Autowired
	EmployeeRegister employeeRegister;

	public void setEmployeeRegister(EmployeeRegister employeeRegister) {
		this.employeeRegister = employeeRegister;
	}


	public List<Employee> getEmployeesByPage(int pageid, int count) {
		int skip = (pageid - 1) * count;
		return employeeRegister.getEmpList().stream().skip(skip).limit(count).collect(Collectors.toList());
    }
}
