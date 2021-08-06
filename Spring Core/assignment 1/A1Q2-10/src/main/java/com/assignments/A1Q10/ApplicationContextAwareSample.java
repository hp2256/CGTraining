package com.assignments.A1Q10;

import com.assignments.A1Q3.BankAccount;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationContextAwareSample implements ApplicationContextAware {
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        BankAccount user = (BankAccount) applicationContext.getBean("bankAccount");
        System.out.println("Application context aware sample printing bean Bankaccounts balance "+ user.getAccountBalance());
    }
}
