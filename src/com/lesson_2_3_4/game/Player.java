package com.lesson_2_3_4.game;//1

import java.util.Arrays;

import static java.util.Arrays.copyOf;

public class Player {
    private String name;
    private int number;
    private int[] playerNumbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setPlayerNumbers(int index) {
        playerNumbers[index] = getNumber();
    }

    public int[] getPlayerNumbers(int attempt, int counterControl) {
        int[] printAttempts = copyOf(playerNumbers, (attempt + 1 + counterControl));
        return printAttempts;
    }

    public void nullPlayerNumbers() {
        Arrays.fill(playerNumbers, 0);
    }
}	
