package com.assignments.A1Q4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddTitle {
    @Autowired
    PersonDao personDao;
    void addName(){
        personDao.setName("Mr HP");
    }
}
