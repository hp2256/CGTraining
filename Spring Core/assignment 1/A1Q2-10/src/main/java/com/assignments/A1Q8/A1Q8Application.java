package com.assignments.A1Q8;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class A1Q8Application {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext applicationContext =
                     new AnnotationConfigApplicationContext(A1Q8Application.class);
        ) {
            CustomerService customerService = applicationContext.getBean(CustomerService.class);
            System.out.println(customerService);
            PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
            personDAO.getJdbcConnection();
        }
    }

}
