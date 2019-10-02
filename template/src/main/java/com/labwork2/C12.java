package main.java.com.labwork2;

public class C12 extends C11 implements If2 {
    If3 if3 = new If3() {
        @Override
        public void meth3() {
            System.out.println("meth3 - c12");
        }

        @Override
        public void meth2() {
            System.out.println("meth2 - c12");

        }
    };
}
