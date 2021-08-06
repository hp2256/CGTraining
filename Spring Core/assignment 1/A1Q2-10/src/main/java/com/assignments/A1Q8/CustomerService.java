package com.assignments.A1Q8;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class CustomerService implements InitializingBean, DisposableBean {
    String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Init method after properties are set : " + message);
    }

    public void destroy() throws Exception {
        System.out.println("Spring Container is destroyed! Customer clean up");
    }

}