package main.java.com.lab111.lab6;

import java.util.HashMap;

public class Client {
    ServerStructure serverStructure;

    public Client(ServerStructure serverStructure) {
        this.serverStructure = serverStructure;
    }

    public void showStructureNamesAndStructure(){
        HashMap<String,Integer> structure = serverStructure.returnProjectStructurePrice();
        for (String key:structure.keySet()
             ) {
            System.out.printf("Price of element %s is %d \n", key, structure.get(key));
        }
    }
}
