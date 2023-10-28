package edu.hw1;

public class Task8 {
    @SuppressWarnings("MagicNumber") public boolean knightBoardCapture(int[][] array) {
        int[][] newArray = new int[12][12];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                newArray[i + 2][j + 2] = array[i][j];
            }
        }
        for (int i = 2; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
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
