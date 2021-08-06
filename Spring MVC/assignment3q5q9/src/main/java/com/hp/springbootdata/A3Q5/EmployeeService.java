package com.hp.springbootdata.A3Q5;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository empRepository;

	public List<Employee> getAllEmployees() {
		List<Employee> getAll = new ArrayList<>();
		empRepository.findAll().forEach(getAll::add);
		return getAll;
	}

	public Employee getEmp(int id) {
		return empRepository.findById(id).get();
	}

	public void addEmployee(Employee employee) {
		empRepository.save(employee);
	}

	public void updateEmployee(Employee employee) {
		empRepository.save(employee);
	}

	public void deleteEmployee(int id) {
		empRepository.deleteById(id);
	}

}
