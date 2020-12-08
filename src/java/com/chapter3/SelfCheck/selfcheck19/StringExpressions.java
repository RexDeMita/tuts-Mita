package com.chapter3.SelfCheck.selfcheck19;

public class StringExpressions {
    //Evaluate the following expressions.
    // Make sure to give a value of the appropriate type
    // (such as including quotes around a String or apostrophes around a char).

    public static void main (String[] args){
        String str1 = "Frodo baggins";
        String str2 = "Gandalf the GRAY";
      //               0123456789012345

        str1.length();
        str1.charAt(7);
        str2.charAt(0);
        str1.indexOf("o");
        str2.toUpperCase();
        str1.toLowerCase().indexOf("B");
        str1.substring(4);
        str2.substring(3, 14);
        str2.replace("a", "oo");
        str2.replace("gray", "white");
        "str1".replace("r", "range");
    }

    /*
    13
    'a'
    'G'
    2
    GANDALF THE GRAY
    frodo baggins -> -1
    "o Baggins"
    "dalf the GR"
    "Goondoolf the GRAY"
    "Gandalf the GRAY"
    "strange1"
     */
}
