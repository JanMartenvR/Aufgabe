package com.btcag.bootcamp;

import java.util.Scanner;

public class Primzahltest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Zahl für den Primetest eingeben (Long):");
        long zahl = scanner.nextLong();
        boolean antwort = true;
        long i = 1;
        while (zahl >= i *i){
            while(0 == zahl % i){
                antwort = false;
                i = zahl;
            }
            i++;
        }
        System.out.println("Ergebnis: "+antwort);

    }
}
