package edu.hw2.Task1;

public sealed interface Expr permits Constant, Addition, Negate, Exponent, Multiplication {
    double evaluate();
}
