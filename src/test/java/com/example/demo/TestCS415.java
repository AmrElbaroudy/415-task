package com.example.demo;

// Import the modern JUnit 5 classes
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestCS415 {

    // A small tolerance for comparing double-precision floating-point numbers
    private static final double DELTA = 1e-9;

    @Test
    void testSqrt() {

        assertEquals(3.0, CS415.sqrt(9.0), DELTA);
        assertEquals(0.0, CS415.sqrt(0.0), DELTA);
        assertEquals(1.41421356237, CS415.sqrt(2.0), DELTA);
    }

    @Test
    void CS415AbsInt() {
        assertEquals(5, CS415.abs(-5));
        assertEquals(5, CS415.abs(5));
        assertEquals(0, CS415.abs(0));
    }

    @Test
    void CS415AbsDouble() {
        assertEquals(5.5, CS415.abs(-5.5), DELTA);
        assertEquals(5.5, CS415.abs(5.5), DELTA);
        assertEquals(0.0, CS415.abs(0.0), DELTA);
    }

    @Test
    void CS415Sin() {
        assertEquals(0.0, CS415.sin(0.0), DELTA);
        assertEquals(1.0, CS415.sin(Math.PI / 2), DELTA);
        assertEquals(-1.0, CS415.sin(-Math.PI / 2), DELTA);
    }

    @Test
    void CS415Cos() {
        assertEquals(1.0, CS415.cos(0.0), DELTA);
        assertEquals(-1.0, CS415.cos(Math.PI), DELTA);
        assertEquals(0.0, CS415.cos(Math.PI / 2), DELTA);
    }

    @Test
    void CS415Tan() {
        assertEquals(0.0, CS415.tan(0.0), DELTA);
        assertEquals(1.0, CS415.tan(Math.PI / 4), DELTA);
    }
}