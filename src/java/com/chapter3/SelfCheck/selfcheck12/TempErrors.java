package com.chapter3.SelfCheck.selfcheck12;

public class TempErrors {
    /*
    Correct the errors and submit a working version of the program. The output should be:

    Body temp in C is: 37.0

    public class Temperature {
    public static void main(String[] args) {
        double tempf = 98.6;
        double tempc = 0.0;
        ftoc(tempf, tempc);
        System.out.println("Body temp in C is: " + tempc);
    }

    // converts Fahrenheit temperatures to Celsius
    public static void ftoc(double tempf, double tempc) {
        tempc = (tempf - 32) * 5 / 9;
    }
}


    */

    public static void main(String[] args){
        double tempf = 98.6;
        ftoc(tempf);

    }

    public static void ftoc(double tempf){
        double tempc = 0.0;
        tempc = (tempf - 32) * 5 / 9;
        System.out.println("Body temp in C is: " + tempc);
    }
}
