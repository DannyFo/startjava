package com.lesson_2_3_4.calculator;

import static java.lang.Math.*;

public class Calculator {
    private String inputMathPhrase;

    public void setInputMathPhrase(String inputMathPhrase) {
        this.inputMathPhrase = inputMathPhrase;
    }

    public String getInputMathPhraser() {
        return inputMathPhrase;
    }

    public Double Calculate() {
        String[] MathPhrase = inputMathPhrase.split(" ");

        double firstNumber = Double.parseDouble(MathPhrase[0]);
        double secondNumber = Double.parseDouble(MathPhrase[2]);

        switch (MathPhrase[1]) {
            case "+": return (firstNumber + secondNumber);
            case "*" : return (firstNumber * secondNumber);
            case "/" : return (firstNumber / secondNumber);
            case "-" : return (firstNumber - secondNumber);
            case "^" : return (pow(firstNumber, secondNumber));
            case "%" : return (IEEEremainder(firstNumber,secondNumber));
            default: return null;
        }
    }
}
