package com.smola.stringClean;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

@Test
public class StringCleanTest {
    @Test
    public void shouldDeleteDuplicates() {
        StringClean stringClean = new StringClean();
        String givenString = "yyzzza";
        String expected = "yza";
        assertEquals(stringClean.stringClean(givenString),expected);
    }
}