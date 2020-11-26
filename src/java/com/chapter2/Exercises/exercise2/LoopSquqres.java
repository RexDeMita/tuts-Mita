package com.chapter2.Exercises.exercise2;

public class LoopSquqres {
    public static void main(String[] args){
        //Write a for loop that produces the following output
        //1 4 9 16 25 36 49 64 81 100

        //declare and initialize the integer variable count
        int count = 1;

        //this for loop
        for (int i = 1; i < 11; i++){

            System.out.print(count);
            count = count + (2*i + 1);
            System.out.print(" ");


        }
    }
}
