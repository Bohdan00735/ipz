package main.java.com.lab111.labwork9;
/**
 * @author Dudka Maxym
 * @version 12.0.1
 * Realize Builder design pattern. This is the a concrete Builder.
 * Its creates red circle with 20% transparency.
 */
public class Green20CircleBuilder extends ElementBuilder {

    @Override
    public void createColor() {
        myEl.setColor("GREEN");
    }

    @Override
    public void createTransperencyPT() {
        myEl.setTransparencyPRT(20);
    }

    @Override
    public void createType() {
        myEl.setType("Circle");
    }
}


