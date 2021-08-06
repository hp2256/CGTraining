package com.hp.springmvc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class EmployeeRegister {


	private List<Employee> empList = new ArrayList<>();

	private EmployeeRegister() {
		this.empList.add(new Employee(101, "john",100000));
		this.empList.add(new Employee(102, "jack", 50000));
		this.empList.add(new Employee(103, "james", 40000));
		this.empList.add(new Employee(104, "amy", 24000));
		this.empList.add(new Employee(105, "abe", 20000));
		this.empList.add(new Employee(106, "susan", 30000));
		this.empList.add(new Employee(107, "raju", 50000));
		this.empList.add(new Employee(108, "ramu", 60000));
		this.empList.add(new Employee(109, "dude", 55000));
		this.empList.add(new Employee(110, "rambo", 1400000));
		this.empList.add(new Employee(111, "rocky", 200000));
		this.empList.add(new Employee(112, "wick", 60000));
		this.empList.add(new Employee(113, "clark", 30000));
		this.empList.add(new Employee(114, "joanna", 70000));
		this.empList.add(new Employee(115, "lissy", 100000));
	}

	public List<Employee> getEmpList() {
		return empList;
	}

	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}

}
