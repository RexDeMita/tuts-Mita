package com.chapter3G.Sections;
import java.awt.*;

public class Section3G_2 {

    public static void main (String[] args){

        //creates the window
        DrawingPanel panel = new DrawingPanel(200, 100);

        //this line sets the background color to yellow
        panel.setBackground((Color.YELLOW));

        //the code below use the graphics object to draw text
        Graphics g = panel.getGraphics();
        drawText(g);
    }

    public static void drawText(Graphics g) {
        //this for loop displays the text according to the parameters of the drawString method
        for (int i = 0; i < 10; i++){
            g.drawString("There is no place like home", i * 5, 10 + i * 10);
        }
    }
}
