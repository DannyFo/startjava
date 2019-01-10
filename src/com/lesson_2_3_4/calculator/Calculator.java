package com.lesson_2_3_4.calculator;//1

import static java.lang.Math.*;

public class Calculator {
    private String inputMathPhrase;

    public void setInputMathPhrase(String inputMathPhrase) {
        this.inputMathPhrase = inputMathPhrase;
    }

    public String getInputMathPhrase() {
        return inputMathPhrase;
    }

    public Double calculate() {
        String[] mathPhrase = inputMathPhrase.split(" ");

        int firstNumber = Integer.parseInt(mathPhrase[0]);
        int secondNumber = Integer.parseInt(mathPhrase[2]);

        switch (mathPhrase[1]) {
            case "+":
                return Double.valueOf((addExact(firstNumber, secondNumber)));
            case "*":
                return Double.valueOf((multiplyExact(firstNumber, secondNumber)));
            case "/":
                return (Double.valueOf(firstNumber) / Double.valueOf(secondNumber));
            case "-":
                return Double.valueOf((firstNumber - secondNumber));
            case "^":
                return (pow(firstNumber, secondNumber));
            case "%":
                return Double.valueOf((floorMod(firstNumber, secondNumber)));
            default:
                return null;
        }
    }
}
