package edu.hw1;

import java.util.Arrays;

public class Task6 {
    private final static int KAPREKARA = 6174;
    private final static int TEN = 10;

    public int countK(Integer number) {
        int count = 0;
        int copyOfNumber = number;
        String stringNumber = Integer.toString(copyOfNumber);
        final int THOUSAND = 1000;
        if (copyOfNumber <= THOUSAND) {
            return -1;
        }
        while (copyOfNumber != KAPREKARA) {
            int[] arrOfDigits = new int[stringNumber.length()];
            int index = 0;
            while (copyOfNumber > 0) {
                arrOfDigits[index] = copyOfNumber % TEN;
                copyOfNumber /= TEN;
                index += 1;
            }
            Arrays.sort(arrOfDigits);
            String stringNumberMax = "";
            String stringNumberMin = "";
            for (int i = 0; i < stringNumber.length(); i++) {
                stringNumberMax += Integer.toString(arrOfDigits[stringNumber.length() - 1 - i]);
                stringNumberMin += Integer.toString(arrOfDigits[i]);
            }
            count += 1;
            copyOfNumber = Integer.parseInt((stringNumberMax)) - Integer.parseInt(stringNumberMin);
        }
        return count;
    }
}
