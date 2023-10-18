package edu.hw1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task8Test {

    @Test
    void knight_Board_Capture_Figures_Dont_Contact() {
        Task8 task8 = new Task8();
        int[][] array = {
            {0, 0, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 1, 0, 1, 0},
            {0, 1, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0, 0, 1},
            {0, 0, 0, 0, 1, 0, 0, 0}};
        boolean response = task8.knightBoardCapture(array);
        assertTrue(response);
    }
    @Test
    void knight_Board_Capture_Figures_Have_Contact() {
        Task8 task8 = new Task8();
        int[][] array = {
            {1, 0, 1, 0, 1, 0, 1, 0},
            {0, 1, 0, 1, 0, 1, 0, 1},
            {0, 0, 0, 0, 1, 0, 1, 0},
            {0, 0, 1, 0, 0, 1, 0, 1},
            {1, 0, 0, 0, 1, 0, 1, 0},
            {0, 0, 0, 0, 0, 1, 0, 1},
            {1, 0, 0, 0, 1, 0, 1, 0},
            {0, 0, 0, 1, 0, 1, 0, 1}};
        boolean response = task8.knightBoardCapture(array);
        assertFalse(response);
    }
    @Test
    void knight_Board_Capture_Figures_Contact() {
        Task8 task8 = new Task8();
        int[][] array = {
            {0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 1, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0},
            {1, 0, 0, 0, 0, 0, 0, 0}};
        boolean response = task8.knightBoardCapture(array);
        assertFalse(response);
    }
    @Test
    void knight_Board_Capture_Figures_Not_Contact() {
        Task8 task8 = new Task8();
        int[][] array = {
            {1, 0, 0, 1, 0, 0, 1, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {1, 0, 0, 1, 0, 0, 1, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {1, 0, 0, 1, 0, 0, 1, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {1, 0, 0, 1, 0, 0, 1, 0},
            {0, 0, 0, 0, 0, 0, 0, 0}};
        boolean response = task8.knightBoardCapture(array);
        assertTrue(response);
    }
}
