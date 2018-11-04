package com.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    void one() {
        Solution solution = new Solution();
        assertEquals(~1, solution.invertBinaryNumber(1));
    }

    @Test
    void even() {
        Solution solution = new Solution();
        assertEquals(~12, solution.invertBinaryNumber(12));
    }

    @Test
    void odd() {
        Solution solution = new Solution();
        assertEquals(~37, solution.invertBinaryNumber(37));
    }

    @Test
    void intMax() {
        Solution solution = new Solution();
        assertEquals(~Integer.MAX_VALUE, solution.invertBinaryNumber(Integer.MAX_VALUE));
    }

    @Test
    void intMin() {
        Solution solution = new Solution();
        assertEquals(~Integer.MIN_VALUE, solution.invertBinaryNumber(Integer.MIN_VALUE));
    }

}