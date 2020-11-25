package com.chapter2.Sections;

public class Section2_5 {

    /**
     * @author Mita
     *
     */

    public static final int SUB_HEIGHT = 4;

    public static void main (String[] args) {

        /*
        pseudocode

        draw a line
        draw the top half
        draw the bottom half
        draw a line

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

        drawLine();
        drawTop();
        drawBottom();
        drawLine();

    }

        public static void drawLine() {
            System.out.print("+");
            for (int i = 1; i <= (2 * SUB_HEIGHT); i++){
                System.out.print("-");
            }
            System.out.println("+");
        }

        // produces the top half of the hourglass figure
        public static void drawTop() {
            for (int line = 1; line <= SUB_HEIGHT; line++) {
                System.out.print("|");
                for (int i = 1; i <= (line - 1); i++) {
                    System.out.print(" ");
                }
                System.out.print("\\");
                int dots = 2 * SUB_HEIGHT - 2 * line;
                for (int i = 1; i <= dots; i++) {
                    System.out.print(".");
                }
                System.out.print("/");
                for (int i = 1; i <= (line - 1); i++) {
                    System.out.print(" ");
                }
                System.out.println("|");
            }
        }

        public static void drawBottom (){
            for (int line = 1; line <= SUB_HEIGHT; line++){
                System.out.print("|");
                for (int i = 1; i <= (SUB_HEIGHT - line); i++){
                    System.out.print(" ");
                }
                System.out.print("/");
                for (int i = 1; i <= 2 * (line - 1); i++){
                    System.out.print(".");

                }
                System.out.print("\\");
                for (int i = 1; i <= (SUB_HEIGHT - line); i++){
                    System.out.print(" ");
                }
                System.out.println("|");
            }
        }





}
