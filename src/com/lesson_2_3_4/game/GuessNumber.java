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
            if (compareRandomNumber(player1)) {
                break;
            }

            isGameEnded(player1);

            if (compareRandomNumber(player2)) {
                break;
            }

            if (isGameEnded(player2)) {
                break;
            }
            attempt++;

        } while (attempt < 10);

        player1.nullPlayerNumbers();
        player2.nullPlayerNumbers();
    }

    private boolean isGameEnded(Player player) {
        if (attempt + 1 == 10 && player == player1) {
            endGameUlose(player);
        } else if (attempt + 1 == 10) {
            endGameUlose(player);
            printAttemptsArrayForAllPlayers(player);
            return true;
        }
        return false;
    }

    private void inputNumberIntoArray(Player player) {
        System.out.println(player.getName() + "'s player numbers");
        player.setNumber(scan.nextInt());
        player.setPlayerNumbers(attempt);
    }

    private boolean compareRandomNumber(Player player) {
        inputNumberIntoArray(player);
        if (player.getNumber() == randomNumber) {
            printAttemptsArrayForAllPlayers(player);
            endGameUguess(player);
            return true;
        } else if (player.getNumber() < randomNumber) {
            System.out.println("The number you entered is less than what the computer thought");
        } else if (player.getNumber() > randomNumber) {
            System.out.println("The number you entered is greater than what the computer thought");
        }
        return false;
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

    private void printAttemptsArray(int counterControl, Player player) { // counterControl - контроль отображения выводимых значений (чтобы было без 0 у 2 игрока при завершении цикла у 1 игрока)
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
