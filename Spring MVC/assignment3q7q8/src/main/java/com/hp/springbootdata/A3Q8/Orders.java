package com.hp.springbootdata.A3Q8;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Orders")
public class Orders {
	@Id
	int orderId;
	float total;
	LocalDateTime date;
	Customer customer;

	void addLineItem(LineItem lineItem) {

	}
}
