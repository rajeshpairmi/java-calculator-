package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
        assertEquals(10, calculator.add(5, 5));
        assertEquals(-1, calculator.add(2, -3));
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.subtract(4, 3));
        assertEquals(0, calculator.subtract(5, 5));
        assertEquals(5, calculator.subtract(2, -3));
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(0, calculator.multiply(5, 0));
        assertEquals(-6, calculator.multiply(2, -3));
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(2.0, calculator.divide(6, 3), 0.01);
        assertEquals(2.5, calculator.divide(5, 2), 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        calculator.divide(5, 0);
    }
}

