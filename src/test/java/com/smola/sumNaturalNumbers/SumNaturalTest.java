package com.smola.sumNaturalNumbers;

import org.testng.annotations.Test;

import static org.testng.Assert.*;
@Test
public class SumNaturalTest {
    @Test
    public void shouldSumNumbers() {
        SumNatural sumN = new SumNatural();
        int given = 10;
        int expected = 100;
        int actual = sumN.sumNatural(given);
        assertEquals(actual,expected);
    }
}