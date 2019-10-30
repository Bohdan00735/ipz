package main.java.com.lab111.lab6;

public class Element{
    int price;

    String getName(){
        return this.getClass().getName();
    }

    public Element(int price) {
        this.price = price;
    }

    public int getPrice(int roots) {
        if (roots<=2){return price;}
        return 0;
    }

    public void Accept(Visitor visitor){
        visitor.addToCash(getPrice(visitor.getRoots()));
    }
}
