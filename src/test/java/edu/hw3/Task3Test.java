package edu.hw3;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    void freeDict_Letter_Elements_1() {
        Task3 task3 = new Task3();
        ArrayList<String> arrayList = new ArrayList<>(List.of(new String[] {"a", "bb", "a", "bb"}));
        var response = task3.freeDict(arrayList);
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("bb", 2);
        expected.put("a", 2);
        assertEquals(expected, response);
    }

    @Test
    void freeDict_Letter_Elements_2() {
        Task3 task3 = new Task3();
        ArrayList<String> arrayList = new ArrayList<>(List.of(new String[] {"that", "and", "and", "this"}));
        var response = task3.freeDict(arrayList);
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("and", 2);
        expected.put("that", 1);
        expected.put("this", 1);
        assertEquals(expected, response);
    }

    @Test
    void freeDict_Different_Languages() {
        Task3 task3 = new Task3();
        ArrayList<String> arrayList = new ArrayList<>(List.of(new String[] {"код", "код", "код", "bug"}));
        var response = task3.freeDict(arrayList);
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("код", 3);
        expected.put("bug", 1);
        assertEquals(expected, response);
    }

    @Test
    void freeDict_Number_Elements() {
        Task3 task3 = new Task3();
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(new Integer[] {1, 1, 2, 2}));
        var response = task3.freeDict(arrayList);
        HashMap<Integer, Integer> expected = new HashMap<>();
        expected.put(1, 2);
        expected.put(2, 2);
        assertEquals(expected, response);
    }

}
