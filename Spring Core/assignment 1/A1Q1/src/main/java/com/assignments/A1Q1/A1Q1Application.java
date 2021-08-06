package com.assignments.A1Q1;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class A1Q1Application {

    public static void main(String[] args) {
        //originally
      /*  AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(A1Q1Application.class);
        Customer customer1 = applicationContext.getBean(Customer.class);
        System.out.println("Customer details " + customer1);*/

        //using XML
        try(ClassPathXmlApplicationContext applicationContext =
                    new ClassPathXmlApplicationContext("applicationContext.xml")){
            Customer c1 =applicationContext.getBean(Customer.class);
           // System.out.println(c1.getCustomerAddress().getCity() + c1.getCustomerAddress().getCountry());
            System.out.println(c1.toString());
        }

    }

}
