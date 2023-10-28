package edu.hw2.Task1;

public final class Exponent implements Expr {
    private final double number;
    private final double pow;

    public Exponent(Expr number, Expr pow) {
        this.number = number.evaluate();
        this.pow = pow.evaluate();
    }

    public Exponent(Expr number, double pow) {
        this.number = number.evaluate();
        this.pow = pow;
    }

    public Exponent(double number, Expr pow) {
        this.number = number;
        this.pow = pow.evaluate();
    }

    public Exponent(double number, double pow) {
        this.number = number;
        this.pow = pow;
    }

    @Override
    public double evaluate() {
        return Math.pow(number, pow);
    }

    @Override
    public String toString() {
        return Double.toString(Math.pow(number, pow));
    }
}
