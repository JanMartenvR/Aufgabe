package com.btcag.bootcamp;

import java.util.Scanner;

public class kryptischeZahlen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte die Zahl eingeben: ");
        long input = scanner.nextLong();
        System.out.println("Bitte Passwort (ZAHL) eingeben:");
        long passwort = scanner.nextLong();
        long result = 0;
        long input_var = input;
        long passwort_var = passwort;

        while (input_var != 0){
            result = input_var % 10;
            long mod = passwort_var % 10;
            result = result % mod;
            passwort_var /= 10;
            input_var /= 10;
        }

        while (passwort == input) {
            result = input;
        }

        System.out.println("Result: " + result);
    }
}
