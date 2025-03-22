package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 2 числа:");

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        Calculate calculate = new Calculate();

        try{
            System.out.println(calculate.calc(number1, number2));
        }catch (ArithmeticException e){
            System.out.println("делить на 0 нельзя");
            scanner.close();
        }finally {
            scanner.close();
        }
    }
}
