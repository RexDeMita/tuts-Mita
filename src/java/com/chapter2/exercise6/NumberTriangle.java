package com.chapter2.exercise6;

public class NumberTriangle {
    //Using for loops, produce the following output

    //1
    //22
    //333
    //4444
    //55555
    //666666
    //7777777
    public static void main(String[] args){
        for (int i = 1; i <= 7; i++){
            for (int j  = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}