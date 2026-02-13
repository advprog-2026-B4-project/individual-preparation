package com.example.individualprep.service;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class VectorSubtractTest {

    private final VectorUtility vectorUtility = new VectorUtility();

    @Test
    void testSubtractBasic() {
        double[] v1 = {5, 7, 9};
        double[] v2 = {1, 2, 3};
        double[] expected = {4, 5, 6};
        assertArrayEquals(expected, vectorUtility.subtract(v1, v2));
    }

    @Test
    void testSubtractWithNegatives() {
        double[] v1 = {2, -3, 4};
        double[] v2 = {-1, 5, -2};
        double[] expected = {3, -8, 6};
        assertArrayEquals(expected, vectorUtility.subtract(v1, v2));
    }

    @Test
    void testSubtractEmpty() {
        double[] v1 = {};
        double[] v2 = {};
        double[] expected = {};
        assertArrayEquals(expected, vectorUtility.subtract(v1, v2));
    }

    @Test
    void testSubtractNullVector1() {
        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> vectorUtility.subtract(null, new double[] {1})
        );
        assertEquals("Vectors cannot be null", ex.getMessage());
    }

    @Test
    void testSubtractNullVector2() {
        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> vectorUtility.subtract(new double[] {1}, null)
        );
        assertEquals("Vectors cannot be null", ex.getMessage());
    }

    @Test
    void testSubtractDifferentLengths() {
        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> vectorUtility.subtract(new double[] {1, 2}, new double[] {1})
        );
        assertEquals("Vectors must have the same length", ex.getMessage());
    }
}
