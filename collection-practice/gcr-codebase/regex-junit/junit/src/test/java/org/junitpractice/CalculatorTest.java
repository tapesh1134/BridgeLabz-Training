package org.junitpractice;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void testAddition() {
        Calculator calc = new Calculator();
        int result = calc.add(5, 3);
        assertEquals(8, result);
    }
    @Test
    void testSubtraction() {
        Calculator calc = new Calculator();
        int result = calc.subtract(5, 3);
        assertEquals(2, result);
    }
    @Test
    void testMultiplication() {
        Calculator calc = new Calculator();
        int result = calc.multiply(5, 3);
        assertEquals(15, result);
    }
    @Test
    void testDivision() {
        Calculator calc = new Calculator();
        int result = calc.divide(15, 3);
        assertEquals(5, result);
    }
}
