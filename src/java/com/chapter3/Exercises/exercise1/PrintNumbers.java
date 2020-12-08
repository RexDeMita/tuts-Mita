package com.chapter3.Exercises.exercise1;

public class PrintNumbers {
    /*
    Write a method called printNumbers
    that accepts a maximum number as a parameter and
    prints each number from 1 up to that maximum, inclusive, boxed by square brackets.
    For example, consider the following calls:

    printNumbers(15);
    printNumbers(5);

     */

    public static void main(String[] args){
        printNumber(5);
        printNumber(15);
    }

    public static void printNumber(int max){
        for (int i=1; i <= max; i++){
            System.out.print("[" + i + "] ");

        }
        System.out.println(" ");
    }
}
