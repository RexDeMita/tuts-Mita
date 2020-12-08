package com.chapter3.Sections;
import java.util.*;

/**
 * @author Mita
 */

public class Section3_4 {

    //calculate the trajectory that a projectile will follow

    /*
    several questions to answer:
    When does the projectile reach its highest point?
    How high does it reach?
    How long does it take to come back to the ground?
    How far does it land from where it was launched?
     */

    //gravity constant
    public static final double ACCELERATION = -9.81;

    public static void main (String[] args) {

        //prompts

        //Scanner object used to take input by the user from the console
        Scanner console = new Scanner(System.in);

        //the following is the velocity prompt and sets the value of the velocity variable
        System.out.print("velocity (meters/second)? ");
        double velocity = console.nextDouble();

        //the following is the angle prompt and sets the value of the angle variable
        System.out.print("angle (degrees)? ");
        double angle = Math.toRadians(console.nextDouble());

        //the following is the number of steps prompt and sets the value of the steps variable
        System.out.print("number of steps to display? ");
        int steps = console.nextInt();

        System.out.println();

        printTable(velocity, angle, steps);
    }
    //prints a table showing trajectory
    public static void printTable(double velocity, double angle, int steps){

        //compute the x and y components of the velocity
        double xVelocity = velocity * Math.cos(angle);
        double yVelocity = velocity * Math.sin(angle);

        //compute total air time
        double totalTime = -2.0 * yVelocity / ACCELERATION;

        //compute the time increment
        double timeIncrement = totalTime / steps;

        //compute the distance in the x direction
        double xIncrement = xVelocity * timeIncrement;

        //declaration and initialization of the x, y, and t variables used to calculate displacement
        double x = 0.0;
        double y = 0.0;
        double t = 0.0;

        //prints out initial step, x, y, and time
        System.out.println("step\tx\t\ty\t\ttime");
        System.out.println("0\t\t0.0\t\t0.0\t\t0.0");

        //prints out the table
        for (int i = 1; i <= steps; i++) {
            //t increases by timeIncrement each iteration
            t += timeIncrement;

            //x increases by xIncrement each iteration
            x += xIncrement;

            //y is set as the return of the displacement method
            y = displacement(yVelocity, t, ACCELERATION);

            //prints out values rounded to two decimal places
            System.out.println(i + "\t\t" + round2(x) + "\t" +
                    round2(y) + "\t" + round2(t));

        }
    }

    public static void giveIntro(){
        System.out.println("This program computes the trajectory of a projectile given its initial velocity and its");
        System.out.println("angle relative to the horizontal.");
    }

    //calculates the vertical displacement
    public static double displacement (double v, double t, double a){
        return v * t + 0.5 * a * t * t;
    }

    //rounds n to 2 digits after the decimal point
    public static double round2(double n){
        return Math.round(n * 100.0) / 100.0;
    }
}
