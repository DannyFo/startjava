package com.lesson_2_3_4.calculator;

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
            case "^" :

                double degree = 1;
                for (int i = 1; i <= secondNumber; i++) {
                    degree *= firstNumber;
                }
            return (degree);
            case "%" : return (firstNumber % secondNumber);
            default: return null;
        }
    }
}
