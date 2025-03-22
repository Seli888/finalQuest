package org.example;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число");

        int number = scanner.nextInt();

        try {
            NegativeNumberExeption.checkNumber(number);
        } catch (NegativeNumberExeption e){
            System.out.println("Число не может быть отрицательным");
        } finally {
            scanner.close();
        }

    }
}
