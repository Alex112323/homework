import edu.hw1.Task4;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Task4Test {

    @Test
    void fix_String_Standart_Example() {
        Task4 task4 = new Task4();
        String string = "123456";
        String response = task4.fixString(string);
        assertEquals("214365", response);
    }

    @Test
    void fix_String_With_Whitespaces() {
        Task4 task4 = new Task4();
        String string = "hTsii  s aimex dpus rtni.g";
        String response = task4.fixString(string);
        assertEquals("This is a mixed up string.", response);
    }

    @Test
    void fix_String_Odd_Length() {
        Task4 task4 = new Task4();
        String string = "badce";
        String response = task4.fixString(string);
        assertEquals("abcde", response);
    }

    @Test
    void fix_String_One_Symbol() {
        Task4 task4 = new Task4();
        String string = "b";
        String response = task4.fixString(string);
        assertEquals("b", response);
    }

    @Test
    void fix_String_Empty_String() {
        Task4 task4 = new Task4();
        String string = "";
        String response = task4.fixString(string);
        assertEquals("", response);
    }
}
