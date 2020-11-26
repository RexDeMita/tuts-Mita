package com.chapter2.Sections;

public class Section2_5 {

    /**
     * @author Mita
     *
     */

    //class constant that sets the value of the height of the halves of the hourglass
    public static final int SUB_HEIGHT = 4;

    public static void main (String[] args) {

        /*
        pseudocode


        //this is the most basic version of pseudocode
        draw a line
        draw the top half
        draw the bottom half
        draw a line

        //these are the steps broken down into methods
        write a plus, 6 dashes, another plus

        for (each of 3 lines) {
            write a bar
            write some spaces
            write a backslash
            write some dots
            write a slash
            write some spaces
            write a bar
        }

        for (line going 1 to 3) {
            write a bar
            write (line - 1) spaces
            write a backslash
            write (6  2 * line) dots
            write a slash
            write (line  1) spaces o
            write a bar
        }

         */

        //the method calls to output the hourglass

        //this method call draws the line at the top of the hourglass
        drawLine();

        //this method call draws the top half of the hourglass
        drawTop();

        //this method call draws the bottom half of the hourglass
        drawBottom();

        //this method call draws the line at the bottom of the hourglass
        drawLine();

    }
        //this method draws the line at the top of the hourglass
        public static void drawLine() {
            //this line prints the + at the beginning of the line
            System.out.print("+");

            //this for loop prints the hyphens or dashes after the plus based on the value of the constant
            for (int i = 1; i <= (2 * SUB_HEIGHT); i++){
                System.out.print("-");
            }

            //this line prints the + at the end of the line
            System.out.println("+");
        }

        // produces the top half of the hourglass figure
        public static void drawTop() {
            //this for loop controls the for loops inside it based on the value of the constant
            for (int line = 1; line <= SUB_HEIGHT; line++) {

                //this line prints |
                System.out.print("|");

                //this for loop prints the spaces after the |
                for (int i = 1; i <= (line - 1); i++) {
                    System.out.print(" ");
                }
                //this line prints a \
                System.out.print("\\");

                //this line sets the value of the dots based on the value of the constant and changing value of line
                int dots = 2 * SUB_HEIGHT - 2 * line;

                //this for loop prints dots
                for (int i = 1; i <= dots; i++) {
                    System.out.print(".");
                }
                //this line prints a /
                System.out.print("/");

                //this for loop prints spaces
                for (int i = 1; i <= (line - 1); i++) {
                    System.out.print(" ");
                }

                // this line prints a |
                System.out.println("|");
            }
        }

        //this method produces the bottom half of the hourglass
        public static void drawBottom (){

            //this for loop prints the bottom half of the hourglass
            for (int line = 1; line <= SUB_HEIGHT; line++){

                //this line prints a |
                System.out.print("|");

                //this for loop prints the spaces based on the value of the constant and the changing value of line
                for (int i = 1; i <= (SUB_HEIGHT - line); i++){
                    System.out.print(" ");
                }
                //this line prints a /
                System.out.print("/");

                //this for loop prints dots based on the incrementing value of line
                for (int i = 1; i <= 2 * (line - 1); i++){
                    System.out.print(".");

                }
                //this line prints a \
                System.out.print("\\");

                //this for loop prints spaces based on the value of the constant and the incrementing value of line
                for (int i = 1; i <= (SUB_HEIGHT - line); i++){
                    System.out.print(" ");
                }
                // this line prints a |
                System.out.println("|");
            }


        }





}
