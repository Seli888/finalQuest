package org.example;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String filePath = "C:\\Users\\django\\Desktop\\go.txt";

        try{ String text = new String(Files.readAllBytes(Paths.get(filePath)));
                System.out.println(text);
        } catch (IOException e){
                System.out.println("файл не найден");
        } finally{
                System.out.println("Работа с файлом завершена");
        }
    }
}