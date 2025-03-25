package org.example;

import java.math.BigDecimal;

public class PlusCalculation implements Calculation{
    public BigDecimal calculate(double operand1, double operand2) {
        return BigDecimal.valueOf(operand1).add(BigDecimal.valueOf(operand2));
    }
}
