package edu.hw3;

public class Task1 {
    public String atbash(String string) {
        StringBuilder response = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char symbol = string.charAt(i);
            response.append(reverseLetter(symbol));
        }
        return response.toString();
    }

    public char reverseLetter(char symbol) {
        if (symbol >= 'a' & symbol <= 'z') {
            return (char) ('z' - symbol + 'a');
        } else if (symbol >= 'A' & symbol <= 'Z') {
            return (char) ('Z' - symbol + 'A');
        } else {
            return symbol;
        }
    }
}
