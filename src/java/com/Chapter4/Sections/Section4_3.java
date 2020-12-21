package com.Chapter4.Sections;

public class Section4_3 {

    public static void main (String[] args){
        //char type: single character of text placed between single quotes

        printVertical("type");

        //char vs int: chars have int values, int can be changed into char using cast

     System.out.println(count("type", 'y'));


        //chars can be concatenated with strings
        System.out.println(reverse("menage a trois"));

        //system.out.printf uses a format string to specify the general appearance of the output and parameters to be
        //included in the output

        //format specifiers: placeholders that allow you to specify a location
        //where a variable's value should be inserted, along with the format you'd like to give that value

        //printf does not create a new line

        //two format specifiers are needed to use them as printable characters

        //int x = 38, y = 152;  System.out.printf("location: (%d, %d)\n", x, y);
    }

    //this method prints each character of a string on its own line
    public static void printVertical(String message) {
        for (int i = 0; i < message.length(); i++) {
            //the char at a specific index is stored in variable ch
            char ch = message.charAt(i);
            System.out.println(ch);
        }
    }
    //this method accepts a string and a character and returns the number of times the character occurs in the string
    public static int count(String text, char c) {
        int found = 0;

        //when the character is found in the string, the counter is increased by 1
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == c) {
                found++;
            }
        }
        return found;
    }
    //this method prints a given string in reverse order
    public static String reverse(String phrase) {
        String result = "";

        //this for loop iterates the 1 less char than the length of the given phrase and prints it out in reverse order
        for (int i = 0; i < phrase.length(); i++) {
            result = phrase.charAt(i) + result;
        }
        return result;
    }
}
