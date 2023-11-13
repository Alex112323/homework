package edu.hw5.Task3;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class Task3 {
    final static List<AbstractDate> DIFFERENTDATES = List.of(
        new DateFromWord(),
        new SomeDaysAgo(),
        new DateAsPattern("yyyy-MM-dd", "\\d{4}-\\d{2}-\\d{2}"),
        new DateAsPattern("yyyy-MM-d", "\\d{4}-\\d{2}-\\d"),
        new DateAsPattern("yyyy-M-dd", "\\d{4}-\\d-\\d{2}"),
        new DateAsPattern("yyyy-M-d", "\\d{4}-\\d-\\d"),
        new DateAsPattern("d/M/yyyy", "\\d-\\d-\\d{4}"),
        new DateAsPattern("d/MM/yyyy", "\\d-\\d{2}-\\d{4}"),
        new DateAsPattern("dd/M/yyyy", "\\d{2}-\\d-\\d{4}"),
        new DateAsPattern("dd/MM/yyyy", "\\d{2}-\\d{2}-\\d{4}"),
        new DateAsPattern("d/M/yy", "\\d-\\d-\\d{2}"),
        new DateAsPattern("d/MM/yy", "\\d-\\d{2}-\\d{2}"),
        new DateAsPattern("dd/M/yy", "\\d{2}-\\d-\\d{2}"),
        new DateAsPattern("dd/MM/yy", "\\d{2}-\\d{2}-\\d{2}")
    );

    public Optional<LocalDate> parseDate(String string) {
        for (var elem : DIFFERENTDATES) {
            if (!elem.parseDate(string).isEmpty()) {
                return elem.parseDate(string);
            }
        }
        return Optional.empty();
    }
}
