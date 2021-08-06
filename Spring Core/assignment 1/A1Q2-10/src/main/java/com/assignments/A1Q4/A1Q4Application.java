package com.assignments.A1Q4;

import com.assignments.A1Q3.BankAccountController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class A1Q4Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext
                = SpringApplication.run(A1Q4Application.class, args);
        AddTitle addTitle = applicationContext.getBean(AddTitle.class);
        DisplayName displayNameBean = (DisplayName) applicationContext.getBean("diplayname");
        addTitle.addName();
        displayNameBean.display();

    }

}
