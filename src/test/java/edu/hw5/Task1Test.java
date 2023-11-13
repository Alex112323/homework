package edu.hw5;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void average_Pastime_Standart() {
        List<String> listTime = new ArrayList<>();
        listTime.add("2022-03-12, 20:20 - 2022-03-12, 23:50");
        listTime.add("2022-04-01, 21:30 - 2022-04-02, 01:20");
        Task1 task1 = new Task1();
        Duration result = task1.averagePastime(listTime);
        assertEquals(3, result.toHours());
    }

    @Test
    void average_Pastime_0_Hours() {
        List<String> listTime = new ArrayList<>();
        listTime.add("2022-03-12, 20:20 - 2022-03-12, 20:20");
        listTime.add("2022-04-01, 21:30 - 2022-04-01, 21:30");
        Task1 task1 = new Task1();
        Duration result = task1.averagePastime(listTime);
        assertEquals(0, result.toHours());
    }
}
