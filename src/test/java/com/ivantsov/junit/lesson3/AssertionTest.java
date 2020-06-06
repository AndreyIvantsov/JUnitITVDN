package com.ivantsov.junit.lesson3;

import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionTest {
    
    public AssertionTest() {
    }

    @Test
    public void test_whenAssertionEquality_thenEqual() {
        String actual = "ITVDN";
        String expected = "ITVDN";
        String message = "Expected and actual not equal";
        assertEquals(message, expected, actual);
    }
    
    @Test
    public void test_whenAssertionDoubleEquality_thenEqual() {
        double actual = 0.34;
        double expected = 0.33;
        // delta - это максимально допустимая разница между
        // actual и expected
        double delta = 0.05;
        String message = "The difference between expected and actual more then " + delta;
        assertEquals(message, expected, actual, delta);
    }
    
    @Test
    public void test_whenAsstrtionArrayEquality_thenEqual() {
        char[] actual = {'J', 'u', 'n', 'i', 't'};
        char[] expected = "Junit".toCharArray();
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void test_givenNullArray_whenAssertionArrarysEquality_thenEqual() {
        int[] actual = null;
        int[] expected = null;
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void test_whenAssertionNull_thenTrue() {
        Object tested = null;
        assertNull("Tested object should be null", tested);
    }
    
    @Test
    public void test_whenAssertionNotNull_thenTrue() {
        Object tested = new Object();
        assertNotNull(tested);
    }
    
    @Test
    public void test_whenAssertionNotSomeObject_thenDifferent() {
        Object cat = new Object();
        Object dog = new Object();
        // Переменные cat и dog на ссылаются на различные объекты
        assertNotSame(cat, dog);
    }
}
