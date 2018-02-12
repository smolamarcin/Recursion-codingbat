package com.smola.parenBit;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

@Test
public class ParenBitTest {
    @Test
    public void shouldDeleteParanthesis() {
        ParenBit parenBit = new ParenBit();
        String givenString = "hello(not really)there";
        String expected = "(not really)";
        assertEquals(parenBit.parenBit(givenString), expected);

    }
}