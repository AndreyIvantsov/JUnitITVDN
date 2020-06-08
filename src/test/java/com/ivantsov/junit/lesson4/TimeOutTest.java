package com.ivantsov.junit.lesson4;

import org.junit.Test;

public class TimeOutTest {
    
    @Test(timeout = 5000)
    public void test_timeout() throws InterruptedException {
//        while (true) {
//            Thread.currentThread().sleep(1000);
//        }
    }
}
