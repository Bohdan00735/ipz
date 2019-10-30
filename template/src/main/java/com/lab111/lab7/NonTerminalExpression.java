package main.java.com.lab111.lab7;

public class NonTerminalExpression extends AbstractExpression{

// make actions and combine all terminal express
    @Override
    public void interpreter(Context context) {
        System.out.println("NONteminal expresion done");
    }

    @Override
    public String toString() {
        return String.valueOf(super.symbol);
    }
}
