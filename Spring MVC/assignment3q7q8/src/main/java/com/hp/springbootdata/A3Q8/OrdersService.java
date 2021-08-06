package com.hp.springbootdata.A3Q8;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdersService {

	@Autowired
	private OrdersRepository orderRepository;

	public List<Orders> getAllOrders() {
		// return topics;
		List<Orders> getAll = new ArrayList<>();
		orderRepository.findAll().forEach(getAll::add);
		return getAll;
	}

	public Orders getOrder(int id) {
		// return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return orderRepository.findById(id).get();
	}

	public void submitOrder(Orders order) {
		// topics.add(topic);
		orderRepository.save(order);
	}

	public void updateOrder(Orders order) {
		/*
		 * for (Topic topicupdate : topics) { if (topicupdate.getId().equals(id)) {
		 * topics.set(0, topic); } }
		 */
		orderRepository.save(order);
	}

	public void deleteOrder(int id) {
		// topics.removeIf(x -> x.getId().equals(id));
		orderRepository.deleteById(id);
	}

	public void cancelOrder(int id) {

	}

}
