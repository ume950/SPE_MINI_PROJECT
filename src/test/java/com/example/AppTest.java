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
        assertEquals("Factorial of 4", 24, calculator.fact(4), DELTA);
    }

    @Test
    public void testFactorialWithNegativeNumbers() {
        assertNotEquals("Factorial of 7", 5040, calculator.fact(7), DELTA);
        assertNotEquals("Factorial of 8", 40320, calculator.fact(8), DELTA);
    }

    @Test
    public void testPowerWithPositiveNumbers() {
        assertEquals("Power of 2^5", 32, calculator.power(2, 5), DELTA);
        assertEquals("Power of 6^2", 36, calculator.power(6, 2), DELTA);
    }

    @Test
    public void testPowerWithNegativeNumbers() {
        assertNotEquals("Power of 2^4", 8, calculator.power(2, 4), DELTA);
        assertNotEquals("Power of 3^4", 81, calculator.power(3, 4), DELTA);
    }

    @Test
    public void testNaturalLogWithPositiveNumbers() {
        assertEquals("Natural log of 10", 2.302585092994046, calculator.naturalLog(10), DELTA);
        assertEquals("Natural log of e^2", 2, calculator.naturalLog(7.38905609893065), DELTA);
    }

    @Test
    public void testNaturalLogWithNegativeNumbers() {
        assertNotEquals("Natural log of 3", 1.0986122886681098, calculator.naturalLog(3), DELTA);
        assertNotEquals("Natural log of 4", 1.3862943611198906, calculator.naturalLog(4), DELTA);
    }

    @Test
    public void testSquareRootWithPositiveNumbers() {
        assertEquals("Square root of 25", 5, calculator.squareRoot(25), DELTA);
        assertEquals("Square root of 49", 7, calculator.squareRoot(49), DELTA);
    }

    @Test
    public void testSquareRootWithNegativeNumbers() {
        assertNotEquals("Square root of 5", 2, calculator.squareRoot(5), DELTA);
        assertNotEquals("Square root of 64", 8, calculator.squareRoot(64), DELTA);
    }
}
