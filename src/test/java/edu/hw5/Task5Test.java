package edu.hw5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    @Test
    void check_Correct_Number_Plate_Correct1() {
        Task5 task5 = new Task5();
        boolean result = task5.checkCorrectNumberPlate("А123ВЕ777");
        boolean expected = true;
        assertEquals(expected, result);
    }

    @Test
    void check_Correct_Number_Plate_Correct2() {
        Task5 task5 = new Task5();
        boolean result = task5.checkCorrectNumberPlate("О000ОО000");
        boolean expected = true;
        assertEquals(expected, result);
    }

    @Test
    void check_Correct_Number_Plate_Not_Correct() {
        Task5 task5 = new Task5();
        boolean result = task5.checkCorrectNumberPlate("А123ВГ77");
        boolean expected = false;
        assertEquals(expected, result);
    }
}
