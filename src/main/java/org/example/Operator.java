package org.example;

public enum Operator {
    PLUS("+"),
    MINUS("-"),
    MULTIPLY("*"),
    DIVISION_SIGN("/");


    private final String symbol;

    Operator(String s) {
        symbol = s;
    }

    public String getSymbol() {
        return symbol;
    }
}

