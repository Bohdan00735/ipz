package main.java.com.lab111.lab7;

public abstract class AbstractExpression  {
    char symbol;
    int number;
    NonTerminalExpression nonTerminalExpression;

    // parse general scheme and disassemble to smaller non terminal and terminal parts

    public void interpreter(Context context){
        System.out.println("abstract interpr of context " +
                "and call teminal or not terminal context");
        context.arrayOfActions.get(0).interpreter(context);
        context.arrayOfNumbers.get(0).interpreter(context);

    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
