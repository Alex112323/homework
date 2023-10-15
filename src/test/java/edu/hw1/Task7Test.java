package edu.hw1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task7Test {

    @Test
    void rotateRight_1() {
        Task7 task7 = new Task7();
        Integer number = 8;
        Integer shift = 1;
        String response = task7.rotateRight(number, shift);
        assertEquals("0100",response);
    }
    @Test
    void rotateRight_2() {
        Task7 task7 = new Task7();
        Integer number = -2;
        Integer shift = 1;
        String response = task7.rotateRight(number, shift);
        assertEquals("-1",response);
    }
    @Test
    void rotateRight_3() {
        Task7 task7 = new Task7();
        Integer number = 0;
        Integer shift = 3;
        String response = task7.rotateRight(number, shift);
        assertEquals("0",response);
    }
    @Test
    void rotateRight_4() {
        Task7 task7 = new Task7();
        Integer number = 21;
        Integer shift = 46;
        String response = task7.rotateRight(number, shift);
        assertEquals("11010",response);
    }

    @Test
    void rotateLeft_1() {
        Task7 task7 = new Task7();
        Integer number = 16;
        Integer shift = 1;
        String response = task7.rotateLeft(number, shift);
        assertEquals("00001",response);
    }
    @Test
    void rotateLeft_2() {
        Task7 task7 = new Task7();
        Integer number = 17;
        Integer shift = 2;
        String response = task7.rotateLeft(number, shift);
        assertEquals("00110",response);
    }
    @Test
    void rotateLeft_3() {
        Task7 task7 = new Task7();
        Integer number = -2;
        Integer shift = 2;
        String response = task7.rotateLeft(number, shift);
        assertEquals("-1",response);
    }
    @Test
    void rotateLeft_4() {
        Task7 task7 = new Task7();
        Integer number = 0;
        Integer shift = -2;
        String response = task7.rotateLeft(number, shift);
        assertEquals("0",response);
    }
    @Test
    void rotateLeft_5() {
        Task7 task7 = new Task7();
        Integer number = 18;
        Integer shift = 15;
        String response = task7.rotateLeft(number, shift);
        assertEquals("10010",response);
    }
}
