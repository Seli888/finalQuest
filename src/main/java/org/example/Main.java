package org.example;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        var operand1 = in.nextDouble();
        var operator = in.next();
        var operand2 = in.nextDouble();

        var f = new Facade();
        var res = f.calculate(operand1, operand2, operator);
        System.out.println(res);

    }
}