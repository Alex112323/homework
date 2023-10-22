package edu.hw2.Task1;

public final class Multiplication implements Expr {
    private final double firstNumber;
    private final double secondNumber;

    public Multiplication(Expr firstNumber, Expr secondNumber) {
        this.firstNumber = firstNumber.evaluate();
        this.secondNumber = secondNumber.evaluate();
    }

    public Multiplication(Expr firstNumber, double secondNumber) {
        this.firstNumber = firstNumber.evaluate();
        this.secondNumber = secondNumber;
    }

    public Multiplication(double firstNumber, Expr secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber.evaluate();
    }

    public Multiplication(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    @Override
    public double evaluate() {
        return firstNumber * secondNumber;
    }

    @Override
    public String toString() {
        return Double.toString(firstNumber * secondNumber);
    }
}
