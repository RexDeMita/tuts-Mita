package com.chapter3.selfcheck24;
import java.util.*;

public class PromptMultiplyBy2 {
    /*
    Write code to read an integer from the user, then print that number multiplied by 2.
    You may assume that the user types a valid integer.
    A sample run of the code would produce the following:

    Type an integer: 4
    4 times 2 = 8

     */
    public static void main (String[] args){
        System.out.print("Type and integer: ");
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();
        System.out.print(x + " times 2 = " + (x*2));
    }

}
