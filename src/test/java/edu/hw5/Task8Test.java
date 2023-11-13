package edu.hw5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task8Test {

    @Test
    void check_Number_1_Correct() {
        Task8 task8 = new Task8();
        boolean result = task8.checkNumber1("10100");
        boolean expected = true;
        assertEquals(expected, result);
    }

    @Test
    void check_Number_1_Not_Odd_Length() {
        Task8 task8 = new Task8();
        boolean result = task8.checkNumber1("0100");
        boolean expected = false;
        assertEquals(expected, result);
    }

    @Test
    void check_Number_2_Correct() {
        Task8 task8 = new Task8();
        boolean result = task8.checkNumber2("01001");
        boolean expected = true;
        assertEquals(expected, result);
    }

    @Test
    void check_Number_2_Not_Correct() {
        Task8 task8 = new Task8();
        boolean result = task8.checkNumber2("0001");
        boolean expected = false;
        assertEquals(expected, result);
    }

    @Test
    void check_Number_3_Correct() {
        Task8 task8 = new Task8();
        boolean result = task8.checkNumber3("0001");
        boolean expected = true;
        assertEquals(expected, result);
    }

    @Test
    void check_Number_3_Amount_Of_Zeros_2() {
        Task8 task8 = new Task8();
        boolean result = task8.checkNumber3("01111011");
        boolean expected = false;
        assertEquals(expected, result);
    }

    @Test
    void check_Number_5_Correct() {
        Task8 task8 = new Task8();
        boolean result = task8.checkNumber5("01111101");
        boolean expected = true;
        assertEquals(expected, result);
    }

    @Test
    void check_Number_5_Not_Correct() {
        Task8 task8 = new Task8();
        boolean result = task8.checkNumber5("100111");
        boolean expected = false;
        assertEquals(expected, result);
    }
}
