package com.assignments.A1Q2.case1;

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
public class A1Q2ApplicationTests {
    @Autowired
    QuestionCase1 q1;

    @Test
    public void testListAnswers(){
        List<String> cities = Arrays.asList("Mumbai","BLR","Chennai","Kerala","Delhi");
        assertArrayEquals(cities.toArray(),q1.getListanswers().toArray());
    }
}
