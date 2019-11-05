package main.java.com.lab111.lab8;

import java.util.ArrayList;

public class Point implements VectorPrototype {
    ArrayList<VectorPrototype> childs;

    @Override
    public void addChild(VectorPrototype vectorPrototype) {
        try{childs.add(vectorPrototype);
        }catch (NullPointerException n){
            childs = new ArrayList<VectorPrototype>();
            childs.add(vectorPrototype);
        }
    }

    @Override
    public VectorPrototype myClone(){
        try {
            return (Point) this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public VectorPrototype deepClone() {
        Point cloned = (Point) this.myClone();
        try {
            System.out.println("simple clone");
            for (VectorPrototype part: childs){
                cloned.childs.add(part.deepClone());
        }

        }catch (NullPointerException ex){
            System.out.println("deep copy, done");
            return cloned;
        }
        return null;
    }
}
