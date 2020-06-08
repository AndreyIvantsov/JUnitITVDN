package com.ivantsov.junit.lesson4;

import java.io.IOException;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import static org.junit.Assert.fail;
import org.junit.Test;

public class FileCreaterTest {
    
    public FileCreaterTest() {
    }

    @Test(expected = IOException.class)
    public void testByAnnatationTest() throws IOException {
        FileCreater.createTempFile();
    }
    
    @Test
    public void testByTryCatch() {
        try {
            FileCreater.createTempFile();
            fail("Expected IOExeption");
        } catch (IOException e) {
            Assert.assertNotEquals("", e.getMessage());
        }
    }
    
    @Test
    public void testByAssertJ() {
        Throwable throwable = Assertions.catchThrowable(() -> FileCreater.createTempFile());
        Assertions.assertThat(throwable).isInstanceOf(IOException.class);
        Assertions.assertThat(throwable.getMessage()).isNotBlank();
    }
    
}
