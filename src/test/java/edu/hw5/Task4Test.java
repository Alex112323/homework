package edu.hw5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    void check_Correct_Password_One_Symbol() {
        Task4 task4 = new Task4();
        boolean result = task4.checkCorrectPassword("~zxcvb");
        boolean expected = true;
        assertEquals(expected, result);
    }

    @Test
    void check_Correct_Password_Not_Correct() {
        Task4 task4 = new Task4();
        boolean result = task4.checkCorrectPassword("zxcvb");
        boolean expected = false;
        assertEquals(expected, result);
    }

    @Test
    void check_Correct_Password_Many_Symbols() {
        Task4 task4 = new Task4();
        boolean result = task4.checkCorrectPassword("~!$#afjaff!");
        boolean expected = true;
        assertEquals(expected, result);
    }
}
