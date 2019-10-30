package main.java.com.lab111.lab7;

public class TerminalExpression extends AbstractExpression{
    // translate chars in to ints without sign
    @Override
    public void interpreter(Context context) {
        System.out.println("terminal expresion done");
    }

    @Override
    public String toString() {
        return String.valueOf(super.number);
    }
}
