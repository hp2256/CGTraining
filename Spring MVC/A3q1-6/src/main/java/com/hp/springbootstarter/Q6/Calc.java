package com.hp.springbootstarter.Q6;

import org.springframework.stereotype.Repository;

@Repository
public class Calc {
	double x;
	double y;

	public Calc() {

	}

	public Calc(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

}
