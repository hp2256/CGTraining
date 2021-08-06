package com.hp.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloWorldController {

	@RequestMapping(value = "/helloworld")
	public String sayHello() {
		return "helloWorld";
	}
	@RequestMapping(value = "/index")
	public String index() {
		System.out.println("hi");
		return "index";
	}
}