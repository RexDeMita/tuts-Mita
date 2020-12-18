package com.Chapter4.Sections;

public class Section4_1 {

    public static void main (String[] args){

        //if statement structure

            /*
            if (test) {
                statement
                statement
                }
             */

        //if else structure
        /*
        if (<test>) {
            <statement>;
            <statement>;

            <statement>;
        } else {
            <statement>;

            <statement>;
            <statement>;
        }
         */

        // nested if else structures can result in one, none, or some execution

        // if the last branch is else: it will execute a statement

        // if the last branch is if (test): it is possible the structure might not execute anything

        int number = -6;

        //the if statements below are checking to see if number is positive, negative, or zero
        if (number > 0){
            System.out.println("Number is positive");
        } else if (number == 0){
            System.out.println("Number is zero");
        } else {
            System.out.println("Number is negative");
        }

        // If it doesn't matter what combination of branches is taken, use sequential if statements.
        // If you want one or none of the branches to be taken,
        // use nested if/else statements with a test for each statement.
        // If you want exactly one branch to be taken,
        // use nested if/else statements with a final branch controlled by an else rather than by a test.


        //== does not work for objects

        // factor out repetitive code

        // for multi condition, use the AND and OR operators


    }
}
