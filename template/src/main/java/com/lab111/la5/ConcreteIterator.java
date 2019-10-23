package main.java.com.lab111.la5;

public class ConcreteIterator {
    int position = 0;

    ConcreteAggregate concreteAggregate;

    public ConcreteIterator(ConcreteAggregate concreteAggregate) {
        this.concreteAggregate = concreteAggregate;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
