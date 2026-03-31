package org.junitpractice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class DivideExceptionTest {
    DivideException divideException = new DivideException();
    @Test
    public void testDivide(){
        ArithmeticException exception = assertThrows(ArithmeticException.class, ()-> divideException.divide(10,1));
        assertEquals("Divisor is zero", exception.getMessage());
    }
}