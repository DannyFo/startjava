package com.lesson_2_3_4.game;//1

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {	
    private int randomNumber = (int) (Math.random() * 101);
    private Player player1;
    private Player player2;

    int counter = 0;
    int [] player1Numbers = new int [10];
    int [] player2Numbers = new int [10];

    Scanner scan1 = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void game() {

        do {
            System.out.println(player1.getName() + "'s player numbers");
            int player1number = scan1.nextInt();
            player1.setNumber(player1number);
            player1Numbers[counter] = player1number;
            compareRandomNumber(player1.getNumber());
            if (player1.getNumber() == randomNumber) {
                printAttemptsArray(0, player1Numbers, player1.getName());
                printAttemptsArray(-1, player2Numbers, player2.getName());
                System.out.println("Player " + player1.getName() + " guess number " + randomNumber + " after " + (counter + 1) + " attempts");
                break;
            }
            if (counter + 1 == 10) {
                System.out.println("Player " + player1.getName() + " has run out of attempts ");
            }

            System.out.println(player2.getName() + "'s player numbers");
            int player2number = scan1.nextInt();
            player2.setNumber(player2number);
            player2Numbers[counter] = player2number;
            compareRandomNumber (player2.getNumber());
            if (player2.getNumber() == randomNumber) {
                printAttemptsArray(0,player1Numbers, player1.getName());
                printAttemptsArray(0,player2Numbers, player2.getName());
                System.out.println("Player " + player2.getName()+ " guess number " + randomNumber + " after " + (counter + 1) + " attempts");
                break;
            }
            if (counter + 1 == 10) {
                System.out.println("Player " + player2.getName() + " has run out of attempts ");
                printAttemptsArray(0,player1Numbers, player1.getName());
                printAttemptsArray(0,player2Numbers, player2.getName());
                break;
            }
            counter++;
        } while(counter<=10);
     Arrays.fill(player1Numbers, 0);
     Arrays.fill(player2Numbers, 0);
    }
    private void compareRandomNumber(int playerNumber) {
        if (playerNumber > randomNumber) {
            System.out.println("The number you entered is greater than what the computer thought");
        } else if (playerNumber < randomNumber) { 
            System.out.println("The number you entered is less than what the computer thought");
        }
    }
    private void printAttemptsArray (int counterControl,int [] needArray, String needName) { // counterControl - контроль отображения выводимых значений (чтобы было без 0 у 2 игрока при завершении цикла у 1 игрока)
        System.out.print(needName + "'s numbers: ");
        for (int i = 0; i <= (counter + counterControl); i++) {
            System.out.print(needArray[i] + " ");
        }
        System.out.println(" ");
    }
}	
