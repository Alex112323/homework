package edu.hw5.Task3;

import java.time.LocalDate;
import java.util.Optional;

public abstract class AbstractDate {
    String pattern;

    public abstract Optional<LocalDate> parseDate(String string);
}
