package com.assignments.A1Q4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

@Controller
@Configuration
public class DisplayName {
    @Autowired
    PersonDao personDao;
    @Bean
    public DisplayName diplayname(){
        return new DisplayName();
    }
    public void display(){
        System.out.println(personDao.getName());
    }
}
