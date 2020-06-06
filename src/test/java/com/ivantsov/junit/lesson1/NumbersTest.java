package com.ivantsov.junit.lesson1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NumbersTest {
    
    public NumbersTest() {
    }

    @Test
    public void testSum() {
        int number = 5;
        Numbers instance = new Numbers();
        int expResult = 15;
        int result = instance.sum(number);
        assertEquals(expResult, result);
    }
    
}
