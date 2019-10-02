package com.chapter2.exercise5;

public class starTriangle {
    //Produce the following output

    //*
    //**
    //***
    //****
    //*****

    public static void main(String[] args){
        for (int i = 1; i <= 5; i++){
            for (int j  = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
