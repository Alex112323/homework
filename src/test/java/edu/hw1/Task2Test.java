package edu.hw1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task2Test {
    @Test
    void countDigitsFourDigitNumber() {
        Task2 task2 = new Task2();
        int number = 4666;
        int response = task2.countDigits(number);
        assertEquals(4, response);
    }
    @Test
    void countDigitsThreeDigitNumber() {
        Task2 task2 = new Task2();
        int number = 544;
        int response = task2.countDigits(number);
        assertEquals(3, response);
    }
    @Test
    void countDigitsExampleWithZero() {
        Task2 task2 = new Task2();
        int number = 0;
        int response = task2.countDigits(number);
        assertEquals(1, response);
    }
    @Test
    void countDigitsNegativeNumber() {
        Task2 task2 = new Task2();
        int number = -248;
        int response = task2.countDigits(number);
        assertEquals(3, response);
    }
}

