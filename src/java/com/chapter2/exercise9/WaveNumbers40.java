package com.chapter2.exercise9;

public class WaveNumbers40 {
    //Write for loops to produce the following output

    //----------------------------------------
    //_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-
    //1122334455667788990011223344556677889900
    //----------------------------------------

    public static void main(String[] args){
        for(int j = 0; j <= 39; j++){
            System.out.print("-");
        }
        System.out.println();
        for(int k = 0; k <= 9; k++){
            System.out.print("_-^-");
        }
        System.out.println();
        for(int l = 1; l < 3; l++){
            for(int h = 1; h < 11; h++){
                System.out.print(h%10);
                System.out.print(h%10);
            }
        }
        System.out.println();
        for(int i = 0; i<= 39; i++){
            System.out.print("-");
        }
    }
}
