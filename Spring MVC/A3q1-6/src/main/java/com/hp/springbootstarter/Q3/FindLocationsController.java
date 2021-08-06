package com.hp.springbootstarter.Q3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FindLocationsController {
	@Autowired
	FindLocationService locationInfo;

	@RequestMapping(method = RequestMethod.GET, value = "/findlocationinfo/{zip}")
	public Locations findLoc(@PathVariable int zip) {
		return locationInfo.findLocation(zip);
	}

}
