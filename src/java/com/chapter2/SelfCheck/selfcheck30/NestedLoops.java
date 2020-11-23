package com.chapter2.SelfCheck.selfcheck30;

public class NestedLoops {
    //what is the output of the following code?
    public static void main (String[] args){
        for (int i =1; i <= 10; i++){
            for (int j = 1; j <= 10 -1; j++){
                System.out.print(" ");
            }
            for (int j = i; j <= 2 * i - 1; j++){
               System.out.print("*");
            }
            System.out.println();
        }
    }
    //         *
    //        ***
    //       *****
    //      *******
    //     *********
    //    ***********
    //   *************
    //  ***************
    // *****************
    //*******************
}
