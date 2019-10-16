package main.java.com.lab111.lab4;

import main.java.com.labwork3.Color;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PointFactory pointFactory = new PointFactory(new PointShape());
        Color[] colors = {Color.RED, Color.GREEN, Color.BLACK, Color.WHITE};
        ArrayList<int[]> coord = new ArrayList<int[]>();
        for (int i = 1; i < 9; i+=2){
            int [] param = {i,i};
            coord.add(param);
        }

        pointFactory.CreateAndAddPoint(colors, coord);
        pointFactory.draw();
    }
}
