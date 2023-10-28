package edu.hw2.Task1;

public final record Constant(double value) implements Expr {

    @Override
    public double evaluate() {
        return value;
    }

    @Override
    public String toString() {
        return Double.toString(value);
    }


}
