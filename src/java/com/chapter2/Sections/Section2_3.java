package com.chapter2.Sections;

/**
 * @author Mita
 *
 */

public class Section2_3 {

    public static final int LINES = 5;

    /**
     * Main method, entry into program.
     *
     *
     * @param args, command line arguments
     */
    public static void main(String[] args){
        //this for loop prints a list of the squares starting from 1 to 5
        for (int i = 1; i <= 5; i++){
            System.out.println(i + " squared = " + (i * i));
        }

        //convention to use i, j, k as control variable

        //nested for loops

        //this for loop iterates 10 times and controls the loop inside it
        for (int i = 1; i <= 10; i++){
            //this for loop iterates 5 times and prints "Hi there"
            for (int j = 1; j <= 5; j++){
                System.out.println(("Hi there."));

            }
        }
        //this for loop controls the loop inside it
        for (int i = 1; i <= 6; i++){
            //this for loop prints stars based on the iteration of the outer for loop
            for (int j = 1; j <= i; j++){
                System.out.print("*");

            }
            //this line creates a stack of stars instead of a single line of them
            System.out.println();
        }

        //the use of constants and nested for loops

        //this for loop iterates based on the value of the constant
        for (int line = LINES; line >= 1; line--){
            //this for loop prints spaces based on the value of "line" in the outer loop
            for (int i = 1; i <= (line - 1); i++) {
                System.out.print(" ");
            }
            //the number of stars that are printed is based on the constant
            int stars = 2 * LINES + 1 - 2 * line;
            //this line prints "line" based on the value in the outer loop
            System.out.println(line);
            //this for loop prints the stars based on the number calculated above
            for (int i = 1; i <= stars; i++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
