package com.lesson_1.calculator;

public class Calculator {	
	public static void main(String[] args) {
		int firstNumber = 2;
		int secondNumber = 10;
		char sign = '^';

		if (sign == '+') {
			System.out.println(firstNumber + secondNumber);
		} else if (sign == '-') {
			System.out.println(firstNumber - secondNumber);
		} else if (sign == '*') {
			System.out.println(firstNumber * secondNumber);
		} else if (sign == '/') {
			System.out.println(firstNumber / secondNumber);
		} else if (sign == '^') {
			int degree = 1;
			for (int i = 1; i <= secondNumber; i++) {
				degree *=firstNumber;
			}
			System.out.println(degree);
		} else if (sign == '%') {
			System.out.println(firstNumber % secondNumber);
		} else {
			System.out.println("not correct symbol");
		}
	}
}
