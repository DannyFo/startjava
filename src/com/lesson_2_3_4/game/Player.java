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

    public int getNumber() {
        return number;
    }

    public void setPlayerNumbers(int index, int number) {
        this.number = number;
        playerNumbers[index] = number;
    }

    public int[] getPlayerNumbers(int attempt) {
        int[] printAttempts = copyOf(playerNumbers, (attempt + 1));
        return printAttempts;
    }

    public void nullPlayerNumbers() {
        Arrays.fill(playerNumbers, 0);
    }
}	
