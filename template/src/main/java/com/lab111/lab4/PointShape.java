package main.java.com.lab111.lab4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class PointShape extends Coordinates implements Ishape {
    private ArrayList<Point> points = new ArrayList<Point>();
    private int counter = 0;


    public void addToCoord(ArrayList<int[]> coord){
       super.addPartToCoord(coord);
    }

    public void addOneMorePoint(Point point){
       points.add(counter, point);
       counter++;
    }

    public ArrayList<Point> getPoints() {
        return points;
    }

    public void setPoints(ArrayList<Point> points) {
        this.points = points;
    }

    @Override
    public void draw(int[] coord) {

    }

    @Override
    public void draw() {
        if (super.getCoord().size() == points.size()){
           Iterator<int[]> iterator = super.getCoord().iterator();
           int thiscounter = 0;
           while (iterator.hasNext()){
               points.get(thiscounter).draw(iterator.next());
               thiscounter++;
           }
        }else {
            System.out.println("Set all dates rite");
        }
    }
}
