package com.chapter3.selfcheck10;

public class printStrings {
    /*
    Write a method called printStrings that accepts a String and a number of repetitions as parameters and prints that
    String the given number of times. For example, the call:

    printStrings("abc", 5);

    will print the following output:

    abcabcabcabcabc


     */

    public static void main(String[] args){
        printStrings("abc", 5);
    }

    public static void printStrings(String s, int x){
        for (int i = 1; i <= x; i++){
            System.out.print(s);
        }
    }
}
