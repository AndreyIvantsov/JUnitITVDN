package com.ivantsov.junit.lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.hamcrest.CoreMatchers;
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
    
    @Test
    public void test_whenAssertionSomeObject_thenNotDifferent() {
        String actual = "Test";
        String expectes = actual;
        // Переменные actual и expected ссылаются на один объект
        assertSame(expectes, actual);
    }
    
    @Test
    public void test_whenAssertionCondition_thenVerify() {
        assertFalse("5 is greater then 4", 5 < 4);
        assertTrue("5 is not greater then 6", 5 < 6);
    }
    
    @Test
    public void test_whenCheckingExceptionMessage_thenEqual() {
        try {
            methodThatShouldThrowExeption();
            fail("Exeption not throw");
        } catch (UnsupportedOperationException e) {
            String exepted = "Operation is not supported";
            assertEquals(exepted, e.getMessage());
        }
    }

    private void methodThatShouldThrowExeption() {
        throw new UnsupportedOperationException("Operation is not supported");
    }
    
    @Test
    public void test_assertThatHasItems() {
        List<String> list = Arrays.asList("Java", "Kotlin", "Scala");
        assertThat(list, CoreMatchers.hasItems("Java", "Scala"));
    }
}
