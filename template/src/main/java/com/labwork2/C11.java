package main.java.com.labwork2;

public class C11 implements If1 {

    C13 c13 = new C13();


    @Override
    public void meth1() {
        System.out.println("meth1 - c11" );

    }

    @Override
    public void meth3() {
        System.out.println("meth2 - c11" );

    }

    @Override
    public void meth2() {
        System.out.println("meth3 - c11" );

    }
}
