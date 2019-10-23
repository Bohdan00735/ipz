package main.java.com.lab111.la5;

public class Main {
    public static void main(String[] args) {
        int[] mass = {1,3,2,7,5};
        ConcreteAggregate concreteAggregate = new ConcreteAggregate(mass);
        Iterator iterator = new Iterator(concreteAggregate.makeConcreteIterator());
        Iterator sortIterator = new Iterator(concreteAggregate.makeSortedIterator());
        while (iterator.hasNext()){
            System.out.printf("non sorted - %d  Sorted - %d \n",(int)iterator.next(), (int)sortIterator.next() );
        }
    }
}
