package com.example.individualprep.service;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ArithmeticMultiplyTest {
    private ArithmeticUtility arithmeticUtility = new ArithmeticUtility();

    @Test
    void testPositiveMultiplication() {
        assertEquals(24, arithmeticUtility.multiply(3, 8));
    }

    @Test
    void testNegativeMultiplication() {
        assertEquals(24, arithmeticUtility.multiply(-3, -8));
    }

    @Test
    void testMixedMultiplication() {
        assertEquals(-24, arithmeticUtility.multiply(-3, 8));
    }

    @Test
    void testMultiplicationByZero() {
        assertEquals(0, arithmeticUtility.multiply(0, 24));
    }

    @Test
    void testDecimalMultiplication() {
        assertEquals(0.24, arithmeticUtility.multiply(0.3, 0.8), 0.0001);
    }

}
