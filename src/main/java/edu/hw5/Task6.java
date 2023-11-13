package edu.hw5;

public class Task6 {
    private final static String ANYSYMBOL = ".*";

    public boolean checkSubstring(String substring, String string) {
        StringBuilder pattern = new StringBuilder();
        pattern.append(ANYSYMBOL);
        for (int i = 0; i < substring.length(); i++) {
            pattern.append(substring.charAt(i));
            pattern.append(ANYSYMBOL);
        }
        return string.matches(pattern.toString());
    }
}
