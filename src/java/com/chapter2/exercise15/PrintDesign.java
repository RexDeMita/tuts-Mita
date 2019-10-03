package com.chapter2.exercise15;

public class PrintDesign {
// Write a method called printDesign that produces the following output.
// Use nested for loops to capture the structure of the figure.
    public static void main(String[] args){

        for (int i = 1; i <= 5; i++){
            for (int j = 6; j >= i+1; j--){
                System.out.print("-");
            }

            for (int k = 1; k <= 2*i - 1; k++){
                System.out.print((2*i-1));

            }

            for (int l = 6; l >= i+1; l--){
                System.out.print("-");
            }
            System.out.println();
        }

    }
}
