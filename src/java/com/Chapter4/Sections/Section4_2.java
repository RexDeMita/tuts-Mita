package com.Chapter4.Sections;
import java.util.*;

public class Section4_2 {

    public static void main (String[] args){

        //cumulative algorithm: operation in which an overall value is computed incrementally, often using a loop


        //info about the program
        System.out.println("This program adds a sequence of numbers.");
        System.out.println();

        //scanner object
        Scanner console = new Scanner(System.in);

        //prompt
        System.out.print("How many numbers do you have? ");

        //initialized and declared totalNumber variable
        int totalNumber = console.nextInt();

        //initialized and declared sum variable
        double sum = 0.0;

        //this for loop prints the results of the numbers given by the user
        for (int i = 1; i <= totalNumber; i++) {

            //this line prints out a prompt for the next number
            System.out.print(" #" + i + "? ");

            //this line receives the users input
            double next = console.nextDouble();

            //this line updates sum
            sum += next;
        }
        System.out.println();

        //this line prints out sum
        System.out.println("sum = " + sum);


    }
}
