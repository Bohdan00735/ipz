package main.java.com.lab111.lab6;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cabel cabel1 = new Cabel(500);
        Cabel cabel2 = new Cabel(700);
        Cabel cabel3 = new Cabel(600);
        Cabel cabel4 = new Cabel(400);
        Server server1 = new Server(900);
        Server server2 = new Server(1200);
        WorkStantion workStantion = new WorkStantion(1000000);
        ArrayList<Element> elements = new ArrayList<>();
        Element[] listOfElem = new Element[]{cabel1, cabel2,cabel3,cabel4,server1,server2,workStantion};
        elements.addAll(Arrays.asList(listOfElem));
        ServerStructure serverStructure = new ServerStructure(elements);
        Client client = new Client(serverStructure);
        client.showStructureNamesAndStructure();
    }

}
