package org.example;

import java.math.BigDecimal;

public class DivisionSignCalculation implements Calculation {
    public BigDecimal calculate(double operand1, double operand2) {
        return BigDecimal.valueOf(operand1).divide(BigDecimal.valueOf(operand2));
    }
}
