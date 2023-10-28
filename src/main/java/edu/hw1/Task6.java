package edu.hw1;

import java.util.Arrays;

public class Task6 {
    private final static int KAPREKARA = 6174;
    private final static int TEN = 10;
    private final static int THOUSAND = 1000;

    public int countK(Integer number) {
        int count = 0;
        int copyOfNumber = number;
        String stringNumber = Integer.toString(copyOfNumber);
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
            StringBuilder stringNumberMax = new StringBuilder();
            StringBuilder stringNumberMin = new StringBuilder();
            for (int i = 0; i < stringNumber.length(); i++) {
                stringNumberMax.append(arrOfDigits[stringNumber.length() - 1 - i]);
                stringNumberMin.append(arrOfDigits[i]);
            }
            count += 1;
            copyOfNumber = Integer.parseInt((stringNumberMax.toString()))
                - Integer.parseInt(stringNumberMin.toString());
        }
        return count;
    }
}
