package edu.hw5.Task3;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    void parse_Date_As_Pattern_Standart1() {
        Task3 task3 = new Task3();
        Optional<LocalDate> result = task3.parseDate("2020-10-10");
        LocalDate expected = LocalDate.of(2020,10,10);
        assertEquals(expected, result.get());
    }

    @Test
    void parse_Date_As_Pattern_Standart2() {
        Task3 task3 = new Task3();
        Optional<LocalDate> result = task3.parseDate("2020-1-1");
        LocalDate expected = LocalDate.of(2020,1,1);
        assertEquals(expected, result.get());
    }

    @Test
    void parse_Date_As_Pattern_Not_Correct() {
        Task3 task3 = new Task3();
        Optional<LocalDate> result = task3.parseDate("20-1-1");
        assertTrue(result.isEmpty());
    }

    @Test
    void parse_Date_1_Day_Ago() {
        Task3 task3 = new Task3();
        Optional<LocalDate> result = task3.parseDate("1 day ago");
        LocalDate expected = LocalDate.now().minusDays(1);
        assertEquals(expected, result.get());
    }

    @Test
    void parse_Date_Yesterday() {
        Task3 task3 = new Task3();
        Optional<LocalDate> result = task3.parseDate("yesterday");
        LocalDate expected = LocalDate.now().minusDays(1);
        assertEquals(expected, result.get());
    }
}
