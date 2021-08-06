package com.hp.springbootdata.A3Q9;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public List<Customer> getAllCustomers() {
		List<Customer> getAll = new ArrayList<>();
		customerRepository.findAll().forEach(getAll::add);
		return getAll;
	}

	public Customer getCustomer(int id) {
		return customerRepository.findById(id).get();
	}

	public void addCustomer(Customer cust) {
		customerRepository.save(cust);
	}

	public void updateCustomer(Customer cust) {

		customerRepository.save(cust);
	}

	public void deleteCustomer(int id) {
		customerRepository.deleteById(id);
	}

}
