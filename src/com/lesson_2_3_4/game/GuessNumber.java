package com.lesson_2_3_4.game;//1

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {	
    private int randomNumber = (int) (Math.random() * 101);
    private Player player1;
    private Player player2;

    private int attempt = 0;

    Scanner scan = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void game() {

        do {
            if (IsGuess(player1))
                break;

            IsGameEnded(player1);

            if (IsGuess(player2))
                break;

            IsGameEnded(player2);
            attempt++;

            if (attempt == 10) {
                attempt = attempt-1;
                printAttemptsArrayForAllPlayers(player2);
                break;
            }
        } while(attempt<10);

     player1.nullPlayerNumbers();
     player2.nullPlayerNumbers();
    }

    private boolean IsGuess(Player player) {
        setArray(player);
        if (player.getNumber() == randomNumber) {
            printAttemptsArrayForAllPlayers(player);
            endGameUguess(player);
            return true;
        }
        return false;
    }

    private void IsGameEnded(Player player) {
        if  (attempt + 1 == 10) {
            endGameUlose(player);
        }
    }

    private void setArray(Player player) {
        System.out.println(player.getName() + "'s player numbers");
        int playerNumber = scan.nextInt();
        player.setNumber(playerNumber);
        player.setPlayerNumbers(attempt);
        compareRandomNumber(player.getNumber());
    }

    private void compareRandomNumber(int playerNumber) {
        if (playerNumber > randomNumber) {
            System.out.println("The number you entered is greater than what the computer thought");
        } else if (playerNumber < randomNumber) { 
            System.out.println("The number you entered is less than what the computer thought");
        }
    }

    private void printAttemptsArrayForAllPlayers(Player player) {//вывод попыток игроков для всех игроков
        if (player == player1) {
            printAttemptsArray(0, player1);
            printAttemptsArray(-1, player2);
        } else {
            printAttemptsArray(0, player1);
            printAttemptsArray(0, player2);
        }
    }

    private void printAttemptsArray(int counterControl,Player player) { // counterControl - контроль отображения выводимых значений (чтобы было без 0 у 2 игрока при завершении цикла у 1 игрока)
        System.out.print(player.getName() + "'s numbers: ");
        int[] printAttempts = player.getPlayerNumbers(attempt, counterControl);
        System.out.print(Arrays.toString(printAttempts));
        System.out.println(" ");
    }

    private void endGameUguess(Player player) {//вывод на экран если игрок угадал число
        System.out.println("Player " + player.getName() + " guess number " + randomNumber + " after " + (attempt + 1) + " attempts");
    }

    private void endGameUlose(Player player) {//вывод на экран если игрок не угадал число после-ти попыток
        System.out.println("Player " + player.getName() + " has run out of attempts ");
    }
}
