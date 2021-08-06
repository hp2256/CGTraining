package com.assignments.A1Q3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class A1Q3Application {

	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext applicationContext
					= new ClassPathXmlApplicationContext("applicationContext.xml")){
			BankAccountController bankAccount = applicationContext.getBean(BankAccountController.class);
			System.out.println(bankAccount.getBalance(12345));
		}
	}

}
