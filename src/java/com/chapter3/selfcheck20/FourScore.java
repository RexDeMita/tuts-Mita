package com.chapter3.selfcheck20;

public class FourScore {
    //what indexes must be passed to the substring method to produce the new String with the value "SCORE"?
    // What indexes to substring produce "fouryears"?

    public static void main(String[] args){
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;

        String quote = "Four score and seven years ago";
        String expr1 = quote.substring(a, b).toUpperCase();
        String expr2 = quote.toLowerCase().substring(c, d) + quote.substring(e,f);
    }

    /*
    a = 5
    b = 10
    c = 0
    d = 4
    e = 21
    f = 26
     */
}
