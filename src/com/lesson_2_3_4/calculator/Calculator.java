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

        double firstNumber = Double.parseDouble(mathPhrase[0]);
        double secondNumber = Double.parseDouble(mathPhrase[2]);

        switch (mathPhrase[1]) {
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
