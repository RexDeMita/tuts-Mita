package com.chapter2.exercise11;

public class NumbersOutputConstant {

    public static final int RANGE = 10;
    public static final int NUMOFREPS = 6;
    public static void main (String[] args){




        for (int i = 1; i <= NUMOFREPS; i++) {
            for (int j = 1; j < RANGE; j++) {
                System.out.print(" ");
            }
            System.out.print("|");
        }
        System.out.println();
        for (int k = 1; k <= NUMOFREPS; k++) {
            for (int l = 1; l <= RANGE; l++) {
                System.out.print(l%RANGE);
            }
        }
    }
}
