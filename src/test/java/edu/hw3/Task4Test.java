package edu.hw3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    void convert_To_Roman_Small_Number() {
        Task4 task4 = new Task4();
        Integer number = 2;
        String response = task4.convertToRoman(number);
        String expected = "II";
        assertEquals(expected, response);
    }

    @Test
    void convert_To_Roman_Two_Digit_Number() {
        Task4 task4 = new Task4();
        Integer number = 12;
        String response = task4.convertToRoman(number);
        String expected = "XII";
        assertEquals(expected, response);
    }

    @Test
    void convert_To_Roman_Big_Number() {
        Task4 task4 = new Task4();
        Integer number = 1015;
        String response = task4.convertToRoman(number);
        String expected = "MXV";
        assertEquals(expected, response);
    }
}
