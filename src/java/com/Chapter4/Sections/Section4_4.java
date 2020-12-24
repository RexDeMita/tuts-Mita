package com.Chapter4.Sections;

public class Section4_4 {

    public static void main(String[] args){

        //methods have metrics to determine functional success

        //preconditions: a condition that must be true before a method can execute in order to guarantee
        // that the method can perform its task
        //
        // post-conditions: a condition that the method guarantees will be true after it finishes executing, as long as
        // the preconditions were true before the method was called

        //throw exceptions if a precondition fails      throw <exception>;

        throw new IllegalArgumentException();

        //include the code above in an if statement

        //you can include text that is shown when the exception is thrown

        //inclusion of pre and post conditions alongside exceptions can be beneficial




    }
    //this method determines which number is larger
    public static int max (int x, int y){
        if (x > y) {
            return x;
        }
            return y;
    }

    //if we say a method returns a particular value, we must have an explanation if that value is never found

    //this method finds the index of a character in a string using a for loop
    public static int indexOf(char ch, String s) {
        for (int i = 0; i < s.length(); i++) {

            //this if statement checks the index for the character
            if (s.charAt(i) == ch) {
                return i;
            }
        }
        //this return statement is for the situation where the for loop does not find the value
        return -1;
    }

    //think in terms of paths and cases possible for the code, not just the problem being solved

    //figure out which ones are the simplest to test for
}
