package main.java.com.labwork3;

public class Square implements Shape{
    int xcenter;
    int ycenter;
    int wide;

    public Square(int xcenter, int ycenter, int wide) {
        this.xcenter = xcenter;
        this.ycenter = ycenter;
        this.wide = wide;
    }

    public void setXcenter(int xcenter) {
        this.xcenter = xcenter;
    }

    public void setYcenter(int ycenter) {
        this.ycenter = ycenter;
    }

    public void setWide(int wide) {
        this.wide = wide;
    }

    @Override
    public void draw() {

    }

    @Override
    public void resize() {

    }

    @Override
    public String description() {
        return null;
    }

    @Override
    public boolean isHide() {
        return false;
    }
}
