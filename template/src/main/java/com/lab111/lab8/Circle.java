package main.java.com.lab111.lab8;

import java.util.ArrayList;

public class Circle implements VectorPrototype {
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
            return (VectorPrototype) this.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public VectorPrototype deepClone() {
        Circle cloned = (Circle) this.myClone();
        try {
            for (VectorPrototype part: childs){
                cloned.childs.add(part.deepClone());
            }
            System.out.println("deep copy, done");

        }catch (NullPointerException ex){
            return cloned;
        }
        return null;
    }
}
