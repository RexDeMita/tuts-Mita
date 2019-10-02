package com.chapter2.exercise2;

public class LoopSquqres {
    public static void main(String[] args){
        //Write a for loop that produces the following output
        //1 4 9 16 25 36 49 64 81 100
        int count = 1;
        for (int i = 1; i < 11; i++){

            System.out.print(count);
            count = count + (2*i + 1);
            System.out.print(" ");


        }
    }
}
