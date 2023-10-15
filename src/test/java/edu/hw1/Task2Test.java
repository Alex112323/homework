package edu.hw1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task2Test {
    @Test
    void countDigits_1() {
        Task2 task2 = new Task2();
        int number = 4666;
        int response = task2.countDigits(number);
        assertEquals(4, response);
    }
    @Test
    void countDigits_2() {
        Task2 task2 = new Task2();
        int number = 544;
        int response = task2.countDigits(number);
        assertEquals(3, response);
    }
    @Test
    void countDigits_3() {
        Task2 task2 = new Task2();
        int number = 0;
        int response = task2.countDigits(number);
        assertEquals(1, response);
    }
    @Test
    void countDigits_4() {
        Task2 task2 = new Task2();
        int number = -248;
        int response = task2.countDigits(number);
        assertEquals(3, response);
    }
}

