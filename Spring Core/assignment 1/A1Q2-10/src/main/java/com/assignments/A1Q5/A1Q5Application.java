package com.assignments.A1Q5;

import com.assignments.A1Q4.AddTitle;
import com.assignments.A1Q4.DisplayName;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class A1Q5Application {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("applicationContext.xml");
        Employee e = applicationContext.getBean("employee",Employee.class);
        System.out.println(e);
    }

}
