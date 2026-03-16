package com.polybit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DominoPiling_50ATest {

    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;
    private ByteArrayOutputStream testOut;

    @BeforeEach
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    private void provideInput(String data) {
        ByteArrayInputStream testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    private String getOutput() {
        return testOut.toString();
    }

    @AfterEach
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }

    @Test
    public void testExample1() {
        String input = "2 4\n";
        provideInput(input);
        
        DominoPiling_50A.main(new String[0]);
        
        assertEquals("4\n", getOutput().replace("\r\n", "\n"));
    }

    @Test
    public void testExample2() {
        String input = "3 3\n";
        provideInput(input);
        
        DominoPiling_50A.main(new String[0]);
        
        assertEquals("4\n", getOutput().replace("\r\n", "\n"));
    }
}
