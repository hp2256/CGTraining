package com.assignments.A1Q6;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeExternalService {
    //from property file dbConfig.properties
    @Value("${driver.class.name}")
    String driverClassName;

    @Value("${dburl}")
    String dburl;

    @Value("${username}")
    String username;

    @Value("${password}")
    String pass;
    public String returnServiceUrl() {
        return driverClassName+"\n"+dburl+"\n"+username+"\n"+pass;
    }
}
