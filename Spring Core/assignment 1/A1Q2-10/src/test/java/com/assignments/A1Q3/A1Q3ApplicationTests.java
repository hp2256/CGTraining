package com.assignments.A1Q3;

import com.assignments.A1Q2.case1.QuestionCase1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "/applicationContext.xml")
public class A1Q3ApplicationTests {
    @Autowired
    BankAccountController bankAccount1;

    @Autowired
    BankAccountRepositoryImpl bankAccountRepository;

    @Autowired
    BankAccountServiceImpl bankAccountService;

    @Test
    public void testbyName(){
        assertEquals(10000,bankAccount1.getBalance(12345));
        System.out.println("hello");
    }
    @Test
    public void testbyType(){
        assertEquals(10000,bankAccountRepository.getBalance(12345));
    }
    @Test
    public  void byCons(){
        assertEquals(10000,bankAccountService.getBalance(12345));
    }
}
