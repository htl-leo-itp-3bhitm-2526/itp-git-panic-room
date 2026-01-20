package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void add_works() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void divide_works() {
        assertEquals(2.5, calculator.divide(5, 2), 0.001);
    }

    @Test  // Neuer Test für Aufgabe
    void divide_by_zero_throws() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(5, 0));
    }
}
