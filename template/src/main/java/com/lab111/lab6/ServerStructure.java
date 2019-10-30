package main.java.com.lab111.lab6;

import java.util.ArrayList;
import java.util.HashMap;

public class ServerStructure {
    ArrayList<Element> elements;

    public ServerStructure(ArrayList<Element> elements) {
        this.elements = elements;
    }

    HashMap<String, Integer> returnProjectStructurePrice() {
        HashMap<String, Integer> structure = new HashMap<String, Integer>();
        for (Element element : elements) {
            structure.put(element.getName(), element.getPrice(0));
        }
        return structure;
    }
}
