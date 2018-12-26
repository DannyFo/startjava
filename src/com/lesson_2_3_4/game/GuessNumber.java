package com.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumber {	
    private int randomNumber = (int) (Math.random() * 101);
    private Player player1;
    private Player player2;
    Scanner scan1 = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void game() {
        do {
            System.out.println(player1.getName() + " number");      
            player1.setNumber(scan1.nextInt());
            compareRandomNumber(player1.getNumber());
            if (player1.getNumber() == randomNumber) {
                break;
            }
            System.out.println(player2.getName() + " number");      
            player2.setNumber(scan1.nextInt());
            compareRandomNumber (player2.getNumber());
        } while(player2.getNumber() != randomNumber);
    }
    private void compareRandomNumber(int playerNumber) {
        if (playerNumber > randomNumber) {
            System.out.println("The number you entered is greater than what the computer thought");
        } else if (playerNumber < randomNumber) { 
            System.out.println("The number you entered is less than what the computer thought");
        } else {
            System.out.println("you are damn right!");
        }
    }
}	
