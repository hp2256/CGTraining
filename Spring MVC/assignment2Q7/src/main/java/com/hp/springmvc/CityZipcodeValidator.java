package com.hp.springmvc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.BeanWrapperImpl;

public class CityZipcodeValidator implements ConstraintValidator<CityZipcode, Object> {
	Map<String, String> zipCodes = new HashMap<>();
	Map<String, List<String>> cities = new HashMap<String, List<String>>();
	private String city;
	private String zipCode;

	@Override
	public void initialize(CityZipcode arg0) {
		System.out.println(arg0.toString());
		this.city = arg0.city();
		this.zipCode = arg0.zipcode();
		List<String> mumbaiZips = new ArrayList<>(Arrays.asList("1234", "1235", "1236"));
		List<String> delhiZips = new ArrayList<>(Arrays.asList("2345", "2235", "2236"));
		List<String> blrZips = new ArrayList<>(Arrays.asList("3234", "3235", "3236"));

		cities.put("mumbai", mumbaiZips);
		cities.put("bangalore", blrZips);
		cities.put("delhi", delhiZips);
		zipCodes.put("Mumbai", "1234");
	}

	@Override
	public boolean isValid(Object arg0, ConstraintValidatorContext arg1) {

		Object cityValue = new BeanWrapperImpl(arg0).getPropertyValue(city);
		Object zipCodeValue = new BeanWrapperImpl(arg0).getPropertyValue(zipCode);
		System.out.println(cityValue + " " + zipCodeValue);

		if (cities.entrySet().stream().anyMatch(
				a -> a.getKey().equals(cityValue) && a.getValue().stream().anyMatch(b -> b.equals(zipCodeValue)))) {
			System.out.println("true");
			return true;
		}
		/*
		 * if (cities.keySet().stream().anyMatch(t -> t.equals(cityValue))) { if
		 * (cities.values().contains(zipCodeValue)) { System.out.println("true"); return
		 * true; } }
		 */

		return false;
	}

}
