package main.java.com.lab111.lab8;

import java.util.ArrayList;

public class Line implements VectorPrototype {
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
    public VectorPrototype myClone() {
        try {
            System.out.println("simple clone");
            return (Line) this.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public VectorPrototype deepClone() {
        Line cloned = (Line) this.myClone();
        try {
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
