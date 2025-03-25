package org.example;

import java.util.Arrays;
import java.math.BigDecimal;


public class Facade {
    public BigDecimal calculate(double operand1, double operand2, String operatorString) {
        var operator = parseOperator(operatorString);
        var calculation = getCalculationByOperator(operator);
        return calculation.calculate(operand1, operand2);
    }

    private Operator parseOperator(String operator) {
        return Arrays.stream(Operator.values())
                .filter(it -> it.getSymbol().equals(operator))
                .findAny()
                .orElseThrow(() -> new RuntimeException("В системе не существует переданного знака оператора"));
    }

    private Calculation getCalculationByOperator(Operator operator) {
        return switch (operator) {
            case PLUS -> new PlusCalculation();
            case MINUS -> new MinusCalculation();
            case TIMES -> new TimesCalculation();
            case DIVISION_SIGN -> new DivisionSignCalculation(); };
    }
}


