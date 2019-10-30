package main.java.com.lab111.lab7;

import java.util.ArrayList;
import java.util.Scanner;

public class ClientListener {


    public Context setAExample(){
        Context context = new Context();
        ArrayList all = new ArrayList<AbstractExpression>();
        ArrayList symb = new ArrayList<NonTerminalExpression>();
        ArrayList numbs = new ArrayList<TerminalExpression>();
        Scanner scanner = new Scanner(System.in);
        Symbols symbols = new Symbols();

        System.out.println("Input number or open scope");

        String symbol = scanner.next();

        if (symbol.equals("(")){
            NonTerminalExpression nonTerminalExpression = new NonTerminalExpression();
            nonTerminalExpression.setSymbol('(');
            symb.add(nonTerminalExpression);
            all.add(nonTerminalExpression);

        }else {
            TerminalExpression terminalExpression= new TerminalExpression();
            terminalExpression.setNumber(Integer.parseInt(symbol));
            numbs.add(terminalExpression);
            all.add(terminalExpression);
        }

        while (true){
            System.out.println("Input num, action or scope, look for your actions\n" +
                    "to exit - !");
            symbol = scanner.next();

            if (symbols.isInAttr(symbol.charAt(0))){
                NonTerminalExpression nonTerminalExpression = new NonTerminalExpression();
                nonTerminalExpression.setSymbol(symbol.charAt(0));
                symb.add(nonTerminalExpression);
                all.add(nonTerminalExpression);
            }else if (checkForNum(symbol)){
                TerminalExpression terminalExpression= new TerminalExpression();
                terminalExpression.setNumber(Integer.parseInt(symbol));
                numbs.add(terminalExpression);
                all.add(terminalExpression);
            }else if ("!".equals(symbol)){
                context.setArrayOfNumbers(numbs);
                context.setTogether(all);
                context.setArrayOfActions(symb);
                return context;
            }else {
                System.out.println("unreadeble symbol");
            }
        }
    }

    public boolean checkForNum(String s){
        try {
            Float.parseFloat(s);
            return true;
        }catch (Exception e){return false;}
    }
}
