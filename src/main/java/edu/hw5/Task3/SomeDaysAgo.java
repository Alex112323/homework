package edu.hw5.Task3;

import java.time.LocalDate;
import java.util.Optional;

public class SomeDaysAgo extends AbstractDate {
    public SomeDaysAgo() {
        this.pattern = "(1 day|\\d+ days) ago";
    }

    @Override
    public Optional<LocalDate> parseDate(String string) {
        if (string.matches(pattern)) {
            Integer days = Integer.parseInt(string.split(" ")[0]);
            return Optional.of(LocalDate.now().minusDays(days));
        }
        return Optional.empty();
    }
}
