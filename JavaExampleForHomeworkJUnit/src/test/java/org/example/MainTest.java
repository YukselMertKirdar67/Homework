package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    @DisplayName("Add two numbers")
    void add() {
        int result = Main.add(10, 5);
        assertEquals(15, result);
    }
    @Test
    @DisplayName("Multiply two numbers")
    void multiply() {
        int result = Main.multiply(10, 5);
        assertEquals(50, result);
    }

    @Test
    @DisplayName("Minus two numbers")
    void minus() {
        int result = Main.minus(10, 5);
        assertEquals(5, result);
    }

    @Test
    @DisplayName("Divide two numbers")
    void divide() {
        int result = Main.divide(10, 5);
        assertEquals(2, result);
    }
}