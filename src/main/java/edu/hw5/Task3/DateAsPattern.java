package edu.hw5.Task3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

public class DateAsPattern extends AbstractDate {

    public String format;

    public DateAsPattern(String format, String pattern) {
        this.format = format;
        this.pattern = pattern;
    }

    @Override
    public Optional<LocalDate> parseDate(String string) {
        if (string.matches(pattern)) {
            return Optional.of(LocalDate.parse(string, DateTimeFormatter.ofPattern(format)));
        }
        return Optional.empty();
    }
}
