package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void add_works() {
        assertEquals(5, Calculator.add(2, 3));
    }

    @Test
    void divide_works() {
        assertEquals(2.5, Calculator.divide(5, 2), 0.001);
    }

    @Test
    void add_works() {
        assertEquals(5, Calculator.add(2, 3));
    }

}
