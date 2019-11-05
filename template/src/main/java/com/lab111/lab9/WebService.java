package main.java.com.lab111.lab9;

public abstract class WebService {
    String link;
    char root;
    String param;
    String description;

    public WebService(String link, char root, String param) {
        this.link = link;
        this.root = root;
        this.param = param;
    }

    public void checkStructure(){}

    public boolean checkLink(){return false;}

    public void setRoot(char root) {
        this.root = root;
    }
}
