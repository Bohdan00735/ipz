package main.java.com.labwork3;

public class BezierCurve implements Shape{
    @Override
    public void draw() {
        System.out.println("BezierCurve printed");
    }

    @Override
    public void resize() {
        System.out.println("Resizing BezierCurve");

    }

    @Override
    public String description() {
        return "BezierCurve";
    }

    @Override
    public boolean isHide() {
        return false;
    }
}
