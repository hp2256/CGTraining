package com.assignments.A1Q2.case3;

import com.assignments.A1Q2.case2.QuestionCase2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "/applicationContext.xml")
public class A1Q2ApplicationTestsCase3 {
    @Autowired
    QuestionCase3 q1;

    @Test
    public void testSetAnswers(){
        List<String> cities = Arrays.asList("Mumbai","BLR","Chennai","Kerala","Delhi");
        assertArrayEquals(cities.toArray(),q1.mapanswers.values().toArray());
    }
}
