package com.hp.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class SimpleInterestController {
	
	@Autowired
	SiCalc siCalc= new SiCalc();
	  @RequestMapping(value = "/simpleinterest", method = RequestMethod.GET) public String
	  homePage() { return "simpleinterest"; }
	 
	@RequestMapping(value = "/simpleinterest", method = RequestMethod.POST)
	public String homePageDisplay(@RequestParam Double pa, @RequestParam Double noy, @RequestParam Double ri, ModelMap model) {
			//Double simpleinterest = Double.parseDouble(pa)*(1+(Double.parseDouble(noy)*Double.parseDouble(ri))));
		Double simpleinterest = siCalc.siCalc(pa,noy,ri);
		Double total = pa+simpleinterest;
		model.put("pa", pa);
		model.put("si", simpleinterest);
		model.put("total", total);
		return "simple";
	}

}