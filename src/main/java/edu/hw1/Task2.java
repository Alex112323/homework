package edu.hw1;

public class Task2 {
    @SuppressWarnings("MagicNumber") public int countDigits(Integer number) {
        if (number == 0) {
            return 1;
        }
        if (number > 0) {
            int quantityOfDigits = 0;
            int copyOfNumber = number;
            while (copyOfNumber > 0) {
                quantityOfDigits += 1;
                copyOfNumber /= 10;
            }
            return quantityOfDigits;
        }
        return countDigits(-number);
    }
}
