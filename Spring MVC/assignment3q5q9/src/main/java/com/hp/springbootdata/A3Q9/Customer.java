package com.hp.springbootdata.A3Q9;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Repository;

@Repository
@Entity
public class Customer {

	@Id
	private int customerId;
	private String customerName;
	private String address;

	public Customer() {

	}

	public Customer(int customerId, String customerName, String address) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.address = address;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
