package com.projet;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTests {
    Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void testSum(){
        int result = calculator.sum(2,6);
        Assert.assertEquals(8,result);
    }

    @Test
    public void testMinus() {
        Assert.assertEquals(4, calculator.minus(8,4));
    }

    @Test
    public void testDivide(){
        Assert.assertEquals(2, calculator.divide(10,5));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideWillThrowExceptionWhenDivideOnZero() {
        calculator.divide(6, 0);
    }

    @Test
    public void testMultiply(){
        Assert.assertEquals(14, calculator.multiply(7,2));
    }

    @Test

    public void testMin(){
        int min = calculator.min(10,20);
        if (min != 11) Assert.fail();
    }

    @Test
    public void testMax() {
        int max = calculator.max(2000, -2000);
        Assert.assertEquals(2, max);
    }

}
