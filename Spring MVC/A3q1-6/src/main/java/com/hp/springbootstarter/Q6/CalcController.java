package com.hp.springbootstarter.Q6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {
	@Autowired
	CalculatorService calc;

	@RequestMapping(method = RequestMethod.POST, value = "/add")
	public double addNos(@RequestBody Calc c) {
		return calc.addNos(c.x, c.y);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/divide")
	public double divideNos(@RequestBody Calc c) {
		return calc.divideNos(c.x, c.y);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/multiply")
	public double multiplyNos(@RequestBody Calc c) {
		return calc.multiplyNos(c.x, c.y);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/subtract")
	public double subtractNos(@RequestBody Calc c) {
		return calc.subtractNos(c.x, c.y);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/squareroot")
	public double squareRootNos(@RequestBody Calc c) {
		return calc.squareRootNos(c.x);
	}
}
