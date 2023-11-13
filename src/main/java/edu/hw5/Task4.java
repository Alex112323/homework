package edu.hw5;

import java.util.regex.Pattern;

public class Task4 {
    public boolean checkCorrectPassword(String password) {
        Pattern pattern = Pattern.compile("[~!@#$%^&*|]+");
        return pattern.matcher(password).find();
    }
}
