package edu.hw1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    @Test
    void is_Palindrome_Descendant_4Th_Order() {
        Task5 task5 = new Task5();
        Integer number = 11211230;
        boolean response = task5.isPalindromeDescendant(number);
        assertTrue(response);
    }
    @Test
    void is_Palindrome_Descendant_3Th_Order() {
        Task5 task5 = new Task5();
        Integer number = 13001120;
        boolean response = task5.isPalindromeDescendant(number);
        assertTrue(response);
    }
    @Test
    void is_Palindrome_Descendant_2Th_Order() {
        Task5 task5 = new Task5();
        Integer number = 23336014;
        boolean response = task5.isPalindromeDescendant(number);
        assertTrue(response);
    }
    @Test
    void is_Palindrome_Descendant_1Th_Order() {
        Task5 task5 = new Task5();
        Integer number = 11;
        boolean response = task5.isPalindromeDescendant(number);
        assertTrue(response);
    }
    @Test
    void is_Palindrome_Descendant_Odd_Length() {
        Task5 task5 = new Task5();
        Integer number = 128;
        boolean response = task5.isPalindromeDescendant(number);
        assertFalse(response);
    }
    @Test
    void is_Palindrome_Descendant_Digit() {
        Task5 task5 = new Task5();
        Integer number = 1;
        boolean response = task5.isPalindromeDescendant(number);
        assertTrue(response);
    }
}
