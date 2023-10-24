package edu.hw2.Task1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void test_Constant() {
        var two = new Constant(2.0);
        assertEquals(2.0, two.evaluate());
        assertEquals("2.0", two.toString());
    }
    @Test
    void test_result() {
        var two = new Constant(2);
        var four = new Constant(4);
        var negOne = new Negate(new Constant(1));
        var sumTwoFour = new Addition(two, four);
        var mult = new Multiplication(sumTwoFour, negOne);
        var exp = new Exponent(mult, 2);
        var result = new Addition(exp, new Constant(1));
        assertEquals(37.0, result.evaluate());
        assertEquals("37.0", result.toString());
    }

}
