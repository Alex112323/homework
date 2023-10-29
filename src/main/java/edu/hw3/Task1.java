package edu.hw3;

public class Task1 {
    public String atbash(String string) {
        StringBuilder response = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            int charToInt = string.charAt(i);
            if (charToInt >= 'a' & charToInt <= 'z') {
                response.append((char) ('z' - charToInt + 'a'));
            } else if (charToInt >= 'A' & charToInt <= 'Z') {
                response.append((char) ('Z' - charToInt + 'A'));
            } else {
                response.append((char) charToInt);
            }
        }
        return response.toString();
    }
}
