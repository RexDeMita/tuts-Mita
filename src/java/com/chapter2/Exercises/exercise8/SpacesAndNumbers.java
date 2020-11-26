package com.chapter2.Exercises.exercise8;

/**
 * @author Mita
 */

public class SpacesAndNumbers {

    //use nested for loops to produce the following output

    //    1
    //   22
    //  333
    // 4444
    //55555

    public static void main(String[] args) {

        //this is the outer for loop that controls the inner for loops that will print the output
        for (int i = 1; i <= 5; i++) {

            //this for loop print the required spaces
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            //this for loop prints i after the spaces
            for (int j = 1; j <= i; j++){
                System.out.print(i);
            }
            //this line creates a new line
            System.out.println();
        }

    }
}