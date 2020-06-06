package com.ivantsov.junit.lesson2;

import static org.junit.Assert.assertFalse;
import org.junit.Test;


public class NamingTest {
    
    public NamingTest() {
    }
    
    private final Naming naming = new Naming();

    // 1-й способ именования модульных тестов
    @Test
    public void test_isAdult_AgeLessThen18_False() {
        int age = 16;
        boolean result = naming.isAdult(age);
        assertFalse(result);
    }
    
    // 2-й способ именования модульных тестов
    @Test
    public void test_isAdult_False_AgeLessThen18() {
        int age = 16;
        boolean result = naming.isAdult(age);
        assertFalse(result);
    }
    
    // 3-й способ именования модульных тестов
    @Test
    public void testIsNotAnAdultIfAgeLessThen18() {
        int age = 16;
        boolean result = naming.isAdult(age);
        assertFalse(result);
    }
    
    // 4-й способ именования модульных тестов
    @Test
    public void test_isNotAnAdultIfAgeLessThen18() {
        int age = 16;
        boolean result = naming.isAdult(age);
        assertFalse(result);
    }
    
    // 5-й способ именования модульных тестов
    @Test
    public void test_should_ReturnFalse_When_AgeLessThen18() {
        int age = 16;
        boolean result = naming.isAdult(age);
        assertFalse(result);
    }
    
    // 6-й способ именования модульных тестов
    @Test
    public void test_when_AgeLessThen18_Expect_isAdultAsFalse() {
        int age = 16;
        boolean result = naming.isAdult(age);
        assertFalse(result);
    }
    
    // 7-й способ именования модульных тестов
    @Test
    public void test_given_TryToBuyACigarette_When_AgeLessThen18_Exect_IsAdultAsFalse() {
        int age = 16;
        boolean result = naming.isAdult(age);
        assertFalse(result);
    }
}
