package com.example.individualprep.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VectorNormTest {

    private final VectorUtility vectorUtility = new VectorUtility();

    @Test
    void testNormBasic() {
        double[] v = {3, 4};
        assertEquals(5.0, vectorUtility.norm(v));
    }

    @Test
    void testNormZeroVector() {
        double[] v = {0, 0, 0};
        assertEquals(0.0, vectorUtility.norm(v));
    }

    @Test
    void testNorm3D() {
        double[] v = {1, 2, 2};
        assertEquals(3.0, vectorUtility.norm(v));
    }

    @Test
    void testNormWithNegatives() {
        double[] v = {-3, -4};
        assertEquals(5.0, vectorUtility.norm(v));
    }
}