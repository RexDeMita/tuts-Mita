package com.chapter2.Exercises.exercise8;

public class SpacesAndNumbers {
    //use nested for loops to produce the following output

    //    1
    //   22
    //  333
    // 4444
    //55555
    public static void main(String[] args){
        for (int i = 1; i <= 5; i++){
            for (int j  = 1; j <= 5-i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
