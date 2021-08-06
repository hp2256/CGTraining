package com.hp.springbootdata.A3Q9;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CustomerController {

	@Autowired
	CustomerService customerervice;

	@RequestMapping("/customer")
	public List<Customer> getAllCustomer() {
		return customerervice.getAllCustomers();
	}

	@RequestMapping("/customer/{id}")
	public Customer getCust(@PathVariable int id) {
		return customerervice.getCustomer(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/customer")
	public void addCust(@RequestBody Customer cust) {
		customerervice.addCustomer(cust);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/customer/{id}")
	public void updateCust(@RequestBody Customer cust) {
		customerervice.updateCustomer(cust);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/customer/{id}")
	public void deleteCust(@PathVariable int id) {
		customerervice.deleteCustomer(id);
	}
}
