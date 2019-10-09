package com.chapter3.exercise3;

public class printPowersOfN {
    /*
    Write a method called printPowersOfN
    that accepts a base and an exponent as arguments and
    prints each power of the base from base0 (1) up to that maximum power, inclusive.
    For example, consider the following calls:

    printPowersOfN(4,3);
    printPowersOfN(5,6);
    printPowersOfN(-2,8);

     */

    public static void main(String[] args){
        printPowersOfN(4,3);
    }

    public static void printPowersOfN(int base, int exp){
        System.out.print("1 ");
        double pwer = 1;
        for (int i = 1; i <= exp; i++){

                pwer = pwer * base;
                int power = (int) pwer;
                System.out.print(power);
                System.out.print(" ");

        }
    }
}
