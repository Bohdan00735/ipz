package main.java.com.lab111.lab9;

public abstract class File {
    String way;
    private String pass;
    int cofig;
    char root;

    public File(String way, String pass, int cofig, char root) {
        this.way = way;
        this.pass = pass;
        this.cofig = cofig;
        this.root = root;
    }

    public void delete(){};
    public void create(){};
    public void setRoots(String roots){};
}
