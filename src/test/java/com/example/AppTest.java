package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    // Define the precision for double comparison
    private static final double DELTA = 1e-15;
    
    // Create an instance of the App class
    App calculator = new App();

    // Test cases for factorial calculation with positive numbers
    @Test
    public void testFactorialWithPositiveNumbers() {
        assertEquals("Factorial of 2", 2, calculator.fact(2), DELTA); // Test factorial of 2
        assertEquals("Factorial of 4", 24, calculator.fact(4), DELTA); // Test factorial of 4
    }

    // Test cases for factorial calculation with negative numbers
    @Test
    public void testFactorialWithNegativeNumbers() {
        assertNotEquals("Factorial of 5", 113, calculator.fact(5), DELTA); // Test factorial of 5
        assertNotEquals("Factorial of 6", 10, calculator.fact(6), DELTA); // Test factorial of 6
    }

    // Test cases for power calculation with positive numbers
    @Test
    public void testPowerWithPositiveNumbers() {
        assertEquals("Power of 3^2", 9, calculator.power(3, 2), DELTA); // Test power of 3^2
        assertEquals("Power of 5^2", 25, calculator.power(5, 2), DELTA); // Test power of 5^2
    }

    // Test cases for power calculation with negative numbers
    @Test
    public void testPowerWithNegativeNumbers() {
        assertNotEquals("Power of 4^3", 10, calculator.power(4, 3), DELTA); // Test power of 4^3
        assertNotEquals("Power of 2^3", -7, calculator.power(2, 3), DELTA); // Test power of 2^3
    }

    // Test cases for natural logarithm calculation with positive numbers
    @Test
    public void testNaturalLogWithPositiveNumbers() {
        assertEquals("Natural log of 1", 0, calculator.naturalLog(1), DELTA); // Test natural log of 1
        assertEquals("Natural log of e", 1, calculator.naturalLog(2.718281828459045), DELTA); // Test natural log of e
    }

    // Test cases for natural logarithm calculation with negative numbers
    @Test
    public void testNaturalLogWithNegativeNumbers() {
        assertNotEquals("Natural log of 3.4", 60, calculator.naturalLog(3.4), DELTA); // Test natural log of 3.4
        assertNotEquals("Natural log of 3.1", 4.7, calculator.naturalLog(3.1), DELTA); // Test natural log of 3.1
    }

    // Test cases for square root calculation with positive numbers
    @Test
    public void testSquareRootWithPositiveNumbers() {
        assertEquals("Square root of 64", 8, calculator.squareRoot(64), DELTA); // Test square root of 64
        assertEquals("Square root of 25", 5, calculator.squareRoot(25), DELTA); // Test square root of 25
    }

    // Test cases for square root calculation with negative numbers
    @Test
    public void testSquareRootWithNegativeNumbers() {
        assertNotEquals("Square root of 5", 1, calculator.squareRoot(5), DELTA); // Test square root of 5
        assertNotEquals("Square root of 49", 3, calculator.squareRoot(49), DELTA); // Test square root of 49
    }
}
