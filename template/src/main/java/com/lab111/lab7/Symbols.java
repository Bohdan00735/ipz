package main.java.com.lab111.lab7;

import java.util.Objects;


class Symbols {
    final char openScope = '(';
    final char closeScope = ')';
    final char plus = '+';
    final char mines = '-';
    final char multiplication = '*';
    final char division = '/';

    boolean isInAttr(char symbol){
        if (symbol==openScope || symbol == closeScope || symbol == plus ||
                symbol == mines || symbol == multiplication || symbol == division){
            return true;
        }return false;
    }

    public char getOpenScope() {
        return openScope;
    }

    public char getCloseScope() {
        return closeScope;
    }

    public char getPlus() {
        return plus;
    }

    public char getMines() {
        return mines;
    }

    public char getMultiplication() {
        return multiplication;
    }

    public char getDivision() {
        return division;
    }
}
