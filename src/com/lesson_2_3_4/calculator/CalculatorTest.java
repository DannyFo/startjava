package com.lesson_2_3_4.calculator;//1

import java.util.Scanner;

public class CalculatorTest {	
    public static void main(String[] args) {
        String answerContinue;
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Input Math Phrase");
            calc.setInputMathPhrase(scan.nextLine());

            if (calc.Calculate() == null) {
                System.out.println("Not correct sign");
            } else {
            System.out.println(calc.Calculate());
            }

            do {
                System.out.println("Do u wanna continue? [y/n]");
                answerContinue = scan.next();
            } while(!answerContinue.equals("n") && !answerContinue.equals("y"));
        } while(answerContinue.equals("y"));
    }
}