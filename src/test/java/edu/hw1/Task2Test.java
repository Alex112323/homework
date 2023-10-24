package edu.hw1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task2Test {
    @Test
    void count_Digits_Four_Digit_Number() {
        Task2 task2 = new Task2();
        int number = 4666;
        int response = task2.countDigits(number);
        assertEquals(4, response);
    }
    @Test
    void count_Digits_Three_Digit_Number() {
        Task2 task2 = new Task2();
        int number = 544;
        int response = task2.countDigits(number);
        assertEquals(3, response);
    }
    @Test
    void count_Digits_Example_With_Zero() {
        Task2 task2 = new Task2();
        int number = 0;
        int response = task2.countDigits(number);
        assertEquals(1, response);
    }
    @Test
    void count_Digits_Negative_Number() {
        Task2 task2 = new Task2();
        int number = -248;
        int response = task2.countDigits(number);
        assertEquals(3, response);
    }
}

