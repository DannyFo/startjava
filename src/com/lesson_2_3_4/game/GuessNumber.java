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

    public void startGame() {

        do {
            inputNumber(player1);

            if (comparePlayerNumber(player1)) {
                break;
            }

            isGameEnded(player1);

            inputNumber(player2);

            if (comparePlayerNumber(player2)) {
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

    private void inputNumber(Player player) {
        System.out.println(player.getName() + "'s player numbers");
        player.setPlayerNumbers(attempt, scan.nextInt());
    }

    private boolean comparePlayerNumber(Player player) {
        if (player.getNumber() == randomNumber) {
            printUserNumbers(player);
            endGameYouGuess(player);
            return true;
        } else if (player.getNumber() < randomNumber) {
            System.out.println("The number you entered is less than what the computer thought");
        } else if (player.getNumber() > randomNumber) {
            System.out.println("The number you entered is greater than what the computer thought");
        }
        return false;
    }

    private boolean isGameEnded(Player player) {
        if (attempt + 1 == 10 && player == player1) {
            endGameYouLose(player);
        } else if (attempt + 1 == 10) {
            endGameYouLose(player);
            printUserNumbers(player);
            return true;
        }
        return false;
    }

    private void printUserNumbers(Player player) {//вывод попыток игроков для всех игроков
        if (player == player1) {
            printAttemptsArray(player1, attempt);
            printAttemptsArray(player2, (attempt - 1));
        } else {
            printAttemptsArray(player1, attempt);
            printAttemptsArray(player2, attempt);
        }
    }

    private void printAttemptsArray(Player player, int attempt) {
        System.out.print(player.getName() + "'s numbers: ");
        int[] printAttempts = player.getPlayerNumbers(attempt);
        System.out.print(Arrays.toString(printAttempts));
        System.out.println(" ");
    }

    private void endGameYouGuess(Player player) {//вывод на экран если игрок угадал число
        System.out.println("Player " + player.getName() + " guess number " + randomNumber + " after " + (attempt + 1) + " attempts");
    }

    private void endGameYouLose(Player player) {//вывод на экран если игрок не угадал число после-ти попыток
        System.out.println("Player " + player.getName() + " has run out of attempts ");
    }
}
