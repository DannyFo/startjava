package com.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {	
    public static void main(String[] args) {
        String answerContinue;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("U have 10 attempts");
            System.out.println("Input 1-st player name");
            Player player1 = new Player(scan.next());
            System.out.println("Input 2-nd player name");
            Player player2 = new Player(scan.next());
            GuessNumber guess1 = new GuessNumber (player1, player2);
            guess1.game();
            do {
                System.out.println("Do u wanna continue? [y/n]");
                answerContinue = scan.next();
            } while(!answerContinue.equals("n") && !answerContinue.equals("y"));
        } while(answerContinue.equals("y"));
    }
}	
