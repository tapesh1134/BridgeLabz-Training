package org.junitpractice;

public class DivideException {
    public int divide(int num1, int num2){
        if(num2 == 0){
            throw new ArithmeticException("Divisor is zero");
        }
        return num1/num2;
    }
}