package com.assignments.A1Q8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
@Repository
public class PersonDAO {
    @PostConstruct
    void postConstruct(){
        System.out.println("post construct the bean is being created");
    }
    @PreDestroy
    void preDestroy(){
        System.out.println("predestroy now the bean will be destroyed");
    }
    @Autowired
    JdbcConnection jdbcConnection;

    public JdbcConnection getJdbcConnection() {
        return jdbcConnection;
    }

    public void setJdbcConnection(JdbcConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }
}
