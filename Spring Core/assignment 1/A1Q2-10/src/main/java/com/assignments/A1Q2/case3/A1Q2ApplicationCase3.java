package com.assignments.A1Q2.case3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class A1Q2ApplicationCase3 {

	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext applicationContext
					= new ClassPathXmlApplicationContext("applicationContext.xml")){
			QuestionCase3 q1 = applicationContext.getBean(QuestionCase3.class);
			q1.display();
		}
	}

}
