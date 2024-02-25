package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final double DELTA = 1e-15;
    App calculator = new App();

    @Test
    public void testFactorialWithPositiveNumbers() {
        assertEquals("Factorial of 3", 6, calculator.fact(3), DELTA);
        assertEquals("Factorial of 6", 720, calculator.fact(6), DELTA);
    }

    @Test
    public void testFactorialWithNegativeNumbers() {
        assertNotEquals("Factorial of 7", 113, calculator.fact(7), DELTA);
        assertNotEquals("Factorial of 8", 10, calculator.fact(8), DELTA);
    }

    @Test
    public void testPowerWithPositiveNumbers() {
        assertEquals("Power of 2^4", 16, calculator.power(2, 4), DELTA);
        assertEquals("Power of 7^2", 49, calculator.power(7, 2), DELTA);
    }

    @Test
    public void testPowerWithNegativeNumbers() {
        assertNotEquals("Power of 3^3", 10, calculator.power(3, 3), DELTA);
        assertNotEquals("Power of 4^3", -7, calculator.power(4, 3), DELTA);
    }

    @Test
    public void testNaturalLogWithPositiveNumbers() {
        assertEquals("Natural log of 0", 1, calculator.naturalLog(1), DELTA);
        assertEquals("Natural log of e", 1, calculator.naturalLog(2.718281828459045), DELTA);
    }

    @Test
    public void testNaturalLogWithNegativeNumbers() {
        assertNotEquals("Natural log of 3.4", 60, calculator.naturalLog(3.4), DELTA);
        assertNotEquals("Natural log of 3.1", 4.7, calculator.naturalLog(3.1), DELTA);
    }

    @Test
    public void testSquareRootWithPositiveNumbers() {
        assertEquals("Square root of 25", 5, calculator.squareRoot(25), DELTA);
        assertEquals("Square root of 81", 9, calculator.squareRoot(81), DELTA);
    }

    @Test
    public void testSquareRootWithNegativeNumbers() {
        assertNotEquals("Square root of 5", 1, calculator.squareRoot(5), DELTA);
        assertNotEquals("Square root of 49", 3, calculator.squareRoot(49), DELTA);
    }
}
