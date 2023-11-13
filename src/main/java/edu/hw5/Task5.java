package edu.hw5;

import java.util.regex.Pattern;

public class Task5 {
    public boolean checkCorrectNumberPlate(String numberPlate) {
        String pattern = "[АВЕКМНОРСТУХ]{1}\\d{3}[АВЕКМНОРСТУХ]{2}\\d{3}";
        return numberPlate.matches(pattern);
    }
}
