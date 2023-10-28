package edu.hw1;

public class Task4 {
    public String fixString(String string) {
        StringBuilder response = new StringBuilder();
        if (string.length() <= 1) {
            return string;
        }
        for (int i = 0; i < string.length() - 1 - string.length() % 2; i += 2) {
            response.append(String.valueOf(string.charAt(i + 1)) + string.charAt(i));
        }
        if (string.length() % 2 == 1) {
            response.append(String.valueOf(string.charAt(string.length() - 1)));
        }
        return response.toString();
    }
}
