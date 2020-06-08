package com.ivantsov.junit.lesson5;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(JUnitParamsRunner.class)
public class SaveAdditionalUtilTest {
    
    SaveAdditionalUtil util = new SaveAdditionalUtil();
    
    @Test
//    @Parameters({"1, 2, 3", "-10, 30, 20", "15, -5, 10",  "-5, -10, -15"})
//    @Parameters(method = "parametersToTestAdd")
    @Parameters
    public void test_whenWithAnnatationProviderParams_themSafeAdd(int a, int b, int result) {
        assertEquals(result, util.addSave(a, b));
    }
    
    // [parametersFor] + [Test_whenWithAnnatationProviderParams_themSafeAdd]()
    public Object[] parametersForTest_whenWithAnnatationProviderParams_themSafeAdd() {
        return new Object[] {
            new Object[] {1, 2, 3},
            new Object[] {-10, 30, 20},
            new Object[] {Integer.MAX_VALUE, 2, Integer.MAX_VALUE},
            new Object[] {Integer.MIN_VALUE, -8, Integer.MIN_VALUE}
        };
    }
    
//    public Object[] parametersToTestAdd() {
//        return new Object[] {
//            new Object[] {1, 2, 3},
//            new Object[] {-10, 30, 20},
//            new Object[] {Integer.MAX_VALUE, 2, Integer.MAX_VALUE},
//            new Object[] {Integer.MIN_VALUE, -8, Integer.MIN_VALUE}
//        };
//    }
    
}
