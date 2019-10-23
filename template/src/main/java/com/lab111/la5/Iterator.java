package main.java.com.lab111.la5;

public class Iterator implements java.util.Iterator  {
    private ConcreteIterator concreteIterator;

    public Iterator(ConcreteIterator concreteIterator) {
        this.concreteIterator = concreteIterator;
    }

    @Override
    public boolean hasNext() {
        return !(concreteIterator.position + 1 > concreteIterator.concreteAggregate.massive.length);
    }

    @Override
    public Object next() {
        int position = concreteIterator.position;
        concreteIterator.setPosition(position+1);
        return concreteIterator.concreteAggregate.massive[position];
    }
}
