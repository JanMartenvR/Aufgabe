package com.btcag.bootcamp;

import java.util.Scanner;

public class kryptischeZahlen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte die Zahl eingeben: ");
        long input = scanner.nextLong();
        System.out.println("Bitte Passwort (ZAHL) eingeben:");
        long passwort = scanner.nextLong();

        long schluessel = passwort % 10;

        long ergebnis = 0;
        long multiplikator = 1;
        long tmp = input;

        while (tmp > 0) {
            long ziffer = tmp % 10;

            ziffer = ziffer ^ schluessel;
            ergebnis = ergebnis + (ziffer * multiplikator);
            multiplikator *= 10;
            tmp /= 10;
        }


        System.out.println("Result: " + ergebnis);


    }
}
