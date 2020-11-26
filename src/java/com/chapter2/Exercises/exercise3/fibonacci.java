package com.chapter2.Exercises.exercise3;

public class fibonacci {
    //The Fibonacci numbers are a sequence of integers in which the first two elements are 1
    // each following element is the sum of the two preceding elements.
    // The mathematical definition of each kth Fibonacci number is the following:
    //
    //F(k):
    //k > 2 : F(k-1) + F(k-2)
    //k <= 2 : 1
    //
    //The first 12 Fibonacci numbers are: 1 1 2 3 5 8 13 21 34 55 89 144

    public static void main (String[] args){

        int numOne = 0;
        int numTwo = 1;
        int x;

        for (int i = 1; i <= 12; i++){
            System.out.print(numTwo + " ");
            x = numTwo;
            numTwo = numTwo + numOne;
            numOne = x;


        }
    }
}
