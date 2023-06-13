package org.example;

public class MathOperations{
    int firstNumber;
    int secondNumber;
    String operator;

    public int plus() {
        return firstNumber + secondNumber;
    }
    public int minus() {
        return firstNumber - secondNumber;
    }
    public int times() {
        return firstNumber * secondNumber;
    }
    public double divide() {
        return (double) firstNumber / secondNumber;
    }
}
