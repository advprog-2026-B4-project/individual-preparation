package com.example.individualprep.service;

import org.springframework.stereotype.Service;

@Service
public class VectorUtility {
    
    public double[] add(double[] v1, double[] v2) {
        // Basic Vector Validation
        if (v1 == null || v2 == null) {
            throw new IllegalArgumentException("Vectors cannot be null");
        }

        if (v1.length != v2.length) {
            throw new IllegalArgumentException("Vectors must have the same length");
        }

        double[] result = new double[v1.length];
        for (int i = 0; i < v1.length; i++) {
            result[i] = v1[i] + v2[i];
        }
        return result;
    }

    public double[] subtract(double[] v1, double[] v2) {
        // TODO: Implement me properly!
        return new double[] { 0.0, 0.0, 0.0 };
    }

    public double[] multiply(double[] v1, int x) {
        double[] res = new double[v1.length];
        for (int i = 0; i < v1.length; i++) {
            res[i] = v1[i]*x;
        }
        return res;
    }
    
    public double dotProduct(double[] v1, double[] v2) {
        double res = 0;
        for (int i = 0; i < v1.length; i++)
            res += v1[i] * v2[i];
        return res;
    }
    
    public double norm(double[] v1) {
        // TODO: Implement me properly!
        return 0.0;
    }
}