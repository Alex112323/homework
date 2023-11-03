package edu.hw3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    void convert_To_Roman_Small_Number() {
        Task4 task4 = new Task4();
        Integer number = 2;
        String response;
        try {
            response = task4.convertToRoman(number);
        }
        catch (Exception e){
            response = e.getMessage();
        }
        String expected = "II";
        assertEquals(expected, response);
    }

    @Test
    void convert_To_Roman_Two_Digit_Number() {
        Task4 task4 = new Task4();
        Integer number = 12;
        String response;
        try {
            response = task4.convertToRoman(number);
        }
        catch (Exception e){
            response = e.getMessage();
        }
        String expected = "XII";
        assertEquals(expected, response);
    }

    @Test
    void convert_To_Roman_Big_Number() {
        Task4 task4 = new Task4();
        Integer number = 1015;
        String response;
        try {
            response = task4.convertToRoman(number);
        }
        catch (Exception e){
            response = e.getMessage();
        }
        String expected = "MXV";
        assertEquals(expected, response);
    }
    @Test
    void convert_To_Roman_Too_Big_number() {
        Task4 task4 = new Task4();
        Integer number = 4000;
        assertThrows(Exception.class, () -> {
            task4.convertToRoman(number);
        });
    }

    @Test
    void convert_To_Roman_Negative_Number_Or_Zero() {
        Task4 task4 = new Task4();
        Integer number = -3;
        assertThrows(Exception.class, () -> {
            task4.convertToRoman(number);
        });
    }
}
