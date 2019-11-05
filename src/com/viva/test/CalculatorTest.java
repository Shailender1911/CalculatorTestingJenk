package com.viva.test;
import org.junit.Test;

import com.viva.client.Calculator;

import org.junit.Assert;
import org.junit.Before;
public class CalculatorTest {
    private Calculator objCalcUnderTest;
    @Before
    public void setUp() {
        objCalcUnderTest = new Calculator();
    }
    @Test
    public void testAdd() {
        int a = 15;
        int b = 20;
        int expectedResult = 35;
        long result = Calculator.add(a, b);
        Assert.assertEquals(expectedResult, result);;
    }
    @Test
    public void testSubtract() {
        int a = 25;
        int b = 20;
        int expectedResult = 5;
        long result = Calculator.sub(a, b);
        Assert.assertEquals(expectedResult, result);;
    }
    @Test
    public void testMultiply() {
        int a = 10;
        int b = 25;
        long expectedResult = 250;
        long result = Calculator.mult(a, b);
        Assert.assertEquals(expectedResult, result);;
    }
    @Test
    public void testDivide() {
        int a = 50;
        int b = 10;
        double expectedResult = 5;
        double result = Calculator.div(a, b);
        Assert.assertEquals(expectedResult, result,0.00005);
    }
   
}
