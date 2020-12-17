package com.chapter3G.Sections;
import java.awt.*;


public class Section3G_1 {

    public static void main(String[] args){

        //create a graphical window by specifying the height and width of a DrawingPanel object
        DrawingPanel Panel = new DrawingPanel(200, 300);

        //common use of DrawingPanel is to set the background color and use the graphics object

        //all coordinates are specified as integers that correspond to pixels on the screen

        //the upper left corner is 0,0

        //use a graphics object to draw: Graphics g = panel.getGraphics();

        //draw a line
        Graphics g = Panel.getGraphics();

        //you want to use a variable to store the object in case you want to use it multiple times
        g.drawLine(25, 75, 175, 25);

        // you can draw the outlines of shapes. the shape is drawn from the upper left corner

        //you can fill in the shapes

        //this line fills in a rectangle
        //g.fillRect(25, 50, 20, 20);

        //this line draws the outline of a rectangle
        //g.drawRect(150, 10, 40, 20);

        //this line draws the outline of an oval
        //g.drawOval(50, 25, 20, 20);

        //this line fills in an oval
        //g.fillOval(150, 50, 40, 20);

        //set the color of shapes or the background
        //the order of commands matters

        for (int i = 0; i < 4; i++){

            //the color is set to white before the oval is filled
            g.setColor(Color.WHITE);

            //the oval is filled with the preset color
            g.fillOval(i * 50, i * 25, 50, 25);

            //the color is set to black
            g.setColor(Color.BLACK);

            //the rectangle is drawn
            g.drawRect(i * 50, i * 25, 50, 25);


        }

        //custom rgb can be made

        //text can included as well: g.drawString(message, x, y)
        //the coordinates are for the bottom left corner

        for (int i = 0; i < 10; i++){
            g.drawString("There is no place like home", i * 5, 10 + i * 10);

        }


    }
}
