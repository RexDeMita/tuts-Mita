package com.chapter3.exercise5;

public class PrintGrid {
    public static void main(String[] args){
        printGrid(3,2);
    }

    public static void printGrid(int row, int col){
        for (int i = 1; i <= row; i++){
            int num = i;
            System.out.print(num);

            for (int j = 1; j < col; j++){
                num += row;
                System.out.print(", " + num);
            }

            System.out.println();
        }
    }
}
