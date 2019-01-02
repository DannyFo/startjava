package com.lesson_1.game;

public class MyFirstGame {	
	public static void main(String[] args) {
		int compNumber = 39;
		int inputNumber = 15;
		int randomNumber = -25;

		while (inputNumber != compNumber) {
			if (inputNumber > compNumber) {
				System.out.println("The number you entered is greater than what the computer thought");
			} else { 
				System.out.println("The number you entered is less than what the computer thought");
			}
			randomNumber = - randomNumber + 1;
			inputNumber = inputNumber + randomNumber;
		}
		System.out.println("you are damn right!");
	}
}	