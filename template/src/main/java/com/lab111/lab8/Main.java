package main.java.com.lab111.lab8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Client client = new Client(new ArrayList<VectorPrototype>());
        Circle circle = new Circle();
        circle.addChild(new Point());
        Line line = new Line();
        line.addChild(new Circle());
        circle.addChild(line);
        client.addElement(circle);
        client.addElement(new Vector());
        client.copy();
        client.deepCopy();
    }
}
