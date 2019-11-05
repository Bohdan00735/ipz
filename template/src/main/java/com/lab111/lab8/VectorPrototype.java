package main.java.com.lab111.lab8;

public interface VectorPrototype {
    public VectorPrototype myClone();
    public VectorPrototype deepClone();
    public void addChild(VectorPrototype vectorPrototype);
}
