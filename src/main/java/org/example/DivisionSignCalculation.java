package org.example;

import java.math.BigDecimal;

public class DivisionSignCalculation implements Calculation {
    public BigDecimal calculate(double operand1, double operand2) {

        try {
             BigDecimal.valueOf(operand1).divide(BigDecimal.valueOf(operand2));
        } catch (NegativeNumberExeption e){
            System.out.println("Деление на 0 не приветствуется");
        }
        return BigDecimal.valueOf(operand1).divide(BigDecimal.valueOf(operand2));

    }
       public static void check(double operand2) {
           if (operand2 == 0) {
               throw new NegativeNumberExeption();
           }
    }

}
