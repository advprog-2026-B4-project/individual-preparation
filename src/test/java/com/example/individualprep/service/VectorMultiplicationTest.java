package com.example.individualprep.service;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class VectorMultiplicationTest {
    private VectorUtility vectorUtility = new VectorUtility();

    @Test
    void testPositiveMultiplication() {
        double[] expected = {2, 4, 6};
        double[] test = {1, 2, 3};
        assertArrayEquals(expected, vectorUtility.multiply(test, 2));
    }

    @Test
    void testNegativeMultiplication() {
        double[] expected = {-2, -4, -6};
        double[] test = {1, 2, 3};
        assertArrayEquals(expected, vectorUtility.multiply(test, -2));
    }

    @Test
    void testMultiplicationbyZero() {
        double[] expected = {0, 0, 0};
        double[] test = {1, 2, 3};
        assertArrayEquals(expected, vectorUtility.multiply(test, 0));
    }

    @Test
    void testEmptyMultiplication() {
        double[] expected = {};
        double[] test = {};
        assertArrayEquals(expected, vectorUtility.multiply(test, 3));
    }
}
