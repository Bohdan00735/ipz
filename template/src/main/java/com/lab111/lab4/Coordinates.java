package main.java.com.lab111.lab4;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Coordinates {
    private LinkedHashSet<int[]> coord =  new LinkedHashSet<int[]>();
    private int counter = 0;


    public LinkedHashSet<int[]> getCoord() {
        return coord;
    }

    public void setCoord(LinkedHashSet<int[]> coord) {
        this.coord = coord;
        System.out.println("Setting complete");
    }

    public void addPartToCoord(@NotNull int [] coordinates){
        coord.add(coordinates);
        counter++;
        System.out.println("Adding complete");
    }

    public void addPartToCoord(@NotNull ArrayList<int[]> coordinates){
        for (int[] i:coordinates
             ) {
            coord.add(i);
            counter++;
        }
        System.out.println("Adding complete");
    }
}
