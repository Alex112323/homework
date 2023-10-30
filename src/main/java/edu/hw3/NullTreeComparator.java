package edu.hw3;

import java.util.Comparator;

public class NullTreeComparator implements Comparator<String> {
    @Override
    public int compare(String objectFirst, String objectSecond) {
        if (objectFirst == null || objectSecond == null) {
            return 0;
        }
        return compare(objectFirst, objectSecond);
    }
}
