package com.hp.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hp.springmvc.exceptions.AccountNotFoundException;
import com.hp.springmvc.exceptions.LowBalanceException;

@Controller
public class SimpleInterestController {

	@Autowired
	BankService bankService;

	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String homePage() {
		return "main";
	}

	@RequestMapping(value = "/main", method = RequestMethod.POST)
	public String homePageDisplay(@RequestParam int accno, @RequestParam Double bal, ModelMap model)
			throws AccountNotFoundException, LowBalanceException {
		// Double simpleinterest =
		// Double.parseDouble(pa)*(1+(Double.parseDouble(noy)*Double.parseDouble(ri))));
		bankService.findAcc(accno);
		bankService.lowBal(bal);
		model.addAttribute("balance", bal);
		model.addAttribute("account", accno);
		return "main";
	}

}