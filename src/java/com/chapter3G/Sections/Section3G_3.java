package com.chapter3G.Sections;
import java.awt.*;

public class Section3G_3 {
    //class constant for the size of the pyramid
    public static final int SIZE = 100;

    public static void main(String[] args){
        //create a window of a certain size and create a graphics object
        DrawingPanel panel = new DrawingPanel(350, 250);
        Graphics g = panel.getGraphics();

        //method calls for the pyramids
        drawPyramid(g, Color.WHITE, 0, 0, 10);
        drawPyramid(g, Color.RED, 80, 140, 5);
        drawPyramid(g, Color.BLUE, 220, 50, 20);

    }

    //draws one pyramid with the given number of stairs at the given position with the given color

    public static void drawPyramid(Graphics g, Color c, int x, int y, int stairs){
        //this line draws the rectangular border
        g.drawRect(x, y, SIZE, SIZE);

        //the for loop draws the stairs of the pyramid
        for (int i = 0; i < stairs; i++) {
            //this line calculates stair height
            int stairHeight = SIZE / stairs;

            //this line calculates stair width
            int stairWidth = stairHeight * (i + 1);

            //calculates the coordinates of the stairs
            int stairX = x + (SIZE - stairWidth) / 2;
            int stairY = y + stairHeight * i;

            //fills in the rectangles
            g.setColor(c);
            g.fillRect(stairX, stairY, stairWidth, stairHeight);

            //draws the black rectangle outlines
            g.setColor(Color.BLACK);
            g.drawRect(stairX, stairY, stairWidth, stairHeight);
        }


    }
}
