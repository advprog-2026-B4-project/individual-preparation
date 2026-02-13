package com.example.individualprep.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArithmeticSubtractTest {

    private final ArithmeticUtility arithmeticUtility = new ArithmeticUtility();

    @Test
    void testSubtractPositive() {
        assertEquals(7, arithmeticUtility.subtract(15, 8));
    }

    @Test
    void testSubtractNegative() {
        assertEquals(-8, arithmeticUtility.subtract(5, 13));
    }

    @Test
    void testSubtractWithZero() {
        assertEquals(20, arithmeticUtility.subtract(20, 0));
    }

    @Test
    void testSubtractDecimal() {
        assertEquals(7.0, arithmeticUtility.subtract(12.5, 5.5), 0.0001);
    }
}
