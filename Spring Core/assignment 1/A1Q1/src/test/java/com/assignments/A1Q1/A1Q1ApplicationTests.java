package com.assignments.A1Q1;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "/applicationContext.xml")
public class A1Q1ApplicationTests {
    @Autowired
    Customer customer;
    @Test
    public void testBasicScenario(){

        assertAll(
                ()-> assertEquals("hp",customer.getCustomerName()),
                ()-> assertEquals("1234",customer.getCustomerId()),
                ()-> assertEquals(1243513,customer.getCustomerContact()),
                ()-> assertEquals("mumbai",customer.getCustomerAddress().getCity()),
                ()->assertEquals("marines",customer.getCustomerAddress().getStreet()),
                ()->assertEquals("india",customer.getCustomerAddress().getCountry()),
                ()->assertEquals(40002,customer.getCustomerAddress().getZip())
        );    }
}
