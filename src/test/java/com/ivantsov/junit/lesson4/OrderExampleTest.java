package com.ivantsov.junit.lesson4;

import org.junit.*;
//import org.junit.AfterClass;
//import org.junit.BeforeClass;
//import org.junit.FixMethodOrder;
//import org.junit.Test;
import org.junit.runners.MethodSorters;

//@FixMethodOrder(MethodSorters.JVM)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OrderExampleTest {
    
    public OrderExampleTest() {
    }
    
    @BeforeClass
    public static void before() {
        System.out.println("Before OrderExampleTest.class");
    }
    
    @AfterClass
    public static void after() {
        System.out.println("After OrderExampleTest.class");
    }

    @Test
    public void firstTest() {
        OrderExample.printDetail("firstTest");
    }
    
    @Test
    public void test() {
        OrderExample.printDetail("test");
    }
    
    @Test
    public void secondTest() {
        OrderExample.printDetail("secondTest");
    }
    
}
