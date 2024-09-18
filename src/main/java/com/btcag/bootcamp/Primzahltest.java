package com.btcag.bootcamp;

import java.util.Scanner;

public class Primzahltest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Zahl für den Primetest eingeben (Long):");
        long zahl = scanner.nextLong();
        boolean antwort = false;
        long i = 2;
        while (zahl >= i *i){
            while(0 == zahl % i){
                antwort = true;
                i = zahl+1;
            }
            i++;
        }
        System.out.println("Ergebnis: "+antwort);

    }
}
