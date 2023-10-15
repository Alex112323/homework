package edu.hw1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    void fixString_1() {
        Task4 task4 = new Task4();
        String string = "123456";
        String response = task4.fixString(string);
        assertEquals( "214365", response);
    }
    @Test
    void fixString_2() {
        Task4 task4 = new Task4();
        String string = "hTsii  s aimex dpus rtni.g";
        String response = task4.fixString(string);
        assertEquals( "This is a mixed up string.", response);
    }
    @Test
    void fixString_3() {
        Task4 task4 = new Task4();
        String string = "badce";
        String response = task4.fixString(string);
        assertEquals( "abcde", response);
    }
    @Test
    void fixString_4() {
        Task4 task4 = new Task4();
        String string = "b";
        String response = task4.fixString(string);
        assertEquals( "b", response);
    }
    @Test
    void fixString_5() {
        Task4 task4 = new Task4();
        String string = "";
        String response = task4.fixString(string);
        assertEquals( "", response);
    }
}
