package org.example;

public enum Operator {
    PLUS("+"),
    MINUS("-"),
    TIMES("*"),
    DIVISION_SIGN("/");


    private final String symbol;

    Operator(String s) {
        symbol = s;
    }

    public String getSymbol() {
        return symbol;
    }
}

