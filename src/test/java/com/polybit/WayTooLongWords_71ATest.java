package com.polybit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WayTooLongWords_71ATest {

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
    public void testExample() {
        String input = "4\n" +
                "word\n" +
                "localization\n" +
                "internationalization\n" +
                "pneumonoultramicroscopicsilicovolcanoconiosis\n";
        provideInput(input);
        
        WayTooLongWords_71A.main(new String[0]);
        
        String expected = "word\n" +
                "l10n\n" +
                "i18n\n" +
                "p43s\n";
        assertEquals(expected, getOutput().replace("\r\n", "\n"));
    }
}
