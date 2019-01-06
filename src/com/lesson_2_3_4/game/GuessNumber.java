package com.lesson_2_3_4.game;//1

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.*;

public class GuessNumber {	
    private int randomNumber = (int) (Math.random() * 101);
    private Player player1;
    private Player player2;

    int counter = 0;

    Scanner scan = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void game() {

        do {
            setArray(player1);
            if (player1.getNumber() == randomNumber) {
                printAttemptsArrayForAllPlayers();
                endGameUguess (player1);
                break;
            }
            if (counter + 1 == 10) {
                endGameUlose (player1);
            }

            setArray(player2);
            if (player2.getNumber() == randomNumber) {
                printAttemptsArrayForLastPlayer();
                endGameUguess (player2);
                break;
            }
            if (counter + 1 == 10) {
                endGameUlose (player2);
                printAttemptsArrayForLastPlayer();
                break;
            }
            counter++;
        } while(counter<=10);
     player1.nullPlayerNumbers();
     player2.nullPlayerNumbers();
    }

    private void compareRandomNumber(int playerNumber) {
        if (playerNumber > randomNumber) {
            System.out.println("The number you entered is greater than what the computer thought");
        } else if (playerNumber < randomNumber) { 
            System.out.println("The number you entered is less than what the computer thought");
        }
    }

    private void printAttemptsArray (int counterControl,Player player) { // counterControl - контроль отображения выводимых значений (чтобы было без 0 у 2 игрока при завершении цикла у 1 игрока)
        System.out.print(player.getName() + "'s numbers: ");
        int[] printAttempts = copyOf(player.getPlayerNumbers(), (counter + 1 + counterControl));
        System.out.print(Arrays.toString(printAttempts));
        System.out.println(" ");
    }

    private void setArray (Player player) {
        System.out.println(player.getName() + "'s player numbers");
        int playerNumber = scan.nextInt();
        player.setNumber(playerNumber);
        player.setPlayerNumbers(player.getNumber(), counter);
        compareRandomNumber(player.getNumber());
    }

    private void endGameUguess (Player player) {//вывод на экран если игрок угадал число
        System.out.println("Player " + player.getName() + " guess number " + randomNumber + " after " + (counter + 1) + " attempts");
    }

    private void endGameUlose (Player player) {//вывод на экран если игрок не угадал число после-ти попыток
        System.out.println("Player " + player.getName() + " has run out of attempts ");
    }

    private void printAttemptsArrayForAllPlayers() {//вывод попыток игроков для всех игроков (если их будет больше двух)окромя последнего
        printAttemptsArray(0, player1);
        printAttemptsArray(-1, player2);
    }

    private void printAttemptsArrayForLastPlayer() {//вывод попыток игроков для  последнего игрока
        printAttemptsArray(0, player1);
        printAttemptsArray(0, player2);
    }
}
