package edu.hw1;

public class Task3 {
    public boolean isNestable(int[] numsFirst, int[] numsSecond) {
        if (numsFirst.length == 0 || numsSecond.length == 0) {
            return false;
        }
        int max = numsSecond[0];
        int min = numsSecond[0];
        for (int i = 1; i < numsSecond.length; i++) {
            if (numsSecond[i] < min) {
                min = numsSecond[i];
            } else if (numsSecond[i] > max) {
                max = numsSecond[i];
            }
        }
        for (int i = 0; i < numsFirst.length; i++) {
            if (numsFirst[i] <= min || numsFirst[i] >= max) {
                return false;
            }
        }
        return true;
    }
}
