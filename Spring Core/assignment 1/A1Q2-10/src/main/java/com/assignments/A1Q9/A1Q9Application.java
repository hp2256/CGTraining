package com.assignments.A1Q9;

import com.assignments.A1Q5.Employee;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class A1Q9Application {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("applicationContext.xml");
        applicationContext.close();
    }

}
