package com.chapter2.SelfCheck.selfcheck15;

public class FirstSecond2 {
    //Rewrite the following code from the previous exercise to be shorter, by declaring the variables together on the same line
    // and by using the special assignment operators (e.g., +=, -=, *=, and /=) as appropriate.
    public static void main (String[] args){
        int first = 8;
        int second = 19;
        first = first + second;
        second = first - second;
        first = first - second;

        //shortened code
        //int first = 8, second = 19;
        //first += second;
        //second = first - second;
        //first -= second;
    }
}
