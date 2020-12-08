package com.chapter3.Sections;

/**
 * @author Mita
 */

public class Section3_2 {

    public static void main (String[] args){

        //dot notation - classname.element     Math.sqrt

        //these lines print out the values of the hypotenuse method calls
        System.out.println("hypotenuse 1 = " + hypotenuse(5, 12));
        System.out.println("hypotenuse 2 = " + hypotenuse(3, 4));

    }

    //this method returns the value of the expression solving for the hypotenuse of a triangle
    public static double hypotenuse(double a, double b){
        return Math.sqrt(a * a + b * b);
    }
}
