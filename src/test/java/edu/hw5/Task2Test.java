package edu.hw5;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void all_Fridays_13_Year_1925() {
        Task2 task2 = new Task2();
        List<LocalDate> dates = task2.allFridays13(1925);
        assertEquals(3, dates.get(1).getMonthValue());
    }

    @Test
    void all_Fridays_13_Year_2024() {
        Task2 task2 = new Task2();
        List<LocalDate> dates = task2.allFridays13(2024);
        assertEquals(9, dates.get(0).getMonthValue());
    }

    @Test
    void nearestFriday13() {
        Task2 task2 = new Task2();
        LocalDate date = LocalDate.of(2022,7, 3);
        LocalDate result = task2.nearestFriday13(date);
        LocalDate expected = LocalDate.of(2023,1, 13);
        assertEquals(expected, result);

    }
}
