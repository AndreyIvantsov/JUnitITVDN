package com.ivantsov.junit.lesson2;

import static junit.framework.TestCase.assertEquals;
import org.junit.*;

public class AccumulatorTest {
    
    public AccumulatorTest() {
    }
    
    private static int number;
    private Accumulator instance;
    
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before class");
        number = 10;
    }
    
    @AfterClass
    public static void afterClass() {
        System.out.println("After class");
    }
    
    @Before
    public void before() {
        System.out.println("Before method");
        instance = new Accumulator();
    }
    
    @After
    public void after() {
        System.out.println("After mothod");
        instance = null;
    }

    @Test
    public void testAccumulate() {
        System.out.println("testAccumulate");
        instance.accumulate(number);
        instance.accumulate(number * 2);
        int actual = instance.getCounter();
        int expResult = 30;
        assertEquals(expResult, actual);
    }

    @Test
//    @Ignore("Tested in accumulate method")
    public void testGetCounter() {
        System.out.println("testGetCounter");
        instance.accumulate(number);
        int actual = instance.getCounter();
        int expResult = 10;
        assertEquals(expResult, actual);
    }
    
}
