package edu.hw1;

public class Task7 {
    public String rotateRight(Integer number, Integer shift) {
        if (number < 0) {
            return "-1";
        }
        String binaryString = Integer.toBinaryString(number);
        String newNumber = "";
        for (int i = 0; i < binaryString.length(); i++) {
            newNumber += binaryString.charAt(moduleOfNumber(i - shift, binaryString.length()));
        }
        return newNumber;
    }

    public String rotateLeft(Integer number, Integer shift) {
        if (number < 0) {
            return "-1";
        }
        String binaryString = Integer.toBinaryString(number);
        String newNumber = "";
        for (int i = 0; i < binaryString.length(); i++) {
            newNumber += binaryString.charAt(moduleOfNumber(i + shift, binaryString.length()));
        }
        return newNumber;
    }

    public int moduleOfNumber(Integer number, Integer module) {
        int copyOfNumber = number;
        while (copyOfNumber < 0 || copyOfNumber >= module) {
            if (copyOfNumber < 0) {
                copyOfNumber += module;
            } else {
                copyOfNumber -= module;
            }
        }
        return copyOfNumber;
    }
}
