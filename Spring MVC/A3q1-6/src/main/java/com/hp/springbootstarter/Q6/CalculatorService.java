package com.hp.springbootstarter.Q6;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

	public double addNos(double x, double y) {
		return x + y;
	}

	public double divideNos(double x, double y) {
		if (y != 0)
			return x / y;
		else
			return 0;
	}

	public double multiplyNos(double x, double y) {
		return x * y;
	}

	public double subtractNos(double x, double y) {
		return x - y;
	}

	public double squareRootNos(double x) {
		return Math.sqrt(x);
	}
}
