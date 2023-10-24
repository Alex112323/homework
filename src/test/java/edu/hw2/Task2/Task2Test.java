package edu.hw2.Task2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void new_Side_Of_Square() {
        Square square = new Square(10);
        Square newSquare = square.setWidth(20);
        assertEquals(400.0, newSquare.area());
    }

    @Test
    void new_Side_Of_Rectangle() {
        Rectangle rectangle = new Rectangle(10, 20);
        Rectangle newRectangle = rectangle.setWidth(20).setHeight(30);
        assertEquals(600.0, newRectangle.area());
    }

}
