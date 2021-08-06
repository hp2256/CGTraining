package com.hp.springmvc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepo {
	public List<Employee> getEmp() {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "Amit", 30000));
		employees.add(new Employee(2, "Ajit", 40000));
		employees.add(new Employee(3, "James", 50000));
		employees.add(new Employee(4, "Sonoo", 60000));
		employees.add(new Employee(5, "Sarfraz", 70000));
		employees.add(new Employee(6, "Bob", 80000));
		return employees;
	}
}
