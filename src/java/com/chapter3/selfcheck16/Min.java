package com.chapter3.selfcheck16;

public class Min {

    //Write a method called min that takes three integers as parameters and returns the smallest of the three values
    // such that a call of min(3, -2, 7) would return -2, and a call of min(19, 27, 6) would return 6.
    // Use Math.min to write your solution.

    public static void main (String[] args){
        int x = 3;
        int y = -2;
        int z = 7;
        min(3, -2, 7);
    }

    public static int min(int x, int y, int z) {
        int bogey = Math.min(x, y);
        int real = Math.min(bogey, z);
        return real;
    }
        }
