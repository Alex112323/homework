package edu.hw5;

public class Task7 {
    public boolean checkLength(String string) {
        return string.matches("[0|1]{1,3}");
    }

    public boolean startEqualEnd(String string) {
        return string.matches("^([0|1])[0|1]*\\1$");
    }

    public boolean least3ElementsLastZero(String string) {
        return string.matches("^[0|1]{2}[0,1]*0$");
    }
}
