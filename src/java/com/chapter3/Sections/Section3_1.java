package com.chapter3.Sections;

/**
 * @author Mita
 */

public class Section3_1 {

    public static final int SUB_HEIGHT = 4;

    public static void main(String[] arg){

        drawTheTop();

    }
    //this method takes in 2 types of input, a char and an int
    public static void writeChars(char ch, int number){

        //based on the parameters, this for loop prints out a certain number of ch
        for (int i = 1; i <= number; i++){
            System.out.print(ch);
        }
    }

    // produces the top half of the hourglass figure
    public static void drawTheTop() {


        for (int line = 1; line <= SUB_HEIGHT; line++){

            //this line prints out a |
            System.out.print("|");

            //this method call tells writeChars to print the spaces
            writeChars(' ', line - 1);

            //this line prints out a \
            System.out.print("\\");

            //this method call tells writeChars to print the '.'
            writeChars('.', 2 * SUB_HEIGHT - 2 * line);

            //this line prints out a /
            System.out.print("/");

            //this method call tells writeChars to print spaces
            writeChars(' ', line - 1);

            //this line prints a |
            System.out.println("|");
        }
    }

    //use constants when making changes from execution to execution
    //use parameters when making changes within one execution


}
