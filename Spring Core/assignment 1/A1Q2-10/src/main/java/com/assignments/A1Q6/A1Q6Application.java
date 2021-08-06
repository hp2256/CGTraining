package com.assignments.A1Q6;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
//adding dbConfig.properties
@PropertySource("/dbConfig.properties")
public class A1Q6Application {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext applicationContext =
                     new AnnotationConfigApplicationContext(A1Q6Application.class);
        ) {
            SomeExternalService service = applicationContext.getBean(SomeExternalService.class);
            System.out.println(service.returnServiceUrl());
        }
    }

}
