package com.chapter2.Exercises.exercise7;

public class SpacedNumbers {
    //use nested for loops to produce the following output:

    //    1
    //   2
    //  3
    // 4
    //5

    public static void main(String[] args){
        for (int i = 1; i <= 5; i++){
            for (int j  = 1; j <= 5-i; j++){
                System.out.print(" ");
            }
            System.out.println(i);
        }
    }
}
