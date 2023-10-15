package edu.hw1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    @Test
    void isPalindromeDescendant_1() {
        Task5 task5 = new Task5();
        Integer number = 11211230;
        boolean response = task5.isPalindromeDescendant(number);
        assertTrue(response);
    }
    @Test
    void isPalindromeDescendant_2() {
        Task5 task5 = new Task5();
        Integer number = 13001120;
        boolean response = task5.isPalindromeDescendant(number);
        assertTrue(response);
    }
    @Test
    void isPalindromeDescendant_3() {
        Task5 task5 = new Task5();
        Integer number = 23336014;
        boolean response = task5.isPalindromeDescendant(number);
        assertTrue(response);
    }
    @Test
    void isPalindromeDescendant_4() {
        Task5 task5 = new Task5();
        Integer number = 11;
        boolean response = task5.isPalindromeDescendant(number);
        assertTrue(response);
    }
    @Test
    void isPalindromeDescendant_5() {
        Task5 task5 = new Task5();
        Integer number = 128;
        boolean response = task5.isPalindromeDescendant(number);
        assertFalse(response);
    }
    @Test
    void isPalindromeDescendant_6() {
        Task5 task5 = new Task5();
        Integer number = 1;
        boolean response = task5.isPalindromeDescendant(number);
        assertTrue(response);
    }
}
