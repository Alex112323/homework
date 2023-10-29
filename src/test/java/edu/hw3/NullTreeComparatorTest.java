package edu.hw3;

import org.junit.jupiter.api.Test;

import java.util.TreeMap;
import static org.junit.jupiter.api.Assertions.*;

class NullTreeComparatorTest {

    @Test
    void compare() {
        TreeMap<String, String> tree = new TreeMap<>(new NullTreeComparator());
        tree.put(null, "test");
        assertEquals("test", tree.get(null));
    }
}
