package edu.hw5;

public class Task5 {
    public boolean checkCorrectNumberPlate(String numberPlate) {
        String pattern = "[АВЕКМНОРСТУХ]\\d{3}[АВЕКМНОРСТУХ]{2}\\d{3}";
        return numberPlate.matches(pattern);
    }
}
