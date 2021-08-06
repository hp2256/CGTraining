package com.assignments.A1Q2.case2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class A1Q2Applicationcase2 {

	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext applicationContext
					= new ClassPathXmlApplicationContext("applicationContext.xml")){
			QuestionCase2 q1 = applicationContext.getBean(QuestionCase2.class);
			q1.display();
		}
	}

}
