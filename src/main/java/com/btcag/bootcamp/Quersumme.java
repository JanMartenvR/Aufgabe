package com.btcag.bootcamp;

import java.util.Scanner;

public class Quersumme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Zahl eingeben (String):");
        String zahl = scanner.nextLine();
        int length = zahl.length();
        int summe = 0;

        while (length > 0){
            char c = zahl.charAt(length-1);
            length--;
            int x = c - 48;         // - 48 Wegen der ASCII-Tabelle
            summe = summe + x;
        }
        System.out.println(""+summe);


        System.out.println("Bitte Zahl eingeben (Long):");
        long zahl_int = scanner.nextLong();
        long result_int = 0;
        while (zahl_int != 0){
            result_int = result_int + zahl_int % 10;
            zahl_int /= 10;
        }

        System.out.println(""+result_int);



    }
}
