package edu.hw1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task6Test {

    @Test
    void countKExampleWith3Frauds() {
        Task6 task6 = new Task6();
        Integer number = 3524;
        int response = task6.countK(number);
        assertEquals(3,response);
    }
    @Test
    void countKExampleWith5Frauds() {
        Task6 task6 = new Task6();
        Integer number = 6621;
        int response = task6.countK(number);
        assertEquals(5,response);
    }
    @Test
    void countKExampleWith4Frauds() {
        Task6 task6 = new Task6();
        Integer number = 6554;
        int response = task6.countK(number);
        assertEquals(4,response);
    }
    @Test
    void countKSecondExampleWith3Frauds() {
        Task6 task6 = new Task6();
        Integer number = 1234;
        int response = task6.countK(number);
        assertEquals(3,response);
    }
    @Test
    void countKExampleWithSmallNumber() {
        Task6 task6 = new Task6();
        Integer number = 1000;
        int response = task6.countK(number);
        assertEquals(-1,response);
    }
    @Test
    void countKExampleWithNegativeNumber() {
        Task6 task6 = new Task6();
        Integer number = -78;
        int response = task6.countK(number);
        assertEquals(-1,response);
    }
}
