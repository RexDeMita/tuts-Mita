package com.chapter3.selfcheck26;

import java.util.*;

public class RobertPaulson {
    //Write code that prompts the user for a phrase and a number of times to repeat it,
    // then prints the phrase that many times.
    // Here is an example dialogue with the user:

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("What is your phrase?");
        String phrase = console.next();
        System.out.print("How many times should I repeat it?");
        int integer = console.nextInt();

        for (int i = 1; i <= integer; i++){
            System.out.println(phrase);
        }
    }
}
