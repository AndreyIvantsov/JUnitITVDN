package com.ivantsov.junit.lesson4;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.hamcrest.CoreMatchers;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.*;
import org.junit.rules.TemporaryFolder;

public class RuleClassTest {
    
    private List<String> logs = new ArrayList<>();
    
    public RuleClassTest() {
    }
    
    @Rule
    public final TemporaryFolder temporaryfolder = new TemporaryFolder();
    
    @Test
    public void test_givenTempFolderRule_whenNewFile_thenFileIsCreated() throws IOException {
        File file = temporaryfolder.newFile("file-test.txt");
        assertTrue("The file should have been created: ", file.isFile());
        assertEquals("Temp folder and test file should match", temporaryfolder.getRoot(), file.getParentFile());
    }
    
    @Rule
    public final ExpectedException expectedException = ExpectedException.none();
    
    @Test
    public void test_gevenIllegalArgument_whenExeptionThrow_messageAndCouseMatch() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectCause(CoreMatchers.isA(NullPointerException.class));
        expectedException.expectMessage("This is message");
        throw new IllegalArgumentException("This is message", new NullPointerException());
    }
    
    @Rule
    public TestName testName = new TestName();
    
    @Test
    public void testName() {
        assertEquals("testName", testName.getMethodName());
    }
    
    @Rule
    public Timeout globalTimeout = Timeout.seconds(3);
    
    @Test
    public void test_givenLongRunningTest_whenTimeOut_thenTestFail() throws InterruptedException {
//        TimeUnit.SECONDS.sleep(5); // fail
        TimeUnit.SECONDS.sleep(1); // succes
    }
    
    @Rule
    public ErrorCollector errorCollector = new ErrorCollector();
    
    @Test
    public void test_givenMultipleErrors_whenTestRun_thenCollectorReportsErrors() {
//        errorCollector.addError(new Throwable("First thing when wrong"));
//        errorCollector.addError(new Throwable("Second thing when wrong"));
    }
    
    @Rule
    public Verifier verifier = new Verifier() {
        @Override
        protected void verify() {
            //assertFalse("Message log is not empty", logs.isEmpty());
        }
    };
    
    @Test
    public void test_givenNewMessage_whenVerifier_thenMessageLogNotEmpty() {
        logs.add("There is new message");
    }
            
}
