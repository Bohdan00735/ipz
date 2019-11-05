package main.java.com.lab111.lab8;

import java.util.ArrayList;

public class Client {
    ArrayList<VectorPrototype> elements;

    public Client(ArrayList<VectorPrototype> elements) {
        this.elements = elements;
    }


    public void addElement(VectorPrototype element){
        elements.add(element);
    }

    public ArrayList<VectorPrototype> copy(){
        ArrayList copied = new ArrayList<VectorPrototype>();
        VectorPrototype newElement;
        for (VectorPrototype element:elements
             ) {newElement = element.myClone();
             copied.add(newElement);

        }
        return copied;
    }

    public ArrayList<VectorPrototype> deepCopy(){
        ArrayList copied = new ArrayList<VectorPrototype>();
        VectorPrototype newElement;
        for (VectorPrototype element:elements
        ) {newElement = element.deepClone();
            copied.add(newElement);

        }
        return copied;
    }

}
