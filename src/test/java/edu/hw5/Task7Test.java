package edu.hw5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task7Test {

    @Test
    void check_Length_Incorrect_Alphabet() {
        Task7 task7 = new Task7();
        String string = "a0";
        boolean result = task7.checkLength(string);
        boolean expected = false;
        assertEquals(expected, result);
    }

    @Test
    void check_Length_Longer() {
        Task7 task7 = new Task7();
        String string = "1010100100";
        boolean result = task7.checkLength(string);
        boolean expected = false;
        assertEquals(expected, result);
    }

    @Test
    void check_Length_Correct() {
        Task7 task7 = new Task7();
        String string = "101";
        boolean result = task7.checkLength(string);
        boolean expected = true;
        assertEquals(expected, result);
    }

    @Test
    void start_Equal_End_Correct_Example() {
        Task7 task7 = new Task7();
        String string = "100010100101011";
        boolean result = task7.startEqualEnd(string);
        boolean expected = true;
        assertEquals(expected, result);
    }

    @Test
    void start_Equal_End_Not_Correct_Example() {
        Task7 task7 = new Task7();
        String string = "100010";
        boolean result = task7.startEqualEnd(string);
        boolean expected = false;
        assertEquals(expected, result);
    }

    @Test
    void least_3_Elements_Last_Zero_Correct_Example() {
        Task7 task7 = new Task7();
        String string = "100";
        boolean result = task7.least3ElementsLastZero(string);
        boolean expected = true;
        assertEquals(expected, result);
    }

    @Test
    void least_3_Elements_Last_Zero_Short() {
        Task7 task7 = new Task7();
        String string = "10";
        boolean result = task7.least3ElementsLastZero(string);
        boolean expected = false;
        assertEquals(expected, result);
    }

    @Test
    void least_3_Elements_Last_Zero_Not_Correct_End() {
        Task7 task7 = new Task7();
        String string = "10010101001";
        boolean result = task7.least3ElementsLastZero(string);
        boolean expected = false;
        assertEquals(expected, result);
    }
}
