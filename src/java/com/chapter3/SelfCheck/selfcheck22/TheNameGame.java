package com.chapter3.SelfCheck.selfcheck22;

import java.util.*;

public class TheNameGame {
    /*
    Write a complete program called "TheNameGame,"
    where the user inputs a first/last name and a song in the following format
    is printed about their first, then last, name.
    Use a method to avoid redundancy.

    What is your name? Fifty Cent
Fifty Fifty, bo-Bifty
Banana-fana fo-Fifty
Fee-fi-mo-Mifty
FIFTY!
Cent Cent, bo-Bent
Banana-fana fo-Fent
Fee-fi-mo-Ment
CENT!
     */
    public static void main (String[] args){
        System.out.println("What is your name?");
        Scanner console = new Scanner(System.in);
        String first = console.next();
        String subfirst = first.substring(1);
        String last = console.next();
        String sublast = last.substring(1);

        name(first, subfirst);
        name(last, sublast);


    }

    public static void name(String name, String ame){
        String ucfirst = name.toUpperCase();
        System.out.println(ucfirst + " " + ucfirst + ", bo-B" + ame);
        System.out.println("Banana-fana fo-F" + ame);
        System.out.println("Fee-fi-mo-M" + ame);
        System.out.println(name);
    }
    public static void lastname(String last, String sublast){

    }

}
