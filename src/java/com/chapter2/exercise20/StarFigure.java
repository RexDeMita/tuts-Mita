package com.chapter2.exercise20;

public class StarFigure {
    //Write a program that produces the following output using for loops

    // ////////////////\\\\\\\\\\\\\\\\
    // ////////////********\\\\\\\\\\\\
    // ////////****************\\\\\\\\
    // ////************************\\\\
    // ********************************

    public static void main(String[] args){
        for (int i = 1; i < 6; i++){
            for (int j = 1; j <= 20-4*i; j++){
                System.out.print("/");
            }

            for (int j = 1; j <= 8 * i - 8; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= 20 - 4 * i; j++) {
                System.out.print("\\");
            }

            System.out.println();
        }
    }
}
