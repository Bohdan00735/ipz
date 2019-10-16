package main.java.com.lab111.labwork9;
/**
 * @author Dudka Maxym
 * @version 12.0.1
 * Realize Builder design pattern. This is the a concrete Builder.
 * Its creates green square with 20% transparency.
 */
public class Yellow80SquareBuilder extends ElementBuilder {

    @Override
    public void createColor() {
        myEl.setColor("YELLOW");
    }

    @Override
    public void createTransperencyPT() {
        myEl.setTransparencyPRT(80);
    }

    @Override
    public void createType() {
        myEl.setType("Square");
    }
}
