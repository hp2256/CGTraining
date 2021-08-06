package com.hp.springbootstarter.Q3;

public class Locations {
	String state;
	String city;
	String country;
	int zipcode;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public Locations(String state, String city, String country, int zipcode) {
		super();
		this.state = state;
		this.city = city;
		this.country = country;
		this.zipcode = zipcode;
	}

	public Locations() {

	}

}
