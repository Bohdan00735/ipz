package main.java.com.lab111.lab6;

public class Visitor {
    private int roots;
    private int cashe;

    public void addToCash(int sum) {
        cashe += sum;
    }

    String getAppointment() {
        return this.getClass().getName();
    }

    public int getCashe() {
        return cashe;
    }

    public int getRoots() {
        return roots;
    }

    public Visitor(int roots) {
        this.roots = roots;
    }

    public int visitWorkStation() {
        return 0;
    }

    public int visitCabel() {
        return 0;
    }

    public int visitServer() {
        return 0;
    }
}
