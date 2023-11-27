package com.company;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            File fisier = new File("lab9.txt");
            if(fisier.exists()) {
                System.out.println("Fisierul exista: " + fisier.getName());
            } else {
                if(fisier.createNewFile()) {
                    System.out.println("Fisier creat: " + fisier.getName());
                }
                else {
                    System.out.println("Fisierul nu a fost creat.");
                }
            }
        } catch (IOException e) {
            System.out.println("A aparut o eroare");
            e.printStackTrace();
        }
    }
}


