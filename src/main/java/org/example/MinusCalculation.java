package org.example;

import java.math.BigDecimal;


public class MinusCalculation implements Calculation{
    public BigDecimal calculate(double operand1, double operand2) {
        return BigDecimal.valueOf(operand1).subtract(BigDecimal.valueOf(operand2));
    }
}
