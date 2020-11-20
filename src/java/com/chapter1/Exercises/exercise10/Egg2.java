package com.chapter1.Exercises.exercise10;

public class Egg2 {
    public static void main (String[] args){
        //Generate the egg output
        //eliminate redundancy
        topHalf();
        bottomHalf();
        middle();
        System.out.print("");
        topHalf();
        bottomHalf();
        middle();
        bottomHalf();
        topHalf();
        middle();
        bottomHalf();
    }

    public static void topHalf (){
        System.out.println("  _______  ");
        System.out.println(" /       \\ ");
        System.out.println("/         \\");

    }

    public static void bottomHalf (){
        System.out.println("\\         / ");
        System.out.println(" \\_______/  ");
    }

    public static void middle(){
        System.out.println("-\"-'-\"-'-\"-");
    }
}
