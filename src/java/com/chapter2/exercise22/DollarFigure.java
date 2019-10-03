package com.chapter2.exercise22;

public class DollarFigure {

    //Write code that produces the following output
    //
    //$$$$$$$**************$$$$$$$
    //**$$$$$$************$$$$$$**
    //****$$$$$**********$$$$$****
    //******$$$$********$$$$******
    //********$$$******$$$********
    //**********$$****$$**********
    //************$**$************

    public static void main(String[] args){
        for (int i = 0; i < 7; i++){
            for (int j = 0; j < 2*i; j++){
                System.out.print("*");

            }

            for (int j = 7-i; j >= 1; j--){
                System.out.print("$");
            }

            for (int j = 1; j<=14 -2*i; j++){
                System.out.print("*");
            }

            for (int j = 7-i; j >= 1; j--){
                System.out.print("$");
            }

            for (int j = 0; j < 2*i; j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
