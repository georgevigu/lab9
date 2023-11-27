package com.company;
import java.io.File;

public class StergereFisier {
    public static void main(String[] args) {
        File fisier = new File("lab9.txt");
        if(fisier.delete()) {
            System.out.println("Am sters fisierul: " + fisier.getName());
        }
        else {
            System.out.println("Nu am putut sterge fisierul");
        }
    }
}
