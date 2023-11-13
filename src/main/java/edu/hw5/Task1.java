package edu.hw5;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

public class Task1 {
    @SuppressWarnings("MultipleStringLiterals")
    public Duration averagePastime(List<String> listTime) {
        Duration allDuration = Duration.ofDays(0);
        long amount = 0;
        for (var elem : listTime) {
            String[] dates = elem
                .split(" - ");
            StringBuilder date1 = new StringBuilder(dates[0].replaceAll(", ", "T"));
            date1.append(":00.000Z");
            StringBuilder date2 = new StringBuilder(dates[1].replaceAll(", ", "T"));
            date2.append(":00.000Z");
            Instant start = Instant.parse(date1);
            Instant end = Instant.parse(date2);
            Duration eachdDuration = Duration.between(start, end);
            allDuration = allDuration.plus(eachdDuration);
            amount++;
        }
        return allDuration.dividedBy(amount);
    }
}
