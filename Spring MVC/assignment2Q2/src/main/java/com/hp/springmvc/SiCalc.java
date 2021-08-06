package com.hp.springmvc;

import org.springframework.stereotype.Service;

@Service
public class SiCalc {

	public double siCalc(double pa, double y, double rt) {
		return (pa*rt*y)/100;
	}
}
