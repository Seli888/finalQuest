package org.example;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {

        String filePath = "literatura.txt";

        try{ Scanner scanner = new Scanner(new File(filePath));
        } catch (FileNotFoundException e){
            System.out.println("файл не найден");
        } finally{
            System.out.println("Работа с файлом завершена");
        }
    }
}
