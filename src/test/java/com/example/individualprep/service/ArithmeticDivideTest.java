package com.example.individualprep.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class ArithmeticDivideTest {

    private final ArithmeticUtility arithmeticUtility = new ArithmeticUtility();

    @Test
    void testDividePositive() {
        assertEquals(3.0, arithmeticUtility.divide(24, 8));
    }

    @Test
    void testDivideNegativeResult() {
        assertEquals(-3.0, arithmeticUtility.divide(-24, 8));
    }

    @Test
    void testDivideDecimal() {
        assertEquals(0.375, arithmeticUtility.divide(0.3, 0.8), 0.0001);
    }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> arithmeticUtility.divide(10, 0.0));
    }
}
