package main.java.com.lab111.labwork9;
/**
 * @author Dudka Maxym
 * @version 12.0.1
 * Realize Builder design pattern. This is the Abstract Builder.
 */
abstract public class ElementBuilder {

    /**
     * Element, wich we will construct.
     */
    protected Element myEl;

    /**
     * Getter for element
     * @return element.
     */
    public Element getMyEl(){
        return myEl;
    }

    /**
     * Method to firstly create our element.
     */
    public void createElement(){
        myEl= new Element();
    }

    //other abstract methods

    /**
     * Set color for element.
     */
    public abstract void createColor();

    /**
     * Set pts of Transperency for element.
     */
    public abstract void createTransperencyPT();

    /**
     * Set type for element.
     */
    public abstract void createType();

}
