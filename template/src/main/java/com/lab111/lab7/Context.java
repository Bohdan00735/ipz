package main.java.com.lab111.lab7;

import java.util.ArrayList;

public class Context {
     ArrayList<NonTerminalExpression> arrayOfNumbers;
     ArrayList<TerminalExpression> arrayOfActions;
    private ArrayList<AbstractExpression> together;
    private String formula;

    public Context() {
        this.arrayOfNumbers = new ArrayList<NonTerminalExpression>();
        this.arrayOfActions = new ArrayList<TerminalExpression>();
        this.together = new ArrayList<AbstractExpression>();
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public ArrayList<AbstractExpression> getTogether() {
        return together;
    }

    public void setTogether(ArrayList<AbstractExpression> together) {
        this.together = together;
    }

    public void setArrayOfNumbers(ArrayList<NonTerminalExpression> arrayOfNumbers) {
        this.arrayOfNumbers = arrayOfNumbers;
    }

    public void setArrayOfActions(ArrayList<TerminalExpression> arrayOfActions) {
        this.arrayOfActions = arrayOfActions;
    }

    public ArrayList<NonTerminalExpression> getArrayOfNumbers() {
        return arrayOfNumbers;
    }

    public ArrayList<TerminalExpression> getArrayOfActions() {
        return arrayOfActions;
    }

    public void makeAcctions(){
        //parcing on parts and calculate with help of abstract form;
        // combining all form together with abstract
        together.get(0).interpreter(this);
        together.get(1).interpreter(this);
        System.out.println("result");

    }
}
