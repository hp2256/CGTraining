package com.hp.springmvc;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.stereotype.Repository;

@Repository
public class Customer {
	@NotBlank(message = "cannot be blank")
	@NotNull(message = "cannot be null")
	@Size(min = 8, max = 20, message = "Must be between 8 and 20 chars")
	String name;

	@NotBlank(message = "cannot be blank")
	@NotNull(message = "cannot be null")
	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$", message = "Password should be 8-20, 1 caps, 1 small, 1 special")
	String password;

	@Email
	@NotBlank(message = "cannot be blank")
	@NotNull(message = "cannot be null")
	String email;

	long contact;

	String city;

	@NotNull(message = "cannot be null")
	@Min(value = 6)
	int zipcode;

	public Customer() {

	}

	public Customer(String name, String password, String email, long contact, String city, int zipcode) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
		this.contact = contact;
		this.city = city;
		this.zipcode = zipcode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

}
