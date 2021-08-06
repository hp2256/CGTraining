package com.hp.springbootstarter.Q3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class FindLocationService {

	List<Locations> locationsList = new ArrayList<>(
			Arrays.asList(new Locations("Maharashtra", "Mumbai", "India", 400002),
					new Locations("NYC", "NYC", "USA", 14207), new Locations("Karnataka", "BLR", "India", 123415)));

	public Locations findLocation(int zip) {
		return locationsList.stream().filter(t -> t.zipcode == zip).findAny().get();
	}
}
