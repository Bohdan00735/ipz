package main.java.com.lab111.la5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ConcreteAggregate implements Aggregate {
    int[] massive;

    public ConcreteAggregate(int[] massive) {
        this.massive = massive;
    }

    @Override
    public ConcreteIterator makeConcreteIterator() {
        return new ConcreteIterator(new ConcreteAggregate(massive));
    }

    public ConcreteIterator makeSortedIterator(){
        int [] sorted = massive.clone();
        Arrays.sort(sorted);
        return new ConcreteIterator(new ConcreteAggregate(sorted));
    }
}
