package edu.hw5;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

public class Task1 {
    public Duration averagePastime(List<String> listTime) {
        Duration allDuration = Duration.ofDays(0);
        long amount = 0;
        for (var elem : listTime) {
            String[] dates = elem
                .replaceAll(", ", "T")
                .replaceAll(" ", ".000Z")
                .split("-");
            Instant start = Instant.parse(dates[0]);
            Instant end = Instant.parse(dates[1]);
            Duration eachdDuration = Duration.between(start, end);
            allDuration = allDuration.plus(eachdDuration);
            amount++;
        }
        return allDuration.dividedBy(amount);
    }
}
