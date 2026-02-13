package com.example.individualprep.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArithmeticAddTest {

    private final ArithmeticUtility arithmeticUtility = new ArithmeticUtility();

    @Test
    void testAddPositive() {
        assertEquals(23, arithmeticUtility.add(15, 8));
    }

    @Test
    void testAddNegative() {
        assertEquals(18, arithmeticUtility.add(5, 13));
    }

    @Test
    void testAddWithZero() {
        assertEquals(20, arithmeticUtility.add(20, 0));
    }

    @Test
    void testAddDecimal() {
        assertEquals(18.0, arithmeticUtility.add(12.5, 5.5), 0.0001);
    }
}