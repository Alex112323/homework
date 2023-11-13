package edu.hw5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task6Test {

    @Test
    void check_Substring_Standart() {
        Task6 task6 = new Task6();
        String substring = "abc";
        String string = "achfdbaabgabcaabg";
        boolean result = task6.checkSubstring(substring, string);
        boolean expected = true;
        assertEquals(expected, result);
    }

    @Test
    void check_Substring_Mixed() {
        Task6 task6 = new Task6();
        String substring = "abc";
        String string = "aghtycffhfhb";
        boolean result = task6.checkSubstring(substring, string);
        boolean expected = false;
        assertEquals(expected, result);
    }

    @Test
    void check_Substring_Bigger() {
        Task6 task6 = new Task6();
        String substring = "abcfsafafafa";
        String string = "abc";
        boolean result = task6.checkSubstring(substring, string);
        boolean expected = false;
        assertEquals(expected, result);
    }
}
