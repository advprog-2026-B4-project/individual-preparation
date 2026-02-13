package com.example.individualprep.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;


public class AritmeticExponentTest {
   
    private ArithmeticUtility arithmeticUtility;

    @BeforeEach
    void setUp() {
        arithmeticUtility = new ArithmeticUtility();
    }

    @Test
    void testExponentPositiveBasePositiveExponent() {
        double result = arithmeticUtility.exponent(2.0, 3);
        assertEquals(8.0, result, 0.0001);
    }

    @Test
    void testExponentPositiveBaseZeroExponent() {
        double result = arithmeticUtility.exponent(5.0, 0);
        assertEquals(1.0, result, 0.0001);
    }

    @Test
    void testExponentPositiveBaseNegativeExponent() {
        double result = arithmeticUtility.exponent(2.0, -2);
        assertEquals(0.25, result, 0.0001);
    }

    @Test
    void testExponentNegativeBaseOddExponent() {
        double result = arithmeticUtility.exponent(-2.0, 3);
        assertEquals(-8.0, result, 0.0001);
    }

    @Test
    void testExponentNegativeBaseEvenExponent() {
        double result = arithmeticUtility.exponent(-2.0, 2);
        assertEquals(4.0, result, 0.0001);
    }

    @Test
    void testExponentZeroBasePositiveExponent() {
        double result = arithmeticUtility.exponent(0.0, 5);
        assertEquals(0.0, result, 0.0001);
    }

    @Test
    void testExponentDecimalBase() {
        double result = arithmeticUtility.exponent(1.5, 2);
        assertEquals(2.25, result, 0.0001);
    }

    @Test
    void testExponentOfOne() {
        double result = arithmeticUtility.exponent(7.0, 1);
        assertEquals(7.0, result, 0.0001);
    }

    @Test
    void testExponentLargeExponent() {
        double result = arithmeticUtility.exponent(2.0, 10);
        assertEquals(1024.0, result, 0.0001);
    }

    @Test
    void testExponentFractionalResult() {
        double result = arithmeticUtility.exponent(10.0, -3);
        assertEquals(0.001, result, 0.0001);
    }
}
