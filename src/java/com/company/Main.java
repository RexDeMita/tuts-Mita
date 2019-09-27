package java.com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //ch6Ex1();

        //swap();

        int a = 3;
        int b = 1;
        int tmp = a;

        a = b;
        b = tmp;

        System.out.println("a, b\n\n" + a + ", " + b);
    }

   public static void  ch6Ex1(){

       // write your code here
       String test = "test world";
       System.out.println(test);
       System.out.println("test".toUpperCase());
       System.out.println(test.toUpperCase());
       System.out.println("Hello World".toLowerCase());

   }

   public static void swap(){
       Scanner console = new Scanner(System.in);
       System.out.print("Give two integers.");
       int a = console.nextInt();
       int b = console.nextInt();

       System.out.println("a is originally " + a);
       System.out.println("b is originally" + b);

       int temp = a;
       a = b;
       b = temp;


       System.out.println("a is now " + a);
       System.out.println("b is now" + b);

   }
}
