package com.assignments.A1Q8;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;

//@Component
@Repository
public class JdbcConnection {
    public JdbcConnection() {
        System.out.println("jdbc connection");
    }

}
