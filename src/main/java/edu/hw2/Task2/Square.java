package edu.hw2.Task2;

public class Square extends Rectangle {
    @Override
    public Square setWidth(int width) {
        return new Square(width);
    }

    @Override
    public Square setHeight(int height) {
        return new Square(height);
    }

    public Square(int side) {
        super(side, side);
    }
}
