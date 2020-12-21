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

        //initialize max numbers to the smallest possible value or the first value in the sequence

        //calculating cumulative sum with if else
        //the test checks to see if the total is less than or equal to zero before finding the average
        if (totalNumber <= 0) {
            System.out.println("No numbers to average");
        } else {
            double average = sum / totalNumber;
            System.out.println("average = " + average);
        }

        printHailstoneMaxMin(5,5);

        //round-off errors: numerical error that occurs because floating point numbers are stores as approximations
        //rather than as exact values

        //doubles and floats are approximations

        //dont compare doubles for equality, use a margin for error in the difference between the values

    }
    public static void printHailstoneMaxMin(int value, int length){
        //min and max are initialized and declared
        int min = value;
        int max = value;

        for (int i = 1; i <= length - 1; i++) {

            //this if else checks if the value is even or odd
            //it then calculates a value based on the result of the test
            if (value % 2 == 0) {
                value = value / 2;
            } else {
                value = 3 * value + 1;
            }
            //the next if else structure checks to see if the value is the new min or max
            if (value > max) {
                max = value;
            } else if (value < min) {
                min = value;
            }
        }

        //these lines print the min and max
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }


}
