package edu.hw3;

import java.util.ArrayList;

public class Task2 {
    public ArrayList<String> clusterize(String string) {
        ArrayList<String> result = new ArrayList<>();
        int currentStart = 0;
        int amountOfBrackets = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '(') {
                amountOfBrackets++;
            } else if (string.charAt(i) == ')') {
                amountOfBrackets--;
            } else {
                return new ArrayList<>();
            }
            if (amountOfBrackets == 0) {
                result.add(string.substring(currentStart, i + 1));
                currentStart = i + 1;
            }
        }
        return result;
    }
}
