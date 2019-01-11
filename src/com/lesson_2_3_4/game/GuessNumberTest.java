package com.lesson_2_3_4.game;//1

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        String answerContinue;
        Scanner scan = new Scanner(System.in);

        System.out.println("U have 10 attempts");
        System.out.println("Input 1-st player name");
        Player player1 = new Player(scan.next());
        System.out.println("Input 2-nd player name");
        Player player2 = new Player(scan.next());

        do {
            GuessNumber guess = new GuessNumber(player1, player2);
            guess.startGame();
            do {
                System.out.println("Do u wanna continue? [y/n]");
                answerContinue = scan.next();
            } while (!answerContinue.equals("n") && !answerContinue.equals("y"));
        } while (answerContinue.equals("y"));
    }
}	
