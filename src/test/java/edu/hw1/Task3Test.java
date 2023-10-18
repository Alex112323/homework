package edu.hw1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    void is_Nestable_Standart_True_Example() {
        Task3 task3 = new Task3();
        int[] numsFirst = {1,2,3,4};
        int[] numsSecond = {0,6};
        boolean response = task3.isNestable(numsFirst, numsSecond);
        assertTrue(response);
    }
    @Test
    void is_Nestable_Second_Standart_True_Example() {
        Task3 task3 = new Task3();
        int[] numsFirst = {3,1};
        int[] numsSecond = {4,0};
        boolean response = task3.isNestable(numsFirst, numsSecond);
        assertTrue(response);
    }
    @Test
    void is_Nestable_Equality_Of_Minimums() {
        Task3 task3 = new Task3();
        int[] numsFirst = {9,9,8};
        int[] numsSecond = {8,9};
        boolean response = task3.isNestable(numsFirst, numsSecond);
        assertFalse(response);
    }
    @Test
    void is_Nestable_Standart_False_Example() {
        Task3 task3 = new Task3();
        int[] numsFirst = {1,2,3,4};
        int[] numsSecond = {2,3};
        boolean response = task3.isNestable(numsFirst, numsSecond);
        assertFalse(response);
    }
    @Test
    void is_Nestable_Empty_One_Array() {
        Task3 task3 = new Task3();
        int[] numsFirst = {};
        int[] numsSecond = {2,3};
        boolean response = task3.isNestable(numsFirst, numsSecond);
        assertFalse(response);
    }
    @Test
    void is_Nestable_Empty_Two_Arrays() {
        Task3 task3 = new Task3();
        int[] numsFirst = {};
        int[] numsSecond = {};
        boolean response = task3.isNestable(numsFirst, numsSecond);
        assertFalse(response);
    }
}
