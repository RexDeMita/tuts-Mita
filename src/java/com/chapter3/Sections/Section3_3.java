package com.chapter3.Sections;
import java.util.*; //this import declaration is for the Scanner

/**
 * @author Mita
 */

public class Section3_3 {

    public static void main (String[] args){

        //calling a method of an object: variable.methodname

        //constructors: methods that create and initialize an object. use the keyword new

        //to initialize a scanner object: Scanner console = new Scanner(System.in);

        //token vs line: single element vs lines of input

        //initialization of the scanner object
        Scanner console = new Scanner(System.in);

        //the next line prints out a description
        System.out.println("This program computes monthly mortgage payments.");

        //loan amount prompt and initialization and declaration of the loan variable
        System.out.print("loan amount: ");
        double loan = console.nextDouble();

        //number of years prompt and initialization and declaration of the years variable
        System.out.print("number of years : ");
        int years = console.nextInt();

        //interest rate prompt and initialization and declaration of the rate variable
        System.out.print("interest rate : ");
        double rate = console.nextDouble();

        System.out.println();

        //compute the result and report

        //compute the number of months and interest rate
        int n = 12 * years;
        double c = rate / 12.0 / 100.0;

        //the monthly payment is computed and printed below
        double payment = loan * c * Math.pow(1 + c, n) / (Math.pow(1 + c, n) - 1);
        System.out.println("payment = $" + (int) payment);

    }
}
