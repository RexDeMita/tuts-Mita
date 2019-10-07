package com.chapter3.selfcheck17;

public class CountQuarters {

    /*
    Write a method called countQuarters that takes an int representing a number of cents as a parameter
    returns the number of quarter coins represented by that many cents.
    Don't count any whole dollars, because those would be dispensed as dollar bills.
    For example, countQuarters(64) would return 2, because 2 quarters make 50 cents, with 14 extra left over.
    countQuarters(1278) would return 3, after the 12 dollars are taken out, 3 quarters remain in the 78 cents left.
     */
    public static void main (String[] args){
        countQuarters(125);
    }

    public static int countQuarters(int x){
        x = x % 100;
        x = x / 25;
        return x;
    }
}
