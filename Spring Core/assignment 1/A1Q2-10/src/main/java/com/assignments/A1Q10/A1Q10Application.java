package com.assignments.A1Q10;

import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class A1Q10Application {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContextAwareSample applicationContextAwareSample = new ApplicationContextAwareSample();
        applicationContextAwareSample.setApplicationContext(applicationContext);

        applicationContext.close();
    }

}
