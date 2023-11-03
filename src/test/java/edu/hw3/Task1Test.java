package edu.hw3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void atbash_Whitespace_And_Exclamation_point() {
        Task1 task1 = new Task1();
        String string = "Hello world!";
        String response = task1.atbash(string);
        assertEquals("Svool dliow!", response);
    }
    @Test
    void atbash_Full_Sentence() {
        Task1 task1 = new Task1();
        String string = "Any fool can write code that a computer can understand. " +
            "Good programmers write code that humans can understand. ― Martin Fowler";
        String response = task1.atbash(string);
        assertEquals("Zmb ullo xzm dirgv xlwv gszg z xlnkfgvi xzm fmwvihgzmw. " +
            "Tllw kiltiznnvih dirgv xlwv gszg sfnzmh xzm fmwvihgzmw. ― Nzigrm Uldovi", response);
    }

    @Test
    void atbash_Whitespace() {
        Task1 task1 = new Task1();
        String string = "";
        String response = task1.atbash(string);
        assertEquals("", response);
    }
}
