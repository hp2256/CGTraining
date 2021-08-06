package com.assignments.A1Q2.case1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class A1Q2Application {

	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext applicationContext
					= new ClassPathXmlApplicationContext("applicationContext.xml")){
			QuestionCase1 q1 = applicationContext.getBean(QuestionCase1.class);
			q1.display();
		}
	}

}
