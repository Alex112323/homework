package edu.hw1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    void isNestableStandartTrueExample() {
        Task3 task3 = new Task3();
        int[] numsFirst = {1,2,3,4};
        int[] numsSecond = {0,6};
        boolean response = task3.isNestable(numsFirst, numsSecond);
        assertTrue(response);
    }
    @Test
    void isNestableSecondStandartTrueExample() {
        Task3 task3 = new Task3();
        int[] numsFirst = {3,1};
        int[] numsSecond = {4,0};
        boolean response = task3.isNestable(numsFirst, numsSecond);
        assertTrue(response);
    }
    @Test
    void isNestableEqualityOfMinimums() {
        Task3 task3 = new Task3();
        int[] numsFirst = {9,9,8};
        int[] numsSecond = {8,9};
        boolean response = task3.isNestable(numsFirst, numsSecond);
        assertFalse(response);
    }
    @Test
    void isNestableStandartFalseExample() {
        Task3 task3 = new Task3();
        int[] numsFirst = {1,2,3,4};
        int[] numsSecond = {2,3};
        boolean response = task3.isNestable(numsFirst, numsSecond);
        assertFalse(response);
    }
    @Test
    void isNestableEmptyOneArray() {
        Task3 task3 = new Task3();
        int[] numsFirst = {};
        int[] numsSecond = {2,3};
        boolean response = task3.isNestable(numsFirst, numsSecond);
        assertFalse(response);
    }
    @Test
    void isNestableEmptyTwoArrays() {
        Task3 task3 = new Task3();
        int[] numsFirst = {};
        int[] numsSecond = {};
        boolean response = task3.isNestable(numsFirst, numsSecond);
        assertFalse(response);
    }
}
