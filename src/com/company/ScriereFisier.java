package com.company;
import java.io.FileWriter;
import java.io.IOException;

public class ScriereFisier {
    public static void main(String[] args) {
        try {
            FileWriter scriere = new FileWriter("lab9.txt");
            scriere.write("Paradigme de programare lab9\n");
            scriere.write("Ne place java\n");
            scriere.write("Invatam mult");
            scriere.close();
            System.out.println("Am scris cu succes");
        } catch (IOException e) {
            System.out.println("A aparut o eroare!");
            e.printStackTrace();
        }
    }
}
