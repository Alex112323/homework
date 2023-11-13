package edu.hw5;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("MagicNumber")
public class Task2 {

    public List<LocalDate> allFridays13(int year) {
        List dates = new ArrayList<>();
        for (int i = 1; i <= 12; i++) {
            LocalDate date = LocalDate.of(year, i, 13);
            if (date.getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
                dates.add(date);
            }
        }
        return dates;
    }

    public LocalDate nearestFriday13(LocalDate date) {
        if (date.getDayOfMonth() == 13) {
            return date;
        }
        LocalDate friday13 = LocalDate.of(date.getYear(), date.getMonthValue() + 1, 13);
        while (!friday13.getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
            friday13 = friday13.plusMonths(1L);
        }
        return friday13;
    }
}
