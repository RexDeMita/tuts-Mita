package com.chapter2.selfcheck24;

public class OddStuff {
    public static void main(String[] args){
        //What is the output of the following oddStuff method?
        oddStuff();
    }

    public static void oddStuff(){
        int number = 4;
        for (int count = 1; count <= number; count++){
            System.out.println(number);
            number = number/2;
        }
    }

    //4
    //2
}
