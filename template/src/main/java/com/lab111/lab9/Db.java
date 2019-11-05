package main.java.com.lab111.lab9;

public abstract class Db {
    private int apilevel;
    private int threadsafety;
    private String paramstyle;

    public Db(int apilevel, int threadsafety, String paramstyle) {
        this.apilevel = apilevel;
        this.threadsafety = threadsafety;
        this.paramstyle = paramstyle;
    }
}
