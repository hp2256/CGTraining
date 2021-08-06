package com.hp.springbootstarter.Q4;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.springframework.stereotype.Repository;

@Repository
public class Card {
	// @CardNumber
	@Min(value = 16, message = "Card must be 16 numbers")
	@Max(value = 16, message = "Card must be 16 numbers")
	String x;

	public Card() {

	}

	public Card(String x) {
		super();
		this.x = x;
	}

	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}

}
