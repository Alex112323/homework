package edu.hw1;

public class Task5 {
    public boolean isPalindromeDescendant(Integer number) {
        String stringNumber = Integer.toString(number);
        while (true) {
            if (isPalindrome(stringNumber)) {
                return true;
            } else {
                if (stringNumber.length() % 2 == 0) {
                    if (descendant(stringNumber).length() < 2) {
                        return false;
                    } else {
                        stringNumber = descendant(stringNumber);
                    }
                } else {
                    return false;
                }
            }
        }
    }

    public boolean isPalindrome(String stringNumber) {
        for (int i = 0; i < stringNumber.length(); i++) {
            if (stringNumber.charAt(i) != stringNumber.charAt(stringNumber.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public String descendant(String stringNumber) {
        String newStringNumber = "";
        for (int i = 0; i < stringNumber.length(); i += 2) {
            int sumOfTwoDigits = Integer.parseInt("" + stringNumber.charAt(i))
                + Integer.parseInt("" + stringNumber.charAt(i + 1));
            newStringNumber += Integer.toString(sumOfTwoDigits);
        }
        return newStringNumber;
    }

}
