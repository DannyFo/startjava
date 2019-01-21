package com.lesson_2_3_4.game;//1

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private int randomNumber = (int) (Math.random() * 101);
    private Player player1;
    private Player player2;

    private int attempt = 1;

    Scanner scan = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame() {
        do {
            inputNumber(player1);

            if (comparePlayerNumber(player1)) {
                player1.setIsWin(true);
                printMessageAboutWinner(player1);
                break;
            }

            checkEndOfAttempts(player1);

            inputNumber(player2);

            if (comparePlayerNumber(player2)) {
                player2.setIsWin(true);
                printMessageAboutWinner(player2);
                break;
            }

            checkEndOfAttempts(player2);
            attempt++;

        } while (attempt <= 10);


        printUserNumbers();

        player1.nullPlayerNumbers(attempt);
        player2.nullPlayerNumbers(attempt);
    }

    private void inputNumber(Player player) {
        System.out.println(player.getName() + "'s player numbers");
        player.setPlayerNumbers((attempt - 1), scan.nextInt());
    }

    private boolean comparePlayerNumber(Player player) {
        if (player.getNumber() == randomNumber) {
            return true;
        } else if (player.getNumber() < randomNumber) {
            System.out.println("The number you entered is less than what the computer thought");
        } else if (player.getNumber() > randomNumber) {
            System.out.println("The number you entered is greater than what the computer thought");
        }
        return false;
    }

    private void checkEndOfAttempts(Player player) {
        if (attempt == 10) {
            printMessageAboutLoser(player);
        }
    }

    private void printUserNumbers() {//вывод попыток игроков для всех игроков

        if (player1.getIsWin()) {
            printAttempts(player1, (attempt+1));
            printAttempts(player2, (attempt));
        } else if (player2.getIsWin()) {
            printAttempts(player1, (attempt + 1));
            printAttempts(player2, (attempt + 1));
        } else {
            printAttempts(player1, attempt);
            printAttempts(player2, attempt);
        }
    }

    private void printAttempts(Player player, int attempt) {
        System.out.print(player.getName() + "'s numbers: ");
        int[] printAttempts = player.getPlayerNumbers(attempt - 1);
        System.out.print(Arrays.toString(printAttempts));
        System.out.println(" ");
    }

    private void printMessageAboutWinner(Player player) {//вывод на экран если игрок угадал число
        System.out.println("Player " + player.getName() + " guess number " + randomNumber + " after " + attempt + " attempts");
    }

    private void printMessageAboutLoser(Player player) {//вывод на экран если игрок не угадал число после-ти попыток
        System.out.println("Player " + player.getName() + " has run out of attempts ");
    }
}
