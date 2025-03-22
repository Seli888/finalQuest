package org.example;

public class NegativeNumberExeption extends RuntimeException{


    public static void checkNumber (int number){
        if (number < 0){
            throw new NegativeNumberExeption(); // не понимаю зачем текст в скобках...
        }
    }
}