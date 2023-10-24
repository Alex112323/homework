package edu.hw1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @ParameterizedTest
    @CsvSource(value = {
            "01:00, 60",
            "13:56, 836",
            "10:60, -1",
            ":30, -1",
            "003:20, 200",
            "1234, -1"
    })
    void minutes_To_Seconds(String string, int correctAnswer) {
        Task1 task1 = new Task1();
        int response = task1.minutesToSeconds(string);
        assertEquals(correctAnswer, response);
    }
}
