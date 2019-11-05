package main.java.com.lab111.lab9;

public class Client {
    public static void main(String[] args) {
        APIFactory first = new RedactorApiFactory();
        APIFactory second = new ViewerApiFactory();
        first.createDb("first",0);
        first.createFile("home","my");
        first.createWebService(005,"way","source");
        second.createDb("second",1);
        second.createFile("home","my2");
        second.createWebService(2,"way","source2");
    }
}
