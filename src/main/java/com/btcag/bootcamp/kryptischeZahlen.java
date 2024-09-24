package com.btcag.bootcamp;

import java.util.Scanner;

public class kryptischeZahlen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte die Zahl eingeben: ");
        long input = scanner.nextLong();
        System.out.println("Bitte Passwort (ZAHL) eingeben:");
        long passwort = scanner.nextLong();

        long verschluesselt = 0;
        long multiplikation = 1;
        //verschlüsselung
        while (input > 0){
            long ziffer = input % 10;
            ziffer = (ziffer + 7) % 10;
            verschluesselt = verschluesselt + (ziffer * multiplikation);
            multiplikation *= 10;
            input /= 10;
        }
        System.out.println("Result: " + verschluesselt);
        long entschluesselt = 0;
        long multiplkator = 0;
        while ( input > 0){
            long ziffer = input % 10;
            ziffer = (ziffer + 3 ) % 10;
            entschluesselt = entschluesselt + (ziffer * multiplkator);
            multiplkator *= 10;
            input /= 10;
        }
        System.out.println("Result: " + entschluesselt);
    }
}
