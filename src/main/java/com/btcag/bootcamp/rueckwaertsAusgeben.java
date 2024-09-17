package com.btcag.bootcamp;

import java.util.Scanner;

public class rueckwaertsAusgeben {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Zahl eingeben (String):");
        String zahl = scanner.nextLine();
        String result = "";
        int length = zahl.length();

        while (length > 0){
            char c = zahl.charAt(length-1);
            result = result + c;
            length--;
        }

        System.out.println(""+result);

        System.out.println("Bitte Zahl eingeben (Long):");
        long zahl_int = scanner.nextLong();
        long result_int = 0;
        while (zahl_int != 0){
            result_int = result_int * 10 + zahl_int % 10;
            zahl_int /= 10;
        }

        System.out.println(""+result_int);

        //Die Eingabe 01234 funktioniert beim String, aber nicht beim Long, da beim Long die 0 nicht mathematisch berücksichtigt wird.

    }
}
