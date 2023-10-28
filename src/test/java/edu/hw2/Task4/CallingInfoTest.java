package edu.hw2.Task4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CallingInfoTest {
    @Test
    void calling_Info_Test() {
        CallingInfo callingInfo = CallingInfo.callingInfo();
        assertEquals("calling_Info_Test", callingInfo.methodName());
        assertEquals("edu.hw2.Task4.CallingInfoTest", callingInfo.className());
    }
}
