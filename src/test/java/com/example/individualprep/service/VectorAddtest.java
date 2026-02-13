package com.example.individualprep.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class VectorAddtest {
    private VectorUtility vectorUtility;

    @BeforeEach
    void setUp() {
        vectorUtility = new VectorUtility();
    }

    @Test
    void testAdd3DVectors() {
        double[] v1 = {1.0, 2.0, 3.0};
        double[] v2 = {4.0, 5.0, 6.0};
        double[] expected = {5.0, 7.0, 9.0};

        double[] result = vectorUtility.add(v1, v2);

        assertArrayEquals(expected, result, 0.0001);
    }

    @Test
    void testAdd2DVectors() {
        double[] v1 = {3.5, 2.5};
        double[] v2 = {1.5, 4.5};
        double[] expected = {5.0, 7.0};

        double[] result = vectorUtility.add(v1, v2);

        assertArrayEquals(expected, result, 0.0001);
    }

    @Test
    void testAddVectorsWithNegatives() {
        double[] v1 = {5.0, -3.0, 2.0};
        double[] v2 = {-2.0, 7.0, -1.0};
        double[] expected = {3.0, 4.0, 1.0};

        double[] result = vectorUtility.add(v1, v2);

        assertArrayEquals(expected, result, 0.0001);
    }

    @Test
     void testAddVectorsWithZeros() {
        double[] v1 = {0.0, 0.0, 0.0};
        double[] v2 = {5.0, 3.0, 2.0};
        double[] expected = {5.0, 3.0, 2.0};

        double[] result = vectorUtility.add(v1, v2);

        assertArrayEquals(expected, result, 0.0001);
    }

    @Test
    void testAddZeroVectors() {
        double[] v1 = {0.0, 0.0, 0.0};
        double[] v2 = {0.0, 0.0, 0.0};
        double[] expected = {0.0, 0.0, 0.0};

        double[] result = vectorUtility.add(v1, v2);

        assertArrayEquals(expected, result, 0.0001);
    }

    @Test
    void testAddVectorsWithDecimals() {
        double[] v1 = {1.5, 2.7, 3.3};
        double[] v2 = {0.5, 1.3, 0.7};
        double[] expected = {2.0, 4.0, 4.0};

        double[] result = vectorUtility.add(v1, v2);

        assertArrayEquals(expected, result, 0.0001);
    }

    @Test
    void testAddSingleElementVectors() {
        double[] v1 = {5.0};
        double[] v2 = {3.0};
        double[] expected = {8.0};

        double[] result = vectorUtility.add(v1, v2);

        assertArrayEquals(expected, result, 0.0001);
    }

    @Test
    void testAddLargeVectors() {
        double[] v1 = {1.0, 2.0, 3.0, 4.0, 5.0};
        double[] v2 = {5.0, 4.0, 3.0, 2.0, 1.0};
        double[] expected = {6.0, 6.0, 6.0, 6.0, 6.0};

        double[] result = vectorUtility.add(v1, v2);

        assertArrayEquals(expected, result, 0.0001);
    }

    @Test
    void testAddNullFirstVector() {
        double[] v2 = {1.0, 2.0, 3.0};

        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> vectorUtility.add(null, v2)
        );

        assertEquals("Vectors cannot be null", exception.getMessage());
    }

    @Test
    void testAddNullSecondVector() {
        double[] v1 = {1.0, 2.0, 3.0};

        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> vectorUtility.add(v1, null)
        );

        assertEquals("Vectors cannot be null", exception.getMessage());
    }

    @Test
    void testAddBothVectorsNull() {
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> vectorUtility.add(null, null)
        );

        assertEquals("Vectors cannot be null", exception.getMessage());
    }

    @Test
    void testAddDifferentLengthVectors() {
        double[] v1 = {1.0, 2.0, 3.0};
        double[] v2 = {1.0, 2.0};

        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> vectorUtility.add(v1, v2)
        );

        assertEquals("Vectors must have the same length", exception.getMessage());
    }

    @Test
    void testAddFirstVectorLonger() {
        double[] v1 = {1.0, 2.0, 3.0, 4.0};
        double[] v2 = {1.0, 2.0};

        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> vectorUtility.add(v1, v2)
        );

        assertEquals("Vectors must have the same length", exception.getMessage());
    }

    @Test
    void testAddSecondVectorLonger() {
        double[] v1 = {1.0, 2.0};
        double[] v2 = {1.0, 2.0, 3.0, 4.0};

        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> vectorUtility.add(v1, v2)
        );

        assertEquals("Vectors must have the same length", exception.getMessage());
    }

    @Test
    void testAddVectorsWithLargeNumbers() {
        double[] v1 = {1000000.0, 2000000.0, 3000000.0};
        double[] v2 = {4000000.0, 5000000.0, 6000000.0};
        double[] expected = {5000000.0, 7000000.0, 9000000.0};

        double[] result = vectorUtility.add(v1, v2);

        assertArrayEquals(expected, result, 0.0001);
    }

    @Test
    void testAddVectorsWithSmallNumbers() {
        double[] v1 = {0.0001, 0.0002, 0.0003};
        double[] v2 = {0.0004, 0.0005, 0.0006};
        double[] expected = {0.0005, 0.0007, 0.0009};

        double[] result = vectorUtility.add(v1, v2);

        assertArrayEquals(expected, result, 0.0001);
    }
}
