package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Lottery {
    private int [] playerNumbers = new int[6];
    int randomNum;

    public Lottery() {
        for (int i = 0; i < 6; i++) {
            randomNum = (int) (Math.random() * 50);
            for (int x = 0; x < i; x++) {
                if (playerNumbers[x] == randomNum) {
                    randomNum = (int) (Math.random() * 50);
                    x = -1;
                }
            }
            playerNumbers[i] = randomNum;
        }
        for (int i = 0; i < playerNumbers.length; i++) {
            System.out.printf(playerNumbers[i] + " ");
        }
    }

}
