package com.company;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CitireFisier {
    public static void main(String[] args) {
        try {
            FileReader fisier = new FileReader("lab9.txt");
            Scanner scanner = new Scanner(fisier);
            while(scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }
            scanner.close();
        } catch(FileNotFoundException e) {
            System.out.println("A aparut o eroare!");
            e.printStackTrace();
        }
    }
}
