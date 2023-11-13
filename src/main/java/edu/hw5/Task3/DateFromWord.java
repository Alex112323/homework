package edu.hw5.Task3;

import java.time.LocalDate;
import java.util.Optional;

public class DateFromWord extends AbstractDate {

    @Override
    public Optional<LocalDate> parseDate(String string) {
        if (string.equals("today")) {
            return Optional.of(LocalDate.now());
        } else if (string.equals("yesterday")) {
            return Optional.of(LocalDate.now().minusDays(1));
        } else if (string.equals("tomorrow")) {
            return Optional.of(LocalDate.now().plusDays(1));
        }
        return Optional.empty();
    }
}
