package com.example;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue( true );
    }

    @Test
    public void shouldReturnHelloWorld()
    {
        assertEquals(
            "Hello, test, from AWS Lambda!", 
            new App().handleRequest("test")
        );
    }
}
