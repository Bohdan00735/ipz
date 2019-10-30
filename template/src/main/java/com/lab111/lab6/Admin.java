package main.java.com.lab111.lab6;

public class Admin extends Visitor {
    public Admin() {
        super(1);
    }

    @Override
    public int visitWorkStation() {
        return super.visitWorkStation();
    }

    @Override
    public int visitCabel() {
        return super.visitCabel();
    }

    @Override
    public int visitServer() {
        return super.visitServer();
    }
}
