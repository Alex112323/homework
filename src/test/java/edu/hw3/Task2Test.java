package edu.hw3;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void clusterize_Single_Brackets() {
        Task2 task2 = new Task2();
        String string = "()()()";
        ArrayList<String> result = task2.clusterize(string);
        ArrayList<String> expected = new ArrayList<>(List.of(new String[] {"()", "()", "()"}));
        assertEquals(expected, result);
    }

    @Test
    void clusterize_Brackets_In_Brackets() {
        Task2 task2 = new Task2();
        String string = "((()))";
        ArrayList<String> result = task2.clusterize(string);
        ArrayList<String> expected = new ArrayList<>(List.of(new String[] {"((()))"}));
        assertEquals(expected, result);
    }

    @Test
    void clusterize_Different_Amount() {
        Task2 task2 = new Task2();
        String string = "((()))(())()()(()())";
        ArrayList<String> result = task2.clusterize(string);
        ArrayList<String> expected = new ArrayList<>(List.of(new String[] {"((()))", "(())", "()", "()", "(()())"}));
        assertEquals(expected, result);
    }

    @Test
    void clusterize_WrongSymbol() {
        Task2 task2 = new Task2();
        String string = "()(()a)";
        ArrayList<String> result = task2.clusterize(string);
        ArrayList<String> expected = new ArrayList<>();
        assertEquals(expected, result);
    }

}
