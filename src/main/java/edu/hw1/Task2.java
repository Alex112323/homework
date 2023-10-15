package edu.hw1;

public class Task2 {
    public int countDigits(Integer number) {
        if (number == 0) {
            return 1;
        } else if (number > 0) {
            int quantityOfDigits = 0;
            final int TEN = 10;
            int copyOfNumber = number;
            while (copyOfNumber > 0) {
                quantityOfDigits += 1;
                copyOfNumber /= TEN;
            }
            return quantityOfDigits;
        } else {
            return countDigits(-number);
        }
    }
}
