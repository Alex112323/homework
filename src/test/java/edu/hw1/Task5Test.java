package edu.hw1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    @Test
    void isPalindromeDescendant4ThOrder() {
        Task5 task5 = new Task5();
        Integer number = 11211230;
        boolean response = task5.isPalindromeDescendant(number);
        assertTrue(response);
    }
    @Test
    void isPalindromeDescendant3ThOrder() {
        Task5 task5 = new Task5();
        Integer number = 13001120;
        boolean response = task5.isPalindromeDescendant(number);
        assertTrue(response);
    }
    @Test
    void isPalindromeDescendant2ThOrder() {
        Task5 task5 = new Task5();
        Integer number = 23336014;
        boolean response = task5.isPalindromeDescendant(number);
        assertTrue(response);
    }
    @Test
    void isPalindromeDescendant1ThOrder() {
        Task5 task5 = new Task5();
        Integer number = 11;
        boolean response = task5.isPalindromeDescendant(number);
        assertTrue(response);
    }
    @Test
    void isPalindromeDescendantOddLength() {
        Task5 task5 = new Task5();
        Integer number = 128;
        boolean response = task5.isPalindromeDescendant(number);
        assertFalse(response);
    }
    @Test
    void isPalindromeDescendantDigit() {
        Task5 task5 = new Task5();
        Integer number = 1;
        boolean response = task5.isPalindromeDescendant(number);
        assertTrue(response);
    }
}
