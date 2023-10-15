package edu.hw1;

public class Task8 {
    public boolean knightBoardCapture(int[][] array) {
        final int TWELVE = 12;
        int[][] newArray = new int[TWELVE][TWELVE];
        final int EIGHT = 8;
        for (int i = 0; i < EIGHT; i++) {
            for (int j = 0; j < EIGHT; j++) {
                newArray[i + 2][j + 2] = array[i][j];
            }
        }
        final int TEN = 10;
        for (int i = 2; i < TEN; i++) {
            for (int j = 2; j < TEN; j++) {
                if (newArray[i][j] == 1 & newArray[i + 2][j + 1]
                    + newArray[i + 2][j - 1] + newArray[i + 1][j + 2]
                    + newArray[i + 1][j - 2] + newArray[i - 1][j + 2]
                    + newArray[i - 1][j - 2] + newArray[i - 2][j + 1]
                    + newArray[i - 2][j - 1] > 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
