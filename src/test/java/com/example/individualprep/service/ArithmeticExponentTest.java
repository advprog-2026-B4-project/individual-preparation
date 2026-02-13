package com.example.individualprep.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArithmeticExponentTest {

    private final ArithmeticUtility arithmeticUtility = new ArithmeticUtility();

    @Test
    void testExponentPositive() {
        assertEquals(8.0, arithmeticUtility.exponent(2.0, 3));
    }

    @Test
    void testExponentZero() {
        assertEquals(1.0, arithmeticUtility.exponent(5.0, 0));
    }

    @Test
    void testExponentNegative() {
        assertEquals(0.125, arithmeticUtility.exponent(2.0, -3));
    }

    @Test
    void testExponentOne() {
        assertEquals(5.0, arithmeticUtility.exponent(5.0, 1));
    }

    @Test
    void testExponentNegativeBase() {
        assertEquals(4.0, arithmeticUtility.exponent(-2.0, 2));
    }
}