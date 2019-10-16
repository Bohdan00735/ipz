package main.java.com.lab111.lab4;

import main.java.com.labwork3.Color;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class PointFactory implements Ishape {
    private PointShape pointShape = new PointShape();

    public PointFactory(PointShape pointShape) {
        this.pointShape = pointShape;
    }

    public void setPointShape(PointShape pointShape) {
        this.pointShape = pointShape;
    }

    public void CreateAndAddPoint(Color color, int x, int y){
        pointShape.addOneMorePoint(new Point(color));
        int[] coord = {x,y};
        pointShape.addPartToCoord(coord);
    }

    public void CreateAndAddPoint(HashMap<int[],Color> param){
        for (int [] i: param.keySet()
             ) {
            pointShape.addPartToCoord(i);
            pointShape.addOneMorePoint(new Point(param.get(i)));
        }
    }

    public void CreateAndAddPoint(Color[] colors, ArrayList<int[]> coord){
        if (colors.length != coord.size()){
            System.out.println("All data should be synchronize");
            System.exit(1);
        }else {
            pointShape.addPartToCoord(coord);
            for (Color i:colors
                 ) {pointShape.addOneMorePoint(new Point(i));
            }
        }
    }

    public void draw(){
        pointShape.draw();
    }

    @Override
    public void draw(int[] coord) {
        pointShape.draw(coord);
    }
}
