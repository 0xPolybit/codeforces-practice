package com.polybit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NextRound_158ATest {

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
        String input = "8 5\n" +
                "10 9 8 7 7 7 5 5\n";
        provideInput(input);
        
        NextRound_158A.main(new String[0]);
        
        assertEquals("6\n", getOutput().replace("\r\n", "\n"));
    }

    @Test
    public void testExample2() {
        String input = "4 2\n" +
                "0 0 0 0\n";
        provideInput(input);
        
        NextRound_158A.main(new String[0]);
        
        assertEquals("0\n", getOutput().replace("\r\n", "\n"));
    }
}
