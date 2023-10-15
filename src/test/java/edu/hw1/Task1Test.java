package edu.hw1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void minutesToSeconds_1() {
        Task1 task1 = new Task1();
        String word = "01:00";
        int response = task1.minutesToSeconds(word);
        assertEquals(60, response);
    }
    @Test
    void minutesToSeconds_2(){
        Task1 task1 = new Task1();
        String word = "13:56";
        int response = task1.minutesToSeconds(word);
        assertEquals(836, response);
    }
    @Test
    void minutesToSeconds_3() {
        Task1 task1 = new Task1();
        String word = "10:60";
        int response = task1.minutesToSeconds(word);
        assertEquals(-1, response);
    }
    @Test
    void minutesToSeconds_4() {
        Task1 task1 = new Task1();
        String word = ":30";
        int response = task1.minutesToSeconds(word);
        assertEquals(-1, response);
    }
    @Test
    void minutesToSeconds_5() {
        Task1 task1 = new Task1();
        String word = "003:20";
        int response = task1.minutesToSeconds(word);
        assertEquals(200, response);
    }
    @Test
    void minutesToSeconds_6() {
        Task1 task1 = new Task1();
        String word = "1234";
        int response = task1.minutesToSeconds(word);
        assertEquals(-1, response);
    }
}
