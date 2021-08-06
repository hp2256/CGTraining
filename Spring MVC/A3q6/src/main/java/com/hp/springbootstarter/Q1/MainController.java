package com.hp.springbootstarter.Q1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MainController {
	@Autowired
	RestTemplate restTemplate;

	@RequestMapping(value = "/calc/add", method = RequestMethod.POST)
	public String add(@RequestBody Calc c) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Calc> entity = new HttpEntity<Calc>(c, headers);
		return restTemplate.exchange("http://localhost:8080/add", HttpMethod.POST, entity, String.class).getBody();
	}

	@RequestMapping(value = "/divide", method = RequestMethod.POST)
	public String divide(@RequestBody Calc product) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Calc> entity = new HttpEntity<Calc>(product, headers);

		return restTemplate.exchange("http://localhost:8080/divide", HttpMethod.POST, entity, String.class).getBody();
	}

	@RequestMapping(value = "/multiply", method = RequestMethod.POST)
	public String multiply(@RequestBody Calc product) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Calc> entity = new HttpEntity<Calc>(product, headers);

		return restTemplate.exchange("http://localhost:8080/multiply", HttpMethod.POST, entity, String.class).getBody();
	}

	@RequestMapping(value = "/subtract", method = RequestMethod.POST)
	public String subtract(@RequestBody Calc product) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Calc> entity = new HttpEntity<Calc>(product, headers);

		return restTemplate.exchange("http://localhost:8080/subtract", HttpMethod.POST, entity, String.class).getBody();
	}

	@RequestMapping(value = "/squareroot", method = RequestMethod.POST)
	public String createProducts(@RequestBody Calc product) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Calc> entity = new HttpEntity<Calc>(product, headers);

		return restTemplate.exchange("http://localhost:8080/squareroot", HttpMethod.POST, entity, String.class)
				.getBody();
	}
}
