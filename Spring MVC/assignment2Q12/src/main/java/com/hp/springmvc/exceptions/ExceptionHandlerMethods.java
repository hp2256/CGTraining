package com.hp.springmvc.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerMethods {

	@ExceptionHandler(value = AccountNotFoundException.class)
	public String handleAccNotFound() {
		System.out.println("Account not found");
		return "accnotfound";
	}

	@ExceptionHandler(value = LowBalanceException.class)
	public String lowBal() {
		System.out.println("low balance");
		return "lowbal";
	}
}
