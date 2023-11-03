package edu.hw3;

import java.util.TreeMap;

public class Task4 {
    private final static int MAXROMAN = 3999;

    public String convertToRoman(Integer number) throws Exception {
        if (number > MAXROMAN) {
            throw new Exception("Слишком большое число");
        } else if (number <= 0) {
            throw new Exception("Число меньше или равно нуля");
        }
        TreeMap<Integer, String> intToRoman = intToRoman();
        int newNumber = number;
        StringBuilder stringBuilder = new StringBuilder();
        while (newNumber > 0) {
            for (var element: intToRoman.descendingKeySet()) {
                if (newNumber >= element) {
                    newNumber -= element;
                    stringBuilder.append(intToRoman.get(element));
                    break;
                }
            }
        }
        return stringBuilder.toString();
    }

    @SuppressWarnings("MagicNumber")
    public static TreeMap<Integer, String> intToRoman() {
        TreeMap<Integer, String> intToRoman = new TreeMap<>();
        intToRoman.put(10, "X");
        intToRoman.put(1, "I");
        intToRoman.put(4, "IV");
        intToRoman.put(5, "V");
        intToRoman.put(9, "IX");
        intToRoman.put(40, "XL");
        intToRoman.put(50, "L");
        intToRoman.put(90, "XC");
        intToRoman.put(100, "C");
        intToRoman.put(400, "CD");
        intToRoman.put(500, "D");
        intToRoman.put(900, "CM");
        intToRoman.put(1000, "M");
        return intToRoman;
    }
}
