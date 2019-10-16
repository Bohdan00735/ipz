package main.java.com.lab111.lab4;

import main.java.com.labwork3.Color;

public class Point implements IPoint {
    Color color;

    public Point(Color color){
        this.color = color;
    }

    @Override
    public void draw(int[] coord) {
        System.out.printf("point with color %s and coord (%d,%d) painted \n",
                color.toString(), coord[0], coord[1]);
    }
}
