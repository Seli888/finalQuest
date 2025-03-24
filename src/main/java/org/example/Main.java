package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean per = false;

        while (!per) {
            try {
                System.out.println("Введите 2 числа:");

                int number1 = scanner.nextInt();
                int number2 = scanner.nextInt();

                calc(number1, number2);
                per = true;
            } catch (ArithmeticException e) {
                System.out.println("делить на 0 нельзя");
            }
        }
    }
    public static void calc(int number1, int number2){
        System.out.println(number1 / number2);
    }
}