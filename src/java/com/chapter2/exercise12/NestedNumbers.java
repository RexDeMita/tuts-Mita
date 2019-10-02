package com.chapter2.exercise12;

public class NestedNumbers {
    //Use nested for loops that produce the following output

    //000111222333444555666777888999
    //000111222333444555666777888999
    //000111222333444555666777888999

    public static void main (String[] args){
        for (int i = 1; i < 4; i++){
            for (int j = 0; j <= 9; j++){
                for (int k = 1; k < 4; k++){
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
