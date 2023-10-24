package edu.hw2.Task1;

public final class Negate implements Expr {
    private final Expr number;

    public Negate(double number) {
        this.number = new Constant(number);
    }

    public Negate(Expr number) {
        this.number = number;
    }

    public double evaluate() {
        return -number.evaluate();
    }

    @Override
    public String toString() {
        return Double.toString(-number.evaluate());
    }
}
