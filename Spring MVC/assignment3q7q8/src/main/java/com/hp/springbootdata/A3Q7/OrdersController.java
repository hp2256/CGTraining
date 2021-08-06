package com.hp.springbootdata.A3Q7;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class OrdersController {

	@Autowired
	OrdersService ordersService;

	@RequestMapping("/orders")
	// @ApiOperation(value = "Gets all the topics", notes = "Use this to get all the
	// topics in the api", response = Topic.class)
	public List<Orders> getAllOrders() {
		return ordersService.getAllOrders();
	}

	@RequestMapping("/orders/{id}")
	public Orders getEmp(@PathVariable int id) {
		return ordersService.getOrder(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/orders")
	public void addEmp(@RequestBody Orders order) {
		ordersService.addOrder(order);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/orders/{id}")
	public void updateEmp(@RequestBody Orders order) {
		ordersService.updateOrder(order);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/orders/{id}")
	public void deleteEmp(@PathVariable int id) {
		ordersService.deleteOrder(id);
	}
}
