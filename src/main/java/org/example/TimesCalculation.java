package org.example;

import java.math.BigDecimal;

public class TimesCalculation implements Calculation{
    public BigDecimal calculate(double operand1, double operand2) {
        return BigDecimal.valueOf(operand1).multiply(BigDecimal.valueOf(operand2));
    }
}
