package com.smola.reverseString;

import org.testng.annotations.Test;

import static org.testng.Assert.*;
@Test
public class ReverseStringTest {
    @Test
    public void shouldReverseString() {
        ReverseString reverseString = new ReverseString();
        String given = "abcdef";
        String expected = "fedcba";
        String actual = reverseString.reverse(given);
        assertEquals(actual,expected);
    }
}