package com.example.individualprep.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VectorDotProductTest {

    private final VectorUtility vectorUtility = new VectorUtility();

    @Test
    void testDotProductBasic() {
        double[] v1 = {1, 2, 3};
        double[] v2 = {4, 5, 6};
        assertEquals(32, vectorUtility.dotProduct(v1, v2));
    }

    @Test
    void testDotProductOrthogonal() {
        double[] v1 = {1, 0, 0};
        double[] v2 = {0, 1, 0};
        assertEquals(0, vectorUtility.dotProduct(v1, v2));
    }

    @Test
    void testDotProductSameVector() {
        double[] v = {3, 4};
        assertEquals(25, vectorUtility.dotProduct(v, v));
    }

    @Test
    void testDotProductWithNegatives() {
        double[] v1 = {2, -3, 1};
        double[] v2 = {1, 2, 4};
        assertEquals(0, vectorUtility.dotProduct(v1, v2));
    }
}
